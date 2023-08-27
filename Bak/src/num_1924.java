import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int months[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        String days[] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        int gap = day - 1;
        for(int i=0;i<month;i++){
            gap += months[i];
        }

        gap %= 7;
        System.out.println(days[gap]);
    }

}
