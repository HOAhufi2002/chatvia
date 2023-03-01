package com.chatvia.chatapp.Repo;

import com.chatvia.chatapp.Models.User;
import com.chatvia.chatapp.Models.ViewedMessage;
import com.chatvia.chatapp.Models.ViewedMessageId;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ViewedMessageRepository extends JpaRepository<ViewedMessage, ViewedMessageId> {

}
