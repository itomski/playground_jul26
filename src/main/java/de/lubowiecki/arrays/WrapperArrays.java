package de.lubowiecki.arrays;

import java.util.Arrays;

public class WrapperArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9};

        System.out.println(arr1[0]); // primitiv

        System.out.println(arr2[0].doubleValue()); // komplex

        System.out.println();

        // Sammlung von 5 Dokumenten
        Document[] docs = new Document[5];
        docs[0] = new Document("PowerPoint", 100);
        docs[1] = new Document("Word", 10);
        docs[2] = new Document("Excel", 1);

        System.out.println(docs);
        System.out.println(Arrays.toString(docs));

        System.out.println();

        for(Document d : docs) {
            if(d != null)
                System.out.println(d.getType());
        }
    }
}

class Document {

    // Finale Instanzvariablen MÜSSEN spätestens im Konstruktor zugewiesen werden
    private final String type;
    private final int pageCount;

    public Document(String type, int pageCount) {
        this.type = type;
        this.pageCount = pageCount;
    }

    public String getType() {
        return type;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Document{" +
                "type='" + type + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }
}