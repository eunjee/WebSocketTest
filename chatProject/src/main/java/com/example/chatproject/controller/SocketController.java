package com.example.chatproject.controller;

import com.example.chatproject.model.MessageDTO;
import com.example.chatproject.service.SocketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
class SocketController {

    private final SocketService socketService;

    //클라이언트가 메세지를 보냈을 경우
    @MessageMapping("/chat/message")
    //@SendTo("/topic/greetings")
    public void echoMessageMapping(MessageDTO messageDTO) {
        socketService.sendMessage(messageDTO);
    }

}
