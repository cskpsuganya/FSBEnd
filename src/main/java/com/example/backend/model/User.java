package com.example.backend.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity

public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
//    @Size(min=3, max = 50)
//    private String firstname;

//    @NotBlank
//    @Size(min=3, max = 50)
//    private String lastname;



    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;

    @NotBlank
    @Size(min=3, max = 50)
    private String username;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    private String mobileNumber;
    private boolean active;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "userId")
    private List<OrderModel> orderList = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CartModel> cart;

    public List<CartModel> getCart() {
        return cart;
    }

    public void setCart(List<CartModel> cart) {
        this.cart = cart;
    }


    public List<OrderModel> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<OrderModel> orderList) {
        this.orderList = orderList;
    }


    public User() {}

    public User(String email, String password, String username, String mobileNumber, boolean active) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.mobileNumber = mobileNumber;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}