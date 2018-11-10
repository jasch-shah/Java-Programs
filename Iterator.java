import java.io.*;
import java.util.*;
import java.lang.*;


class Iterator{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();
		while(testcases-- > 0){
			int n = s.nextInt();
			int k = s.nextInt();

			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0;i<n;i++)
				list.add(s.nextInt());


			Collections.sort(list);
			Iterator<Integer> itr = list.iterator();

			StringBuilder sb = new StringBuilder("[");
			while(itr.hasNext())
			{
				int current = itr.next();
				if(current < k)
				{
					System.out.println("Removed integer value "+current);
					itr.remove();
				} else
					sb.append(current+", ");
			}
			if(sb.length() > 3)
				sb.setLength(sb.length() - 2);
			System.out.println(sb+" ]");
		}
	}
}