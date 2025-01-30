package com.project.uber.uberApp.entities;

import com.project.uber.uberApp.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name="app_user")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @ElementCollection(fetch = FetchType.LAZY) //create new table app_userroles(tablename defined above)
    @Enumerated(EnumType.STRING)//define we gonna save roles enum as it isi.e String
    private Set<Role> roles;
    //@Enumerated(EnumType.STRING): This tells JPA to persist the enum as its name (i.e., "ADMIN", "DRIVER", "RIDER").
    //@ElementCollection: This is used to store a collection of simple types or embeddable types. Since you're using Set<Role>,
    //@ElementCollection here to create a separate table that stores the relationship between User and Role.
}
