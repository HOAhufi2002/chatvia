package com.chatvia.chatapp.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "viewed_messages")
public class ViewedMessage implements Serializable {
    @EmbeddedId
    private ViewedMessageId viewedMessageId;

    @Column(name = "viewed_at")
    private java.sql.Timestamp viewedAt;

    public ViewedMessageId getViewedMessageId() {
        return this.viewedMessageId;
    }

    public void setViewedMessageId(ViewedMessageId messageId) {
        this.viewedMessageId = messageId;
    }

    public java.sql.Timestamp getViewedAt() {
        return this.viewedAt;
    }

    public void setViewedAt(java.sql.Timestamp viewedAt) {
        this.viewedAt = viewedAt;
    }
}
