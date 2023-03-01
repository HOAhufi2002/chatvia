package com.chatvia.chatapp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "groups")
public class Group {
    @Column(name = "avatar")
    private String avatar;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "last_message")
    private Integer lastMessage;

    @Column(name = "desc")
    private String desc;

    @Column(name = "owner")
    private Integer owner;

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLastMessage() {
        return this.lastMessage;
    }

    public void setLastMessage(Integer lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getOwner() {
        return this.owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
    }
}
