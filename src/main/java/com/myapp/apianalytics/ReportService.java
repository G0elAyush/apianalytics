package com.myapp.apianalytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.apianalytics.data.DataService;
import com.myapp.apianalytics.pdf.PdfService;


@Service
public class ReportService {
	
	@Autowired
	private DataService dataService;
	
	@Autowired
	private PdfService pdfService;
	
	
	
	public void createReport() throws Exception{
		
		pdfService.initializeDocument();
		
		pdfService.addPageForSourceBaseMetric(dataService.fetchSourceBaseMetric());
		pdfService.pageBreak();
		pdfService.addPageForClientUsage(dataService.fetchClientUsageData());
		
		pdfService.close();
		
		
	}

}
