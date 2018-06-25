package com.sunaniya.hardaani.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sunaniya.hardaani.bean.Response;
import com.sunaniya.hardaani.bean.User;
import com.sunaniya.hardaani.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	User  status;
	
	@PostMapping(value = "/v1/userDetails")
	public ResponseEntity<Response> submit(HttpServletRequest request, HttpSession session, @RequestBody User user) {
		try {
			status = userService.saveAll(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (null != status) {
			
			Response restResponse = new Response();
			restResponse.setResponseCode(HttpStatus.OK.value());
			restResponse.setResponseMessage("User Saved Successfully.");
			restResponse.setResponseData(null);
			return ResponseEntity.ok().body(restResponse);

		}
		else {
			Response restResponse = new Response();
			restResponse.setResponseCode(HttpStatus.OK.value());
			restResponse.setResponseMessage("User Not Saved Successfully.");
			restResponse.setResponseData(null);
			return ResponseEntity.ok().body(restResponse);	
		}
		
	}

}
