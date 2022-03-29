package project.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.beans.Customer;
import project.beans.agent;
import project.beans.availableProduct;
import project.dao.AgentDAO;
import project.dao.CustomerDAO;
import project.dao.ProductDAO;

@Controller
public class adminController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CustomerDAO customerDAO;
	
	@Autowired
	AgentDAO agentDAO;

	@RequestMapping(value="/adminAgent")
	String agent(Model m) {
		List<agent> c=agentDAO.listAvailableAgents();
		m.addAttribute("agent",c);
		return "adminAgent";
	}
	
	@RequestMapping(value="/addAgentAfter")
	String agentAdd(agent a,Model m) {
		agentDAO.Add(a);
		agent n=new agent();
		m.addAttribute("a",n);
		return "addAgent";
	}
	
	@RequestMapping(value="/searchAgent")
	String searchAgent(HttpServletRequest req,Model m) {
		String c=req.getParameter("agent");
		List<agent> list=agentDAO.listAvailableAgentByName(c);
		m.addAttribute("admin",list);
		return "adminAgent";
	}
	
	@RequestMapping(value="/addAgent")
	String addAgent(Model m) {
		agent a=new agent();
		m.addAttribute("a",a);
		return "addAgent";
	}
	
	@RequestMapping(value="/updateAgent")
	String updateAgent(@RequestParam int id,Model m) {
		agent a=agentDAO.getAgentById(id);
		m.addAttribute("a",a);
		return "updateAgent";
	}
	
	@RequestMapping(value="/adminCust")
	String customer(Model m) {
		List<Customer> c=customerDAO.listAvailableCustomer();
		m.addAttribute("customer",c);
		return "adminCustomer";
	}
	
	@RequestMapping(value="/searchProduct")
	String searchProduct(HttpServletRequest req,Model m) {
		String requiredProduct=req.getParameter("product");
		List<availableProduct> list=productDAO.listAvailableProductsByName(requiredProduct);
		m.addAttribute("products",list);
//		System.out.println("hello");
//		for(availableProduct i:list)
//		{
//			System.out.println(i.getNamme());
//		}
		return "adminProduct";
	}
	
	@RequestMapping(value="/searchCustomer")
	String searchCustomer(HttpServletRequest req,Model m) {
		String c=req.getParameter("customer");
		List<Customer> list=customerDAO.listAvailableCustomerByName(c);
		m.addAttribute("customer",list);
		return "adminCustomer";
	}
	
	@RequestMapping(value="/removeCustomer")
	String removeCustomer(@RequestParam int id,Model m) {
		customerDAO.Remove(id);
		System.out.print("hey!!");
		List<Customer> c=customerDAO.listAvailableCustomer();
		m.addAttribute("customer",c);
		return "adminCustomer";
	}
	
	@RequestMapping(value="/updateCustomer")
	String updateCustomer(@RequestParam int cid,Model m) {
		Customer c=customerDAO.getCustomerById(cid);
		m.addAttribute("obj",c);
		return "updateCustomer";
	}
	
	@RequestMapping(value="/updateCustomerAfter")
	String updateCustomerAfter(Customer c,HttpServletRequest req) {
		System.out.println(c);
		customerDAO.Update(c);
		HttpSession session=req.getSession();
		session.setAttribute("username",c.getName());
		return "index";
	}
	
	

}
	
