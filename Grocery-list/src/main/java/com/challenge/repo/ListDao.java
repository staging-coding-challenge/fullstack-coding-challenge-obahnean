package com.challenge.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.challenge.model.GroceryList;

public interface ListDao extends CrudRepository<GroceryList, Integer> {

	public List<GroceryList> findAll();
	
	public GroceryList findByListID(int listID);
	
	public GroceryList findByListName();
	
	public GroceryList addGroceryList(GroceryList l);
	
	public void deleteByListID(int id);
}
