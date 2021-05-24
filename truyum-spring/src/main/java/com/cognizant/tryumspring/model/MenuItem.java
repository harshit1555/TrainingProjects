package com.cognizant.tryumspring.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(nullable = false)
	private String name;
	private float price;
	private boolean active;
	private LocalDate dateOfLaunch;
	private String category;
	private boolean freeDelivery;

	public MenuItem() {
		
	}
	public MenuItem(long id, String name, float price, boolean active, LocalDate dateOfLaunch, String category,
			boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getDateOfLaunch() {
		return dateOfLaunch;
	}

	public void setDateOfLaunch(LocalDate dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateOfLaunch="
				+ dateOfLaunch + ", category=" + category + ", freeDelivery=" + freeDelivery + "]";
	}


}
