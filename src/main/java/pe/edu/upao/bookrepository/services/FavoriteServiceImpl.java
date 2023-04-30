package pe.edu.upao.bookrepository.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upao.bookrepository.models.Book;
import pe.edu.upao.bookrepository.models.FavoriteBook;
import pe.edu.upao.bookrepository.models.User;
import pe.edu.upao.bookrepository.repositories.FavoriteRepository;

import java.util.List;

@Service
public class FavoriteServiceImpl implements FavoriteBookService{
    @Autowired
    private FavoriteRepository favoriteRepository;
    @Override
    public FavoriteBook saveFavorite(FavoriteBook favorite){
        return favoriteRepository.save(favorite);
    }
    @Override
    public void deleteFavoriteById(Long id){
        favoriteRepository.deleteById(id);
    }
    @Override
    public List<FavoriteBook> getAllFavoritesByUser(User user){
        return favoriteRepository.findAllByUser(user);
    }
    @Override
    public FavoriteBook addFavoriteBook(Long bookId, Long userId) {
        return null;
    }
    @Override
    public List<Book> getFavoriteBooksByUserId(Long userId) {
        return null;
    }
    @Override
    public void removeFavoriteBook(Long bookId, Long userId) { }
}

