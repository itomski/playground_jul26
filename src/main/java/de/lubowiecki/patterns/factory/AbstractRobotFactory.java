package de.lubowiecki.patterns.factory;

public abstract class AbstractRobotFactory {

    public Robot setupAndGet() {
        Robot bot = create();
        bot.setup();
        return bot;
    }

    protected abstract Robot create();
}
