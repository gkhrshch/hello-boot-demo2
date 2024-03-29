package mate.academy.boot.hellobootdemo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String title;
    @Column(length = 1500)
    private String description;
    private Double price;
    private Integer year;

    public Book(String title, Double price, Integer year) {
        this.title = title;
        this.price = price;
        this.year = year;
    }
}
