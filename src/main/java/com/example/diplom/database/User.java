package com.example.diplom.database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private long id;
    private String email;
    private String password;
}
