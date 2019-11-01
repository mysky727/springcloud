package com.ibm.team.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.team.service.service.RTCService;

@Service
public class UserService {

	@Autowired
	private RTCService rtcService;

	public String showUser() {
		return rtcService.getRTCInfo();
//		return "test";
	}
}