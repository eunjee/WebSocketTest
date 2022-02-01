package com.example.chatproject.controller;

import com.example.chatproject.model.dto.res.ChatHistoryRes;
import com.example.chatproject.model.dto.res.ChatRoomRes;
import com.example.chatproject.model.dto.res.NewChatRoomRes;
import com.example.chatproject.service.ChatRoomService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ChatController {
    private final ChatRoomService chatRoomService;

    //회원의 채팅방 리스트 가져오기
    @GetMapping("/chat/rooms/{memberId}")
    public List<ChatRoomRes> getChatRooms(@PathVariable int memberId){
        return chatRoomService.findAllRooms(memberId);
    }

    //새로운 채팅방 만들기 (나 자신, 상대방)
    @PostMapping("/chat/newChat")
    public NewChatRoomRes newChat(@RequestParam String receiver, @RequestParam String sender){
        int roomId = chatRoomService.newRoom(receiver,sender);
        return new NewChatRoomRes(roomId); //새로운 방 번호를 전달
        //아니면 redirect
    }

    //채팅방 대화내역
    @GetMapping("/chat/{roomId}")
    public List<ChatHistoryRes> getChatHistory(@PathVariable int roomId){
        return chatRoomService.getChatHistory(roomId);
    }

}
