import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int stack[] = new int[num];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        int start = 0;
        while(num -- > 0){
            int value = Integer.parseInt(br.readLine());
            if(value > start){
                for(int i=start+1;i<=value;i++){
                    stack[idx] = i;
                    idx++;
                    sb.append('+').append('\n');
                }
                start = value;
            }
            else if(stack[idx - 1] != value){
                System.out.println("NO");
                return;
            }
            idx --;
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}