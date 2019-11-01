package com.company;


import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        ArrayList names = new ArrayList<>();
        int game;           //int for the number of the game. Example FE 1 is "1", Awakening is "12"
        Scanner input = new Scanner(System.in);

        System.out.println("Type in the number of the game you want to play. Example '7' for Fire Emblem 7 ");
        game = input.nextInt();



        Exception(game); //Exception for invalid numbers => To do: Loop the user to write in the right number until you get the right one
        if (game == 6){FireEmbull6(names);} //FE6
        if (game == 7) {FireEmbull7(names);} //Randomizer for FE7
        if (game == 8){FireEmbull8(names);} //Sacred Stones
        if (game == 9){FireEmbull9(names);} //PoR
        if (game == 11){FireEmbull11(names);}//Shadow Dragon
        if (game == 12){FireEmbull12(names);}//New Mystery of the Emblem
        if (game == 13){FireEmbull13(names);}//Awakening
        if (game == 14){FireEmbull14(names);}//Fates
        if (game == 15){FireEmbull15(names);}//Echoes: Shadows of Valentia
    }



public static void Exception(int game){  //Exception for numbers except from 1 to 16 because FE doesn't have other titles
   if (game <= 0 || game > 16){
       System.out.println("Not a valid statement");
                }
    }

    public static void FireEmbull6(ArrayList names){
        String[] units = {"Marcus","Alen","Lance","Wolt","Bors","Elen","Dieck","Wade","Lot","Shanna","Chad","Lugh","Clarine","Rutger","Saul","Dorothy","Sue","Zelots","Trec","Noah","Astore","Lilina","Bath","Ogier","Gwendolyn","Fir","Shin","Geese","Gonzales","Klein","Thea","Lalum","Elffin","Ekhidna","Bartre","Raigh","Cath","Milady","Perceval","Cecilia","Sophia","Igrene","Garret","Fae","Hugh","Zeiss","Douglas","Niime","Juno","Dayan","Jodel","Karel"};
        int length = units.length;
        ForLoop(units,length,names);
        Snapped();
        TheSnap(names, length);
    }

    public static void FireEmbull7(ArrayList names){ //Snap method for Fire Emblem 8



            String [] units = {"Marcus", "Lowen", "Rebecca", "Dorcas", "Bartre", "Owsin", "Serra", "Matthew", "Guy", "Erk", "Priscilla", "Sain", "Kent", "Wil", "Florina", "Raven", "Lucius", "Canas", "Dart", "Fiora", "Legault", "Ninian/Nils", "Isadora", "Heath", "Rath", "Hawkeye", "Geitz", "Wallace", "Pent", "Louise", "Karel", "Harken", "Nino", "Jaffar", "Vaida", "Karla", "Farina", "Renault", "Athos"};
            int length = units.length;
            ForLoop(units, length, names);
            /*System.out.println(names.toString());
                   Zum testen
             */
            Snapped();
            TheSnap(names, length);

    }

    public static void FireEmbull8 (ArrayList names){



            String [] units = {"Seth","Franz","Gilliam", "Vanessa","Moulder","Ross","Garcia","Neimi","Colm","Artur","Lute","Natasha","Joshua","Forde","Kyle","Tana","Amelia","Innes","Gerik","Tethys","Marisa","L'Arachel","Dozla","Saleh","Ewan","Cormag","Rennac","Duessel","Knoll","Myrrh","Syrene"};
            int length = units.length;
            ForLoop(units, length,names);
            Snapped();
            TheSnap(names, length);


    }

    public static void FireEmbull9 (ArrayList names){


            String [] units = {"Boyd","Titania","Oscar","Rhys","Shinon","Gatrie","Soren","Mia","Ilyana","Mist","Rolf","Marcia","Lethe","Mordecai","Volke","Kieran","Nephenee","Brom","Zihark","Sothe","Jill","Astrid","Makalow","Tormod","Muarim","Stefan","Devdan","Tanith","Reyson","Janaff","Ulki","Calill","Tauroneo","Ranulf","Haar","Bastian","Lucia","Geoffrey","Largo","Elincia","Nasir","Ena","Tibarn","Naesala","Giffca"};
            int length = units.length;
            ForLoop(units, length, names);
            Snapped();
            TheSnap(names, length);

    }

    public static void FireEmbull11 (ArrayList names){


            int j; //Variable for

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
                    ForLoop(units, length, names);
                    Snapped();
                    TheSnap(names, length);
                    break;
                case 1:
                    String [] units1 = {"Frey","Norne","Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh"};

                    int length1 = units1.length;
                    ForLoop(units1,length1,names);
                    Snapped();
                    TheSnap(names, length1);
                    break;
                case 2:
                    String [] units2 = {"Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh","Athena","Horace","Etzel","Ymir","Nagi"};
                    int length2 = units2.length;
                    ForLoop(units2, length2,names);
                    Snapped();
                    TheSnap(names, length2);
                    break;
                case 3:
                    String [] units3 = {"Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh"};
                    int length3 = units3.length;
                    ForLoop(units3, length3, names);
                    Snapped();
                    TheSnap(names, length3);
                    break;
            }

    }

    public static void FireEmbull12 (ArrayList names){

        String [] units = {"Luke","Roderick","Cecil","Ryan","Mallesia","Warren","Yumina","Yubello","Sirius","Samto","Phina","Ellerean","Dice","Malice","Roberto","Belf","Leiden","Katarina","Sheena","Michalis","Nyna","Frey","Norne","Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh","Athena","Horace","Etzel","Ymir","Nagi"};

        int length = units.length;
        ForLoop(units, length,names);
        Snapped();
        TheSnap(names, length);

    }

    public static void FireEmbull13(ArrayList names){

        int j;
        AwakeningOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 0 || j > 3){
            do{
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            }while(j < 0 || j > 3);

        }
        switch(j){
            case 0: //case for all units available
                String[] units = {"Gangrel","Walhart","Emmeryn","Yen'fay","Aversa","Priam","Owain","Inigo","Brady","Kjelle","Cynthia","Severa","Gerome","Morgan","Yarne","Laurent","Noire","Nah","Lissa","Frederick","Sully","Virion","Stahl","Vaike","Miriel","Sumia","Kellam","Donnel","Lon'qu","Ricken","Maribelle","Panne","Gaius","Cordelia","Gregor","Nowi","Libra","Tharja","Anna","Olivia","Cherche","Henry","Lucina","Say'ri","Tiki","Basilio","Flavia"};

                int length = units.length;
                ForLoop(units, length, names);
                Snapped();
                TheSnap(names, length);
                break;
            case 1: //case for extra units excluded
                String[] units1 = {"Owain","Inigo","Brady","Kjelle","Cynthia","Severa","Gerome","Morgan","Yarne","Laurent","Noire","Nah","Lissa","Frederick","Sully","Virion","Stahl","Vaike","Miriel","Sumia","Kellam","Donnel","Lon'qu","Ricken","Maribelle","Panne","Gaius","Cordelia","Gregor","Nowi","Libra","Tharja","Anna","Olivia","Cherche","Henry","Lucina","Say'ri","Tiki","Basilio","Flavia"};
                int length1 = units1.length;
                ForLoop(units1, length1, names);
                Snapped();
                TheSnap(names, length1);
                break;
            case 2: //case for kids excluded
                String[] units2 = {"Gangrel","Walhart","Emmeryn","Yen'fay","Aversa","Priam","Lissa","Frederick","Sully","Virion","Stahl","Vaike","Miriel","Sumia","Kellam","Donnel","Lon'qu","Ricken","Maribelle","Panne","Gaius","Cordelia","Gregor","Nowi","Libra","Tharja","Anna","Olivia","Cherche","Henry","Lucina","Say'ri","Tiki","Basilio","Flavia"};
                int length2 = units2.length;
                ForLoop(units2, length2, names);
                Snapped();
                TheSnap(names, length2);
                break;
            case 3: //case for extra units & kids excluded
                String[] units3 = {"Lissa","Frederick","Sully","Virion","Stahl","Vaike","Miriel","Sumia","Kellam","Donnel","Lon'qu","Ricken","Maribelle","Panne","Gaius","Cordelia","Gregor","Nowi","Libra","Tharja","Anna","Olivia","Cherche","Henry","Lucina","Say'ri","Tiki","Basilio","Flavia"};
                int length3 = units3.length;
                ForLoop(units3,length3,names);
                Snapped();
                TheSnap(names, length3);
                break;
        }
    }

    public static void FireEmbull14(ArrayList names){

        int j;

        FatesOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 0 || j > 5){
            do{
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            }while(j < 0 || j > 5);

        }
        switch(j){
            case 0: //case for Birthright with all kids
                String[] units = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu", "Kana", "Shigure", "Dwyer", "Sophie", "Midori","Rinkah","Sakura","Hana","Subaki","Orochi","Saizo","Azama","Hinoka","Setsuna","Hayato","Hinata","Oboro","Kagero","Takumi","Reina","Kaden","Scarlet","Ryoma","Yukimara","Shiro","Kiragi","Asugi","Selkie","Hisame","Mitama","Caeldori","Rhajat","Izana"};
                int length = units.length;
                ForLoop(units, length,names);
                Snapped();
                TheSnap(names, length);
                break;
            case 1: //case for Birthright without kids
                String[] units1 = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu","Rinkah","Sakura","Hana","Subaki","Orochi","Saizo","Azama","Hinoka","Setsuna","Hayato","Hinata","Oboro","Kagero","Takumi","Reina","Kaden","Scarlet","Ryoma","Yukimara","Izana"};
                int length1 = units1.length;
                ForLoop(units1,length1,names);
                Snapped();
                TheSnap(names, length1 );
                break;
            case 2: //case for Conquest with kids
                String[] units2 = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu", "Kana", "Shigure", "Dwyer", "Sophie", "Midori","Elise","Arthur","Effie","Odin","Niles","Nyx","Beruka","Camilla","Selena","Laslow","Peri","Benny","Charlotte","Keaton","Leo","Gunter","Xander","Flora","Siegbert","Forrest","Ignatius","Velouria","Percy","Ophelia","Soleil","Nina","Izana"};
                int length2 = units2.length;
                ForLoop(units2,length2, names);
                Snapped();
                TheSnap(names, length2);
                break;
            case 3: //case for Conquest without kids
                String[] units3 = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu","Elise","Arthur","Effie","Odin","Niles","Nyx","Beruka","Camilla","Selena","Laslow","Peri","Benny","Charlotte","Keaton","Leo","Gunter","Xander","Flora","Izana"};
                int length3 = units3.length;
                ForLoop(units3,length3,names);
                Snapped();
                TheSnap(names, length3);
                break;
            case 4: //all units are available
                String[] units4 = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu", "Kana", "Shigure", "Dwyer", "Sophie", "Midori","Rinkah","Sakura","Hana","Subaki","Orochi","Saizo","Azama","Hinoka","Setsuna","Hayato","Hinata","Oboro","Kagero","Takumi","Reina","Kaden","Ryoma","Shiro","Kiragi","Asugi","Selkie","Hisame","Mitama","Caeldori","Rhajat","Elise","Arthur","Effie","Odin","Niles","Nyx","Beruka","Camilla","Selena","Laslow","Peri","Benny","Charlotte","Keaton","Leo","Gunter","Xander","Flora","Siegbert","Forrest","Ignatius","Velouria","Percy","Ophelia","Soleil","Nina","Fuga"};
                int length4 = units4.length;
                ForLoop(units4,length4,names);
                Snapped();
                TheSnap(names, length4);
                break;
            case 5: //Revelations without kids
                String[] units5 = {"Felicia", "Jakob", "Azura", "Kaze", "Silas", "Shura", "Mozu","Rinkah","Sakura","Hana","Subaki","Orochi","Saizo","Azama","Hinoka","Setsuna","Hayato","Hinata","Oboro","Kagero","Takumi","Reina","Kaden","Ryoma","Elise","Arthur","Effie","Odin","Niles","Nyx","Beruka","Camilla","Selena","Laslow","Peri","Benny","Charlotte","Keaton","Leo","Gunter","Xander","Flora","Fuga"};
                int length5 = units5.length;
                ForLoop(units5,length5,names);
                Snapped();
                TheSnap(names, length5);
                break;
        }
    }

    public static void FireEmbull15(ArrayList names){ //
        int j;
        EchoesOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 0 || j > 1) {
            do {
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            } while (j < 0 || j > 1);
        }
            switch(j){
            case 0: //Both routes use their own randomizer
                String[] units = {"Lukas","Gray","Tobin","Kliff","Faye","Silque","Clair","Clive","Forsyth","Python","Luthier","Mathilda","Delthea","Tatiana","Zeke","Mycen"};
                int length = units.length;
                ForLoop(units, length, names);
                SnappedAlm();
                TheSnap(names, length);

                ArrayList celica = new ArrayList();
                String[] units1 = {"Mae","Boey","Genny","Saber","Valbar","Kamui","Leon","Palla","Catria","Atlas","Jesse","Sonya","Deen","Est","Nomah","Conrad"};
                int length1 = units1.length;
                ForLoop(units1, length1, celica);
                SnappedCelica();
                TheSnap(celica,length1);
                break;

                case 1:
                    String[] units2 = {"Lukas","Gray","Tobin","Kliff","Faye","Silque","Clair","Clive","Forsyth","Python","Luthier","Mathilda","Delthea","Tatiana","Zeke","Mycen","Mae","Boey","Genny","Saber","Valbar","Kamui","Leon","Palla","Catria","Atlas","Jesse","Sonya","Deen","Est","Nomah","Conrad"};
                    int length2 = units2.length;
                    ForLoop(units2, length2, names);
                    Snapped();
                    TheSnap(names, length2);
            }

    }

    public static void Snapped(){ //Method for the text whenever people get snapped
        System.out.println("The following people got snapped and are no longer usable: ");
    }
    public static ArrayList ForLoop(String[] units, int length, ArrayList names){

        int tracker = 0;
        for (tracker = 0; tracker < length; tracker++){
            names.add(units[tracker]);
        }
        return names;
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
    private static void ShadowDragonOptions(){ //prompts the user to enter a number
        System.out.println("Choose what kind of run you want to play, the units will differ in the randomizer.");
        System.out.println("0: Regular, Prologue & Gaiden units are available");
        System.out.println("1: Regular & Prologue units are available. Gaiden units are excluded");
        System.out.println("2: Regular & Gaiden units are available. Prologue units are excluded");
        System.out.println("3: Only units that appear during the regular chapters are available");
    }

    private static void AwakeningOptions(){
        System.out.println("Which units are available? Enter a valid number");
        System.out.println("0: All units are available");
        System.out.println("1: Exclude certain late game units that join after chapter 23 like 'Aversa','Emmeryn', etc. ");
        System.out.println("2: Exclude kids except Lucina");
        System.out.println("3: Exclude late game units that join after chapter 23 & kids except Lucina");
    }

    private static void FatesOptions(){
        System.out.println("Enter a number depending on what kind of run you are doing");
        System.out.println("0: 'Birthright' & all units are available ");
        System.out.println("1: 'Birthright' & no kids are available ");
        System.out.println("2: 'Conquest' & all units are available");
        System.out.println("3: 'Conquest' & no kids are available");
        System.out.println("4: 'Revelations' & all units are available");
        System.out.println("5: 'Revelations' & no kids are available");
    }

    private static void EchoesOptions(){
        System.out.println("Enter the number in which way the Randomizer should randomize");
        System.out.println("0: Both routes get their own randomizer. This means that both routes will lose 50% of their units. Balanced");
        System.out.println("1: Both routes use one randomizer. Can lead to results where one route loses much more units, that the others. Can be unbalanced");
        }
    private static void SnappedAlm(){
        System.out.println("Units that got snapped: Alm Route");
    }

    private static void SnappedCelica(){
        System.out.println("Units that got snapped: Celica Route");
    }
}



