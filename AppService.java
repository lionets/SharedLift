package com.amarsoft.app.service;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amarsoft.app.service.util.ServiceUtil;
import com.amarsoft.are.ARE;
import com.amarsoft.are.util.DataConvert;

@SuppressWarnings("serial")
public class AppService extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		doPost(req, resp);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)  {
		try {
			String sTransMessage = request.getParameter("TransMessage");
			String sMethod = request.getParameter("Method");
			if (sTransMessage == null)
				sTransMessage = "";
			String rMap = "";
			sTransMessage = URLDecoder.decode(sTransMessage, "GBK");
			ARE.getLog().info("接收报文：" + sTransMessage);
			ServiceUtil util = new ServiceUtil();
			rMap = util.jsonMessage(sMethod,sTransMessage);
			ARE.getLog().info("返回报文：" + rMap);
			rMap = URLEncoder.encode(rMap, "GBK");
			// 返回
			ServletOutputStream outStream = response.getOutputStream();
			outStream.println(DataConvert.toRealString(3, rMap));
			outStream.flush();
			outStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
