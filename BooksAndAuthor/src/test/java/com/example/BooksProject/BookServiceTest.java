package com.example.BooksProject;

import com.example.BooksProject.model.Book;
import com.example.BooksProject.repository.BookRepository;
import com.example.BooksProject.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    public void testGetAllBooks() {
        Book book1 = new Book();
        book1.setCopiesAvailable(5);
        book1.setAuthorId("authorId1");
        book1.setGenre("Science Fiction");

        Book book2 = new Book();
        book2.setCopiesAvailable(3);
        book2.setAuthorId("authorId2");
        book2.setGenre("Mystery");

        List<Book> expectedBooks = Arrays.asList(book1, book2);

        Mockito.when(bookRepository.findAll()).thenReturn(expectedBooks);

        List<Book> actualBooks = bookService.getAllBooks();

        assertEquals(expectedBooks, actualBooks);
    }

}
