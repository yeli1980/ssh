package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ProductDao;
import com.ssh.domain.Product;

@Transactional
public class ProductService {
	//ҵ���ע��DAO����
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
	//ҵ��㱣����Ʒ�ķ���
	public void save(Product product) {
		System.out.println("Service�е�save����ִ����....");
		productDao.save(product);
	}

}
