package com.skillindia.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.skillindia.model.Institution;

public class InstitutionDaoImpl implements InstitutionDao {

	private static final Logger logger = 
			LoggerFactory.getLogger(InstitutionDaoImpl.class);

			private SessionFactory sessionFactory;

			@Autowired
			public void setSessionFactory(SessionFactory sf) {
			this.sessionFactory = sf;
			}

			@Override
			public void addInstitution(Institution p) {
			Session session = this.sessionFactory.getCurrentSession();
			session.persist(p);
			logger.info("Institution saved successfully, Institution Details= " + p);
			}

			@Override
			public void updateInstitution(Institution p) {
			Session session = 
			this.sessionFactory
			.getCurrentSession();
			session.update(p);
			logger.info("Institution updated successfully, " + "Institution Details=" + p);
			}

			@SuppressWarnings("unchecked")
			@Override
			public List<Institution> listInstitutions() {
			Session session = this.sessionFactory.getCurrentSession();
			List<Institution> InstitutionsList = session.createQuery("from Institution").list();
			for (Institution p : InstitutionsList) 
			{
			logger.info("Institution List::" + p);
			}
			return InstitutionsList;
			}

			@Override
			public Institution getInstitutionByName(String name) {
			Session session = this.sessionFactory.getCurrentSession();
			Institution p = (Institution) session.load(Institution.class, new String(name));
			logger.info("Institution loaded successfully, Institution details=" + p);
			return p;
			}

			@Override
			public void removeInstitutionByName(String name) {
			Session session = this.sessionFactory.getCurrentSession();
			Institution p = 
			(Institution) session.load(Institution.class, new String(name));
			if (null != p) {
			session.delete(p);
			}
			else {
			logger.error
			("Institution NOT deleted, with Institution Id=" +name);
			}
			logger.info("Institution deleted successfully, Institution details=" + p);
			}

}
