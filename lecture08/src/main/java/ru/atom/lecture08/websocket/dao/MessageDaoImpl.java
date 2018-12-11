package ru.atom.lecture08.websocket.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.atom.lecture08.websocket.model.Message;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class MessageDaoImpl implements  MessageDao{
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Message message) {
        em.persist(message);
    }

    @Override
    public List<Message> findAll() {
        return em.createQuery("Select t from " + Message.class.getSimpleName() + " t").getResultList();
    }

}
