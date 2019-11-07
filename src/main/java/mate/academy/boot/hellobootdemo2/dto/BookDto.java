package mate.academy.boot.hellobootdemo2.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDto {
    @NotNull
    @NotEmpty
    private  String title;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private Double price;

    @NotNull
    @NotEmpty
    private Integer year;

    public BookDto(String title, String description, Double price, Integer year) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.year = year;
    }
}
