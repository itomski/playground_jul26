package de.lubowiecki.libs;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.type.CollectionType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadConfig {

    public static void main(String[] args) {

        String FILE = "config.json";

        ObjectMapper mapper = new ObjectMapper();

        try {
            Config conf = mapper.readValue(new FileReader(FILE), Config.class);

            System.out.println(conf.getUser());
            System.out.println(conf.getPassword());
            System.out.println(conf.getHost());
            System.out.println(conf.getPort());
            System.out.println(conf.getDriver());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
