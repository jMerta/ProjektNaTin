package io.projektnatin.demo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @NotNull
    private String password;
    @OneToOne
    private Cart cart;
    @Email
    private String email;
    @NotNull
    private String username;

    @ManyToMany
    private List<Book> bookList;
}
