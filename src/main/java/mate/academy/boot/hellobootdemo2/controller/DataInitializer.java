package mate.academy.boot.hellobootdemo2.controller;

import javax.annotation.PostConstruct;
import mate.academy.boot.hellobootdemo2.entity.Book;
import mate.academy.boot.hellobootdemo2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void init() {
        bookRepository.save(new Book("111", 1.11, 2));
        bookRepository.save(new Book("121", 1.23, 3));
    }

}
