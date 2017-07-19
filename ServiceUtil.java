package com.amarsoft.app.service.util;


import com.amarsoft.awe.util.json.JSONObject;
import com.amarsoft.awe.util.json.JSONValue;


public class ServiceUtil {

	public String jsonMessage(String sMethod, String jsonStr) {
		JSONObject jsonObject = new JSONObject();
		// 将接收报文解析
		JSONObject mMessage = (JSONObject)JSONValue.parse(jsonStr);
		InterfaceServiceUtil interSer = new InterfaceServiceUtil();
		try {
			jsonObject = (JSONObject) interSer.getClass().getMethod(sMethod, new Class[] { JSONObject.class }).invoke(interSer, new Object[] { mMessage });
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject.toJSONString();
	}
}
