package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.other.EnumStatus;

@Entity
@Table(name="order")
public class Order {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="orderId")
	private int orderId;
	
	//@Column(name="dateOfOrder")
	private final LocalDate doo = LocalDate.now();
	
	//@Column(name="orderStatus",length =10)
	private EnumStatus status;
	
	//@Column(name="email",length=30)
	private String email;
	
	//@Column(name="total")
	private double total;


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getDoo() {
		return doo;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", doo=" + doo + ", status=" + status + ", email=" + email + ", total="
				+ total + "]";
	}

	
	
	
	
}
