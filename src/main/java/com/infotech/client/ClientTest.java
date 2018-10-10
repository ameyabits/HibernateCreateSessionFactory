package com.infotech.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.infotech.util.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()) {
			String SQL="select version()";
			String result= (String)session.createNativeQuery(SQL).getSingleResult();
			System.out.println("MySql version is ::: "+result);
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
	}
	
}
