package lt.egzaminas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.egzaminas.Model.Book;
import lt.egzaminas.Model.Institution.*;
import lt.egzaminas.Repository.JpaBookRepository;
import lt.egzaminas.Repository.JpaInstitutionRepository;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class InstitutionService {

	@Autowired
	private JpaInstitutionRepository jpaInstitutionRepository;

	@Autowired
	private JpaBookRepository jpaBookRepository;

	@Autowired
	private BookService bookService;

	public void addInstitution(InstitutionCreate institutionCreate) {
		Institution institution = null;
		switch (institutionCreate.getInstitutionType()) {
		case ARCHIVE:
			System.out.println("Book archive");
			Archive archive = new Archive();
			archive.setCategory(institutionCreate.getCategory());
			archive.setCity(institutionCreate.getCity());
			archive.setImage(institutionCreate.getImage());
			archive.setTitle(institutionCreate.getTitle());
			archive.setArchiveType(institutionCreate.getArchiveType());
			institution = jpaInstitutionRepository.save(archive);
			break;

		case RENTAL:
			System.out.println("Book rental");
			Rental rental = new Rental();
			rental.setCategory(institutionCreate.getCategory());
			rental.setCity(institutionCreate.getCity());
			rental.setImage(institutionCreate.getImage());
			rental.setTitle(institutionCreate.getTitle());
			rental.setRentalType(institutionCreate.getRentalType());
			institution = jpaInstitutionRepository.save(rental);
			break;

		case BOOKSTORE:
			System.out.println("Bookstore");
			Bookstore bookstore = new Bookstore();
			bookstore.setCategory(institutionCreate.getCategory());
			bookstore.setCity(institutionCreate.getCity());
			bookstore.setImage(institutionCreate.getImage());
			bookstore.setTitle(institutionCreate.getTitle());
			bookstore.setLibraryBookstoreType(institutionCreate.getLibraryBookstoreType());
			institution = jpaInstitutionRepository.save(bookstore);
			break;
			
		case LIBRARY:
			System.out.println("Library");
			Library library = new Library();
			library.setCategory(institutionCreate.getCategory());
			library.setCity(institutionCreate.getCity());
			library.setImage(institutionCreate.getImage());
			library.setTitle(institutionCreate.getTitle());
			library.setLibraryBookStoreType(institutionCreate.getLibraryBookstoreType());
			institution = jpaInstitutionRepository.save(library);
			break;
			
		default:
			System.out.println("No institution found");
			break;
		}

	}

	public Institution getInstitution(long institutionId) {
		return jpaInstitutionRepository.findOne(institutionId);
	}

	public void removeInstitution(long institutionId) {
		jpaInstitutionRepository.delete(institutionId);
	}

	public List<Institution> getAll() {
		return jpaInstitutionRepository.findAll();
	}

	public Set<Book> getInstitutionBooks(long institutionId) {
		return jpaInstitutionRepository.findOne(institutionId).getBooks();
	}

	public void addBookToInstitution(long institutionId, long bookId) {
		Book book = jpaBookRepository.findOne(bookId);
		jpaInstitutionRepository.findOne(institutionId).getBooks().add(book);
	}

	public void addNewBookToInstitution(long institutionId, Book book) {
		book = bookService.addBook(book);
		jpaInstitutionRepository.findOne(institutionId).getBooks().add(book);
	}

	public void removeBookFromInstitution(long institutionId, long bookId) {
		jpaInstitutionRepository.findOne(institutionId).getBooks().remove(jpaBookRepository.findOne(bookId));
	}
}
