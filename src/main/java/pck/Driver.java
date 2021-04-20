package pck;

import java.util.Optional;

public class Driver {
	public static void main(String[] args) throws Throwable {
	
		BookDB bookDB = new BookDB();
		bookDB.add(new Book(3,"titolo2"));
		Optional<?> opt = bookDB.getBookById(2);
		if(opt.isEmpty()) {		
			// orElse permettere di usare un altro valore in caso opt fosse vuoto (in questo caso magari un altro libro)
			// opt.orElse(opt);
			System.out.println("no book found");
			System.out.println(opt.orElseThrow(ArithmeticException::new));
		} else if (opt.isPresent()) {
			System.out.println("book found!");
			System.out.println(((Book) opt.get()).getTitle());
		}
	}

}