package project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import project.beans.*;
import project.beans.availableProduct;
import project.dao.ProductDAO;

@Controller
public class productController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping(value="/")
	public String home()
	{
		System.out.println("hello");
		return "index";
	}
	
	@RequestMapping(value="/adminHome")
	public String adminHome(Model m)
	{
		List<availableProduct> list=productDAO.listAvailableProducts();
		m.addAttribute("products",list);
		System.out.println("hello");
		for(availableProduct i:list)
		{
			System.out.println(i.getName());
		}
		return "adminHome";
	}
	
	
	public String middleC(Model m) {
		Complex c=new Complex();
		m.addAttribute("obj", c);
		c.setShops(0);
		System.out.println(c.getShops());
		System.out.print("in addc");
		return "addComplex";	
	}
	
	public String middleO(Model m) {
		Office c=new Office();
		m.addAttribute("obj", c);
		System.out.println(c.getClass());
		return "addOffice";	
	}
	
	public String middleV(Model m) {
		Villa c=new Villa();
		m.addAttribute("obj", c);
		System.out.println(c.getClass());
		return "addVilla";	
	}
	
	public String middleH(Model m) {
		Hospital c=new Hospital();
		m.addAttribute("obj", c);
		System.out.println(c.getClass());
		return "addHpspital";		
	}
	
	@RequestMapping(value="/addProduct")
	public String addProduct(@RequestParam int  pid,Model m ) {
		String name=productDAO.getProductById(pid);
		System.out.println("in addP");
		System.out.println(name);
		String c="Complex";
		String v="Villa";
		String o="Office";
		String h="Hospital";
		if(name.equals(c))
		{
			System.out.println("in addC");
			middleC(m);
		}
		else if(name.equals(v))
		{
			middleV(m);	
		}
		else if(name.equals(o))
		{
			middleO(m);
		}
		else if(name.equals(h))
		{
			middleH(m);
		}
		else {
		ResidentialBuilding c1=new ResidentialBuilding();
		m.addAttribute("obj", c1);
		System.out.println(c1.getClass());
		return "addResidentialBuilding";	
		}
		
		return "add"+name;
		
	}
	
	
	@RequestMapping(value="/addHospital")
	public String addHospital(Hospital h,Model m,HttpServletRequest request) {
		String i=request.getParameter("oid");
		productDAO.adHospital(h,i);
		Hospital c=new Hospital();
		m.addAttribute("obj", c);
		return "addHospital";
	}
	
	@RequestMapping(value="/addComplex")
	public String addComplex(Complex h,Model m,HttpServletRequest request) {
		String i=request.getParameter("oid");
		productDAO.adComplex(h,i);
		Complex c=new Complex();
		m.addAttribute("obj", c);
		return "addComplex";
	}
	
	@RequestMapping(value="/addVilla")
	public String addVilla(Villa h,Model m,HttpServletRequest request) {
		String i=request.getParameter("oid");
		productDAO.adVilla(h,i);
		Villa c=new Villa();
		m.addAttribute("obj", c);
		return "addVilla";
	}
	
	@RequestMapping(value="/addOffice")
	public String addOffice(Office h,Model m,HttpServletRequest request) {
		String i=request.getParameter("oid");
		productDAO.adOffice(h,i);
		Office c=new Office();
		m.addAttribute("obj", c);
		return "addOffice";
	}
	
	@RequestMapping(value="/addResidentialBuilding")
	public String addResidentialBuilding(ResidentialBuilding h,Model m,HttpServletRequest request) {		String i=request.getParameter("oid");
		
		productDAO.adResidentialBuilding(h,i);
		ResidentialBuilding c=new ResidentialBuilding();
		m.addAttribute("obj", c);
		return "addResidentialBuilding";	
	}
	
	@RequestMapping(value="/viewAll")
	public String viewAll(@RequestParam int  pid,HttpServletRequest req,Model m) {
		System.out.println("jenkin");
		String name=productDAO.getProductById(pid);
		System.out.println("jenkin");
		List<Product>list=productDAO.listProducts(pid,name);
		m.addAttribute("list",list);
		m.addAttribute("name", name);
		System.out.println("jenkin");
		return "viewAll";
	}
	
	@RequestMapping(value="/update")
	public String update(@RequestParam int pid,@RequestParam String classs,HttpServletRequest req,Model m) {
		System.out.println("hello");
		Product p=productDAO.findProduct(pid,classs);
		System.out.println("shrey");
		m.addAttribute("obj", p);
		return "update"+classs;
	}
	
	@RequestMapping(value="/updateHospital")
	public void updateH(Hospital h,Model m,HttpServletRequest request) {
		String i=request.getParameter("oid");
		productDAO.updateHospital(h);
		m.addAttribute("obj", h);
		viewAll(1,request,m);
	}
}
