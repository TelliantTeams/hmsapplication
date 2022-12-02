package com.hmsapplication.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users_table")
public class UsersModel {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String uid;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String displayname;

    @Column
    private String type;

    @Column
    private boolean active;
}
