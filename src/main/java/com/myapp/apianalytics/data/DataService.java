package com.myapp.apianalytics.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	
	//@Autowired
	//private DataRepository repository;
	
	
	public List<ClientUsageData> fetchClientUsageData(){
		//repository.fetchClientUsageData();
		List<ClientUsageData> list = new ArrayList<>();
		
		for(int i = 1; i<16;i++) {
			
			ClientUsageDataC data = new ClientUsageDataC();
			data.setRow_num(String.valueOf(i));
			data.setCustomer_id("12345678");
			data.setSuccess_count("1000000");
			data.setFail_count("2323");
			list.add(data);
			
		}
		return list;
		
		
	}
	
	public Map<Integer, SourceUsage> fetchSourceBaseMetric(){
		//repository.fetchClientUsageData();
		
		List<SourceUsage> list = new ArrayList<>();
		
		
			
			SourceUsageRow data ;
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API3");
			data.setResponse("200");
			data.setCount("100000000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API3");
			data.setResponse("400");
			data.setCount("20000");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API4");
			data.setResponse("200");
			data.setCount("300000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API4");
			data.setResponse("400");
			data.setCount("400000");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API5");
			data.setResponse("200");
			data.setCount("500000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API5");
			data.setResponse("400");
			data.setCount("600000");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API6");
			data.setResponse("200");
			data.setCount("700000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API6");
			data.setResponse("400");
			data.setCount("800000");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API7");
			data.setResponse("200");
			data.setCount("900000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API7");
			data.setResponse("400");
			data.setCount("1000000");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API8");
			data.setResponse("200");
			data.setCount("1100000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API8");
			data.setResponse("400");
			data.setCount("1200000");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API9");
			data.setResponse("200");
			data.setCount("1300000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System4");
			data.setApi("API9");
			data.setResponse("400");
			data.setCount("1400000");
			list.add(data);
			
			
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System2");
			data.setApi("limitCheck");
			data.setResponse("1");
			data.setCount("1500000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System2");
			data.setApi("limitCheck");
			data.setResponse("2");
			data.setCount("1600000");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("System2");
			data.setApi("limitenquiry");
			data.setResponse("200");
			data.setCount("1700000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System2");
			data.setApi("limitenquiry");
			data.setResponse("400");
			data.setCount("1800000");
			list.add(data);
			
			
			
			
			data= new SourceUsageRow();
			data.setSourceSystem("System1");
			data.setApi("limticheck");
			data.setResponse("1");
			data.setCount("1900000");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("System1");
			data.setApi("limitcheck");
			data.setResponse("2");
			data.setCount("2000000");
			list.add(data);
			
			
			
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("System3");
			data.setApi("customer");
			data.setResponse("1");
			data.setCount("2100000");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("System3");
			data.setApi("customer");
			data.setResponse("2");
			data.setCount("2200000");
			list.add(data);
		
		Map<Integer, SourceUsage> sourceSytemUsageRows = new HashMap<>();
		
		List<SourceUsage> cmoSubRows = new ArrayList<>();
		SourceUsage subRow = new SourceUsageRow();
		subRow.setApi("API1");
		cmoSubRows.add(subRow);
		subRow = new SourceUsageRow();
		subRow.setApi("API2");
		cmoSubRows.add(subRow);
		
		List<SourceUsage> allAccessSubRows = new ArrayList<>();
		subRow = new SourceUsageRow();
		subRow.setApi("API3");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API4");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API5");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API6");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API7");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API8");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("API9");
		allAccessSubRows.add(subRow);
		
		sourceSytemUsageRows.put(0, new SourceUsageRow("System1"));
		sourceSytemUsageRows.put(1, new SourceUsageRow("System2",cmoSubRows));
		sourceSytemUsageRows.put(2, new SourceUsageRow("System3"));
		sourceSytemUsageRows.put(3, new SourceUsageRow("System4",allAccessSubRows));
		
		
		for(SourceUsage dbRow:list) {
				
			SourceUsage row ;
			if(dbRow.getSourceSystem() == "System1" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(0);
				
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System1" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(0);
				row.setRejections(sourceSytemUsageRows.get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(sourceSytemUsageRows.get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System2" && dbRow.getApi() == "limitCheck" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(1);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setSuccess(row.getApis().get(0).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System2" && dbRow.getApi() == "limitCheck" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(1);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setRejections(row.getApis().get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System2" && dbRow.getApi() == "limitenquiry" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(1);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setSuccess(row.getApis().get(1).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System2" && dbRow.getApi() == "limitenquiry" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(1);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setRejections(row.getApis().get(1).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System3" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(2);;
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System3" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(2);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API3" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setSuccess(row.getApis().get(0).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API3" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setRejections(row.getApis().get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API4" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setSuccess(row.getApis().get(1).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API4" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setRejections(row.getApis().get(1).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API5" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setSuccess(row.getApis().get(2).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setTotal(row.getApis().get(2).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API5" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setRejections(row.getApis().get(2).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setTotal(row.getApis().get(2).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API6" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setSuccess(row.getApis().get(3).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setTotal(row.getApis().get(3).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API6" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setRejections(row.getApis().get(3).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setTotal(row.getApis().get(3).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API7" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setSuccess(row.getApis().get(4).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setTotal(row.getApis().get(4).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API7" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setRejections(row.getApis().get(4).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setTotal(row.getApis().get(4).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API8" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setSuccess(row.getApis().get(5).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setTotal(row.getApis().get(5).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API8" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setRejections(row.getApis().get(5).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setTotal(row.getApis().get(5).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API9" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setSuccess(row.getApis().get(6).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setTotal(row.getApis().get(6).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "System4" && dbRow.getApi() == "API9" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setRejections(row.getApis().get(6).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setTotal(row.getApis().get(6).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			
			
		
		}
		return sourceSytemUsageRows;
		
		
	}
		
	

}
