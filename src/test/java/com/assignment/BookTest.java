package com.assignment;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book = new Book("Testing",467,"Alexander");

    @BeforeEach

    void Setup(){

        System.out.println("This is a Book Test");
    }

    @Test
    @Order(1)
    void testObjectCreated(){
        assertNotNull(book);
        assertEquals("Testing",book.getTitle());
        assertEquals(467,book.getPages());
        assertEquals("Alexander",book.getAuthor());
    }
    @Test
    @Order(2)
    void testAssertAll(){
        assertAll("This is to test all asserts are true",
                ()-> assertEquals("Testing",book.getTitle()),
                () -> assertEquals(467,book.getPages()),
                () -> assertEquals("Alexander",book.getAuthor()));
    }
    @Test
    @Order(3)
    void testSetTitle(){
        System.out.println("Set new title for the book");
        String title = "Requirement Analysis";
        book.setTitle(title);
        assertEquals(title,book.getTitle());
        assertEquals("Requirement Analysis",book.getTitle());
    }
    @Test
    @Order(4)
    void testSetPages(){
        System.out.println("This is to set pages for the book");
        Integer pages = 600;
        book.setPages(pages);
        assertEquals(pages,book.getPages());
        assertEquals(600,book.getPages());
    }
    @Test
    @Order(5)
    void testSetAuthor(){
        System.out.println("This is to set author for the book");
        String author = "Imran Shah";
        book.setAuthor(author);
        assertEquals(author,book.getAuthor());
        assertEquals("Imran Shah",book.getAuthor());
    }
    @Test
    @Order(6)

    void testSetBookTitleNull(){
        System.out.println("This is to set the book title null and see if the program is returning the original title");
        book.setTitle(null);
        assertNotNull(book.getTitle());
        assertEquals("Testing",book.getTitle());
    }

    @Test
    @Order(7)
    @DisplayName("This to check that Book Title throws exception")

    void testBookTitleThrowsException(){
        String title2 ="";
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> book.setTitle(title2));
        assertNotNull(book.getTitle());
        assertEquals("Testing",book.getTitle());
        System.out.println(exception);
        assertTrue(exception.getMessage().contains("Title must include characters"));
        }

    @Test
    @Order(8)
    @DisplayName("Test that the pages cannot be less than 0")

    void testBookPagesThrowsException(){
        Exception exception = assertThrows(IllegalArgumentException.class,
        () -> book.setPages(-5));
        assertEquals(467,book.getPages());
        System.out.println(exception);
        assertTrue(exception.getMessage().contains("Pages can´t be negative"));
    }

}