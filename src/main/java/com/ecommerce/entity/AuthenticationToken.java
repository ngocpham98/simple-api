package com.ecommerce.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="tokens")
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="token_id")
    private Long id;
    private String token;
    @Column(name="created_date")
    private Date createdDate;
    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name="user_id")
    private User user;

    public AuthenticationToken() {
    }
    public AuthenticationToken(Long id, String token, Date createdDate, User user) {
        this.id = id;
        this.token = token;
        this.createdDate = createdDate;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
