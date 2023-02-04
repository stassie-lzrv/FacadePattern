package org.example;

public class ComputerFacade {
    Browser browser;
    Computer computer;

    public ComputerFacade(Browser browser, Computer computer) {
        this.browser = browser;
        this.computer = computer;

    }

    void watchOnlineLecture(String subject) {
        computer.turnOn();
        computer.loadSystem();
        browser.open();
        browser.openTimetable();
        browser.followZoomLink();
        browser.joinZoomCall(subject);
    }

    void leaveOnlineLecture(String subject){
        browser.endZoomCall(subject);
        browser.close();
        computer.shutdownSystem();
        computer.turnOff();
    }
}
