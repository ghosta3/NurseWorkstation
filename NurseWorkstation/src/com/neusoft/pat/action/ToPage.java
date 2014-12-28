package com.neusoft.pat.action;

import com.opensymphony.xwork2.ActionSupport;

public class ToPage extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5690552043689260746L;
	
	public String checkMoneyPage(){
		return "checkMoney";
	}
	
	public String advListPage(){
		return "advList";
	}
	
	public String decuteMoneyPage(){
		return "decuteMoney";
	}

}
