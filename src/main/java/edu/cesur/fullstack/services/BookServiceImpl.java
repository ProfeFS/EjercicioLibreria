package edu.cesur.fullstack.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.BookDTO;


@Service
public class BookServiceImpl implements BookService {
	
	ArrayList<BookDTO> books = new ArrayList(
			Arrays.asList(new BookDTO(8, "Aventuras", "Javier", false),
					new BookDTO(1, "Viajes locos", "Acner", false),
					new BookDTO(2, "Estudiando Full Stack", "José", false),
					new BookDTO(3, "Cómo aprobar sin morir", "Marcos", false),
					new BookDTO(4, "El conejo no se ha perdido", "Miriam", false),
					new BookDTO(5, "El principito", "Andrea", false),
					new BookDTO(6, "Harry Potter", "Gian", false),
					new BookDTO(7, "Locas aventuras", "Mireia", false)			
			));
	
	

	@Override
	public boolean getStatus(Integer id) {
		
		BookDTO b = getBookById(id);
		return b.getReservado();
		
	}
	

	@Override
	public BookDTO getBookById(Integer id) {
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
