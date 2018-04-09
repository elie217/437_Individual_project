import java.io.File;
import java.io.IOException;

/**
 * Created by elietamer on 4/7/18.
 */
public class Main {
    public static void main(String[] args) throws IOException, InvalidTimestampFormatException {
        SubtitleFile exampleFile = new SubtitleFile(new File("x.srt"));
        //System.out.println( exampleFile.compile());
        System.out.println(exampleFile.find("your side"));

    }
}
