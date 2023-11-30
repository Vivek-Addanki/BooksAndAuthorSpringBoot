package com.example.BooksProject;

import com.example.BooksProject.model.Author;
import com.example.BooksProject.repository.AuthorRepository;
import com.example.BooksProject.service.AuthorService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AuthorServiceTest {

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    @Test
    public void testGetAuthorsByName() {
        Author author1 = new Author();
        author1.setName("John Doe");

        Author author2 = new Author();
        author2.setName("Jane Smith");

        List<Author> expectedAuthors = Arrays.asList(author1, author2);

        Mockito.when(authorRepository.findByNameRegex("Doe")).thenReturn(expectedAuthors);

        List<Author> actualAuthors = authorService.getAuthorsByName("Doe");

        assertEquals(expectedAuthors, actualAuthors);
    }
}
