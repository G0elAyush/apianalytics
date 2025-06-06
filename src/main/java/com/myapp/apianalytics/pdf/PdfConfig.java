package com.myapp.apianalytics.pdf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;

@Configuration
public class PdfConfig {
	
	@Value("${pdf.output.path}")
    private String outputPdfPath;
	 // Define PdfWriter as a bean in Spring context
    @Bean
    PdfDocument pdfDocument() {
    	 try {
    		 PdfWriter writer = new PdfWriter(outputPdfPath);
             return new PdfDocument(writer);
         } catch (Exception e) {
             throw new RuntimeException("Error creating PdfWriter", e);
         }
    }
    
}
