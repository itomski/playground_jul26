package de.lubowiecki.libs;

import tools.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JsonWrite {

    public static void main(String[] args) {

        List<Eintrag> list = new ArrayList<>();
        list.add(new Eintrag("Super Nachricht", LocalDateTime.of(2000, 12, 5, 12, 0), "Bla bla bla"));
        list.add(new Eintrag("Andere Nachricht", LocalDateTime.now(), "Dies und das"));
        list.add(new Eintrag("Ganz andere Nachricht", LocalDateTime.now().minusDays(30), "Das ist das Haus von Nikigraus"));

        // Jackson / Gson

        String FILE = "data.json";

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new FileWriter(FILE), list);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
