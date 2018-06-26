package lt.egzaminas.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lt.egzaminas.Model.Book;
import lt.egzaminas.Service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@Api(value = "Book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/api/books")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "New book")
    public Book addBook(@RequestBody final Book book){
        return bookService.addBook(book);
    }
    @GetMapping("/api/books/{bookId}")
    @ResponseStatus(HttpStatus.OK)
    public Book getBook(@PathVariable long bookId){
        return bookService.getBook(bookId);
    }

    @PutMapping("/api/books/{bookId}")
    @ResponseStatus(HttpStatus.OK)
    public void updateBook(@PathVariable long bookId, @RequestBody Book book){
        bookService.updateBook(bookId, book);
    }

    @GetMapping("/api/books")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooks(){
        return bookService.getAll();
    }

    @DeleteMapping("/api/books/{bookId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBook(@PathVariable long bookId){
        bookService.removeBook(bookId);
    }

}
