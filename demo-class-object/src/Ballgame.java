import java.text.DateFormat;
import java.time.LocalDate;

public class Ballgame {
    private int[] hostStarters;
    private int[] guestStarters;
    private String hostName;
    private String guestName;
    private LocalDate playDate;
/*     private LocalDateTime startTime;
    private LocalDateTime endTime;
 */
    public void setHostName(String name){
        this.hostName = name;
    }
    public String getHostName(){
        return this.hostName;
    }
}


