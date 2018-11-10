public class christmastree {

    public static void main(String[] args) {

        int sizeOfTree = 9;
        double remainderVal = sizeOfTree % 2 ;
        double ans = sizeOfTree / 2 ;

        if (remainderVal == 0) {
            System.out.println("Invalid number enter 9,19 calculat rest yourself u looser ..");
            System.exit(0);
        }
        int middlePos = (int) Math.round(ans + .5);

        for (int i = 0; i <= sizeOfTree; i++) {
            int lStar = middlePos - i;
            int rStar = middlePos + i;

            if (lStar < 1) {
                break;
            }
            printleaves(lStar, rStar, sizeOfTree);
        }
    }

    public static void printleaves(int a,int b, int size){
        System.out.println();
        for (int i = 1; i <= size; i++) {
            if (i > a && i < b ){
                System.out.print("*");
            }else System.out.print(" ");    
        }   
    }
}
