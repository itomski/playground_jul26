package de.lubowiecki.libs;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.type.CollectionType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JsonRead {

    public static void main(String[] args) {

        String FILE = "data.json";

        ObjectMapper mapper = new ObjectMapper();

        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Eintrag.class);
            List<Eintrag> list = mapper.readValue(new FileReader(FILE), type);

            for (Eintrag eintrag : list) {
                System.out.println(eintrag.getTitle());
                System.out.println(eintrag.getErzeugtAm());
                System.out.println(eintrag.getContent());
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
