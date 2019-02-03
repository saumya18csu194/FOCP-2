package com.ncu.assignment.classes;
public class Address
{

  String line1;
  String line2;
  String city;
  String state;
  int pinCode;

  	Address(String line1, String line2, String city, String state, int pinCode)
    { 
        this.line1= line1;
        this.line2= line2;
        this.city= city;
  		  this.state= state;
        this.pinCode= pinCode;
    }

    public void setAddr(String line1, String line2, String city, String state, int pinCode)
    {
      this.line1 = line1; 
      this.line2 = line2;
      this.city= city;
      this.state= state; 
      this.pinCode = pinCode;
    }


    public String displayAddress()
    {
      System.out.println("Line1: " + line1 + "\nLine2: " + line2 + "\nCity: " + city + "\nState: " + state + "\nPincode: " + pinCode);
      return "";

    }

}