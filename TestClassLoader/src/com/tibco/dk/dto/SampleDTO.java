package com.tibco.dk.dto;

public class SampleDTO {
	
	private String privateString;
	
	public String publicString;
	
	private Integer privateInteger;
	
	public Integer publicInteger;
	
	private SampleEnum sampleEnum;

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	public String getPublicString() {
		return publicString;
	}

	public void setPublicString(String publicString) {
		this.publicString = publicString;
	}

	public Integer getPrivateInteger() {
		return privateInteger;
	}

	public void setPrivateInteger(Integer privateInteger) {
		this.privateInteger = privateInteger;
	}

	public Integer getPublicInteger() {
		return publicInteger;
	}

	public void setPublicInteger(Integer publicInteger) {
		this.publicInteger = publicInteger;
	}

	public SampleEnum getSampleEnum() {
		return sampleEnum;
	}

	public void setSampleEnum(SampleEnum sampleEnum) {
		this.sampleEnum = sampleEnum;
	}

	@Override
	public String toString() {
		return "SampleDTO [privateString=" + privateString + ", publicString="
				+ publicString + ", privateInteger=" + privateInteger
				+ ", publicInteger=" + publicInteger + ", sampleEnum="
				+ sampleEnum + "]";
	}
	
	
	
	

}
