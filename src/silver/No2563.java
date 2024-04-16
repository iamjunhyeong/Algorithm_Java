package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2563 {
	
	public static void fill_paper(int[][] arr, int x, int y) {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				arr[y+i][x+j] = 1;
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[101][101];
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			fill_paper(arr, x, y);
		}
		
		int cnt = 0;
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (arr[i][j] == 1)
					cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}
