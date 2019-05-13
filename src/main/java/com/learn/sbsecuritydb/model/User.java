package com.learn.sbsecuritydb.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private int userID;

	@Column(name = "password")
	private String userPass;

	@Column(name = "fname")
	private String userFName;

	@Column(name = "lname")
	private String userLName;

	@Column(name = "email")
	private String userEmail;

	@Column(name = "active")
	private int active;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "roleid"))
	private Set<Role> roles;

	public User(User users) {
		super();
		this.userID = users.getUserID();
		this.userPass = users.getUserPass();
		this.userFName = users.getUserFName();
		this.userLName = users.getUserLName();
		this.userEmail = users.getUserEmail();
		this.active = users.getActive();
		this.roles = users.getRoles();
	}

	public User(int userID, String userPass, String userFName, String userLName, String userEmail, int active,
			Set<Role> roles) {
		super();
		this.userID = userID;
		this.userPass = userPass;
		this.userFName = userFName;
		this.userLName = userLName;
		this.userEmail = userEmail;
		this.active = active;
		this.roles = roles;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}
