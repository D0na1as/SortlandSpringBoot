package com.sortland.visit.Repository;

import com.sortland.visit.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepoJPA extends JpaRepository<Message, Integer> {
}
