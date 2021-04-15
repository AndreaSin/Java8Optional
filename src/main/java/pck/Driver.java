package pck;

public class Driver {

	public static void main(String[] args) {
	
		BookDB bookDB = new BookDB();
		bookDB.add(new Book(2,"titolo2"));
		
		if(bookDB.getBookById(3).isEmpty()) {
			System.out.println("no book found");
		} else {
			System.out.println("book found!");
		}
	}

}
