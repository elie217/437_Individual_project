
import java.util.ArrayList;
import java.util.List;

public class Subtitle {
    private Timestamp startTime, endTime;
    private final List<String> lines;

    /* Create a new Subtitle with the given start and end times. */
    public Subtitle(Timestamp startTime, Timestamp endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        lines = new ArrayList<>();
    }

    public Timestamp getStartTime() {
        return startTime;
    }
    public Timestamp getEndTime() {
        return endTime;
    }
    public void addLine(String line) {
        lines.add(line);
    }





    /* Compiles subtitle into a string with the given subtitle index. */
    public String compile(int index) {
        String subtitle = "";

        subtitle += Integer.toString(index) + "\n";
        subtitle += startTime.compile() + " --> " + endTime.compile() + "\n";

        for (String line : lines) {
            subtitle += line + "\n";
        }

        subtitle += "\n";
        return subtitle;
    }


}
