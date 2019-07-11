package com.sj.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Consumer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.model.UserInfo;
import com.sj.service.user.UserService;

@RestController
@RequestMapping(value = "/api/userinfo")
public class UserInfoController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfo save(@RequestBody UserInfo userInfo) {
		return userService.save(userInfo);
	}
}
