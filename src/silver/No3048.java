package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No3048 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Character[] arr = new Character[n+m];

        String s = br.readLine();
        for (int i = 0; i < n; i++) {
        	arr[i] = s.charAt(n - i - 1);
        }
        
        
        String ss = br.readLine();
        for (int i = n; i < n + m; i++) {
        	arr[i] = ss.charAt(i - n);
        }
        
        int t = Integer.parseInt(br.readLine());
        
       for (int i = 0; i < t; i++ ) {
    	   Character[] cur = arr.clone();
    	   for (int j = 0; j<arr.length - 1; j++) {
    		   if (s.indexOf(cur[j]) != -1 && ss.indexOf(cur[j + 1]) != -1) {
    			   Character tmp = cur[j];
    			   arr[j] = cur[j+1];
    			   arr[j+1] = tmp;
    		   }
    	   }
       }
 
        
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(arr[i]);
        }
        
	}

}
