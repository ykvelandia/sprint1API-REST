package com.sprintAPIREST.sprint1APIREST.model;

public class User {

    private String name;
    private String document;
    private String contacNumber;
    private Integer id;

    public User(String name, String document, String contacNumber,Integer id) {
        this.name = name;
        this.document = document;
        this.contacNumber = contacNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getContacNumber() {
        return contacNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contacNumber = contacNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
