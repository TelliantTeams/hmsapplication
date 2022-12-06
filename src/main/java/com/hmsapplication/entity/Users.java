package com.hmsapplication.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
public class Users implements Serializable {
    @Id
    @GeneratedValue
    private int id;
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

    public Users(int id) {
        this.id = id;
    }

    public Users(int id, String username, String password, String displayname, String type, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayname = displayname;
        this.type = type;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
