package com.sj.repository.user;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sj.model.UserInfo;

/**
 * @author sagar REPOSITORY ANNOTATION REQUIRED FOR STORARE, RETRIVE ,UPDATE
 *         ,DELETE AND SEARCH OPERATION WHICH IS DAO PATTERNS (DATA ACCESS
 *         OBJECT ) WHICH RESPOSIBLE CURD OPERATION WITH DB THIS ANNORATION
 *         SPECIALIZATION OF COMPONENT ANNORATION WHICH IS IN SPRING FRAMEWORK
 */
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

	@Autowired
	private PersistenceManagerFactory pmf;

	@Override
	public UserInfo save(final UserInfo userInfo) {
		PersistenceManager pm = pmf.getPersistenceManager();
		UserInfo info = pm.makePersistent(userInfo);
		return (UserInfo) info;
	}

}
