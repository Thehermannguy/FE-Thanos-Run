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



        if (game <= 0 || game > 16){Exception();} //Exception for invalid numbers => To do: Loop the user to write in the right number until you get the right one
        if (game == 1){FireEmbull(names);}  //FE1
        if (game == 2){FireEmbull2(names);} //Gaiden
        if (game == 3){FireEmbull3(names);} //Mystery of the Emblem
        if (game == 4){FireEmbull4(names);} //Genealogy of the Holy War
        if (game == 5){FireEmbull5(names);}//Thracia
        if (game == 6){FireEmbull6(names);} //Binding Blade
        if (game == 7) {FireEmbull7(names);} //Randomizer for FE7
        if (game == 8){FireEmbull8(names);} //Sacred Stones
        if (game == 9){FireEmbull9(names);} //PoR
        if (game == 10){FireEmbull10(names);} //Radiant Dawn
        if (game == 11){FireEmbull11(names);}//Shadow Dragon
        if (game == 12){FireEmbull12(names);}//New Mystery of the Emblem
        if (game == 13){FireEmbull13(names);}//Awakening
        if (game == 14){FireEmbull14(names);}//Fates
        if (game == 15){FireEmbull15(names);}//Echoes: Shadows of Valentia
        if (game == 16){FireEmbull16(names);}//Three Houses
    }



