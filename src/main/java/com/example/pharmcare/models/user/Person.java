package com.example.pharmcare.models.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @NotNull
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotNull
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotNull
    @Column(unique = true, nullable = false)
    private String email;

    @NotNull
    @Column(nullable = false)
    private String password;

    @NotNull
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

//    @NotNull
//    @Column(nullable = false)
//    @Enumerated(EnumType.STRING)
//    private ROLE_DETAIL roleDetail;

    @Column(name = "verify_email", nullable = false)
    private boolean verifyEmail = false;

    @NotNull
    @Column(nullable = false)
    private String gender;

    @NotNull
    @Column(name = "date_of_birth", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateOfBirth;

    private String image;

    @Column(name = "date_of_birth", nullable = false)
    private String resetPasswordToken;

}
