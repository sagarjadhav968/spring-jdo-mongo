package com.sj.repository.user;

import com.sj.model.UserInfo;

/**
 * @author sagar 
 * THIS INTERFACE ABSTRACT THE USER IMPLMENRATION FROM DB
 */
public interface UserInfoRepository {

	public UserInfo save(final UserInfo userInfo);
}
