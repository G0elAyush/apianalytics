/**
 * 
 */
package com.myapp.apianalytics.pdf;


import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.kernel.pdf.xobject.PdfFormXObject;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.DashedBorder;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.LineSeparator;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.AreaBreakType;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.myapp.apianalytics.chart.ApiChart;
import com.myapp.apianalytics.data.ClientUsageData;
import com.myapp.apianalytics.data.SourceUsage;
import com.orsonpdf.PDFDocument;
import com.orsonpdf.PDFGraphics2D;
import com.orsonpdf.Page;

/**
 * 
 */
@Service
public class PdfService {

	@Value("${pdf.isLandScape}")
	private boolean isLandScape;

	@Value("${pdf.pdfTitle}")
	private String pdfTitle;

	@Value("${pdf.pdfAuthor}")
	private String pdfAuthor;

	@Value("${pdf.pdfSubject}")
	private String pdfSubject;

	@Value("${pdf.pdfKeyWords}")
	private String pdfKeyWords;

	@Value("${pdf.pdfCreator}")
	private String pdfCreator;

	@Value("${pdf.pdfProducer}")
	private String pdfProducer;

	@Autowired
	private PdfDocument pdf;
	
	@Autowired
	private ApiChart chart;

	@Autowired
	private IEventHandler handler;
	
	private Document document;

	public void initializeDocument() throws Exception {
		
		pdf.getDocumentInfo()
			.setTitle(pdfTitle)
			.setAuthor(pdfAuthor)
			.setSubject(pdfSubject)
			.setKeywords(pdfKeyWords)
			.setCreator(pdfCreator)
			.setProducer(pdfProducer);
		
		if(isLandScape)
			pdf.setDefaultPageSize(PageSize.A4.rotate()); 
		
		pdf.addEventHandler(PdfDocumentEvent.END_PAGE, handler);
		document =  new Document(pdf);
	}
	
	public void pageBreak() {
		document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
		
	}

	public void close() {
		document.close();
		
	}

	private void setPageTitle(String pageTitle) throws Exception {
		document.add(new LineSeparator(new SolidLine()));
		document.add(new Paragraph(pageTitle).setFontColor(ColorConstants.DARK_GRAY,0.8f).setFontSize(18f).setFont(PdfFontFactory.createFont(StandardFonts.HELVETICA_BOLD)));
		document.add(new LineSeparator(new SolidLine()));
		document.add( new Paragraph("\n"));

	}

	private Table inititaliseTable(float tableWidth, int unitType, float... value) {
		if (value == null) {
			throw new IllegalArgumentException("The column widths can not be null.");
		}
		if (value.length == 0) {
			throw new IllegalArgumentException("The column widths can not have zero length.");
		}
		UnitValue[] columnWidths = new UnitValue[value.length];
		for (int i = 0; i < value.length; i++) {
			columnWidths[i] = new UnitValue(unitType, value[i]);
		}
		Table table = new Table(columnWidths);
		table.setWidth(tableWidth);
		
		return table;

	}
	private void addTableHeader(Table table,String ...headers) {
		if (headers == null) {
			throw new IllegalArgumentException("The headers can not be null.");
		}
		if (headers.length == 0) {
			throw new IllegalArgumentException("The headers can not have zero length.");
		}
		Stream.of(headers)
		.forEach(columnTitle -> {
			Cell header = new Cell();
			
			header.setBold();
			header.setFontSize(14f);
			header.setBackgroundColor(new DeviceRgb(210 , 225, 250));
			header.setBorder( new SolidBorder(1));
			header.add(new Paragraph(columnTitle));
			header.setTextAlignment(TextAlignment.CENTER);
			header.setBorder(new SolidBorder(2f));
			header.setPadding(5f);
			table.addCell(header);
		});
	}
	
