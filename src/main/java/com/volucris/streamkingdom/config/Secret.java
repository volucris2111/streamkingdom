package com.volucris.streamkingdom.config;

public enum Secret {
	SECRET("s3f7a7tdaqwxdsseg911gh2uukf0nf");
	
	
	private Secret(String secret) {
		this.secret = secret;
	}
	
	private String secret;

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
}
