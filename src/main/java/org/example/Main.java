package org.example;

public class Main {
    public static void main(String[] args) {
        Browser browser = new Browser("Safari");
        Computer computer = new Computer("MacBook Pro");
        String lectureName = "Алгоритмы и Структуры Данных";

        ComputerFacade computerFacade = new ComputerFacade(browser,computer);
        computerFacade.watchOnlineLecture(lectureName);
        computerFacade.leaveOnlineLecture(lectureName);
    }
}