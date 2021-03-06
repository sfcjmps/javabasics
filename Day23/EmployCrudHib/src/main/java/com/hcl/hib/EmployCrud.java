package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployCrud {
	public List<Employ> showEmploy() {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ");
		List<Employ> lst = q.list();
		return lst;
	}
	
	public Employ searchEmploy(int empno) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employ where empno = " + empno);
		Employ ems = null;
		List<Employ> lst = q.list();
		if (lst.size() != 0) {
			ems = lst.get(0);
		}
		return ems;
	}
	
	public String insertEmploy(Employ e) {
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(e);
		t.commit();
		return "Record Inserted..."; 
	}
	
	public String updateEmploy(Employ E) {
		Employ res = searchEmploy(E.getEmpno());
		res.setName(E.getName());
		res.setDept(E.getDept());
		res.setDesig(E.getDesig());
		res.setBasic(E.getBasic());
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.update(res);
		t.commit();
		return "Record Updated";
	}
	
	public String deleteEmploy(int empno) {
		Employ e = searchEmploy(empno);
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(e);
		t.commit();
		return "Record Deleted";
	}
}
