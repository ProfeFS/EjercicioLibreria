package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.model.UserDTO;


@Service
public class BookServiceImpl implements BookService {
	
	ArrayList<BookDTO> books = new ArrayList(
			Arrays.asList(new BookDTO(8l, "Aventuras", "Javier", false),
					new BookDTO(1l, "Viajes locos", "Acner", false),
					new BookDTO(2l, "Estudiando Full Stack", "José", false),
					new BookDTO(3l, "Cómo aprobar sin morir", "Marcos", false),
					new BookDTO(4l, "El conejo no se ha perdido", "Miriam", false),
					new BookDTO(5l, "El principito", "Andrea", false),
					new BookDTO(6l, "Harry Potter", "Gian", false),
					new BookDTO(7l, "Locas aventuras", "Mireia", false)			
			));
	
	

	@Override
	public boolean getStatus(Long id) {
		
		BookDTO b = getBookById(id);
		return b.getReservado();
		
	}
	

	@Override
	public BookDTO getBookById(Long id) {
		for (BookDTO book : books) {
			if (book.getId() == id) {
				return book;
			}			
		}
		
		return null;
	}
	
	
	
	@Override
	public BookDTO updateBookStatus(BookDTO book) {
		BookDTO b = getBookById(book.getId());
		//b.setReservado();
		return null;
	}


	@Override
	public ArrayList<BookDTO> getAllBooks() {
		
		return books;
	}





}
