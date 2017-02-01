package com.mechanitis.demo.sense.client.user;

import com.mechanitis.demo.sense.infrastructure.MessageListener;
import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;

import static javafx.collections.FXCollections.observableArrayList;

public class LeaderboardData implements MessageListener<String> {
    private static final int NUMBER_OF_LEADERS = 18;
    private final Map<String, TwitterUser> allTwitterUsers = new HashMap<>();

    private ObservableList<TwitterUser> items = observableArrayList();

    public ObservableList<TwitterUser> getItems() {
        return items;
    }

    @Override
    public void onMessage(String message) {
        System.out.println("message = [" + message + "]");
    }
}
