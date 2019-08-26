package com.challenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROCERY_LIST")
public class GroceryList {

	@Id
	@Column(name="listID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int listID;
	
	@Column(name="listName")
	private String listName;

	public GroceryList() {
		super();
	}

	public GroceryList(int listID, String listName) {
		super();
		this.listID = listID;
		this.listName = listName;
	}

	public int getListID() {
		return listID;
	}

	public void setListID(int listID) {
		this.listID = listID;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	@Override
	public String toString() {
		return "GroceryList [listID=" + listID + ", listName=" + listName + "]";
	}
	
}
