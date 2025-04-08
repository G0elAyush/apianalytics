package com.myapp.apianalytics.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="RESTREQUESTLOGGER")
public class DataTable {
	
	@Id
	@SequenceGenerator(name="REQUESTIDSEQ",sequenceName="REQUESTIDSEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "REQUESTIDSEQ")
	@Column(length=10,nullable = false,unique = true,name="REQUEST_ID")
	private Integer requestId;
	
	@Column(name = "RESQUEST",length = 1048576)
	@Lob
	private byte[] request;
	
	@Column(name = "RESPONSE",length = 1048576)
	@Lob
	private byte[] response;
	
	@Column(name="HTTP_RESPONSECODE")
	private int httpResponseCode;
	
	@Column(length=500,name="REQUEST_TIME")
	private String requestTime;
	
	@Column(length=500,name="RESPONSE_CONTENT_TYPE")
	private String responseContentType;
	
	@Column(length=1048576,name="HTTP_HEADERS")
	@Lob
	private byte[] httpHeaders;
	
	@Column(length=2000,name="QUERY_PARAMS")
	private String queryParam;
	
	@Column(length=100,name="METHOD_TYPE")
	private String methodType;
	
	@Column(length=600,name="REQUEST_URL")
	private String requestURL;
	
	@Column(length=100,name="BANCS_CORRELATIONID")
	private String correleationId;
	
	@Column(length=100,name="BUSINESS_REFERENCE")
	private String businessReference;
	
	@Column(length=100,name="IDEMPOTENCYKEY")
	private String idempotencyKey;

}
