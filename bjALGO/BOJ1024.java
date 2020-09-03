package bojEX;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ1024 {

	public static void main(String[] args) {
		// boj 1024
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		try {
			StringTokenizer token = new StringTokenizer(br.readLine());
			long N = Long.parseLong(token.nextToken());
			long L = Long.parseLong(token.nextToken());
			boolean flag = true;
			for(long x = L; x < 101 && flag ; x ++) {
				long mcule = (2*N - x*(x-1));
				long deno = (2*x);
				if(mcule % deno == 0 && 2*N >= x*(x-1)) {
					long fterm = mcule/deno;
					for(long i = 0; i < x; i ++) {
						bw.write((fterm + i) + " ");
					}
					flag = false;
				}
			}
				/*anon = (N - (x*(x-1)/2));
				result = anon / x;*/
				/*System.out.println(N + ", " + L);
				System.out.println("anon : " + anon);
				System.out.println("result : " + result);*/
				//if(anon % x == 0 && result >= L && anon >= 0) {
					/*for(long i = 0; i <= x; i ++) {
						bw.write(result + i + " ");
					}*/
			if(flag) bw.write("-1 \n");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(0); 
	}

}
