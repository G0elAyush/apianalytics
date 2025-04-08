package com.myapp.apianalytics.data;

import lombok.Data;

@Data
public class ClientUsageDataC implements ClientUsageData {
	
	
	private String row_num;
	private String customer_id;
	private String success_count;
	private String fail_count;

}
