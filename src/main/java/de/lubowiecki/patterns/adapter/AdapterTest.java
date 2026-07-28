package de.lubowiecki.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        // Zwei Klassen deren Schnittstelle nicht zueinander passt, werden durch den Adapter angepasst

        MessageServer server = new MessageServer();
        server.send(new Sms("01723564345", "012347865432", "Yo! Mann!"));
        server.send(new EMail("a@b.com", "b@c.org", "Dies und das", "Yo! Mann!..."));

        Tweet tweet = new Tweet("Peter Parker", "starter", "So macht man es...", "Bla bla bla bla bla", "wichtig", "vip", "mega");
        server.send(new TweetToMessageAdapter(tweet));
    }
}
