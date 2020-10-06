package com.sortland.visit.Service;

import com.sortland.visit.Model.Message;
import com.sortland.visit.Repository.MessageRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepoJPA messageRepo;

    public List<Message> fetchAllItems() {
        return messageRepo.findAll();
    }

    public void addItem(Message message) {
            messageRepo.save(message);
    }
}
