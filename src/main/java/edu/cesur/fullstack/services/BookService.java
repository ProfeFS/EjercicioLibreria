package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.model.UserDTO;

public interface BookService {
	
	boolean getStatus(Long id);
	
	BookDTO getBookById(Long id);
	
	BookDTO updateBookStatus(BookDTO book);
	
	ArrayList<BookDTO> getAllBooks();
	


}
