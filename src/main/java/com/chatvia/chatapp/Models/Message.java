package com.chatvia.chatapp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "sender_id")
    private Integer senderId;

    @Column(name = "message")
    private String message;

    @Column(name = "sent_at")
    private java.sql.Timestamp sentAt;

    @Column(name = "group_id")
    private Integer groupId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSenderId() {
        return this.senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public java.sql.Timestamp getSentAt() {
        return this.sentAt;
    }

    public void setSentAt(java.sql.Timestamp sentAt) {
        this.sentAt = sentAt;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
