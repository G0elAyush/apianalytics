package com.myapp.apianalytics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApianalyticsApplication implements CommandLineRunner {
	

	@Autowired
	private ReportService reportService;
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApianalyticsApplication.class, args);
		System.exit(0);
	}
	
	@Override
    public void run(String... args) throws Exception {
        // Generate PDF when application starts
		reportService.createReport();
    }

}
