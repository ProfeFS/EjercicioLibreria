package edu.cesur.fullstack.services;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.model.ReservaDTO;
import edu.cesur.fullstack.model.UserDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ReservaServiceImpl implements ReservaService{
	
	
	ArrayList<ReservaDTO> reservas = new ArrayList<>();	
	
	@Autowired
	BookService bookService;

	@Override
	public ReservaDTO reserveBook(Integer bookId, Integer userId) {
		
		BookDTO book = bookService.getBookById(bookId);
		log.info("El libro:\n" + book);
		Integer index = reservas.size();
				
		if(book.getReservado() != true) {
			ReservaDTO reserva = new ReservaDTO((index+1), bookId, userId, LocalDate.now(), null);
			book.setReservado(true);
			log.info("Datos de la reserva: \n" + bookService.getBookById(bookId));
			return reserva;				
		}
		
		throw new RuntimeException("Este Libro ya se cuentra reservado");
		
		
		//obtener el status del libro (Uso el servicio book)
		//si no está reservado cambiarle el estado a reservado (Uso el servicio book?)
		//crear una nueva reserva con los datos
		
	}


	@Override
	public ArrayList<ReservaDTO> getAllReservations() {
		
		return reservas;
	}

	@Override
	public void cancelReservation(Integer bookId, Integer userId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
