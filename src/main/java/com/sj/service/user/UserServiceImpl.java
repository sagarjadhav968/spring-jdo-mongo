package com.sj.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.model.UserInfo;
import com.sj.repository.user.UserInfoRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoRepository infoRepository;

	@Override
	public UserInfo save(final UserInfo userInfo) {
		UserInfo userInfo2 = infoRepository.save(userInfo);
		return userInfo2;
	}
}
