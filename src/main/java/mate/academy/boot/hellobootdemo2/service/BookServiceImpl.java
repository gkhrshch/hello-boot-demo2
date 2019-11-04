package mate.academy.boot.hellobootdemo2.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import mate.academy.boot.hellobootdemo2.entity.Book;
import mate.academy.boot.hellobootdemo2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public void update(Long bookId, Book book) {
        Book toUpdate = findById(bookId).orElseThrow(
                () -> new NoSuchElementException("No book found by id " + bookId));
        toUpdate.setDescription(book.getDescription());
        toUpdate.setYear(book.getYear());
        toUpdate.setTitle(book.getTitle());
        toUpdate.setPrice(book.getPrice());
        bookRepository.save(toUpdate);
    }
}
