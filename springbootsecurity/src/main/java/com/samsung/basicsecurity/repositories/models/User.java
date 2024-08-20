package com.samsung.basicsecurity.repositories.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 150, unique = true)
    private String username;

    @Column(name = "password", length = 150)
    private String password;

    @Column(name = "confirm_password", length = 150)
    private String confirmpassword;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "fullname", length = 150)
    private String fullname;

    private boolean status;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Orders> orders;
}
