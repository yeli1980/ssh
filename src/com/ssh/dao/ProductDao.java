package com.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ssh.domain.Product;

public class ProductDao extends HibernateDaoSupport{

	public void save(Product product) {
		System.out.println("DAO中的save方法执行了....");
		//基于appcation.xml中配置Dao类注入的的sessionFactory
		this.getHibernateTemplate().save(product);
	}

}
