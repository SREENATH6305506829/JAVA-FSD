package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.entity.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class MainController {
	@Autowired
	EProductDAO eproductDAO;

	@GetMapping(value = "/listProduct")
	public String listProducts(ModelMap map) {
		List<EProduct> list = eproductDAO.getProducts();
		map.addAttribute("list", list);
		return "listProducts";
	}
}