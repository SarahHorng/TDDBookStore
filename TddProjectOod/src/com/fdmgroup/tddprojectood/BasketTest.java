package com.fdmgroup.tddprojectood;

import java.util.List;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasketTest {

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {

//Arrange
//◦ You will need a Basket object task1
		Basket basket = new Basket();

//Act
//◦ Call getBooksInBasket() method of your Basket object and store the returned Book list
		List<Book> test = basket.getBooksInBasket();

//Assert   
//The size of the Book list should be equal to zero 
		assertEquals(0, test.size());

	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {

////Arrange
//Call addBook(Book book) method of your Basket, passing it your Book object
		Basket basket = new Basket();
		Book book = new Book();

////Act
		basket.addBook(book);
		List<Book> test = basket.getBooksInBasket();

//// Assert
		assertEquals(1, test.size());
	}

}
