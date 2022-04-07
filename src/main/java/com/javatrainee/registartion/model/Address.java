package com.javatrainee.registartion.model;

public class Address {

	private int id;
	private String addrs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addrs=" + addrs + "]";
	}

}
