import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class num_10816 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int card[] = new int[N];
        for(int i=0;i<N;i++)
        {
            card[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(card);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++)
        {
            int num = Integer.parseInt(st.nextToken());

            /*
            * upper bound - lower bound = 중복 원소에 대한 길이가 된다.
            * */

            sb.append(upper(card,num) - lower(card,num)).append(' ');
        }

        System.out.println(sb);
    }

    
    /*
    * 하한(lower bound) : 찾고자 하는 값 이상의 값이 처음으로 나타나는 위치
    * 중복 원소를 고려해야하기 때문에 하한과 상한의 개념을 알아야 한다.
    * */
    
    public static int lower(int []first_card, int third_card)
    {
        int min=0;
        int max = first_card.length; //배열 마지막 인덱스를 초과한 인덱스가 나올 수 있기 때문에 -1을 하지 않는다.

        while(min < max)
        {
            int mid = min + ((max-min)/2);  // 인덱스 이동하려면 min을 더해줘야함.
            if(third_card <= first_card[mid])   //찾고자 하는 값이 배열의 값보다 작다면 max값 조정
            {
                max = mid;
            }
            /*
            * 찾고자 하는 값이 배열의 값보다 크다면 min값 조정
            * 중복하는 값이 있을 수 있기 때문에 1씩 증가하며 값을 비교한다.
            * */
            else
            {
                min++;
            }
        }
        return min;
    }


    /*
     * 상한(upper bound) : 찾고자 하는 값을 초과하는 값이 처음으로 나타나는 위치
     * */
    public static int upper(int []first_card, int third_card)
    {
        int min=0;
        int max =first_card.length;
        while(min < max)
        {
            int mid = min + ((max-min)/2);
            if(third_card < first_card[mid])
            {
                max = mid;
            }
            else
            {
                min++;
            }
        }
        if(third_card == 10) {
            System.out.println("min : " + min);
            System.out.println("length : "+first_card.length);
        }
        return min;
    }

}