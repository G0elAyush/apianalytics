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
			data.setSourceSystem("AllAccess");
			data.setApi("createUser");
			data.setResponse("200");
			data.setCount("1");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("createUser");
			data.setResponse("400");
			data.setCount("2");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("modifyuser");
			data.setResponse("200");
			data.setCount("3");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("modifyuser");
			data.setResponse("400");
			data.setCount("4");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("suspenduser");
			data.setResponse("200");
			data.setCount("5");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("suspenduser");
			data.setResponse("400");
			data.setCount("6");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("resumeuser");
			data.setResponse("200");
			data.setCount("7");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("resumeuser");
			data.setResponse("400");
			data.setCount("8");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("deleteuser");
			data.setResponse("200");
			data.setCount("9");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("deleteuser");
			data.setResponse("400");
			data.setCount("10");
			list.add(data);
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("viewuser");
			data.setResponse("200");
			data.setCount("11");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("viewuser");
			data.setResponse("400");
			data.setCount("12");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("viewrole");
			data.setResponse("200");
			data.setCount("13");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("AllAccess");
			data.setApi("viewrole");
			data.setResponse("400");
			data.setCount("14");
			list.add(data);
			
			
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("CMO");
			data.setApi("limitCheck");
			data.setResponse("1");
			data.setCount("15");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("CMO");
			data.setApi("limitCheck");
			data.setResponse("2");
			data.setCount("16");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("CMO");
			data.setApi("limitenquiry");
			data.setResponse("200");
			data.setCount("17");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("CMO");
			data.setApi("limitenquiry");
			data.setResponse("400");
			data.setCount("18");
			list.add(data);
			
			
			
			
			data= new SourceUsageRow();
			data.setSourceSystem("PSHC");
			data.setApi("limticheck");
			data.setResponse("1");
			data.setCount("19");
			list.add(data);
			
			data = new SourceUsageRow();
			data.setSourceSystem("PSHC");
			data.setApi("limitcheck");
			data.setResponse("2");
			data.setCount("20");
			list.add(data);
			
			
			
			
			
			data = new SourceUsageRow();
			data.setSourceSystem("BBD");
			data.setApi("customer");
			data.setResponse("1");
			data.setCount("21");
			list.add(data);
			data= new SourceUsageRow();
			data.setSourceSystem("BBD");
			data.setApi("customer");
			data.setResponse("2");
			data.setCount("22");
			list.add(data);
		
		Map<Integer, SourceUsage> sourceSytemUsageRows = new HashMap<>();
		
		List<SourceUsage> cmoSubRows = new ArrayList<>();
		SourceUsage subRow = new SourceUsageRow();
		subRow.setApi("Limit Check");
		cmoSubRows.add(subRow);
		subRow = new SourceUsageRow();
		subRow.setApi("Limit Enquiry");
		cmoSubRows.add(subRow);
		
		List<SourceUsage> allAccessSubRows = new ArrayList<>();
		subRow = new SourceUsageRow();
		subRow.setApi("Create User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("Modify User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("Suspend User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("Resume User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("Delete User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("View User");
		allAccessSubRows.add(subRow);
		
		subRow = new SourceUsageRow();
		subRow.setApi("View Role");
		allAccessSubRows.add(subRow);
		
		sourceSytemUsageRows.put(0, new SourceUsageRow("PSHC"));
		sourceSytemUsageRows.put(1, new SourceUsageRow("CMO",cmoSubRows));
		sourceSytemUsageRows.put(2, new SourceUsageRow("BBD"));
		sourceSytemUsageRows.put(3, new SourceUsageRow("AllAccess",allAccessSubRows));
		
		
		for(SourceUsage dbRow:list) {
				
			SourceUsage row ;
			if(dbRow.getSourceSystem() == "PSHC" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(0);
				
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "PSHC" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(0);
				row.setRejections(sourceSytemUsageRows.get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(sourceSytemUsageRows.get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "CMO" && dbRow.getApi() == "limitCheck" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(1);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setSuccess(row.getApis().get(0).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "CMO" && dbRow.getApi() == "limitCheck" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(1);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setRejections(row.getApis().get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "CMO" && dbRow.getApi() == "limitenquiry" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(1);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setSuccess(row.getApis().get(1).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "CMO" && dbRow.getApi() == "limitenquiry" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(1);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setRejections(row.getApis().get(1).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "BBD" && dbRow.getResponse()=="1") {
				row = sourceSytemUsageRows.get(2);;
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "BBD" && dbRow.getResponse()=="2") {
				row = sourceSytemUsageRows.get(2);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "createUser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setSuccess(row.getApis().get(0).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "createUser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setRejections(row.getApis().get(0).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(0).setTotal(row.getApis().get(0).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "modifyuser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setSuccess(row.getApis().get(1).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "modifyuser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setRejections(row.getApis().get(1).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(1).setTotal(row.getApis().get(1).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "suspenduser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setSuccess(row.getApis().get(2).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setTotal(row.getApis().get(2).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "suspenduser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setRejections(row.getApis().get(2).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(2).setTotal(row.getApis().get(2).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "resumeuser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setSuccess(row.getApis().get(3).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setTotal(row.getApis().get(3).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "resumeuser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setRejections(row.getApis().get(3).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(3).setTotal(row.getApis().get(3).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "deleteuser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setSuccess(row.getApis().get(4).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setTotal(row.getApis().get(4).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "deleteuser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setRejections(row.getApis().get(4).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(4).setTotal(row.getApis().get(4).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "viewuser" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setSuccess(row.getApis().get(5).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setTotal(row.getApis().get(5).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "viewuser" && dbRow.getResponse()=="400") {
				row = sourceSytemUsageRows.get(3);
				row.setRejections(row.getRejections() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setRejections(row.getApis().get(5).getRejections() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(5).setTotal(row.getApis().get(5).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "viewrole" && dbRow.getResponse()=="200") {
				row = sourceSytemUsageRows.get(3);
				row.setSuccess(row.getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.setTotal(row.getTotal() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setSuccess(row.getApis().get(6).getSuccess() + Integer.parseInt(dbRow.getCount()));
				row.getApis().get(6).setTotal(row.getApis().get(6).getTotal() + Integer.parseInt(dbRow.getCount()));
			}
			else if(dbRow.getSourceSystem() == "AllAccess" && dbRow.getApi() == "viewrole" && dbRow.getResponse()=="400") {
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
