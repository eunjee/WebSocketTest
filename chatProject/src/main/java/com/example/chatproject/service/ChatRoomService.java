package com.example.chatproject.service;

import com.example.chatproject.model.dto.res.ChatHistoryRes;
import com.example.chatproject.model.dto.res.ChatRoomRes;
import com.example.chatproject.model.dto.res.NewChatRoomRes;
import com.example.chatproject.repository.ChatRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;
    //새로운 방 id
    public int newRoom(String receiver, String sender) {
        return 0;
    }


    //모든 방 가져오기
    public List<ChatRoomRes> findAllRooms(int memberId) {
        return null;
    }

    public List<ChatHistoryRes> getChatHistory(int roomId) {
        return null;
    }
}
