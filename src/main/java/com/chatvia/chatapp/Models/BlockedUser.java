package com.chatvia.chatapp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "blocked_users")
public class BlockedUser {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "blocked_user_id")
    private Integer blockedUserId;

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

    public Integer getBlockedUserId() {
        return this.blockedUserId;
    }

    public void setBlockedUserId(Integer blockedUserId) {
        this.blockedUserId = blockedUserId;
    }
}
