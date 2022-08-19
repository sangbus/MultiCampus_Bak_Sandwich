import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_10871 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int num = Integer.parseInt(st.nextToken());
      int min = Integer.parseInt(st.nextToken());
      int arr[] = new int[num];
      StringTokenizer st1 = new StringTokenizer(br.readLine());
      for(int i=0;i<num;i++)
      {
         arr[i]=Integer.parseInt(st1.nextToken());
      }
      StringBuilder sb = new StringBuilder();
      for(int a : arr)
      {
         if(a<min)
         {
            sb.append(a+" ");
         }
      }
      System.out.println(sb);
   }

}