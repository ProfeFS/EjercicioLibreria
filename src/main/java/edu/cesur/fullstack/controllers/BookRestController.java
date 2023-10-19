package edu.cesur.fullstack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cesur.fullstack.services.BookService;

@RestController
public class BookRestController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping
	public ResponseEntity<?> getAllBooks() {
		return ResponseEntity.ok(bookService.getAllBooks());

	}
	

}
