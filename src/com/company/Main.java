package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int game;           //int for the number of the game. Example FE 1 is "1", Awakening is "12"
        Scanner input = new Scanner(System.in);

        System.out.println("Type in the number of the game you want to play. Example '7' for Fire Emblem 7 ");
        game = input.nextInt();

        Exception(game); //Exception for invalid numbers => To do: Loop the user to write in the right number until you get the right one

    }



public static void Exception(int game){  //Exception for numbers except from 1 to 16 because FE doesn't have other titles
   if (game <= 0 || game > 16){
       System.out.println("Not a valid statement");
   }
}
    public static void FireEmbull7(int game){
        if (game == 7){


        }
    }

    public static String[] FE7(){ //insert different cases. Eliwood has 42 playable units, Hector 44 units. in this case we use Hectors units for now
        int i;
        String [] units = {"Marcus", "Lowen", "Rebecca", "Dorcas", "Bartre", "Owsin", "Serra", "Matthew","Guy", "Erk", "Priscilla", "Sain", "Kent", "Wil", "Florina","Raven", "Lucius", "Canas", "Dart", "Fiora", "Legault", "Ninian/Nils", "Isadora", "Heath", "Rath", "Hawkeye", "Geitz", "Wallace", "Pent", "Louise", "Karel", "Harken", "Nino", "Jaffar", "Vaida", "Karla", "Farina", "Renault", "Athos"  };

        return units;
    }

}


/*
package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int length;
        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you wanna test?");
        length = input.nextInt();

        ArrayList names = new ArrayList();
        int nameCount = length/2;                                   //half of input
        int tracker = 0;

        for(int counter = 0; counter < length; counter++){
            System.out.println("Contestant: " +(counter+1));
            names.add(input.next());
        }
        input.close();

        System.out.println("These are the contestants: ");          //prints out all contestants
        for(int counter = 0; counter < length; counter++){
            System.out.println(names.get(counter));
        }

        Random r = new Random();
        System.out.println("These people don't feel so good:");
        while (tracker < nameCount){
            int randomNumber=r.nextInt(names.size());
            System.out.println(names.get(randomNumber));
            names.remove(randomNumber);
            tracker++;
        }

    }


}



 */