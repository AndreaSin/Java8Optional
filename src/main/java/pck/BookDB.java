package pck;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDB {
	
	List<Book> books;
	
	public BookDB() {
		this.books = new ArrayList<Book>();
	}

	public Optional<Book> getBookById(int id) {
		for(Book book: books) {
			if(book.getId()==id)
				return Optional.of(book);
		}
		return Optional.empty();
	}
	
	
	/*
	 * senza optional sarebbe stato
	 * 
	 public Book getBookById(int id) {
		for(Book book: books) {
			if(book.getId()==id)
				return book;
		}
		return null;
	  	}

	 * 
	 * e avrebbe lasciato al chiamante l'onere di immaginare che un certo valore 
	 * di ritorno possa essere null
	 */
	
	public void add(Book book) {
		books.add(book);
	}


}
