package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.GroceryList;
import com.challenge.repo.ListDao;

@CrossOrigin(origins="http://localhost:4200")
@RestController("ListController")
public class ListController {
	
	@Autowired
	private ListDao list;
	
	@GetMapping(value="/getLists.app")
	public @ResponseBody List<GroceryList> findLists (){
		return list.findAll();
	}

	@PostMapping(value="/getListById.app")
	public @ResponseBody GroceryList getListById(@RequestParam("listID") int id) {
		return list.findByListID(id);
	}
	
	@PostMapping(value="/addList.app")
	public @ResponseBody GroceryList addList(GroceryList l) {
		return list.addGroceryList(l);
	}
	
	@PostMapping(value="/removelist.app")
	public @ResponseBody void removeList(GroceryList l) {
		
		list.delete(l);;
	}
	
	
}
