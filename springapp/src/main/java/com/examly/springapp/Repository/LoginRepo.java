package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.Login;




@Repository
public interface LoginRepo extends JpaRepository<Login,String> {

}
