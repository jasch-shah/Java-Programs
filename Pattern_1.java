/*
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5


import java.util.*;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//accept nos of rows
		System.out.println("Enter no of rows");
		int n = sc.nextInt();

		System.out.println("Loading your pattern");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

*/

/*
1
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5




import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(i+" ");
			System.out.println();
		}
	}
}

*/
/*

1
1 2 
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3 
1 2
1

*/

/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		System.out.println("Loading pattern");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(j+" ");
			System.out.println();
		}


	}
}

*/



/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5



*/


/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}	
}

*/

/*

5 4 3 2 1
4 3 2 1
3 2 1 
2 1
1 
1
2 1 
3 2 1
4 3 2 1
5 4 3 2 1




import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}



	}
}	

*/

/* 

	1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5   	



import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j = n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
				System.out.println();
		}
		

	
	}
}	

*/

/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4 
5

*/

/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}


	}
}	

*/

/*

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1

*/
/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}

*/

/*
1 2 3 4 5
1 2 3 4 
1 2 3
1 2 
1


import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}
*/

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

Floyd triangle


import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();
		int k=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}	
}


*/

/*

1 
2 1 
3 2 1
4 3 2 1 
5 4 3 2 1 



import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}	
}

*/


/*

1
2 7
3 8 13
4 9 14 19
5 10 15 20 25



import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int temp=i;
			for(int j=i;j>=1;j--)
			{
				System.out.print(temp+" ");
				temp += n;
			}
			System.out.println();
		}
	}	
}


*/

/*

	1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1



import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("-");
			}
			int temp=1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(temp+" ");
				temp=temp*(i-k)/(k);
			}
			System.out.println();
		}

	}	
}


*/

/*
1 
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/

/*

import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}	
}

*/

/*

1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1

*/

/*    
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(' ');
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}	
}  


*/

/*
			
	1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
*/

/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}	
}

*/
/*
12345
 2345
  345
   45
    5
    5
   45
  345
 2345
12345

*/

/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}

			for(int k=i;k<=n;k++)
			{
				System.out.print(k);
			}


			System.out.println();
		}

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}	
}
*/


/*

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5 

*/

/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+" ");

			}
			System.out.println();
		}
	}	
}

*/

/*

	1
   121
  12321
 1234321
123454321

*/
/*
import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+"");
			}
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}
	}	
}

*/

/*
1 
1 0
1 0 1
1 0 1 0
1 0 1 0 1


*/

import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();

		for(int i = 1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2 +" ");
			}
			System.out.println();
		}
	}	
}











/*

import java.util.Scanner;

public class Pattern_1
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("add nos of rows");
		int n=sc.nextInt();
	}	
}


*/



