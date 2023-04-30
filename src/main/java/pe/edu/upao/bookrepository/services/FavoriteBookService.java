package pe.edu.upao.bookrepository.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.bookrepository.models.Book;
import pe.edu.upao.bookrepository.models.FavoriteBook;
import pe.edu.upao.bookrepository.models.User;

import java.util.List;

@Service
public interface FavoriteBookService {
    FavoriteBook saveFavorite(FavoriteBook favorite);
    void deleteFavoriteById(Long id);
    List<FavoriteBook> getAllFavoritesByUser(User user);
    FavoriteBook addFavoriteBook(Long bookId, Long userId);
    List<Book> getFavoriteBooksByUserId(Long userId);
    void removeFavoriteBook(Long bookId, Long userId);
}
