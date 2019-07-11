package com.sj.model;

import javax.jdo.annotations.DatastoreIdentity;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(table = "user_info", detachable = "true")
@DatastoreIdentity(customStrategy = "uuid")
public class UserInfo {

	@PrimaryKey
	@Persistent(column = "_id", customValueStrategy = "uuid")
	private String id;
	
	private String firstName, lastName;

	public UserInfo(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
