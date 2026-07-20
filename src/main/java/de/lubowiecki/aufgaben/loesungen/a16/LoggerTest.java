package de.lubowiecki.aufgaben.loesungen.a16;

public class LoggerTest {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Dies und das", "INFO");

        System.out.println();

        logger.log("Was anderes", "WARNING");

        machWas();

        logger.printLog();
    }

    static void machWas() {

        Logger logger = Logger.getInstance();
        logger.log("Info aus machWas", "INFO");
    }
}
