import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int king1=1;
        int queen1=1;
        int look1=2;
        int bishop1=2;
        int night1=2;
        int phone1=8;


        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int look = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int phone = Integer.parseInt(st.nextToken());

        System.out.print(king1-king+" ");
        System.out.print(queen1-queen+" ");
        System.out.print(look1-look+" ");
        System.out.print(bishop1-bishop+" ");
        System.out.print(night1-night+" ");
        System.out.print(phone1-phone);
    }
}
