package com.java.learning.restfullspringbootapplication.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Friends {

	@Id
	private int friendId;
	private String name;
	private String address;

	/**
	 * @return the friendId
	 */
	public int getFriendId() {
		return friendId;
	}

	/**
	 * @param friendId
	 *            the friendId to set
	 */
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
