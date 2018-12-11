package ru.atom.lecture08.websocket.dao;

import ru.atom.lecture08.websocket.model.Message;

import java.util.List;

public interface MessageDao {
    void save(Message message);
    List<Message> findAll();
}
