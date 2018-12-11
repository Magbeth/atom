package ru.atom.lecture08.websocket.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "message", schema = "chat")
public class Message {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

    @Column(name = "time", nullable = false)
    private Date time = new Date();

    @Column(name = "value", length = 140, nullable = false)
    private String value;

    public User getUser() {
        return user;
    }

    public Message setUser(User user) {
        this.user = user;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public Message setTime(Date timestamp) {
        this.time = timestamp;
        return this;
    }

    public String getValue() {
        return value;
    }

    public Message setValue(String value) {
        this.value = value;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", timestamp=" + time +
                ", value='" + value + '\'' +
                '}';
    }
}