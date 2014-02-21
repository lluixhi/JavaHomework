/* Project 6-6 Patron
 *
 * Can have a name and three
 * books.
 *
 */

public class Patron66 {
	// Give instance variables the value of null.  We want them to have values later.
	private Book66 b1 = null;
	private Book66 b2 = null;
	private Book66 b3 = null;
	private String name;

	public Patron66() {
		name = "";
	}

	public void setName(String nm) {
		name = nm;
	}

	public String getName() {
		return name;
	}

	public void borrow(String ttl, String aut) {
		// If the variable is null, we can instantiate a new book with the parameters.
		if (b1 == null) b1 = new Book66(ttl, aut);
		else if (b2 == null) b2 = new Book66(ttl, aut);
		else if (b3 == null) b3 = new Book66(ttl, aut);
	}

	public String borrowedBooks() {
		String books;
		books = "";
		// Add the list of books and authors in an intelligent way 
		// (don't add null to a String)
		if (b1 != null) books += b1.getBook();
		if (b2 != null) books += b2.getBook();
		if (b3 != null) books += b3.getBook();
		return books;
	}

	public boolean chkBorrow(String ttl) {
		// Check first to make sure the book isn't null; That would give us a null pointer exception. 
		// Then, call the getTitle() method and check if it equals the parameter
		if (b1 != null && b1.getTitle().equals(ttl)) return true;
		else if (b2 != null && b2.getTitle().equals(ttl)) return true;
		else if (b3 != null && b3.getTitle().equals(ttl)) return true;
		else return false;
	}

	public void returnBook(String ttl) {
		// set the named book to null, freeing it to become a new book.
		if (b1.getTitle().equals(ttl)) b1 = null;
		else if (b2.getTitle().equals(ttl)) b2 = null;
		else if (b3.getTitle().equals(ttl)) b3 = null;
	}
}
