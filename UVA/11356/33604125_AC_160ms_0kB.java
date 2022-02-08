
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);

        int k =1;
        int t = in.nextInt();

        in.nextLine();

        while (t-- > 0) {
            String str = in.nextLine();
            int n = in.nextInt();
            in.nextLine();

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MMMM-dd");

            Date date = format.parse(str);

            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, n);
            Date d = c.getTime();
            System.out.println("Case "+k+": "+format.format(d));
            k++;
        }
    }
}
