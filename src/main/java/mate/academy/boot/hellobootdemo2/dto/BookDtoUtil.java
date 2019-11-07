package mate.academy.boot.hellobootdemo2.dto;

import mate.academy.boot.hellobootdemo2.entity.Book;

public class BookDtoUtil {
    public static Book bookFromDto(BookDto bookDto) {
        Book bookFromDto = new Book();
        bookFromDto.setDescription(bookDto.getDescription());
        bookFromDto.setPrice(bookDto.getPrice());
        bookFromDto.setTitle(bookDto.getTitle());
        bookFromDto.setYear(bookDto.getYear());
        return bookFromDto;
    }
}
