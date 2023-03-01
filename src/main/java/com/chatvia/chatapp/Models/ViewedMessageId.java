package com.chatvia.chatapp.Models;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ViewedMessageId implements Serializable {

    @Column(name = "message_id")
    private Integer messageId;

    @Column(name = "user_id")
    private Integer userId;

    public ViewedMessageId() {
    }

    public ViewedMessageId(Integer messageId, Integer userId) {
        this.messageId = messageId;
        this.userId = userId;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer employeeId) {
        this.messageId = employeeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer departmentId) {
        this.userId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ViewedMessageId that = (ViewedMessageId) o;
        return messageId.equals(that.messageId) &&
                userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, userId);
    }
}