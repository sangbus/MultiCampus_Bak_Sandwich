package day03;
import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class iftest {
	public static void main(String[] args) throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int time[][] = new int[num][2];
		for(int i=0;i<num;i++)
		{
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		
	 }
}
