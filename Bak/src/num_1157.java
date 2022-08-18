import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int alp[] = new int[26];
		for(int i=0;i<word.length();i++)
		{
			char cword = word.charAt(i);
			if(cword>='A' && cword<='Z')
			{
				alp[cword-'A']++;
			}
			else
			{
				alp[cword-'a']++;
			}
		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < alp.length; i++) {
 
			if (alp[i] > max) {
				max = alp[i];
				ch = (char)(i+'A');
			} 
			else if (alp[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}

}