public static void Exception(){  //Exception for numbers except from 1 to 16 because FE doesn't have other titles
    System.out.println("Please enter a valid number");
        }



    public static void FireEmbull (ArrayList names){
        String [] units = {"Abel", "Cain","Jagen","Gordin","Draug","Caeda","Wrys","Ogma","Barst","Bord","Cord","Castor","Darros","Julian","Lena","Navarre","Merric","Matthis","Hardin","Wolf","Sedgar","Roshea","Vyland","Wendell","Bantu","Rickard","Caesar","Radd","Roger","Jeorge","Maria","Minerva","Linde","Jake","Midia","Dolph","Macellan","Tomas","Boah","Beck","Astram","Palla","Catria","Arran","Samson","Xane","Est","Tiki","Lorenz","Elice","Gotoh"};

        int length = units.length;
        ForLoop(units, length, names);
        Snapped();
        TheSnap(names, length);
    }

    public static void FireEmbull2(ArrayList names) {
        int j;
        EchoesOptions();
        Scanner input = new Scanner(System.in);
        j= input.nextInt();
        if (j < 0 || j > 1) {
            do {
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            } while (j < 0 || j > 1);
        }
        switch (j){
            case 0:
                String[] units = {"Lukas","Gray","Tobin","Kliff","Silque","Clair","Clive","Forsyth","Python","Luthier","Mathilda","Delthea","Tatiana","Zeke","Mycen"};
                int length = units.length;
                ForLoop(units, length, names);
                SnappedAlm();
                TheSnap(names, length);

                ArrayList celica = new ArrayList();
                String[] units1 = {"Mae","Boey","Genny","Saber","Valbar","Kamui","Leon","Palla","Catria","Atlas","Jesse","Sonya","Deen","Est","Nomah"};
                int length1 = units1.length;
                ForLoop(units1, length1, celica);
                SnappedCelica();
                TheSnap(celica,length1);
                break;
            case 1:

                String[] units2 = {"Lukas","Gray","Tobin","Kliff","Silque","Clair","Clive","Forsyth","Python","Luthier","Mathilda","Delthea","Tatiana","Zeke","Mycen","Mae","Boey","Genny","Saber","Valbar","Kamui","Leon","Palla","Catria","Atlas","Jesse","Sonya","Deen","Est","Nomah"};
                int length2 = units2.length;
                ForLoop(units2, length2, names);
                Snapped();
                TheSnap(names, length2);
                break;
        }

    }

    public static void FireEmbull3(ArrayList names){
        int j;
        MysteryOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 1 || j > 2){
            do{
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            }while(j < 1 || j > 2);

        }
        switch (j){
            case 1:
                String[] book1 = {"Cain","Abel","Jagen","Caeda","Gordin","Draug","Ogma","Barst","Bord","Cord","Castor","Julian","Lena","Navarre","Hardin","Wolf","Sedgar","Roshea","Vyland","Merric","Matthis","wendell","Rickard","Bantu","Caesar","Radd","Maria","Minerva","Jeorge","Linde","Midia","Dolph","Macellan","Tomas","Boah","Astram","Palla","Catria","Arran","Samson","Xane","Tiki","Est","Lorenz","Elice"};
                int length = book1.length;
                ForLoop(book1, length,names);
                Snapped();
                TheSnap(names, length);
                break;
            case 2:
                String[] book2 = {"Luke","Arran","Cecil","Roderick","Gordin","Ryan","Draug","Mallesia","Catria","Warren","Linde","Palla","Julian","Matthis","Ogma","Yumina","Yubello","Sirius","Caeda","Castor","Rickard","Samto","Wendell","Navarre","Phina","Cain","Bantu","Jeorge","Minerva","Merric","Ellerean","Xane","Tiki","Est","Abel","Astram","Sheena","Samson","Roshea","Midia","Lena","Nyna","Maria","Elice"};
                int length2 = book2.length;
                ForLoop(book2,length2,names);
                Snapped();
                TheSnap(names,length2);
                break;
        }
}

    public static void FireEmbull4(ArrayList names){
        int j;
        GenealogyOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 0 || j > 1){
            do{
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            }while(j < 0 || j > 1);

        }
        switch(j){
            case 0: //Only Gen 1 gets snapped
                String[] units = {"Naoise","Alec","Arden","Azel","Lex","Quan","Finn","Ethlyn","Midir","Dew","Aideen","Ayra","Jamke","Holyn","Lachesis","Beowulf","Lewyn","Sylvia","Erin","Briggid","Tailtiu","Claude"};
                int length = units.length;
                ForLoop(units, length, names);
                Snapped();
                TheSnap(names, length);
                break;

            case 1: //Both gens get snapped
                String[] units1 = {"Naoise","Alec","Arden","Azel","Lex","Quan","Finn","Ethlyn","Midir","Dew","Aideen","Ayra","Jamke","Holyn","Lachesis","Beowulf","Lewyn","Sylvia","Erin","Briggid","Tailtiu","Claude","Ulster/Roddlevan","Larcei/Radney","Lana/Mana","Delmud/Tristan","Lester/Dimna","Oifey","Fee/Femina","Arthur/Amid","Johalva","Johan","Leif","Nanna/Jeanne","Shanan","Patty/Daisy","Ares","Lene/Laylea","Tine/Linda","Faval/Asaello","Ced/Hawk","Hannibal","Corple/Sharlow","Altenna"};
                int length1 = units1.length;
                ForLoop(units1, length1, names);
                Snapped();
                TheSnap(names,length1);

                break;
        }
    }

    public static void FireEmbull5(ArrayList names){
        String[] units = {"Finn","Orsin","Halvan","Eyvel","Dagdar","Tanya","Marty","Ronan","Safy","Lifis","Machyua","Brighton","Lara","Felgus","Karin","Dalsin","Asvel","Nanna","Hicks","Shiva","Carrion","Selfina","Kain","Alva","Robert","Fred","Olwen","Mareeta","Salem","Pirn","Trewd","Tina","Glade","Dean","Eda","Homer","Linoan","Ralf","Eyrios","Sleuf","Misha","Sara","Shanam","Miranda","Xavier","Amalda","Conomool","Delmud","Saias","Ced","Galzus"};
        int length = units.length;
        ForLoop(units, length, names);
        Snapped();
        TheSnap(names, length);
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

    public static void FireEmbull10 (ArrayList names) {
        int j;
        RadiantDawnOptions();
        Scanner input = new Scanner (System.in);
        j = input.nextInt();

        if (j < 0 || j > 1){
            do{
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            }while(j < 0 || j > 1);

        }
        switch(j){
            case 0: //split into each parts
                String[] unitsPartI = {"Edward","Leonardo","Nolan","Laura","Sothe","Ilyana","Aran","Meg","Volug","Tauroneo","Jill","Zihark","Fiona","Tormod","Muarim","Vika","Rafiel","Nailah"};
                int length = unitsPartI.length;
                ForLoop(unitsPartI, length, names);
                System.out.println("Snapped units from Part I");
                TheSnap(names, length);

                ArrayList PartII = new ArrayList();
                String[] unitsPartII = {"Marcia","Nealuchi","Leanne","Haar","Brom","Nephenee","Heather","Lucia","Lethe","Mordecai","Geoffrey","Kieran","Astrid","Makalov","Danved","Calill"};
                int length2 = unitsPartII.length;
                ForLoop(unitsPartII, length2, PartII);
                System.out.println("Snapped units from Part II");
                TheSnap(PartII,length2);

                ArrayList PartIII = new ArrayList();
                String[] unitsPartIII = {"Titania","Soren","Mist","Rolf","Boyd","Oscar","Shinon","Gatrie","Rhys","Mia","Ranulf","Kyza","Lyre","Reyson","Janaff","Ulki","Sigrun","Tanith"};
                int length3 = unitsPartIII.length;
                ForLoop(unitsPartIII,length3,PartIII);
                System.out.println("Snapped units from Part III");
                TheSnap(PartIII,length3);

                ArrayList PartIV = new ArrayList();
                String[] unitsPartIV = {"Skrimir","Sanaki","Naesala","Tibarn","Pelleas","Stefan","Oliver","Bastian","Volke","Caineghis","Giffca","Kurthnaga","Ena","Renning","Gareth","Nasir","Sephiran"};
                int length4 = unitsPartIV.length;
                ForLoop(unitsPartIV,length4,PartIV);
                System.out.println("Snapped units from Part IV");
                TheSnap(PartIV, length4);
                break;

            case 1: // all characters into one randomizer
                String[] units = {"Edward","Leonardo","Nolan","Laura","Sothe","Ilyana","Aran","Meg","Volug","Tauroneo","Jill","Zihark","Fiona","Tormod","Muarim","Vika","Rafiel","Nailah","Marcia","Nealuchi","Leanne","Haar","Brom","Nephenee","Heather","Lucia","Lethe","Mordecai","Geoffrey","Kieran","Astrid","Makalov","Danved","Calill","Titania","Soren","Mist","Rolf","Boyd","Oscar","Shinon","Gatrie","Rhys","Mia","Ranulf","Kyza","Lyre","Reyson","Janaff","Ulki","Sigrun","Tanith","Skrimir","Sanaki","Naesala","Tibarn","Pelleas","Stefan","Oliver","Bastian","Volke","Caineghis","Giffca","Kurthnaga","Ena","Renning","Gareth","Nasir","Sephiran"};
                int length5 = units.length;
                ForLoop(units,length5,names);
                Snapped();
                TheSnap(names, length5);
        }
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

    public static void FireEmbull16(ArrayList names){
        int j;
        ThreeHousesOptions();
        Scanner input = new Scanner(System.in);
        j = input.nextInt();
        if (j < 0 || j > 3) {
            do {
                System.out.println("Please enter a valid number!");
                j = input.nextInt();
            } while (j < 0 || j > 3);
        }
        switch(j){
            case 0: //Crimson Flower
                String[] Crimson = {"Hubert","Ferdinand von Aegir","Linhardt","Caspar","Bernadetta","Dorothea","Petra","Felix","Ashe","Sylvain","Mercedes","Annette","Ingrid","Lorenz","Raphael","Ignatz","Lysithea","Marianne","Leonie","Hanneman","Manuela","Alois","Shamir","Jeritza"};
                int length = Crimson.length;
                ForLoop(Crimson,length,names);
                Snapped();
                TheSnap(names, length);
                break;

            case 1: //Azure Moon
                String[] Azure = {"Ferdinand von Aegir","Linhardt","Caspar","Bernadetta","Dorothea","Petra","Felix","Ashe","Sylvain","Mercedes","Annette","Ingrid","Lorenz","Raphael","Ignatz","Lysithea","Marianne","Leonie","Hanneman","Manuela","Alois","Shamir","Dedue","Hilda","Seteth","Flayn","Gilbert","Catherine","Cyril"};
                int length1 = Azure.length;
                ForLoop(Azure, length1,names);
                Snapped();
                TheSnap(names, length1);
                break;

            case 2: //Verdant Wind
                String[] Verdant = {"Ferdinand von Aegir","Linhardt","Caspar","Bernadetta","Dorothea","Petra","Felix","Ashe","Sylvain","Mercedes","Annette","Ingrid","Lorenz","Raphael","Ignatz","Lysithea","Marianne","Leonie","Hanneman","Manuela","Alois","Shamir","Hilda","Seteth","Flayn","Catherine","Cyril"};
                int length2 = Verdant.length;
                ForLoop(Verdant, length2, names);
                Snapped();
                TheSnap(names, length2);
                break;

            case 3: //Silver Snow
                String[] Silver = {"Ferdinand von Aegir","Linhardt","Caspar","Bernadetta","Dorothea","Petra","Felix","Ashe","Sylvain","Mercedes","Annette","Ingrid","Lorenz","Raphael","Ignatz","Lysithea","Marianne","Leonie","Hanneman","Manuela","Alois","Shamir","Hilda","Seteth","Flayn","Catherine","Cyril"};
                int length3 = Silver.length;
                ForLoop(Silver, length3, names);
                Snapped();
                TheSnap(names, length3);
                break;
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

    private static void MysteryOptions(){
        System.out.println("Enter a number to select a book!");
        System.out.println("1: Book 1");
        System.out.println("2: Book 2");
    }

    private static void GenealogyOptions(){ //to do: Add Gen 1 and both Gen options
        System.out.println("Choose a number depending on what kind of run you want to play ");
        System.out.println("0: Only the first Generation gets snapped, this will result in some characters being substitutes but you still have a full army in Gen 2");
        System.out.println("1: Both Generations get snapped.");
    }

    private static void RadiantDawnOptions(){
        System.out.println("Enter a number :");
        System.out.println("0: Units get randomized, depending on the Part they join. Balanced");
        System.out.println("1: All unit get randomized in one randomizer. Unbalanced");
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

    private static void ThreeHousesOptions(){
        System.out.println("Enter a number to choose a run ");
        System.out.println("0: Crimson Flower");
        System.out.println("1: Azure Moon");
        System.out.println("2: Verdant Wind");
        System.out.println("3: Silver Snow");
    }
    private static void SnappedAlm(){
        System.out.println("Units that got snapped: Alm Route");
    }

    private static void SnappedCelica(){
        System.out.println("Units that got snapped: Celica Route");
    }
}



