package com.telusko.demo.model;

/**
 * @author amit
 *
 */
public class Alien {

	private int id;
	private String aname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", aname=" + aname + "]";
	}
	
	
}
