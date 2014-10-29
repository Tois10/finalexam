package id.web.skyforce.bank.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name="id",length=11,nullable=false)
	private Integer id;

	@Column(name="first_name", length=50, nullable=false)
	private String firstName;
	
	@Column(name="last_name", length=50, nullable=false)
	private String lastName;
	
	@Column(name="gender",length=1,nullable=false)
	private Character gender;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="id_number",length=20,nullable=false)
	private String idNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	
	
	
}
