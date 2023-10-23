package edu.cesur.fullstack.services;

import java.util.ArrayList;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.model.UserDTO;

public interface BookService {
	
	boolean getStatus(Integer id);
	
	BookDTO getBookById(Integer id);
	
	BookDTO updateBookStatus(BookDTO book);
	
	ArrayList<BookDTO> getAllBooks();
	


}
