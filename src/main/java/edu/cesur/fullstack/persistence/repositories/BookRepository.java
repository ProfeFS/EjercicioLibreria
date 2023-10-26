package edu.cesur.fullstack.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cesur.fullstack.persistence.entities.BookEntity;


@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer>{
	
	//JPArepository wildcars
	List<BookEntity> findByAutor(String autor);
	List<BookEntity> findByAutorContains(String autor);
}
