package pe.edu.upao.bookrepository.services;

import org.springframework.stereotype.Service;
import pe.edu.upao.bookrepository.models.Review;

import java.util.List;

@Service
public interface ReviewService {
    Review createReview(Review review, Long bookId, Long userId);
    List<Review> getReviewsByBookId(Long bookId);
    Review getReviewByBookIdAndUserId(Long bookId, Long userId);
    List<Review> getAllReviews();
    Review addReview(Long bookId, Long userId, Review review);
    Review updateReview(Long id, Review review);
    void deleteReview(Long id);
    Review addReview(Long bookId, Long userId, String title, String comment, Integer rating);
    List<Review> getReviewsByUserId();
}
