package edu.cesur.fullstack.services;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.model.ReservaDTO;
import edu.cesur.fullstack.model.UserDTO;

@Service
public class ReservaServiceImpl implements ReservaService{
	
	
	ArrayList<ReservaDTO> reservas = new ArrayList<>();	
	
	@Autowired
	BookService bookService;

	@Override
	public ReservaDTO reserveBook(Long bookId, Long userId) {
		
		BookDTO book = bookService.getBookById(bookId);
		int index = reservas.size();
				
		if(book.getReservado() != true) {
			ReservaDTO reserva = new ReservaDTO(Long.valueOf(index+1), bookId, userId, LocalDate.now(), null);
			book.setReservado(true);
			System.out.println(bookService.getBookById(bookId));
			return reserva;				
		}
		
		return null;
		
		
		//obtener el status del libro (Uso el servicio book)
		//si no está reservado cambiarle el estado a reservado (Uso el servicio book?)
		//crear una nueva reserva con los datos
		
	}

	@Override
	public void cancelReservation(Long bookId, Long userId) {
		//busco en mi lista de reservas si existe alguna con esos ids.
		//si existe, pongo la fecha de retorno en el objeto de reserva 
		//busco el libro por id y cambio el estado al libro. (uso el servicio book)
		
		
	}

	@Override
	public ArrayList<ReservaDTO> getAllReservationsByUser(Long userId) {
		
		return null;
	}
	
	
	
	

}
