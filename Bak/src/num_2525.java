import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int need_minute = Integer.parseInt(st.nextToken());

        int KOI = minute+need_minute;

        if(KOI>=60)
        {
            hour += (KOI/60);
            KOI = KOI%60;
            if(hour>=24)
                hour-=24;
        }
        System.out.println(hour+" "+KOI);
    }
}

