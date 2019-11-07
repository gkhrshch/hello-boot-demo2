package mate.academy.boot.hellobootdemo2.controller;

import java.util.List;
import javax.persistence.EntityNotFoundException;
import mate.academy.boot.hellobootdemo2.dto.BookDto;
import mate.academy.boot.hellobootdemo2.dto.BookDtoUtil;
import mate.academy.boot.hellobootdemo2.entity.Book;
import mate.academy.boot.hellobootdemo2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public Book getById(@PathVariable("bookId") Long id) {
        return bookService.findById(id).orElseThrow(
                () -> new EntityNotFoundException("No book found by id: " + id));
    }

    @PostMapping
    public void add(BookDto bookDto) {
        bookService.save(BookDtoUtil.bookFromDto(bookDto));
    }

    @DeleteMapping("/{bookId}")
    public void delete(@PathVariable("bookId") Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{bookId}")
    public void update(@PathVariable("bookId") Long bookId, @RequestBody BookDto bookDto) {
        bookService.update(bookId, BookDtoUtil.bookFromDto(bookDto));
    }
}
