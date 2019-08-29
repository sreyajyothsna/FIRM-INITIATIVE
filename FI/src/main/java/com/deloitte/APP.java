package com.deloitte;
import java.io.FileNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class APP {

	static HIRE_TABLE userObj;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;
	public static void main(String[] args) {
		try {
			System.out.println(".......Started.......\n");
			sessionFactoryObj = HibernateUtil.buildSessionFactory();
			// Get current session
			Session session = HibernateUtil.getSession();

			// Print out all required information
			System.out.println("Session Is Opened :: " + session.isOpen());
			
			//giving entry	
			HIRE_TABLE_DAO UserDao = new HIRE_TABLE_DAO();
			HIRE_TABLE userObj = new HIRE_TABLE("consulting", 123, 234, 3, 4, 5, 6, 7, 8, 9, 10, "Very Large no. of vacancies");
			HibernateUtil.beginTransaction();
			UserDao.persist(userObj);
			System.out.println("First Entry done and saved succesfully");
			
			// Commit transaction
			HibernateUtil.commitTransaction();
			if (session != null) {
				HibernateUtil.closeSession();
			}		

			//UPDATION
			if(!HibernateUtil.isTransactionActive())	{
				int p1=userObj.getp1();
				Session session2 = HibernateUtil.getSession();
				HibernateUtil.beginTransaction();
				userObj=UserDao.find(p1);
				userObj.setComments("VACANCIES REDUCED");
				userObj.setp2(0);
				UserDao.update(userObj);
				HibernateUtil.commitTransaction();
				System.out.println("Updated Succesfully");
				if (session2 != null) {
					HibernateUtil.closeSession();
				}
			}
		}	
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			HibernateUtil.rollbackTransaction();
		}
	}
}