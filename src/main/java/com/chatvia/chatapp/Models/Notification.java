package com.chatvia.chatapp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "type")
    private String type;

    @Column(name = "payload")
    private String payload;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;

    @Column(name = "seen_at")
    private java.sql.Timestamp seenAt;

    @Column(name = "from_id")
    private Integer fromId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return this.payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public java.sql.Timestamp getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(java.sql.Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public java.sql.Timestamp getSeenAt() {
        return this.seenAt;
    }

    public void setSeenAt(java.sql.Timestamp seenAt) {
        this.seenAt = seenAt;
    }

    public Integer getFromId() {
        return this.fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }
}
