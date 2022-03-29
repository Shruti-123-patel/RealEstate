package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import project.beans.Product;
import project.dao.ProductDAO;


@Controller
public class generalController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/resi")
	String resi(Model m) {
		List<Product>h=productDAO.listProducts(2,"ResidentialBuilding");
		m.addAttribute("obj",h);
		System.out.println(h);
		return "house";
	}
	
	@RequestMapping("/villa")
	String villa(Model m) {
		List<Product>h=productDAO.listProducts(5,"Villa");
		m.addAttribute("obj",h);
		System.out.println(h);
		return "Villa";
	}
	
	@RequestMapping("/hospital")
	String hospital(Model m) {
		List<Product>h=productDAO.listProducts(1,"Hospital");
		m.addAttribute("obj",h);
		System.out.println(h);
		return "hospital";
	}
	
	@RequestMapping("/complex")
	String complex(Model m) {
		List<Product>h=productDAO.listProducts(3,"Complex");
		m.addAttribute("obj",h);
		System.out.println(h);
		return "complex";
	}
	
	@RequestMapping("/office")
	String office(Model m) {
		List<Product>h=productDAO.listProducts(4,"Office");
		m.addAttribute("obj",h);
		System.out.println(h);
		return "office";
	}
}
