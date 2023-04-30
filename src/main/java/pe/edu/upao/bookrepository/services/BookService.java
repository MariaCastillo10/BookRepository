package pe.edu.upao.bookrepository.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.bookrepository.models.Book;

import java.util.List;

@Service
public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book addBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
    List<Book> searchBooks(String keyword);
}

