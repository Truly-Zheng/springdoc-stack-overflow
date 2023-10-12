package com.example.springdocstackoverflow.api;

import org.springframework.web.bind.annotation.*;

import com.example.springdocstackoverflow.model.Item;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

	@PostMapping("/add")
	public String add(@RequestBody Item item){
		return null;
	}
}
