package project.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

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
	
	@RequestMapping(value="/addComplex",method=RequestMethod.POST,consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
	public String addComplex(@RequestParam CommonsMultipartFile img, Complex h,Model m,HttpServletRequest request,HttpSession s) {
		String i=request.getParameter("oid");
		byte[] data=img.getBytes();
		String path=s.getServletContext().getRealPath("/")+"assets"+File.separator+"images"+File.separator+img.getOriginalFilename();
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.print("file uploaded");
		}catch(IOException E) {
			E.printStackTrace();
		}
		String name=img.getOriginalFilename();
		productDAO.adComplex(h,i,name);
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
		
		System.out.println(p);
		m.addAttribute("obj", p);
		return "update"+classs;
	}
	
	@RequestMapping(value="/updateHospital")
	public void updateH(Hospital h,Model m,HttpServletRequest request) {
		int i=Integer.parseInt(request.getParameter("oid"));
		
		h.setId(h.getId());
		productDAO.updateHospital(h,i);
		m.addAttribute("obj", h);
		viewAll(1,request,m);
	}
	
	@RequestMapping(value="/updateVilla")
	public void updateV(Villa h,Model m,HttpServletRequest request) {
		int i=Integer.parseInt(request.getParameter("oid"));
		
		h.setId(h.getId());
		productDAO.updateVilla(h,i);
		m.addAttribute("obj", h);
		viewAll(5,request,m);
	}
	
	@RequestMapping(value="/updateOffice")
	public void updateO(Office h,Model m,HttpServletRequest request) {
		int i=Integer.parseInt(request.getParameter("oid"));
		
		h.setId(h.getId());
		productDAO.updateOffice(h,i);
		m.addAttribute("obj", h);
		viewAll(4,request,m);
	}
	
	@RequestMapping(value="/updateComplex")
	public void updateC(Complex h,Model m,HttpServletRequest request) {
		int i=Integer.parseInt(request.getParameter("oid"));
		
		h.setId(h.getId());
		productDAO.updateComplex(h,i);
		m.addAttribute("obj", h);
		viewAll(3,request,m);
	}
	
	@RequestMapping(value="/updateResidentialBuilding")
	public void updateR(ResidentialBuilding h,Model m,HttpServletRequest request) {
		int i=Integer.parseInt(request.getParameter("oid"));
		
		h.setId(h.getId());
		productDAO.updateResidentialBuilding(h,i);
		m.addAttribute("obj", h);
		viewAll(2,request,m);
	}
	
	@RequestMapping(value="/removeProduct")
	public void removeProduct(@RequestParam String classs,@RequestParam int pid,Model m,HttpServletRequest request) {
		
		Product p=productDAO.findProduct(pid, classs);
		productDAO.removeProduct(p);
		
	}
	
}
