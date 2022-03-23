/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Mar 9, 2022
 */
package dmacc.beans;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Contact {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String phone;
	private String relationship;
	@Autowired
	private Address address;
/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
/**
 * @return the id
 */
	public long getId() {
		return id;
	}
/**
 * @param id the id to set
 */
	public void setId(long id) {
		this.id = id;
	}
/**
 * @return the name
 */
	public String getName() {
		return name;
	}
/**
 * @param name the name to set
 */
	public void setName(String name) {
		this.name = name;
	}
/**
 * @return the phone
 */
	public String getPhone() {
		return phone;
	}
/**
 * @param phone the phone to set
 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
/**
 * @return the relationship
 */
	public String getRelationship() {
		return relationship;
	}
/**
 * @param relationship the relationship to set
 */
	public void setRelationship(String relationship) {
		this.relationship = relationship;
}


/**
 * 
 */
	public Contact() {
		super();
		this.relationship = "spouse";
	
	}
/**
 * @param name
 */
	public Contact(String name) {
		super();
		this.name = name;
	}
/**
 * @param name
 * @param phone
 * @param relationship
 */
	public Contact(String name, String phone, String relationship) {
		super();
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
/**
 * @param id
 * @param name
 * @param phone
 * @param relationship
 */
	public Contact(long id, String name, String phone, String relationship) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.relationship = relationship;
	}
@Override
public String toString() {
	return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", relationship=" + relationship + ", address="
			+ address + "]";
}


	
	}