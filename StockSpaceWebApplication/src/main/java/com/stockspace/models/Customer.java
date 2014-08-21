package com.stockspace.models;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4483398965015507662L;
	
	private int customerId;
	private String fullName;
	private String address;
	private String email;
	private String phone;
	private String dateCreated;
	private Boolean isActive;
}
