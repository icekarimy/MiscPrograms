/*
 * Description: This program deploys the use of a recursive function.
 */
package ec1;

public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(findA_n(5, 2)); 
        System.out.println(findA_n(5, 3)); 
        System.out.println(findA_n(5, 4));
    }
    
    public static int findA_n(int n, int a_0) {
        if(n == 0) {
            return a_0;
        } else {
            return findA_n(n-1,-5*a_0 + 4);
        }   
    }
    
}
