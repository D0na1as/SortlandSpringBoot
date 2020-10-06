package com.sortland.visit.Model;

import javax.persistence.*;

@Entity
public class Message {

    @Id
    private int id;
    private String name;
    private String email;
    private String discovered;
    private String subscription="off";
    private String feedback;

    public Message() {
    }

    public Message(int id, String name, String email, String discovered, String subscription, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.discovered = discovered;
        this.subscription = subscription;
        this.feedback = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDiscovered() {
        return discovered;
    }

    public void setDiscovered(String discovered) {
        this.discovered = discovered;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
