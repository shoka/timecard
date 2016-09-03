package me.linknext.timecard.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class ParamBean {
	
	private String param1;
	
	private String param2;
	
	private String param3;
	
	private Integer primitive;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date date;

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public Integer getPrimitive() {
		return primitive;
	}

	public void setPrimitive(Integer primitive) {
		this.primitive = primitive;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
