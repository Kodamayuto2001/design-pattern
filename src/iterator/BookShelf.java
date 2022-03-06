package iterator;

import java.util.ArrayList;

//public class BookShelf implements Aggregate {
//
//	private Book[] books;
//	private int last = 0;
//
//	public BookShelf(int maxsize) {
//		this.books = new Book[maxsize];
//	}
//	public Book getBookAt(int index) {
//		return books[index];
//	}
//
//	public void appendBook(Book book) {
//
//		this.books[last] = book;
//		last++;
//	}
//
//	public int getLength() {
//		return last;
//	}
//
//	public Iterator iterator() {
//		return new BookShelfIterator(this);
//	}
//}

public class BookShelf implements Aggregate {

	private ArrayList<Book> books;

	public BookShelf(int... a) {
		 books = new ArrayList<Book>();
	}

	public Book getBookAt(int index) {
		return books.get(index);
	}

	public void appendBook(Book book) {
		books.add(book);
	}

	public int getLength() {
		return books.size();
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}