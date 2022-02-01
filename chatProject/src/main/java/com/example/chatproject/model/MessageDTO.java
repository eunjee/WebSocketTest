package com.example.chatproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageDTO {
    private int roomId;
    private String sender;
    private String receiver;
    private String message;
}
