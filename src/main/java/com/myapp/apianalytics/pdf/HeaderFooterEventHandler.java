package com.myapp.apianalytics.pdf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.Property;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.renderer.CanvasRenderer;
import com.itextpdf.layout.renderer.IRenderer;

@Component
public class HeaderFooterEventHandler implements IEventHandler {
	
	private PdfDocument pdfDocument;
	
	@Value("${pdf.logoPath}")
	private String logoPath;

    public HeaderFooterEventHandler(PdfDocument pdfDocument) {
        this.pdfDocument = pdfDocument;
    }

    
	@Override
    public void handleEvent(Event event) {
        PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
        PdfPage page = docEvent.getPage();
        
        Rectangle rectangle = new Rectangle(10, 20, 5, 100);
        
        PdfCanvas pdfCanvas = new PdfCanvas(page);
        
        Canvas canvas = new Canvas( pdfCanvas,rectangle); 
        
        pdfCanvas.saveState()
        .setFillColor(new DeviceRgb(115, 225, 250))
        .roundRectangle(10d, pdfCanvas.getDocument().getDefaultPageSize().getTop()-75f, 5d, 75d,3d)
        .fill()
        .restoreState();
        
        pdfCanvas.saveState()
        .setFillColor(new DeviceRgb(115, 225, 250))
        .roundRectangle(10d, 0d, 5d, 50d,3d)
        .fill()
        .restoreState();
    
        
        
        ImageData logo = null;
        // Load the logo image
        try {
        	 logo = ImageDataFactory.create(logoPath); // Specify the path to your logo
        }
        catch(Exception ex) {
        	ex.printStackTrace();
        }
       
        Image logoImage = new Image(logo);
        // Resize logo if needed (optional)
        logoImage.scaleToFit(130, 130); // Resize to fit in a 50x50 area
        
        
        // Add logo to the page
        canvas.add(logoImage.setFixedPosition(page.getPageSize().getRight() - 150, page.getPageSize().getTop() - 55));
        
       // canvas.setBackgroundColor(ColorConstants.BLACK, 1f) ; // Set a fill color for the rectangle
       
       

        // Add Footer (Bottom of the Page)
        Paragraph footer1 = new Paragraph(""+pdfDocument.getPageNumber(page) +"\t"+"ABC Confidential")
                .setFontSize(11)
               // .setFontColor(null)
                .setTextAlignment(TextAlignment.LEFT);
        // Positioning the footer at the bottom of the page
 
        canvas.showTextAligned(footer1, page.getPageSize().getLeft() +36, page.getPageSize().getBottom() + 18, TextAlignment.LEFT);
        
        
        Paragraph footer2 = new Paragraph("Lorem Ipsum is simply dummy text of the  \u2122" )
                .setFontSize(12)
                .setTextAlignment(TextAlignment.RIGHT);
        canvas.showTextAligned(footer2, page.getPageSize().getRight() -50, page.getPageSize().getBottom() + 18, TextAlignment.RIGHT);
        
        canvas.close();
    }

}
class MyCanvasRenderer extends CanvasRenderer {
    protected boolean full = false;

    public MyCanvasRenderer(Canvas canvas) {
        super(canvas);
    }

    @Override
    public void addChild(IRenderer renderer) {
        super.addChild(renderer);
        full = Boolean.TRUE.equals(getPropertyAsBoolean(Property.FULL));
    }

    public boolean isFull() {
        return full;
    }
}
