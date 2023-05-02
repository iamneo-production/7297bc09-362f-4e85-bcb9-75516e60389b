package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.User;



@Repository
public interface UserRepo extends JpaRepository<User,String> {

	User findByEmailAndPassword(String email, String password);

}
