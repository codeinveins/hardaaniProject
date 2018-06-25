package com.sunaniya.hardaani.service;

import com.sunaniya.hardaani.bean.User;

public interface UserService {

	
/*	Response prepareMailSentResponse(String activationLinkSaved, Response mailResponse, String usermail);
	String saveActivationLink(String usermail);
*/	
	User saveAll(User u);
	
}
