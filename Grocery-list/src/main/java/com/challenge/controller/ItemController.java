package com.challenge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.model.GroceryItem;
import com.challenge.repo.ItemDao;


@CrossOrigin(origins="http://localhost:4200")
@RestController("ItemController")
public class ItemController {
	
	@Autowired
	private ItemDao items;

	@GetMapping("/getItems.app")
	public @ResponseBody List<GroceryItem> findItems(){
		
		return (List<GroceryItem>) items.findAll();
	}
	
	
}
