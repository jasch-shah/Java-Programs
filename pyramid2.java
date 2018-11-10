import java.io.*;
 
class pyramid 
{
     
// Function definition
static void pattern(int min_stars, 
                    int p_height)
{
    int p_space;
    p_space = p_height - 1;
    int i, j, k, n, x;
    x = 1;
 
    // for loop for
    // height of pyramid
    for (i = 0; i < p_height; i++) 
    {
 
        // for loop for spaces
        for (j = p_space; j > i; j--) 
        {
            System.out.print(" ");
        }
 
        // for loop for printing
        // left pyramid
        for (k = 0; k < min_stars; k++)
            System.out.print("*");
 
        // for loop for 
        // spaces in middle
        for (n = (p_height + p_height - 2);
             n >= x; n--)
                System.out.print(" ");
 
        // for loop for printing
        // right pyramid
        for (k = 0; k < min_stars; k++)
                System.out.print("*");
 
        min_stars = min_stars + 2;
        x = x + 2;
            System.out.println();
    }
}
 
// Driver code
public static void main (String[] args) 
{
 
/* change value to set minimun 
number of stars in pyramid */
int min_stars = 1;
 
/* change value to increase or
decrease size of pyramid */
int p_height = 5;
 
// function calling
pattern(min_stars, p_height);
}
}