package com.ucs.universityCourseSelection.entity;

public enum AdmissionStatus {
	applied("Applied"),
	pending("pending"),
	confirmed("confirmed"),
	rejected("rejected");
	
	String value;
	
	AdmissionStatus(String value){
		this.value=value;
	}

}
