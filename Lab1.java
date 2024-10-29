package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab1 {
    // Part One
    public static void main(String[] args) {
        int[] X= {1, 3, 5 ,7 ,11};
        int[] Y= {3, 2, 12 ,4 , 66};

        int[] Z = new int[5];

        for (int i = 0; i < Z.length; i++) {
           Z[i] = Math.max(X[i] , Y[i]);
        }   
        System.out.println("array X = " + Arrays.toString(X));
        System.out.println("array Y = " + Arrays.toString(Y));
        System.out.println("array Z = X + Y = " + Arrays.toString(Z));

        // Part Two
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Basith", "Abdul", "Mohammad", "Mohd", "Amer"));

        // the below array list named NamesSwitched is to store the switched first and last letter names
        ArrayList<String> NamesSwitched = new ArrayList<>();

        
        for (String name : names) {
            if (name.length() > 1) {
                String switchedName = name.substring(name.length() - 1).toUpperCase() +
                                      name.substring(1, name.length() - 1).toLowerCase() +
                                      name.substring(0, 1).toLowerCase();
                NamesSwitched.add(switchedName);
            } else {
                
                NamesSwitched.add(name);
            }
        }

     
        System.out.println("Names in the array = " + (names));
        System.out.println("Switched Names in the array = " + (NamesSwitched));
    }

    

}

// array X = [1, 3, 5, 7, 11]
// array Y = [3, 2, 12, 4, 66]
// array Z = X + Y = [3, 3, 12, 7, 66]
// Names in the array = [Basith, Abdul, Mohammad, Mohd, Amer]
// Switched Names in the array = [Hasitb, Lbdua, Dohammam, Dohm, Rmea]