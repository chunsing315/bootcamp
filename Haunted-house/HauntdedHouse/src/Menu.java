import java.util.Scanner;

public class Menu {
    private String command;
    private static Scanner scanner = new Scanner(System.in);

    public void setCommand(String command) {
        this.command = command;
    }

    public static void initial() {
        System.out.println("Press enter to start...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }

    public static String getCommand() {
        System.out.println("Input device name or [s]top: ");
        if (scanner.hasNextLine()) {
            String command = scanner.nextLine();
            return command;
        } else {
            System.out.println("No input available.");
            return "";
        }
    }
    public static void main(String[] args) {
        if (!(Menu.getCommand().equals("q"))){
            Menu.getCommand();
        }
        System.out.println(Menu.getCommand());
    }
}
