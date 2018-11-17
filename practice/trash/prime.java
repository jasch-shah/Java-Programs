import java.util.*;
import java.io.*;

class prime{
	int a = 123456789,l = 9;
	boolean isPrime[];
	HashMap<Integer,Integer> map;

	void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	int getKey(int[][] arr){
		int x = 0;
		for (int i = 0;i<3 ;i++ ) {
			for (int j = 0;j < 3 ;j++ ) {
				x = x*10 + arr[i][j];
				
			}
		}
		return x;
	}

	int comp(int[] arr){
		int i = 0;
		for (int j = 0;j<l ;j++ ) {
			i = i*10 +arr[j];
		}
		return i;
	}

	int[] decomp(int x){
		int[] arr = new int[l];
		for (int i = l-1;i >= 0 ;i-- ) {
			arr[i] = x%10;
			x/=10;
		}
		return arr;
	}
	void graph(){
		Queue<Integer> q = new LinkedList<>();
		q.add(a);
		map.put(a,0);
		while(q.size()>0){
			int a = q.remove();
			int s = map.get(a);
			int[] arr = decomp(a);
			for(int i=0;i<l-1;i++){
				int x = arr[i] + arr[i+1];
				if(isPrime[x] && i!=2 && i!=5){
					swap(arr,i,i+1);
					int n = comp(arr);
					if(!map.containsKey(n)){
						map.put(n,s+1);
						q.add(n);
					}
					swap(arr,i,i+1);
				}
				if(i<6){
					x = arr[i] + arr[i+3];
					if(isPrime[x]){
						swap(arr,i,i+3);
						int n = comp(arr);
						if(!map.containsKey(n)){
							map.put(n,s+1);
							q.add(n);
						}
						swap(arr,i,i+3);
					}
				}
			}
		}
	}

	void init(){
		isPrime = new boolean[20];
		for (int i = 2;i<20 ;i++ ) {
			boolean f = true;
			for (int j = 2;j<i ;j++ ) {
				if(isPrime[j] && j==0){
					f = false;
					break;
				}
				
			}
			isPrime[i] = f;
			
		}
		map = new HashMap<>();
		graph();
	}

	void solve() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		init();
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
			int arr[] = new int[l];
			int k = 0;
			br.readLine();
			for(int i = 0;i<3;i++){
				String[] s = br.readLine().trim().split(" ");
				for(int j = 0;j<3;j++){
					arr[k++] = Integer.parseInt(s[j]);
				}
			}
			int key = comp(arr);
			if(map.containsKey(key)){
				System.out.println(map.get(key));
			}else{
				System.out.println(-1);
			}
		}	
		
	}
	public static void main(String[] args)throws IOException{
		new prime().solve();
	}

}
