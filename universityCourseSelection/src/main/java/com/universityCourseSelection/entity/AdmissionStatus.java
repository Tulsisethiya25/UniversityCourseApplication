package com.universityCourseSelection.entity;

public enum AdmissionStatus {
	APPLIED("Applied"),
	PENDING("pending"),
	CONFIRMED("confirmed"),
	REJECTED("rejected");
	
	String value;
	
	AdmissionStatus(String value){
		this.value=value;
	}

}
