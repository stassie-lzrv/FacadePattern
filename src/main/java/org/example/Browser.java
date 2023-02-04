package org.example;

public class Browser {
    public String name;

    public Browser(String name) {
        this.name = name;
    }

    void open() {
        System.out.printf("Браузер %s открыт\n", name);
    }

    void openTimetable() {
        System.out.println("Расписание открыто");
    }

    void followZoomLink() {
        System.out.println("Переход по ссылке из расписания");
    }

    void joinZoomCall(String subject) {
        System.out.printf("Подключение к онлайн-лекции по предмету: \"%s\"\n",subject);
    }


    void endZoomCall(String subject) {
        System.out.printf("Отключение от онлайн-лекции по предмету: \"%s\"\n",subject);
    }

    void close() {
        System.out.printf("Браузер %s закрыт\n", name);
    }
}
