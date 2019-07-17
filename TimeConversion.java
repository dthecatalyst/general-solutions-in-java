import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    private static String timeConversion(String s) throws ParseException {

        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outPutFormat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        date = parseFormat.parse(s);
        return outPutFormat.format(date);

    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
