package com.swt1.bs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
public class Nachricht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String inhalt;
    private Date datum;

    @ManyToOne(targetEntity = Chat.class)
    private Chat chat;

    public Nachricht(Chat chat, String inhalt) {
        this.chat = chat;
        this.inhalt = inhalt;
    }

}
