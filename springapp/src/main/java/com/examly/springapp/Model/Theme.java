package com.examly.springapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
  //  @Column(name = "themeId")
	int themeId;
	String themeName;
	String themeDetails;
	int themePrice ;
	
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "giftId") private Gift gift;
	 */
	
	/*"*/
	public int getThemeId() {

	return themeId;
	}
	public void setThemeId(int themeId) {
	this.themeId = themeId;
	}
	public String getThemeName() {
	return themeName;
	}
	public void setThemeName(String themeName) {
	this.themeName = themeName;
	}
	public String getThemeDetails() {
	return themeDetails;
	}
	public void setThemeDetails(String themeDetails) {
	this.themeDetails = themeDetails;
	}
	public int getThemePrice() {
	return themePrice;
	}
	public void setThemePrice(int themePrice) {
	this.themePrice = themePrice;
	}
	public Theme(int themeId, String themeName, String themeDetails, int themePrice) {
	super();
	this.themeId = themeId;
	this.themeName = themeName;
	this.themeDetails = themeDetails;
	this.themePrice = themePrice;
	}
	public Theme() {
	super();
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {

	return "Theme [themeId=" + themeId + ", themeName=" + themeName + ", themeDetails=" + themeDetails

	+ ", themePrice=" + themePrice + "]";
	}
	/*
	 * @OneToMany(mappedBy="theme") private List<Gift>gifts;
	 */
}

