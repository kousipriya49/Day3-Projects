package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdemo1")
public class studentdemo
{
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="sage")
	private int sage;
	@Column(name="ssalary")
	private int ssalary;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSsalary() {
		return ssalary;
	}

	public void setSsalary(int ssalary) {
		this.ssalary = ssalary;
	}
	
	public studentdemo(int sid, String sname, int sage, int ssalary) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.ssalary = ssalary;
	}
	public studentdemo()
	{
		
	}
}
