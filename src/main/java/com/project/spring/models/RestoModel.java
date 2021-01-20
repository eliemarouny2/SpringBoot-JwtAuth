package com.project.spring.models;


import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="restaurants")
public class RestoModel {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@Column(name="restaurant_name")
	private String Name;
@Column(name="restaurant_type")
	private String Type;
@Column(name="restaurant_cost")
	private int Cost;
@Column(name="restaurant_address")
	private String Address;
@Column(name="restaurant_number")
	private long Number;
@OneToMany(mappedBy = "restomodel")
private List<VisitModel> visitmodel;

public RestoModel(){
	
}





	public RestoModel(String name, String type, int cost, String address, long number, List<VisitModel> visitmodel) {
	super();
	Name = name;
	Type = type;
	Cost = cost;
	Address = address;
	Number = number;
	this.visitmodel = visitmodel;
}





	public long getID() {
		return id;
	}
	public long setID(long iD) {
		return id = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}

	public void setVisitmodel(List<VisitModel> visitmodel) {
		this.visitmodel = visitmodel;
	}
	
}
