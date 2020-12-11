package com.company.less8.backcall;

public class Button {

    private EventHandler eventHandler;

    public Button(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public void click() {
        eventHandler.execute();
    }
}
