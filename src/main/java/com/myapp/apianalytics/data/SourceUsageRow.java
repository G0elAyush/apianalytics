package com.myapp.apianalytics.data;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SourceUsageRow implements SourceUsage{
	
	private String sourceSystem;
	private String api;
	private String response;
	private String count;
	
	
	private List<SourceUsage> apis;
	
	private int success=0;
	private  int rejections=0;
	private int total=0;
	
	public SourceUsageRow (String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	public SourceUsageRow (String sourceSystem,List<SourceUsage> apis) {
		this.sourceSystem = sourceSystem;
		this.apis = apis;
	}

}
