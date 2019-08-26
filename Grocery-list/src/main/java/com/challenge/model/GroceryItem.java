package com.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROCERY_ITEMS")
public class GroceryItem {

	@Id
	@Column(name="itemID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemID;
	
	@Column(name="itemName")
	private String itemName;
	
	@Column(name="fromList")
	private int fromList;

	public GroceryItem(int itemID, String itemName, int fromList) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.fromList = fromList;
	}

	public GroceryItem() {
		super();
	}

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getFromList() {
		return fromList;
	}

	public void setFromList(int fromList) {
		this.fromList = fromList;
	}

	@Override
	public String toString() {
		return "GroceryItem [itemID=" + itemID + ", itemName=" + itemName + ", fromList=" + fromList + "]";
	}
	
	
}
