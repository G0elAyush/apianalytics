package com.myapp.apianalytics.data;

import java.util.List;

public interface SourceUsage {
	
	
	public String getSourceSystem();
	public String getApi();
	public String getResponse();
	public String getCount();
	public void setApi(String api);
	public void setSuccess(int count);
	public void setRejections(int count);
	public void setTotal(int count);
	public int getSuccess();
	public int getRejections();
	public int getTotal();
	public  List<SourceUsage> getApis();
	

}
