import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2580 {
    public static int arr[][] = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<9;i++)
        {
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sudoku(0,0);
    }

    public static void sudoku(int row, int col)
    {
        if(row==9)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++)
            {
                for(int j=0;j<9;j++)
                {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }
        if(col==9)
        {
            sudoku(row+1,0);
            return; // 이전 row가 잘못 채워졌을 경우 되돌아가기 위함
        }
        if(arr[row][col]==0)
        {
            for(int i=1;i<=9;i++)
            {
                if(possibility(row,col,i))
                {
                    arr[row][col]=i; // 스도쿠에서 현재 가능한 임의의 값을 넣은 다음
                    sudoku(row,col+1); // 다음 열로 넘어간다.
                }
            }
            /*
            * 스도쿠가 채워지지 않는 경우 재귀에서 빠져나가고
            * 다시 초기 값으로 되돌려줘야한다.
            * */
            arr[row][col]=0;
            return;
        }
        sudoku(row,col+1);
    }

    public static boolean possibility(int row,int col,int value)
    {
        for(int i=0;i<9;i++)
        {
            // 같은 행 검사
            if(arr[row][i]==value)
            {
                return false;
            }

            // 같은 열 검사
            if(arr[i][col]==value)
            {
                return false;
            }
        }


        int rrow = row/3*3;
        int ccol = col/3*3;
        // 한 박스 내 탐색
        for(int i=rrow;i<rrow+3;i++)
        {
            for(int j=ccol;j<ccol+3;j++)
            {
                if(arr[i][j]==value)
                    return false;
            }
        }
        return true;
    }
}
