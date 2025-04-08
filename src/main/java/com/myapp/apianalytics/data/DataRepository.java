package com.myapp.apianalytics.data;

import java.util.List;


public interface DataRepository 
//extends JpaRepository<DataTable, Long>
{
	
	
	public List<ClientUsageData> fetchClientUsageData();

}
