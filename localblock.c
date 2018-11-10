#include <stdio.h>

void main()
{
	//Begin the local block before if
	int test_var = 10;
	printf("Test Variable before the if statement: %d\n", test_var);
	if(test_var > 5)
	{
		//begin the local block for if statement
		test_var = 5;
		printf("Test Variable in the if statement: %d\n", test_var);
		{
			//begin independent local block
			int test_var = 0;
			printf("Test Variable within the independent local block : %d\n", test_var);
		}
		//end of independent block
	}
	//end of if
	printf("Test Variable after the if statement: %d\n", test_var);
}