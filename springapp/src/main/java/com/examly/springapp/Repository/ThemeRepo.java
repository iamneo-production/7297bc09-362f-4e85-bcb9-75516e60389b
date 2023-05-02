package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.Theme;



@Repository
public interface ThemeRepo extends JpaRepository<Theme,Integer> {

}
