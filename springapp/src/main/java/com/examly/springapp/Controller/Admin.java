package com.examly.springapp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Model.Gift;
import com.examly.springapp.Model.Login;
import com.examly.springapp.Model.Order;
import com.examly.springapp.Model.Theme;
import com.examly.springapp.Service.AdminService;
import com.examly.springapp.Service.UserService;




@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Admin {

	@Autowired
	private AdminService service;
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("admin/login")
	public boolean AddAdmin(@RequestBody Login login ) {
		return service.addadmin(login);
	}
	
	@PostMapping("addtheme")
	public Theme addTheme(@RequestBody Theme theme) {
		return service.addTheme(theme);
	}
    @GetMapping("gettheme")
    public List<Theme> getTheme(){
    	return service.getTheme();
    	}
    @PutMapping("editTheme/{themeId}")
    public Theme EditTheme(@RequestBody Theme theme,@PathVariable("themeId") int themeId)
    {
    	return service.editTheme(theme);
    }
    @DeleteMapping("deleteTheme/{themeId}")
    public void DeleteTheme(@PathVariable int themeId)
    {
     service.deletetheme(themeId);
    }
    @PostMapping("addgift")
    public Gift AddGift(@RequestBody Gift gift)
    {
    	return service.addGift(gift);
    }
    @GetMapping("getgift")
    public List<Gift> viewGift()
    {
    	return service.ViewGift();
    }
    @PutMapping("Gift/editGift/{giftId}")
    public Gift EditGift(@RequestBody Gift gift,@PathVariable int giftId)
    {
    	return service.editgift(gift);
    }
    @DeleteMapping("Gift/deleteGift/{giftId}")
    public void Deletegift(@PathVariable int giftId)
    {
     service.deletegift(giftId);
    }
    @GetMapping("getAllOrders")
    public List<Order> ViewOrders()
    {
    	return userservice.vieworder();
    }
    @PutMapping("editOrder/{orderId}")
    public Order EditOrders(@RequestBody Order order,@PathVariable int orderId)
    {
   	return userservice.editorder(order);
   }
    @DeleteMapping("deleteOrder/{orderId}")
    public void deleteOrder(@PathVariable("orderId") int orderId)
    {
    	 userservice.deleteorder(orderId); 
    }
}

	

