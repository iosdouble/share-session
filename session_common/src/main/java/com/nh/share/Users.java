package com.nh.share;

import java.io.Serializable;

public class Users implements Serializable{
	
	private String username;
	private String userpwd;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	@Override
	public String toString() {
		return "Users [username=" + username + ", userpwd=" + userpwd + "]";
	}
	public Users() {
		super();
	}
	public Users(String username, String userpwd) {
		super();
		this.username = username;
		this.userpwd = userpwd;
	}
	
	
}

