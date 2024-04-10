package bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No2490 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[] arr = new int[4];
        for (int n = 0; n < 3; n++) {
        	int cnt = 0;
        	st = new StringTokenizer(br.readLine());
        	for (int i = 0; st.hasMoreTokens(); i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        for (int a : arr) {
	        	if (a == 0)
	        		cnt++;
	        }
	        
	        if (cnt == 0)
	        	bw.write('E');
	        else if(cnt == 1)
	        	bw.write('A');
	        else if(cnt == 2)
	        	bw.write('B');
	        else if(cnt == 3)
	        	bw.write('C');
	        else if(cnt == 4)
	        	bw.write('D');
	        bw.newLine();
        }
        bw.close();
        
	}

}
