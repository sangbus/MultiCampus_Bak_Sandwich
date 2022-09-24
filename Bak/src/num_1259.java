import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            String N = br.readLine();

            if(N.equals("0"))
                break;

            if(N.length()==5)
                if(N.charAt(4)==N.charAt(0)&&N.charAt(3)==N.charAt(1))
                    sb.append("yes").append("\n");
                else
                    sb.append("no").append("\n");
            else if(N.length()==4)
            {
                if(N.charAt(3)==N.charAt(0)&&N.charAt(2)==N.charAt(1))
                    sb.append("yes").append("\n");
                else
                    sb.append("no").append("\n");
            }
            else if(N.length()==3)
            {
                if(N.charAt(2)==N.charAt(0))
                    sb.append("yes").append("\n");
                else
                    sb.append("no").append("\n");
            }
            else if(N.length()==2)
            {
                if(N.charAt(0)==N.charAt(1))
                    sb.append("yes").append("\n");
                else
                    sb.append("no").append("\n");
            }
            else
                sb.append("yes").append("\n");

        }
        System.out.println(sb);
    }
}
