package edu.cesur.fullstack.services;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.cesur.fullstack.model.BookDTO;
import edu.cesur.fullstack.persistence.entities.BookEntity;
import edu.cesur.fullstack.persistence.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	ArrayList<BookDTO> books = new ArrayList(Arrays.asList(new BookDTO(8, "Aventuras", "Javier", false),
			new BookDTO(1, "Viajes locos", "Acner", false), new BookDTO(2, "Estudiando Full Stack", "José", false),
			new BookDTO(3, "Cómo aprobar sin morir", "Marcos", false),
			new BookDTO(4, "El conejo no se ha perdido", "Miriam", false),
			new BookDTO(5, "El principito", "Andrea", false), new BookDTO(6, "Harry Potter", "Gian", false),
			new BookDTO(7, "Locas aventuras", "Mireia", false)));

	BookRepository bookRepository; // Inyección de dependencia mediante constructor

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public boolean getStatus(Integer id) {

		BookDTO b = getBookById(id);
		return b.getReservado();

	}

	@Override
	public BookDTO getBookById(Integer id) {

//		bookRepository.findById(id).map(bookEntity -> {
//			 BookDTO book = new BookDTO();
//			 book.setAutor(bookEntity.getAutor());
//			 return book;
//		 });

		Optional<BookEntity> optional = bookRepository.findById(id);
		if(optional.isPresent()) {
			BookEntity bookE = optional.get();
			BookDTO book = new BookDTO();
			book.setAutor(bookE.getAutor());
			
			return book;
		}
		
		return null;
		

		
	}

	@Override
	public BookDTO updateBookStatus(BookDTO book) {
		BookDTO b = getBookById(book.getId());
		// b.setReservado();
		return null;
	}

	@Override
	public ArrayList<BookDTO> getAllBooks() {

		List<BookEntity> books = bookRepository.findAll();
		ArrayList<BookDTO> booksDTO = new ArrayList<>();
		
		for(BookEntity book : books){
			BookDTO b = new BookDTO();
			b.setAutor(book.getAutor());
			b.setId(book.getId());
			b.setReservado(book.getReservado());
			b.setTitulo(book.getTitulo());
			booksDTO.add(b);			
		}
		
		return booksDTO;
	}

}
