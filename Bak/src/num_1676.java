import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class num_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int zero = 0;
        BigInteger pack = new BigInteger("1");
        for(int i=1;i<=num;i++)
        {
            pack = pack.multiply(BigInteger.valueOf(i));
        }
        String chPack = pack.toString();
        int length = chPack.length()-1;
        int count = length;
        for(int i=length;i>=0;i--){
            if(chPack.charAt(i)=='0'&&count==i)
            {
                zero++;
                count--;
            }
            else if(chPack.charAt(i)==0&&count!=i)
                zero=1;
        }
        System.out.println(zero);
    }
}
