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

        input.close();

        Exception(game); //Exception for invalid numbers => To do: Loop the user to write in the right number until you get the right one
        FireEmbull7(game); //Randomizer for FE7
    }



public static void Exception(int game){  //Exception for numbers except from 1 to 16 because FE doesn't have other titles
   if (game <= 0 || game > 16){
       System.out.println("Not a valid statement");
                }
    }


    public static void FireEmbull7(int game){ //insert different cases. Eliwood has 42 playable units, Hector 44 units. in this case we use Hectors units
        if (game == 7) {
            int tracker = 0;
            ArrayList names = new ArrayList<>();
            String[] units = {"Marcus", "Lowen", "Rebecca", "Dorcas", "Bartre", "Owsin", "Serra", "Matthew", "Guy", "Erk", "Priscilla", "Sain", "Kent", "Wil", "Florina", "Raven", "Lucius", "Canas", "Dart", "Fiora", "Legault", "Ninian/Nils", "Isadora", "Heath", "Rath", "Hawkeye", "Geitz", "Wallace", "Pent", "Louise", "Karel", "Harken", "Nino", "Jaffar", "Vaida", "Karla", "Farina", "Renault", "Athos"};
            int length = units.length;
            for (tracker = 0; tracker < length; tracker++) {
                names.add(units[tracker]);
            }
            /*System.out.println(names.toString());
                   Zum testen
             */
            Snapped();
            TheSnap(names, length);
        }
    }



    public static void Snapped(){ //Method for the text whenever people get snapped
        System.out.println("The following people got snapped and are no longer usable: ");
    }

    public static ArrayList TheSnap(ArrayList names, int length ){ //Method for snapping away half the units
        Random r = new Random();   //Random number
        int namecount = length /2;  //namecount is half as long as length
        int i = 0;                  //initialzing i for while loop
        while (i < namecount){          //while i is less than namecount
            int randomNumber=r.nextInt(names.size());       //get random String from List "names"
            System.out.println(names.get(randomNumber));
            names.remove(randomNumber);                     //removes unit from List
            i++;
        }   //half the units will be deleted after the loop is complete
        return names;
    }

}



