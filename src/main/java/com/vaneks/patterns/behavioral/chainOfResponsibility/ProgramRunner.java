package main.java.com.vaneks.patterns.behavioral.chainOfResponsibility;

public class ProgramRunner {
    public static void main(String[] args) {
        Notifier simpleQuest = new SimpleQuest(Quest.ANSWERPHONE);
        Notifier middleQuest = new MiddleQuest(Quest.SUPPORT);
        Notifier hardQuest = new HardQuest(Quest.ENGINEER);

        simpleQuest.setNextNotifier(middleQuest);
        middleQuest.setNextNotifier(hardQuest);

        simpleQuest.notifyManager(" - Simple Answer", 1);
        System.out.println("");
        simpleQuest.notifyManager(" - Middle Answer", 2);
        System.out.println("");
        simpleQuest.notifyManager(" - Hard Answer", 3);

    }
}
