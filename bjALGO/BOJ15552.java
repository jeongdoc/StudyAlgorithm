package bojEX;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ15552 {

	public static void main(String[] args) {
		// boj15552
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int x = Integer.parseInt(br.readLine());
            for(int i = 0; i < x; i ++) {
                String []sar = br.readLine().split(" ");
                bw.write(Integer.parseInt(sar[0]) + Integer.parseInt(sar[1])+ "\n");
            }
            bw.flush();
        } catch(Exception e) {
            e.printStackTrace();
        }
	}

}
