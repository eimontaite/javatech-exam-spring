package lt.egzaminas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.egzaminas.Model.Book;

public interface JpaBookRepository extends JpaRepository<Book, Long> {
}
