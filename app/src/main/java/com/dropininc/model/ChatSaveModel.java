package com.dropininc.model;

import com.dropininc.utils.Logs;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ChatSaveModel extends BaseModel {

    public String account;
    public String message;
    public String gig;
    public String createdAt;
    public String updatedAt;
    public String id;

    public static ChatSaveModel fromJSON(String json) {
        return new Gson().fromJson(json, ChatSaveModel.class);
    }

    public static ArrayList<ChatSaveModel> fromJSONArray(String array) {
        Type collectionType = new TypeToken<ArrayList<ChatSaveModel>>() {
        }.getType();
        return new GsonBuilder().create().fromJson(array, collectionType);
    }

    public static String toJSONArray(ArrayList<ChatSaveModel> datas) {
        return new GsonBuilder().create().toJson(datas);
    }

    @Override
    public String toJSON() {
        return new GsonBuilder().create().toJson(this);
    }

    public JSONObject toJsonObject() {
        try {
            return new JSONObject(toJSON());
        } catch (Exception e) {
            Logs.log(e);
        }
        return null;
    }
}
