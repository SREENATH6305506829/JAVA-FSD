package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class EProductController {

	@Autowired
	private EProductDAO eproductdao;

	@RequestMapping(value = "/ProductList", method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		map.addAttribute("eproduct", new EProductEntity());
		map.addAttribute("productList", eproductdao.getAllProducts());
		return "productList";
	}
}
