package com.hibernate.OneToMany;

import java.util.Set;

public class Vendor 
{
	private int vendorid;
	private String vendorName;
    Set Children;
    
    
    public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Set getChildren() {
		return Children;
	}
	public void setChildren(Set children) {
		Children = children;
	}
	
}
