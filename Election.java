/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election;


public class Election {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int partyOne;
        int partyTwo;
        int partyThree;
        partyOne = (int) (Math.random() * 100 + 1);
        int test = 100 - partyOne;
        if (test > 0) {
        partyTwo = (int) (Math.random() * test + 1);
        }
        else {
            partyTwo = 0;
        }
        partyThree = 100 - (partyOne + partyTwo);
        System.out.println("Party One's votes are " + partyOne);
        System.out.println("Party Two's votes are "+ partyTwo);
        partyThree = 100 - (partyOne + partyTwo);
        System.out.println("Party Three's votes are " + partyThree);
    }
}
