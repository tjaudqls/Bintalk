package com.example.trigem.test.model;

import java.util.HashMap;
import java.util.Map;

public class ChatModel {
    //public String uid;
    //public String destinationUid;
    public Map<String, Boolean> users = new HashMap<>(); // 채팅방의 유저들
    public Map<String, Comment> comments = new HashMap<>(); // 채팅방의 내용


    public static class Comment{
        public String uid;
        public String message;
        public Object timestamp;
        public Map<String,Object> readUsers = new HashMap<>();
        public double longitude;
        public double latitude;



    }

}
