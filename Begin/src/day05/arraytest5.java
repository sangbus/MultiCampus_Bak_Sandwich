package day05;

public class arraytest5 {

	public static void main(String[] args) {
		/*[문제1] 2차원 배열에 아래와 같은 값이 저장되도록 하세요.
		 *        단, for루프를 이용해서 저장한 뒤, 저장된 값들을
		 *        출력해봅시다.
		 *        
		 *        1 0 0 0 0
		 *        0 1 0 0 0
		 *        0 0 1 0 0
		 *        0 0 0 1 0
		 *        0 0 0 0 1
		 * */
		int arr[][] = new int[5][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
					arr[i][j]=1;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		/*[문제2] 아래 선언한 변수들의 자료유형을 맞추세요
		 * 1) int i, j; ===> i,j 모두 정수형
		 * 2) int []i, j; ==>i:1차원 배열, j:1차원 배열
		 * 3) int i[][], j[]; ==> i: 2차원 배열, j: 1차원 배열
		 * 4) int []i, j[]; ==> i: 1차원 배열, j: 2차원 배열
		 * 5) int [][]i, j; ==> i,j 모두 2차원 배열
		 * 6) int i,j[][];  ==> i : 정수형, j: 2차원 배열
		 * */

	}

}
