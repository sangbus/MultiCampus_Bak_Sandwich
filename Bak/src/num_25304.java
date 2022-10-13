import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_order_price = Integer.parseInt(br.readLine());
        int total_order_type = Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<total_order_type;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order_price = Integer.parseInt(st.nextToken());
            int order_num = Integer.parseInt(st.nextToken());
            sum = sum + (order_price*order_num);
        }

        if(total_order_price==sum)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
