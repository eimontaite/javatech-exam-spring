package lt.egzaminas.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.egzaminas.Model.Book;
import lt.egzaminas.Repository.JpaBookRepository;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    private JpaBookRepository jpaBookRepository;

    public Book addBook(Book book) {
        return jpaBookRepository.save(book);
    }

    public Book getBook(long bookId) {
        return jpaBookRepository.findOne(bookId);
    }

    public List<Book> getAll() {
        return jpaBookRepository.findAll();
    }

    public void removeBook(long bookId) {
        jpaBookRepository.delete(bookId);
    }

    public void updateBook(long bookId, Book book) {
        Book dbBook = jpaBookRepository.findOne(bookId);
        dbBook.setAuthor(book.getAuthor());
        dbBook.setCondition(book.getCondition());
        dbBook.setImage(book.getImage());
        dbBook.setPages(book.getPages());
        dbBook.setPrice(book.getPrice());
        dbBook.setQuantity(book.getQuantity());
        dbBook.setTitle(book.getTitle());

    }
}
