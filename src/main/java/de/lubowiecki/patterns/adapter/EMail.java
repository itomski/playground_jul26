package de.lubowiecki.patterns.adapter;

public class EMail implements Message{

    private final String from;
    private final String to;
    private final String subject;
    private final String body;

    public EMail(String from, String to, String subject, String body) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    @Override
    public void compute() {
        System.out.println("------------ SEND EMAIL ------------");
        System.out.println("FROM: \t " + from);
        System.out.println("TO: \t" + to);
        System.out.println("SUBJECT: \t" + subject);
        System.out.println("BODY: \t" + body);
        System.out.println("------------ END ------------\n");
    }

}
