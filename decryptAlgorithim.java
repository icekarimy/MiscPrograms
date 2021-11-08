/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec2;

public class DecryptAlgorithim {

    public static void main(String[] args) {
        final String STRING_1 = "FIGSD RSFYHG ESXTSDJJHQT HQ ODUD HZ MNQ DQY TXXY MXS JP TSDYF";
        final String STRING_2 = "GAFSF HZ D CXG XM RXJECFI JDGA KFAHQY GAF FQRSPEGHXQ DQY YFRSPEGHXQ NZFY KP GAF HQGFSQFG";
        final String STRING_3 = "H BHCC QXG BSHGF KDY GAHQTZ DKXNG JHVF ANKKDSY XQ SDGFJPESXMFZZXSZ";
        final String STRING_4 = "BADG H RDQQXG RSFDGF H YX QXG NQYFSZGDQY";
       System.out.println(decryptAlgorithim(STRING_1));
       System.out.println(decryptAlgorithim(STRING_2));
       System.out.println(decryptAlgorithim(STRING_3));
     // System.out.println(encrpytAlgorithim("A STRING LITERAL CAN BE TAKEN LITERALLY"));
      //System.out.println(decryptAlgorithim(STRING_4));        
    }
    public static String decryptAlgorithim(String phrase) { //conversion between ascii and Z-mod 26 going on
        int length = phrase.length();
        String result = "";
        char char2C; // a character
        int temp;
        int temp2;
        int temp3;
        for (int i = 0; i < phrase.length(); i++) {
            char2C = phrase.charAt(i);
            temp = phrase.charAt(i) - 0 - 65;
            if (char2C != ' ') {
                temp2 = ((15 * (temp - 3)));
                if (temp2 >= 0) {   // checking if its positive
                    temp3 = (temp2 % 26) + 65;
                } else { //if negative it is adjusted 
                    while (temp2 < 2) {
                        temp2 = temp2 + 26;
                    }
                    temp3 = (temp2 % 26) + 65;
                }
                result = result + Character.toString((char) temp3);
            } else {
                result = result + " ";
            }
        }

        return result;
    }

    public static String encrpytAlgorithim(String phrase) {
        String result = "";
        char char2C;
        int temp; // a variable used to temporarily hold the results
        int temp2;
        for (int i = 0; i < phrase.length(); i++) {
            char2C = phrase.charAt(i);
            temp = phrase.charAt(i) - 0 - 65;
            if (char2C != ' ') {
                temp2 = (7 * temp + 3) % 26 + 65;
                result = result + Character.toString((char) temp2);
            } else {
                result = result + " ";
            }

        }
        // #1 Algo
        return result;
    }
}

