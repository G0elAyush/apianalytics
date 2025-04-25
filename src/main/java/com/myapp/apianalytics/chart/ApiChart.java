package com.myapp.apianalytics.chart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.stereotype.Component;

@Component
public class ApiChart {

	public JFreeChart getChartForCMOSuccess() throws Exception{
		
		DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
		dataSet.setValue(791, "API calls", "May 24");
		dataSet.setValue(100000, "API calls", "Jun 24");
		dataSet.setValue(100000, "API calls", "Jul 24");
		dataSet.setValue(110000, "API calls", "Aug 24");
		dataSet.setValue(10000, "API calls", "Sep 24");
		dataSet.setValue(120000, "API calls", "Oct 24");
		dataSet.setValue(100000, "API calls", "Nov 24");
		dataSet.setValue(100000, "API calls", "Dec 24");
		dataSet.setValue(130000, "API calls", "Jan 25");
		dataSet.setValue(100000, "API calls", "Feb 25");
		dataSet.setValue(100000, "API calls", "Mar 25");
		dataSet.setValue(100000, "API calls", "Apr 25");

		JFreeChart chart = ChartFactory.createBarChart(
				"CMO Success API Calls", "Month", "No of API calls",
				dataSet, PlotOrientation.VERTICAL, false, true, false);
		return chart;
	}
}
