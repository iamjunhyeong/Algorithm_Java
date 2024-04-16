package silver;

import java.io.*;

import java.util.*;
import java.lang.Math;

public class No8979 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n, k;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer>[] list = new ArrayList[n];
		for (int i=0; i<n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			list[i].add(Integer.parseInt(st.nextToken()));
			int num = 0;
			for (int j=0; j<3; j++) {
				num += Integer.parseInt(st.nextToken()) * Math.pow(10,2-j);
			}
			list[i].add(num); 
		}
		
		int ind = 0;
		for (int i=0; i<n; i++) {
			if (list[i].get(0) == k) {
				ind = i;
				break;
			}
			
		}
		
		int rank = 1;
		for (int j=0; j<n; j++) {
			if (ind == j) continue;
			
			if (list[ind].get(1) < list[j].get(1))
				rank++;
		}
		System.out.println(rank);	
		
	}
}
