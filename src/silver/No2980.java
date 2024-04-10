package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No2980 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n, l;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        
        
        Integer[][] light = new Integer[n][3];
        for (int i=0; i<n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j=0; j<3; j++) {
        		light[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        int dist = 0;
        int time = 0;
        int cur = 0;
        
        while (dist < l) { 
    
        	// 신호등이 있는 경우
        	if (cur < n && dist == light[cur][0]) {
	        	int	cur_light = (time % (light[cur][1] + light[cur][2])) - light[cur][1];
	        	if (cur_light < 0) {
	        		time++;
	        		continue;
	        	}
	        	else
	        		cur++;
        	}
        	dist++;
        	time++;
        }
        System.out.println(time);
	}

}
