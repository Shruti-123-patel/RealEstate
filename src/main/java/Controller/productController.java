package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productController {
	
	@RequestMapping(value="/")
	public String home()
	{
		System.out.println("hello");
		return "index";
	}
}
