import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2839 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sugar = Integer.parseInt(st.nextToken());

            int bong = 0;

            while(true)
            {
                if(sugar%5==0)
                {
                    bong+=sugar/5;
                    sugar=0;
                    break;
                }
                else if(sugar>=3)
                {
                    bong++;
                    sugar-=3;
                }
                else {
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(bong);
        }
    }