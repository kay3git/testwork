package com.internousdev.ecMidium.dto;



public class BuyItemDTO {
	public String itemName;

	public String itemPrice;

	public int id;

	public String getItemName(){
		return itemName;
	}

	public void setItemName(String itemName){
		this.itemName= itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}

	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id= id;
	}

}
