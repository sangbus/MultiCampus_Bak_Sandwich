import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int noon1 = Integer.parseInt(st.nextToken());
        int noon2 = Integer.parseInt(st.nextToken());
        int noon3 = Integer.parseInt(st.nextToken());

        if(noon1==noon2 && noon2==noon3)
        {
            System.out.println(10000+noon1*1000);
        }
        else if(noon1==noon2)
        {
            System.out.println(1000+noon1*100);
        }
        else if(noon2==noon3)
        {
            System.out.println(1000+noon2*100);
        }
        else if(noon1==noon3)
        {
            System.out.println(1000+noon1*100);
        }
        else if(noon1!=noon2&&noon2!=noon3&&noon1!=noon3)
        {
            int max = Math.max(noon1,noon2);
            max = Math.max(max,noon3);
            System.out.println(max*100);
        }
    }
}
