import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Recorder {
    public String choice;
    private final LocalTime timeStamp;

    private String deviceID;
    Duration duration;

    public Recorder() {
        this.timeStamp = LocalTime.now();
    };

    public Recorder(String deviceID, Duration duration) {
        this.deviceID = deviceID;
        this.duration = duration;
        this.timeStamp = LocalTime.now();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    };

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    public String getDeviceID() {
        return deviceID;
    }

    @Override
    public String toString() {
        return "Cue " + this.deviceID + " @ " + this.duration.toMillis() + " ms\n";
    }

    public static void main(String[] args) {
        clearScreen();
        String choice = "";
        Menu.initial();
        LocalTime starttime = LocalTime.now();
        clearScreen();
        Set<Recorder> loop = new TreeSet<>((r1, r2) -> r1.getDuration().compareTo(r2.getDuration()));

        // Scanner scanner = new Scanner(System.in);
        choice = Menu.getCommand();
        // menu
        while (!(choice.equals("q"))) {
            System.out.println("The loop currently has " + loop.size() + " cues");
            choice = Menu.getCommand();

            switch (choice) {
                case "s": {
                    System.out.println("Stopped");
                    break;
                }
                case "": {
                    break;
                }
                default: {
                    if (Duration.between(LocalTime.now(), starttime).toSeconds() < 3600) {
                        loop.add(new Recorder(choice, Duration.between(starttime, LocalTime.now())));

                    } else {
                        System.out.println("Loop exceed the 1hr limit");
                        choice = "q";
                    }
                }
            }
            ;
            clearScreen();

        }

        // set duration
        System.out.println("Total cue set " + loop.size());
        // for(
        // int i = 1;i<loop.size();i++)
        // {
        // loop.get(i).setDuration(Duration.between(loop.get(0).getTimeStamp(),
        // (loop.get(i).getTimeStamp())));
        // }

        // print all cues
        choice = "";
        while (!(choice.equals("q"))) {
            choice = "";
            System.out.println("[s]how master loop \n"
                    + "Start new loop to master loop [n]ow\n"
                    + "[q]uit: ");
            choice = Menu.getCommand();

            switch (choice) {
                case "q": // early exit
                    System.out.println("Bye!");
                    break;
                case "n":
                    clearScreen();
                    starttime = LocalTime.now();
                    // package these. tbc
                    while (!(choice.equals("q"))) {
                        System.out.println("The loop currently has " + loop.size() + " cues \n"
                                + "Input device name or [q]uit: ");
                        choice = Menu.getCommand();

                        switch (choice) {
                            case "q": {
                                System.out.println("quit");
                                break;
                            }
                            case "": {
                                break;
                            }
                            default: {
                                if (Duration.between(LocalTime.now(), starttime).toSeconds() < 3600) {
                                    loop.add(new Recorder(choice, Duration.between(starttime, LocalTime.now())));

                                } else {
                                    System.out.println("Loop exceed the 1hr limit");
                                    choice = "q";
                                }
                            }
                        }
                        clearScreen();
                    };
                    break;
                case "s":
                    clearScreen();
                    System.out.println(loop);
                default:
                    break;
            }

        }
    }

}
