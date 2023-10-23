package edu.cesur.fullstack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.cesur.fullstack.services.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaRestController {

	@Autowired
	ReservaService reservaService;


	@GetMapping
	public ResponseEntity<?> getAllReservations() {
		return ResponseEntity.ok(reservaService.getAllReservations());
	}
	
	@PostMapping("/{bookId}/{userId}")
	public ResponseEntity<?> reserveBook(@PathVariable Integer bookId, Integer userId){
		
		return ResponseEntity.ok(reservaService.reserveBook(bookId, userId));
		
	}
	
	

}
