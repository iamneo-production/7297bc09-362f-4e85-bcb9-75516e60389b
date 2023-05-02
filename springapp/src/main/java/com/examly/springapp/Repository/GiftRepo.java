package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Model.Gift;


@Repository
public interface GiftRepo extends JpaRepository<Gift,Integer> {

}
