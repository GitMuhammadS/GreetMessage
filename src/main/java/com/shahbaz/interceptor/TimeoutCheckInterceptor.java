package com.shahbaz.interceptor;

import java.time.LocalDateTime;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeoutCheckInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//get the time
		/*LocalDateTime lt=LocalDateTime.now();
		//convert to hour
		int hour=lt.getHour();
		System.out.println("hour: "+hour);
		if(hour==16) {
			RequestDispatcher rd=request.getRequestDispatcher("/timeout.jsp");
			rd.forward(request, response);
			return false;
		}*/
		
		String header=request.getHeader("User-Agent");
		System.out.println("Header: "+header);
		 if(header=="Edg/114.0.1823.58") {
			RequestDispatcher rd=request.getRequestDispatcher("/timeout.jsp");
			rd.forward(request, response);
			return false;
		}
		return true;
	}
}
