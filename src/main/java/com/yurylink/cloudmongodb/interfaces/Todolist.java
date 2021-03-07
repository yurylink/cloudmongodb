package com.yurylink.cloudmongodb.interfaces;

import org.springframework.data.annotation.Id;

public class Todolist {

    @Id
    private Integer id;
    private String nome;
    private Boolean done;

    public Todolist() {
    }

    public Todolist(final Integer id, final String nome, final Boolean done) {
        this.id = id;
        this.nome = nome;
        this.done = done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(final Boolean done) {
        this.done = done;
    }
}
