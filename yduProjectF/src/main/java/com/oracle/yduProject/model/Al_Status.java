package com.oracle.yduProject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Al_Status {
	private int al_num;
	private int c_num;
	private String stu_id;
	private int a_status;
	private String name;
	private int todayAttendChk;
	@Override
	public String toString() {
		return "Al_Status [al_num=" + al_num + ", c_num=" + c_num + ", stu_id=" + stu_id + ", a_status=" + a_status
				+ ", name=" + name + ", todayAttendChk=" + todayAttendChk + "]";
	}
	
}
