package com.hojeonde.hoje.models.user;

public class UserRequest {
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User toUser() {
        User user = new User();
        user.setNome(this.nome);
        user.setEmail(this.email);
        return user;
    }
}
