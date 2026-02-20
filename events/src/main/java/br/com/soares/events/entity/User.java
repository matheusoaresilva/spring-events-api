package br.com.soares.events.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(nullable = false, name = "user_name", length = 255)
    private String name;
    @Column(nullable = false, unique = true, name = "email", length = 255)
    private String email;

//    @ManyToMany(mappedBy = "user")
//    public List<Session> sessions;
//
//    public List<Session> getSessions() {
//        return sessions;
//    }
//
//    public void setSessions(List<Session> sessions) {
//        this.sessions = sessions;
//    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
