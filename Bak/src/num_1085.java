import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int w_x = w-x;
        int h_y = h-y;

        int result=0;
        if(x<w_x){
            if(x<h_y){
                if(x<y)
                    result=x;
                else
                    result=y;
            }
            else{
                if(h_y<y)
                    result=h_y;
                else
                    result=y;
            }
        }
        else {
            if(w_x<h_y){
                if(w_x<y)
                    result=w_x;
                else
                    result=y;
            }
            else{
                if(h_y<y)
                    result=h_y;
                else
                    result=y;
            }
        }
        System.out.println(result);
    }
}
