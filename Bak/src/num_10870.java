import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[N+1];
        for(int i=0;i<=N;i++){
            if(i==0)
                arr[i]=0;
            else if(i==1)
                arr[i]=1;
            else{
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.println(sb.append(arr[N]));
    }
}
