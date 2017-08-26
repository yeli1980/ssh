package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.ProductDao;
import com.ssh.domain.Product;

@Transactional
public class ProductService {
	//业务层注入DAO的类
	private ProductDao productDao;
	
	public void setProductDao(ProductDao productDao){
		this.productDao = productDao;
	}
	
	//业务层保存商品的方法
	public void save(Product product) {
		System.out.println("Service中的save方发执行了....");
		productDao.save(product);
	}

}
