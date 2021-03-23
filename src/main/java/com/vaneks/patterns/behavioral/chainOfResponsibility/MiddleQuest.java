package behavioral.chainOfResponsibility;

public class MiddleQuest extends Notifier{
    public MiddleQuest(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Rebooting your computer..." + message);
    }
}
