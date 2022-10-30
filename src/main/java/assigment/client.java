package assigment;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import assigment.bank;

public class client {
	
	Logger logger
    = Logger.getLogger(client.class.getName());
	private String name;
	private String id;
	private String email;
	private String address;
	private String postCode;
    private String signature;
    boolean logged;
	private String city;
	private int Enteredmoney;
	
 	
	public client() {
		name = "";
		id = "";
		email = "";
		address = "";
		postCode = "";
		city = "";
		Enteredmoney=0;
		
	}
	
	
 
	  
	 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	 
	 
	public int getEnteredmoney() {
		return Enteredmoney;
	}
	public void setEnteredmoney(int Enteredmoney) {
		this.Enteredmoney = Enteredmoney;
	}

	public void setSignature(String signature) {
        this.signature = signature;
    }
	
 

	 public boolean isLogged() {
	        return logged;
	    }

	public String getId() {
		return id;

	}

	
	public String getSignature() {
		return signature; 
	}

}