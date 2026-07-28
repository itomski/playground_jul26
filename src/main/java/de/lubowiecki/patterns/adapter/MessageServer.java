package de.lubowiecki.patterns.adapter;

import java.time.LocalDateTime;

public class MessageServer {

    public MessageServer() {
        System.out.println(LocalDateTime.now() + ": Server läuft");
    }

    public void send(Message msg) {
        System.out.println(LocalDateTime.now() + ": Nachricht wird verschickt...");
        msg.compute();
    }
}
