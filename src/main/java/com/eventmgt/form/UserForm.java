package com.eventmgt.form;



import java.util.Date;


import javax.validation.constraints.NotEmpty;

import com.eventmgt.dto.BaseDTO;
import com.eventmgt.dto.UserDTO;
import com.eventmgt.utility.DataUtility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm extends BaseDTO {
	
	@NotEmpty(message = "First name is required")
	private String firstName;

	@NotEmpty(message = "Last name is required")
	private String lastName;
	
	@NotEmpty(message = "DOB name is required")
	private String dob;
	
	@NotEmpty(message = "First name is required")
	private String gender;
	
	@NotEmpty(message = "First name is required")
	private String email;
	
	@NotEmpty(message = "First name is required")
	private String password;
	
	@NotEmpty(message = "First name is required")
	private String phoneNumber;
	
	@NotEmpty(message = "userRole is required")
	private String userRole;
	
	private String operation;

	
	public UserDTO getDTO() {
		UserDTO bean=new UserDTO();
		bean.setId(id);
		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setDob(dob);
		bean.setGender(gender);
		bean.setEmail(email);
		bean.setPassword(password);
		bean.setPhoneNumber(phoneNumber);
		bean.setUserRole(userRole);
		return bean;
	}

	public void populate(UserDTO bean) {
		id = bean.getId();
		firstName=bean.getFirstName();
		lastName=bean.getLastName();
		dob = bean.getDob();
		gender = bean.getGender();
		email = bean.getEmail();
		password = bean.getPassword();
		phoneNumber = bean.getPhoneNumber();
		userRole = bean.getUserRole();

	}

	@Override
	public String toString() {
		return "UserForm [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ ", email=" + email + ", password=" + password + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	

}
