package com.emreshome.Shopping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.emreshome.Shopping.Entity.Product;
import com.emreshome.Shopping.Service.ProductService;

@Controller
public class MainController {
	
	/*TODO
	 * 
	 *@Autowired
	 *
	 *private ProductService productService;
	*/
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String hello(ModelMap model){
		System.out.println("hello");
		return "index";
	}
	
	@RequestMapping(value = "/list",method=RequestMethod.POST)
	public String list(ModelMap model,@ModelAttribute("name") String name) {
		model.addAttribute("name",name);
		//List<Product> P=productService.findAll();
		
		/*for(Product p:P){
			
			System.out.println(p.getPrice());
		}*/
		return "list";
	}
}
