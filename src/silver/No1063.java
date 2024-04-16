package silver;

import java.util.*;
import java.io.*;

public class No1063 {
	
	public static boolean check_ind(int i, int j) {
		
		if (i >= 8 || j >= 8)
			return false;
		if (i < 0 || j < 0)
			return false;
		return true;
	}
	
	public static void move(Integer[] king, Integer[] stone, String s) {
		int i = 0;
		int j = 0;
		
		for (int len=0; len<s.length(); len++) {
			
			if (s.charAt(len) == 'R')
				j = 1;
			else if (s.charAt(len) == 'L')
				j = -1;
			else if (s.charAt(len) == 'B')
				i = -1;
			else if (s.charAt(len) == 'T')
				i = 1;
		}
		if (!check_ind(king[0] + j, king[1] + i))
			return ;
		king[0] += j;
		king[1] += i;
		
		if (king[0] == stone[0] && king[1] == stone[1] ) {
			if (!check_ind(stone[0] + j, stone[1] + i))
			{
				king[0] -= j;
				king[1] -= i;
				return ;
			}
			stone[0] += j;
			stone[1] += i;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Integer[][] board = new Integer[8][8];
		Integer[] king = new Integer[2];
		Integer[] stone = new Integer[2];
		st = new StringTokenizer(br.readLine());
		
		for (int i=1; i<=2; i++) {
			String str = st.nextToken();
			int fir = str.charAt(0) - 65;
			int sec = str.charAt(1) - 48;
			if (i == 1) {
				king[0] = fir;
				king[1] = sec - 1;
			}
			else {
				stone[0] = fir;
				stone[1] = sec - 1;
			}
		}
		
		int n = Integer.parseInt(st.nextToken());
		
		for (int i=0; i<n; i++) {
			
			String str = br.readLine(); 
			move(king, stone, str);
		}
		
		char k = (char) (king[0] + 65);
		System.out.print(k);
		System.out.println(king[1] + 1);
		char s = (char) (stone[0] + 65);
		System.out.print(s);
		System.out.println(stone[1] + 1);
		
		
	}
}
