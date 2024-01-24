package com.sprintAPIREST.sprint1APIREST.model;

public class User {

    private String name;
    private String document;
    private String contacNumber;

    public User(String name, String document, String contacNumber) {
        this.name = name;
        this.document = document;
        this.contacNumber = contacNumber;
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
}
