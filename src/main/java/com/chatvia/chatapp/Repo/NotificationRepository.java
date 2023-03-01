package com.chatvia.chatapp.Repo;

import com.chatvia.chatapp.Models.Notification;
import com.chatvia.chatapp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}
