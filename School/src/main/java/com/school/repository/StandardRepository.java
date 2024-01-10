package com.school.repository;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.school.entity.StandardEntity;

@Repository
@Transactional
public class StandardRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void save(StandardEntity standard) {
		hibernateTemplate.save(standard);
	}
}
