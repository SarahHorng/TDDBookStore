package com.fdmgroup.tddprojectood;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	private List<Book> books = new ArrayList<Book>(); //defining fields

	public List<Book> getBooksInBasket() {
		return books; 
	}

	public void addBook(Book book) {
		books.add(book);
		
	}

}
