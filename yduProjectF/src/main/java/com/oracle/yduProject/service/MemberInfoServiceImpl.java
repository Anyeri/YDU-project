package com.oracle.yduProject.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.yduProject.dao.MemberInfoDao;
import com.oracle.yduProject.model.C_Name_List_RVO;
import com.oracle.yduProject.model.C_Stu_Info;
import com.oracle.yduProject.model.MemberInfo;
import com.oracle.yduProject.model.Terms;

@Repository
public class MemberInfoServiceImpl implements MemberInfoService{
	@Autowired
	private MemberInfoDao mid;
	
	@Override
	public List<Terms> TermsList() {
		
		return mid.TermsList();
	}

	@Override
	public String confirmId(String id) {
		return mid.confirmId(id);
	}

	@Override
	public C_Name_List_RVO loginChk(HttpServletRequest request, MemberInfo memberInfo) {
		String loginChkResult=null;
		C_Name_List_RVO rVO = new C_Name_List_RVO();
		int loginChk = mid.loginChk(memberInfo);
		System.out.println("service loginChk::::"+loginChk);
		
		if(loginChk==4) {
			MemberInfo bringMemberInfo = mid.bringMemberInfo(memberInfo);
			HttpSession session = request.getSession();
			session.setAttribute("sessionId", memberInfo.getId());
			session.setAttribute("sessionMem_status", bringMemberInfo.getMem_status());
			session.setAttribute("sessionAutority", bringMemberInfo.getAutority());
			session.setAttribute("sessionName", bringMemberInfo.getName());
			System.out.println("session mem_status :::: "+ session.getAttribute("sessionMem_status"));
			System.out.println("session mem_status :::: "+ session.getAttribute("sessionAutority"));
			if(bringMemberInfo.getAutority() == 1) {
				mid.createCStuInfo(rVO, bringMemberInfo.getId());
				loginChkResult = "loginok";
			} else {
				loginChkResult = "loginok";
			}
		} else if(loginChk==3) {
			loginChkResult = "withdraw";
		} else if(loginChk==2) {
			loginChkResult = "waiting";
		}
		
		else if(loginChk==1) {
			loginChkResult = "pwError";
		} else {
			loginChkResult = "idError";
		}
		
		rVO.setResult(loginChkResult);
		return rVO;
	}

	@Override
	public MemberInfo join(MemberInfo memberInfo) {
		MemberInfo result = new MemberInfo();
		if(memberInfo.getYducode()<600000) {
			memberInfo.setAutority(1);
		} else {
			memberInfo.setAutority(2);
		}
		System.out.println("join memberInfo Autority :::: "+memberInfo.getAutority());
		int joinMember = mid.joinMember(memberInfo);
		
		if(joinMember > 0) {
			int joinTerms = 0;
			String t_numArr = memberInfo.getT_numArr();
			String t_necessaryArr = memberInfo.getT_necessaryArr();
			
			String[] t_numArrs = t_numArr.split(","); // 1,2,3,4,5
			String[] t_necessaryArrs = t_necessaryArr.split(","); // Y,Y,Y,N,Y
			for(int i=0; i<t_numArrs.length; i++) {
				//여기서 약관정보 insert 따로
				memberInfo.setT_numArrs(t_numArrs[i]);
				memberInfo.setT_necessaryArrs(t_necessaryArrs[i]);
				joinTerms = mid.joinTerms(memberInfo);
			}
			if(joinTerms > 0) {
				result.setResultMsg(memberInfo.getName()+"님의 회원가입을 축하합니다.");
				result.setSubResultMsg("y");
			} else {
				result.setResultMsg("약관 처리에 오류가 발생하였습니다.");
			}
		} else {
			result.setResultMsg("회원가입 도중 오류가 발생하였습니다.");
		}
		return result;
	}



}
