class heart_pattern{
	public static void main(String[] args) {
		//set size of heart lower traingle part
		int a,b,size = 15;
		//for apex of heart
		for(a = size/2; a <= size;a= a+2){
			//for space before peak-1
			for(b = 1;b<size-a;b=b+2)
				System.out.print(" ");
			//for printing peak
			for(b = 1;b<=a;b++)
				System.out.print("A");

			//part 2 is spaces between peak 1 and peak 2
			for(b = 1;b<=size-a;b++)
				System.out.print(" ");
			//print peak 2
			for(b = 1;b<=a-1;b++)
				System.out.print("A");

			System.out.print("\n");
		}

		//Base of Heart i.e Inverted Triangle
		for(a = size;a>=0;a--){
			//for spaces before inverted traiangle
			for(b=a;b<size;b++)
				System.out.print(" ");
			//print base
			for(b=1;b<((a*2)-1);b++)
				System.out.print("X");

			System.out.print("\n");
		}

	}
}