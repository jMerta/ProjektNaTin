package io.projektnatin.demo.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String author;
    @OneToMany
    private List<Score> scoreList;
    @ManyToMany
    private List<User> userList;
    @ManyToMany
    private List<Cart> cartList;
}
