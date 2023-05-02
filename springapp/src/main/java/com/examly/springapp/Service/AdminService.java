package com.examly.springapp.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Model.Gift;
import com.examly.springapp.Model.Login;
import com.examly.springapp.Model.Theme;
import com.examly.springapp.Repository.GiftRepo;
import com.examly.springapp.Repository.LoginRepo;
import com.examly.springapp.Repository.OrderRepo;
import com.examly.springapp.Repository.ThemeRepo;
import com.examly.springapp.Repository.UserRepo;






@Service
public class AdminService {

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
	

	public boolean addadmin(Login login) {
		// TODO Auto-generated method stub
		return loginrepo.save(login)!=null?true:false;
	}

	public Theme addTheme(Theme theme) {
		// TODO Auto-generated method stub
		return themerepo.save(theme);
	}

	public List<Theme> getTheme() {
		// TODO Auto-generated method stub
		return themerepo.findAll();
	}

	public Theme editTheme(Theme theme) {
		// TODO Auto-generated method stub
		return themerepo.save(theme);
	}

	public void deletetheme(int themeId) {
		// TODO Auto-generated method stub
	themerepo.deleteById(themeId);	
	}

	public Gift addGift(Gift gift) {
		// TODO Auto-generated method stub
		return giftrepo.save(gift);
	}

	public List<Gift> ViewGift() {
		// TODO Auto-generated method stub
		return giftrepo.findAll();
	}

	public Gift editgift(Gift gift) {
		// TODO Auto-generated method stub
		return giftrepo.save(gift);
	}

	public void deletegift(int giftId) {
		// TODO Auto-generated method stub
		giftrepo.deleteById(giftId);
	}

//	public User addUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<User> getallUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public boolean checklogin(User user) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	
 
	
	}
	
	
	
	
	
	

