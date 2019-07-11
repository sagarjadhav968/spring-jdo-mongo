package com.sj;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sagar
 * THIS CLASS IS USED FOR LOADING DB CONFIGURATION FROM PERSITANT XML AND CREATE STATIC INSTACE FOR SHARABLE
 */
@Configuration
public class DBConfig {

	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("PersistenceUnit");

	
	@Bean
	public PersistenceManagerFactory getPersitantManagerFactory() {
		return PMF;
	}
}
