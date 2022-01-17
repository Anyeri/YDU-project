package com.oracle.yduProject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberInfo {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int yducode;
	private int autority;
	private int mem_status;
	private String t_numArr;
	private String t_necessaryArr;
	private String t_numArrs;
	private String t_necessaryArrs;
	
	private String resultMsg;
	private String subResultMsg;
	
	@Override
	public String toString() {
		return "MemberInfo [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", yducode=" + yducode
				+ ", autority=" + autority + ", mem_status=" + mem_status + ", t_numArr=" + t_numArr
				+ ", t_necessaryArr=" + t_necessaryArr + ", t_numArrs=" + t_numArrs + ", t_necessaryArrs="
				+ t_necessaryArrs + ", resultMsg=" + resultMsg + ", subResultMsg=" + subResultMsg + "]";
	}

}