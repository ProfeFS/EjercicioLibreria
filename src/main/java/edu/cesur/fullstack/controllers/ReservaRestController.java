package edu.cesur.fullstack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.services.BookService;
import edu.cesur.fullstack.services.ReservaService;

@RestControllerAdvice
@RequestMapping("/reservas")
public class ReservaRestController {

	@Autowired
	ReservaService reservaService;


	@GetMapping
	public ResponseEntity<?> getAllReservations() {
		return null;

	}
	
	public ResponseEntity<?> reserveBook(Long bookId, Long userId){
		
		return ResponseEntity.ok(reservaService.reserveBook(bookId, userId));
		
	}
	
	

}
