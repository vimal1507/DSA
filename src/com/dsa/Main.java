import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer>[] temp = new ArrayList[m+1];
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i <= m; i++) {
		    temp[i] = new ArrayList<>();
		}
        for(int i=0;i<n;i++){
            int re = arr[i]%m;
            temp[re].add(arr[i]);
        }
        for(int i=0;i<temp.length;i++) {
        	if(temp[i].size()>=k) {
        		System.out.println("Yes");
        		for(int j=0;j<k;j++) {
        			System.out.print(temp[i].get(j)+" ");
        		}
        		return;
        	}
        }
        System.out.println("No");
	}
}
