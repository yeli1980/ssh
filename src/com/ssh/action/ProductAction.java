package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.Product;
import com.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//模型驱动使用的类
	private Product product = new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	//struts和spring整合过程中按名称注入的业务层类	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public String save(){
		System.out.println("Action的save方法执行了....");
		productService.save(product);
		return NONE;
	}

	
	

}
