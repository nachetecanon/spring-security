package org.krams.tutorial.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements
		AuthenticationSuccessHandler {

	protected static Logger logger = Logger.getLogger("security");

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		
			logger.debug("Authentication success");
			
		  	HttpServletResponse httpResponse = (HttpServletResponse) response;
	        httpResponse.sendError(HttpServletResponse.SC_OK, "Authentication success");
	}

}
