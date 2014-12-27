package com.neusoft.patientio.utils;

import net.sf.json.JSONObject;

public class AjaxUtil {
	public static final String closeCurrent = "closeCurrent";
	
	public static JSONObject getSuccessJSON(){
		
		return getSuccessJSON("");
	}
	
	public static JSONObject getSuccessJSON(String callbackType){		
		return getSuccessJSON(callbackType,"");
	}
	
	public static JSONObject getSuccessJSON(String callbackType, String navTabId){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("statusCode", 200);
		jsonObject.put("message", "操作成功");
		jsonObject.put("navTabId", navTabId);
		jsonObject.put("rel", "");
		jsonObject.put("callbackType", callbackType);
		jsonObject.put("forwardUrl", "");
		
		return jsonObject;
	}

}
