/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec3;


public class pascalTriangle {

 /*

 * Description: This program uses factorials amd combinations to display the nth row in Pascal's Triangle
 */
    public static void main(String[] args) {
        //System.out.println(factorial(4));
        //System.out.println(nChooseR(4,1));
        System.out.println(displayPascal(4));
        System.out.println(displayPascal(7));
        System.out.println(displayPascal(10));
       
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
			return n * (factorial(n - 1));
        }
    }
    public static int nChooseR(int n, int r) {
        int result = (factorial(n))/(factorial(r)*(factorial(n-r)));
        return result;
    }
    public static String displayPascal(int row) { 
        String resultant = "";
        int temp;
        for(int i = 0; i <= row; i++) {
            temp = nChooseR(row,i);
            resultant = resultant + " " + String.valueOf(temp);
        }
        return resultant;
    }
    
}
