package id.web.skyforce.bank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

@Id
@GeneratedValue
@Column(name = "id", length=11, nullable=false)
private Integer id;

@Column(name="street", length=50, nullable=false)
private String street;

@Column(name="city", length=20, nullable=false)
private String city;

@Column(name="postal_code", length=5, nullable=false)
private String postalCode;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="customer_id")
private Customer customer;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getPostalCode() {
	return postalCode;
}

public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}



}
