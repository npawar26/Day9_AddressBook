package com.bridgelabz.Addressbook;
	
	public class ContactInfo {
	    private String firstName, lastName, address, city, state, email;
	    private long phoneNumber, zip;

	    ContactInfo(String firstName, String lastName, String city, String state, String address,
	                long zip, long phoneNumber, String email)
	    {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.city = city;
	        this.state = state;
	        this.address = address;
	        this.zip = zip;
	        this.phoneNumber = phoneNumber;
	        this.email = email;
	    }
	    public String getFirstName()
	    {
	        return firstName;
	    }
	    public void setFirstName(String firstName)
	    {
	        this.firstName = firstName;
	    }
	    public String getLastName()
	    {
	        return lastName;
	    }
	    public void setLastName(String lastName)
	    {
	        this.lastName = lastName;
	    }
	    public String getAddress()
	    {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    public String getCity()
	    {
	        return city;
	    }
	    public void setCity(String city)
	    {
	        this.city = city;
	    }
	    public String getState()
	    {
	        return state;
	    }
	    public void setState(String state)
	    {
	        this.state = state;
	    }
	    public long getZip()
	    {
	        return zip;
	    }
	    public void setZip(long zip)
	    {
	        this.zip = zip;
	    }
	    public long getPhoneNumber()
	    {
	        return phoneNumber;
	    }
	    public void setPhoneNumber(long phoneNumber)
	    {
	        this.phoneNumber = phoneNumber;
	    }
	    public String getEmail()
	    {
	        return email;
	    }
	    public void setEmail(String email)
	    {
	        this.email = email;
	    }
	}