	private void addRow(Table table,String ...row) {
		if (row == null) {
			throw new IllegalArgumentException("The row can not be null.");
		}
		if (row.length == 0) {
			throw new IllegalArgumentException("The row can not have zero length.");
		}
		for(int i=0; i<row.length; i++) {

			Cell cell = new Cell();
			cell.setPadding(4f);
			cell.add(new Paragraph(row[i]));
			cell.setTextAlignment(TextAlignment.CENTER);
			cell.setBorderLeft(new SolidBorder(2f));
			cell.setBorderRight(new SolidBorder(2f));

			table.addCell(cell);


		} 
	}
	private void addRow(Table table,int level,String ...row) {
		if (row == null) {
			throw new IllegalArgumentException("The row can not be null.");
		}
		if (row.length == 0) {
			throw new IllegalArgumentException("The row can not have zero length.");
		}
		for(int i=0; i<row.length; i++) {

			Cell cell = new Cell();
			cell.add(new Paragraph(row[i]));

			cell.setBorderLeft(new SolidBorder(2f));
			cell.setBorderRight(new SolidBorder(2f));
			cell.setPadding(5f);

			if(level ==1) {
				cell.setFontSize(12f);
				cell.setBold();
				cell.setBorderTop(new SolidBorder(2f));
				
				cell.setTextAlignment(TextAlignment.CENTER);
				
			}
			if(level ==2 ) {
				cell.setFontSize(10f);
				
				cell.setBorderTop(new DashedBorder(0.8f));
				cell.setTextAlignment(TextAlignment.LEFT);
				cell.setItalic();
				cell.setPaddingLeft(5f);
				
			}


			table.addCell(cell);


		} 

	}

	private void addTableFooter(Table table,String ...headers) {
		
		addTableHeader(table,headers);
		
	}
	
	public void addPageForSourceBaseMetric(Map<Integer, SourceUsage> sourceSytemUsageRows) throws Exception {
		
		setPageTitle("Source-Based API Metrics");
		
		Table table = inititaliseTable(pdf.getDefaultPageSize().getWidth() * 0.915f,2,3.40f,2.3f,2f,2.3f);

		addTableHeader(table,  "Source","Success","Rejections","Total");
		
		int success = 0;
		int rejection = 0;
		int total = 0;
		
		for (var entry : sourceSytemUsageRows.entrySet()) {
			SourceUsage row = entry.getValue();
			success = success+row.getSuccess();
			rejection = rejection + row.getRejections();
			total = total + row.getTotal();
			addRow(table, 1,   row.getSourceSystem(),String.format("%,d",row.getSuccess()),String.format("%,d",row.getRejections()),String.format("%,d",row.getTotal()));
			if(row.getApis() != null) {
				for(SourceUsage subRow :row.getApis()) {
					addRow(table, 2,   subRow.getApi(),String.format("%,d",subRow.getSuccess()),String.format("%,d",subRow.getRejections()),String.format("%,d",subRow.getTotal()));	
				}	
			}
		}
		addTableFooter(table,  "Total",String.format("%,d",success),String.format("%,d",rejection),String.format("%,d",total));
		document.add(table);

	}

	public void addPageForClientUsage(List<ClientUsageData> rows) throws Exception{
		
		setPageTitle("Top client for API1");
		Table table = inititaliseTable(pdf.getDefaultPageSize().getWidth() * 0.915f,2,1f,4.6f,2.2f,2.2f);
		
		addTableHeader(table,  "#","Client","Success Count","Fail Count");
		
		for(ClientUsageData row : rows) {
			addRow(table, row.getRow_num(),row.getCustomer_id(),String.format("%,d",Long.parseLong(row.getSuccess_count())),String.format("%,d",Long.parseLong(row.getFail_count())));
		}
		
		table.setBorder(new SolidBorder(2f));
		document.add(table);
	}
	
	public void addPageForChart(String chartOf) throws Exception{
		
		PDFDocument doc = new PDFDocument();
		Rectangle2D bounds = new Rectangle(0,0,800, 500);
		Page page = doc.createPage(bounds);
		PDFGraphics2D g2 = page.getGraphics2D();
		
		chart.getChartForCMOSuccess().draw(g2, bounds);
		
	
		
		 PdfReader reader = new PdfReader(new ByteArrayInputStream(doc.getPDFBytes()));
	        PdfDocument chartDoc = new PdfDocument(reader);
	        PdfFormXObject chart = chartDoc.getFirstPage().copyAsFormXObject(pdf);
	        Image chartImage = new Image(chart);
	        document.add(chartImage);
	        
	        chartDoc.close();
	}
	

	

}
