package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.Gift;
import com.examly.springapp.Model.Order;
import com.examly.springapp.Model.Theme;
import com.examly.springapp.Model.User;
import com.examly.springapp.Repository.GiftRepo;
import com.examly.springapp.Repository.LoginRepo;
import com.examly.springapp.Repository.OrderRepo;
import com.examly.springapp.Repository.ThemeRepo;
import com.examly.springapp.Repository.UserRepo;


@Service
public class UserService {

	@Autowired
	private GiftRepo giftrepo;
	
	@Autowired
	private ThemeRepo themerepo;
	
	@Autowired
	private OrderRepo orderrepo;
	
	@Autowired
	private LoginRepo loginrepo;
	
	@Autowired
	private UserRepo userrepo;
	
	
	
	public List<Order> vieworder() {
		// TODO Auto-generated method stub
		return orderrepo.findAll();
	}


	public Order editorder(Order order) {
		// TODO Auto-generated method stub
		return orderrepo.save(order);
	}


	public void deleteorder(int id) {
		// TODO Auto-generated method stub
	orderrepo.deleteById(id);	
	}


//	public boolean loginuser(Login login) {
//		// TODO Auto-generated method stub
//		return loginrepo.save(login)!=null?true:false;
//	}
//

	


	public List<Theme> themeget() {
		// TODO Auto-generated method stub
		return themerepo.findAll();
	}


	public Theme selectTheme(Theme theme) {
		// TODO Auto-generated method stub
		return themerepo.save(theme);
	}


	public Gift selectgift(Gift gift) {
		// TODO Auto-generated method stub
		return giftrepo.save(gift);
	}




	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return orderrepo.save(order);
	}


	public Order editorders(int orderId, Order order) {
		// TODO Auto-generated method stub
		order.setOrderId(orderId);
		return orderrepo.save(order);
	}


	public void deleteorders(int orderId) {
		// TODO Auto-generated method stub
		 orderrepo.deleteById(orderId);
	}


//	public User useradd(User user) {
//		// TODO Auto-generated method stub
//		return userrepo.save(user);
//	}
	public List<User> getallUser() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
	}
	public boolean checklogin(User user) {
		// TODO Auto-generated method stub
		User foundLogin=userrepo.findByEmailAndPassword(user.getEmail(),user.getPassword());
		if(foundLogin!=null) {
			return true;
		}
		else {
		return false ;
	}
	}


	public List<Gift> ViewGift() {
		// TODO Auto-generated method stub
		return giftrepo.findAll();
	}
}
