package com.example.chatproject.service;

import com.example.chatproject.model.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SocketService {
    private final SimpMessagingTemplate simpMessagingTemplate;

    public void sendMessage(MessageDTO messageDTO) {
        int roomId = messageDTO.getRoomId();
        String receiver = messageDTO.getReceiver();
        String message = messageDTO.getMessage();

        //대화 DB에 넣기
        //fcm알림
        // 메세지 전송
        simpMessagingTemplate.convertAndSend("/topic/"+receiver,message);

    }
}
