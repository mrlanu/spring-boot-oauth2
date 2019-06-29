package com.lanu.authserver.security;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Occupation occupation;

    private enum Occupation{
        DISPATCH, DRIVER, ACCOUNTER, MECHANIC, BOSS
    }

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;
}
