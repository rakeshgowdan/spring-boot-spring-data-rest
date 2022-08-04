package com.rakesh.springDataRest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue
	private  int productId;
	
	private String name;
	
	private double price;
	
	private boolean status;
	
	private int quantity;
	
	
}
