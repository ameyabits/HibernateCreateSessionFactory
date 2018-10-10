package com.infotech.util;

import org.hibernate.HibernateException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	
	static {
		try {
			if(sessionFactory==null) {
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void closeSessionFactory() {
		sessionFactory.close();
	}
}
