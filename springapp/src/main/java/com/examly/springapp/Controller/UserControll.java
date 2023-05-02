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
import com.examly.springapp.Model.Order;
import com.examly.springapp.Model.Theme;
import com.examly.springapp.Model.User;
import com.examly.springapp.Service.AdminService;
import com.examly.springapp.Service.UserService;




@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserControll {
	
	@Autowired
	private AdminService service;
	
	@Autowired
	private UserService userservice;
	
//	@PostMapping("/login")
//	public boolean userlogin(@RequestBody Login login )
//	{
//	 return userservice.loginuser(login);
//	}
//	
//	@PostMapping("/signup")
//	public User adduser(@RequestBody User user)
//	{
//	return userservice.useradd(user);
//	}
	@GetMapping("user/getGift")
    public List<Gift> viewGift()
    {
    	return userservice.ViewGift();
    }
	
	@GetMapping("getAllThemes")
	public List<Theme> gettheme()
	{
		return userservice.themeget();
	}
	
	@GetMapping("user/getAllOrders")
    public List<Order> ViewOrders()
    {
    	return userservice.vieworder();
    }
	
	@PostMapping("selectTheme")
	public Theme themeselect(@RequestBody Theme theme)
	{
		return userservice.selectTheme(theme);
	}
	@PostMapping("selectGift")
	public Gift selectGift(@RequestBody Gift gift)
	{
		return userservice.selectgift(gift);
	}
	@PostMapping("addOrder")
	public Order addOrder(@RequestBody Order order) {
		return userservice.addOrder(order);
	}
	@PutMapping("user/editOrder/{orderId}")
	public Order editOrder(@PathVariable int orderId,@RequestBody Order order) {
		return userservice.editorders(orderId,order);
	}
	@DeleteMapping("user/deleteOrder/{orderId}")
	public String deleteOrder(@PathVariable int orderId) {
		 userservice.deleteorders(orderId);
		 return "Order no."+orderId+" deleted successfully";
	}
	@GetMapping("")
	public List<User> getallUser(){
		return userservice.getallUser();
	}
	@PostMapping("customer/addprofile")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
	}
	@PostMapping("login")
	public boolean isUserPresent(@RequestBody User user) {
		return userservice.checklogin(user);
	}
}
	
