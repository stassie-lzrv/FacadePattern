package org.example;

public class Computer {
    public String computerName;

    public Computer(String computerName) {
        this.computerName = computerName;
    }

    void turnOn() {
        System.out.printf("Компьютер %s включен\n", computerName);
    }

    void loadSystem() {
        System.out.println("Компьютер готов к работе");
    }

    void shutdownSystem() {
        System.out.println("Компьтер завершил работу");
    }

    void turnOff() {
        System.out.println("Компьютер выключен");
    }
}
