package com.emreshome.Shopping;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.emreshome.Shopping.Entity.Product;
import com.emreshome.Shopping.Entity.User;
import com.emreshome.Shopping.Service.ProductService;
import com.emreshome.Shopping.Service.UserService;
import com.emreshome.Shopping.repositories.UserRepository;

@Controller
public class MainController {
	 
	 @Autowired 
	 private ProductService productService;
	
	 @Autowired 
	 private UserService userService;
	
	
	 public boolean isAuthenticated(){

	       Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	       return authentication != null && !(authentication instanceof AnonymousAuthenticationToken) && authentication.isAuthenticated();

	   }
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String hello(ModelMap model){
		
		 if(isAuthenticated()){
			  Object userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			  User u=userService.findByUsername(((org.springframework.security.core.userdetails.User)userDetails).getUsername());
			  model.addAttribute("realname", u.getName());
		  }	
		  
		return "index";
	}
	
	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String list(ModelMap model) {
		List<Product> P=productService.findAll();
		for(Product p:P){
			System.out.println(p.toString());
			
		}
		 if(isAuthenticated()){
			  Object userDetails = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			  User u=userService.findByUsername(((org.springframework.security.core.userdetails.User)userDetails).getUsername());
			  model.addAttribute("realname", u.getName());
		  }	
		  
		  model.addAttribute("items", P);
		return "list";
	}
	@RequestMapping(value = "/list",method=RequestMethod.POST)
	public String addProduct(ModelMap model, @ModelAttribute Product product){
		product.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
		productService.save(product);
		return "redirect:/list";
		
	}
	@RequestMapping(value = "/manager",method=RequestMethod.GET)
	public String manager(ModelMap model) {
		List<Product> P=productService.findAll();
		for(Product p:P){
			System.out.println(p.toString());
			
		}
	
		model.addAttribute("items", P);
		return "manager";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model, String error, String logout){
		 if (error != null){
	            model.addAttribute("error", "Your username and password is invalid.");
	            
	            return "login";
		 }
		 if (logout != null){
	            model.addAttribute("message", "You have been logged out successfully.");
	            return "login";
		 }
		
		 return "login";
	     
		
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	}
}
