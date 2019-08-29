package com.deloitte;



public class HIRE_TABLE_DAO {
	

	public void persist(HIRE_TABLE entity) {
		HibernateUtil.getSession().save(entity);
    }
 
    public void update(HIRE_TABLE entity) {
    	
    	HibernateUtil.getSession().update(entity);
    }
 
    public HIRE_TABLE find(int p1) {
       HIRE_TABLE userObj = (HIRE_TABLE)HibernateUtil.getSession().get(HIRE_TABLE.class, p1);
        return userObj; 
    }

}
