package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.domain.Product;
import com.ssh.service.ProductService;

public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	
	//ģ������ʹ�õ���
	private Product product = new Product();
	
	@Override
	public Product getModel() {
		return product;
	}
	//struts��spring���Ϲ����а�����ע���ҵ�����	
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	public String save(){
		System.out.println("Action��save����ִ����....");
		productService.save(product);
		return NONE;
	}

	
	

}
