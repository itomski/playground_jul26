package de.lubowiecki.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputOutput {

    public static void main(String[] args) {

        final String FILE = "text1.txt";

//        try(OutputStream out = new FileOutputStream(FILE)) {
//            out.write(("Hello, world!").getBytes()); // Alles muss in Bytes umgewandelt werden
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(Writer out = new FileWriter(FILE)) {
//            out.write("Hello, world!");
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

//        try(InputStream in = new FileInputStream(FILE)) {
//            while(in.available() > 0) {
//                System.out.print((char)in.read());
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        // Mit Buffer
//        try(BufferedReader in = new BufferedReader(new FileReader(FILE))) {
//            String line;
//            while((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        // NIO arbeitet mit Path
        Path path = Paths.get(FILE);

//        try {
//            // Die Datei wird in eine Liste eingelesen und liegt im RAM
//            List<String> rows = Files.readAllLines(path);
//            rows.forEach(System.out::println);
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            // Produziert einen Stream
            Files.lines(path).forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Files
        // Files.createFile(FILE)

    }
}
