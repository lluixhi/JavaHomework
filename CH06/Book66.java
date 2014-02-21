/* Project 6-6 -- Book
 *
 * Contains the Title and Author
 * of a book.
 *
 */

public class Book66 {
	private String title, author;

	public Book66(String ttl, String aut) {
		// ttl and aut are needed, but we don't want to change
		// these values with a setTitle &| setAuthor method.
		title = ttl;
		author = aut;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getBook(){
		// Simple toString method.
		String book = "";
		book += title + " by " + author + "\n";
		return book;
	}
}
