package com.examly.springapp.Model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tableorder")
public class Order {
	@Id
	// @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderId")
	int orderId;
	
	@Column(name = "orderName")
	String orderName;
	
	@Column(name = "orderDescription")
	String orderDescription;
	
	@Column(name = "orderDate")
	LocalDate orderDate;
	
	@Column(name = "orderPrice")
	int orderPrice;
	
	@Column(name = "orderAddress")
	String orderAddress;
	
	@Column(name = "orderPhone")
	String orderPhone;
	
	@Column(name = "orderEmail")
	String orderEmail;
	
	@Column(name = "quantity")
	String quantity;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String orderName, String orderDescription, LocalDate orderLocalDate, int orderPrice,
			String orderAddress, String orderPhone, String orderEmail, String quantity) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderDescription = orderDescription;
		this.orderDate = orderLocalDate;
		this.orderPrice = orderPrice;
		this.orderAddress = orderAddress;
		this.orderPhone = orderPhone;
		this.orderEmail = orderEmail;
		this.quantity = quantity;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderLocalDate) {
		this.orderDate = orderLocalDate;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getOrderPhone() {
		return orderPhone;
	}

	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}

	public String getOrderEmail() {
		return orderEmail;
	}

	public void setOrderEmail(String orderEmail) {
		this.orderEmail = orderEmail;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", orderDescription=" + orderDescription
				+ ", orderDate=" + orderDate + ", orderPrice=" + orderPrice + ", orderAddress=" + orderAddress
				+ ", orderPhone=" + orderPhone + ", orderEmail=" + orderEmail + ", quantity=" + quantity + "]";
	}

}

