package pe.edu.upao.bookrepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.bookrepository.models.FavoriteBook;
import pe.edu.upao.bookrepository.models.User;

import java.util.List;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteBook, Long> {
    List<FavoriteBook> findAllByUser(User user);
}

