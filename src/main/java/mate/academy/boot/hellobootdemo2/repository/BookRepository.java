package mate.academy.boot.hellobootdemo2.repository;

import mate.academy.boot.hellobootdemo2.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
