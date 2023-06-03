package com.jsp;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Person {

	private int id;
	private String name;
	private String address;
	private long phone;
//	@OneToOne
//	private PanCard panCard;
}
