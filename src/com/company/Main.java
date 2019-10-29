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
        if (game == 7) {FireEmbull7(game);} //Randomizer for FE7
        if (game == 8){FireEmbull8(game);}
        if (game == 9){FireEmbull9(game);}
        if (game == 11){FireEmbull11(game);}
        if (game == 12){FireEmbull12(game);}
    }



public static void Exception(int game){  //Exception for numbers except from 1 to 16 because FE doesn't have other titles
   if (game <= 0 || game > 16){
       System.out.println("Not a valid statement");
                }
    }


    public static void FireEmbull7(int game){ //Snap method for Fire Emblem 8

            int tracker = 0;
            ArrayList names = new ArrayList<>();
            String [] units = {"Marcus", "Lowen", "Rebecca", "Dorcas", "Bartre", "Owsin", "Serra", "Matthew", "Guy", "Erk", "Priscilla", "Sain", "Kent", "Wil", "Florina", "Raven", "Lucius", "Canas", "Dart", "Fiora", "Legault", "Ninian/Nils", "Isadora", "Heath", "Rath", "Hawkeye", "Geitz", "Wallace", "Pent", "Louise", "Karel", "Harken", "Nino", "Jaffar", "Vaida", "Karla", "Farina", "Renault", "Athos"};
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

    public static void FireEmbull8 (int game){

            int tracker = 0;
            ArrayList names = new ArrayList<>();
            String [] units = {"Seth","Franz","Gilliam", "Vanessa","Moulder","Ross","Garcia","Neimi","Colm","Artur","Lute","Natasha","Joshua","Forde","Kyle","Tana","Amelia","Innes","Gerik","Tethys","Marisa","L'Arachel","Dozla","Saleh","Ewan","Cormag","Rennac","Duessel","Knoll","Myrrh","Syrene"};
            int length = units.length;
            for (tracker = 0; tracker < length; tracker++) {
                names.add(units[tracker]);
            }
            Snapped();
            TheSnap(names, length);


    }

    public static void FireEmbull9 (int game){

            int tracker = 0;
            ArrayList names = new ArrayList<>();
            String [] units = {"Boyd","Titania","Oscar","Rhys","Shinon","Gatrie","Soren","Mia","Ilyana","Mist","Rolf","Marcia","Lethe","Mordecai","Volke","Kieran","Nephenee","Brom","Zihark","Sothe","Jill","Astrid","Makalow","Tormod","Muarim","Stefan","Devdan","Tanith","Reyson","Janaff","Ulki","Calill","Tauroneo","Ranulf","Haar","Bastian","Lucia","Geoffrey","Largo","Elincia","Nasir","Ena","Tibarn","Naesala","Giffca"};
            int length = units.length;
            for (tracker = 0; tracker < length; tracker++) {
                names.add(units[tracker]);
            }
            Snapped();
            TheSnap(names, length);

    }

    public static void FireEmbull11 (int game){

            int tracker = 0;
            int j = 0; //Variable for
            ArrayList names = new ArrayList<>();
            ShadowDragonOptions(); //Method for different options
            Scanner input = new Scanner(System.in);
            j = input.nextInt();
            if (j < 0 || j > 3){
                do{
                    System.out.println("Please enter a valid number!");
                    j = input.nextInt();
                }while(j < 0 || j > 3);

            }
            switch (j){
                case 0:
                    String [] units = {"Frey","Norne","Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh","Athena","Horace","Etzel","Ymir","Nagi"};

                    int length = units.length;
                    for (tracker = 0; tracker < length; tracker++) {
                        names.add(units[tracker]);
                    }
                    Snapped();
                    TheSnap(names, length);
                    break;
                case 1:
                    String [] units1 = {"Frey","Norne","Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh"};

                    int length1 = units1.length;
                    for (tracker = 0; tracker < length1; tracker++) {
                        names.add(units1[tracker]);
                    }
                    Snapped();
                    TheSnap(names, length1);
                    break;
                case 2:
                    String [] units2 = {"Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh","Athena","Horace","Etzel","Ymir","Nagi"};
                    int length2 = units2.length;
                    for (tracker = 0; tracker < length2; tracker++) {
                        names.add(units2[tracker]);
                    }
                    Snapped();
                    TheSnap(names, length2);
                    break;
                case 3:
                    String [] units3 = {"Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh"};
                    int length3 = units3.length;
                    for (tracker = 0; tracker < length3; tracker++) {
                        names.add(units3[tracker]);
                    }
                    Snapped();
                    TheSnap(names, length3);
                    break;
            }

    }

    public static void FireEmbull12 (int game){
        int tracker = 0;
        ArrayList names = new ArrayList<>();
        String [] units = {"Luke","Roderick","Cecil","Ryan","Mallesia","Warren","Yumina","Yubello","Sirius","Samto","Phina","Ellerean","Dice","Malice","Roberto","Belf","Leiden","Katarina","Sheena","Michalis","Nyna","Frey","Norne","Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh","Athena","Horace","Etzel","Ymir","Nagi"};

        int length = units.length;
        for (tracker = 0; tracker < length; tracker++) {
            names.add(units[tracker]);
        }
        Snapped();
        TheSnap(names, length);

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
    public static void ShadowDragonOptions(){ //prompts the user to enter a number
        System.out.println("Choose what kind of run you want to play, the units will differ in the randomizer.");
        System.out.println("0: Regular, Prologue & Gaiden units are available");
        System.out.println("1: Regular & Prologue units are available. Gaiden units are excluded");
        System.out.println("2: Regular & Gaiden units are available. Prologue units are excluded");
        System.out.println("3: Only units that appear during the regular chapters are available");
    }


}



