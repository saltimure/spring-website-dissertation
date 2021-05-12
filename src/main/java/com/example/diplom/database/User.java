package com.example.diplom.database;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true,length = 45)
    private String email;

    @Column(nullable = false,length = 64)
    private String password;

    @Column(nullable = true,length = 30)
    private String name;

    @Column(nullable = true,length = 100)
    private String comm;

    public String getComm() { return comm; }

    public void setComm(String comm) { this.comm = comm; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
