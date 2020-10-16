package sk.kosickaakademia.nebus.prevody;

public class MyHomework {

    public int pocetOdrazov(double vyskaCm, double koeficientOdrazu){
        double aktualnaVyska = vyskaCm;
        int pocitadlo = 0;

        while(aktualnaVyska>100){
            aktualnaVyska = aktualnaVyska*koeficientOdrazu;
            pocitadlo++;
        }
        return pocitadlo;
    }

    public void zakladnyTvar(int citatel, int menovatel){
        if(citatel == menovatel){
            System.out.println("Zakladny tvar je: 1/1");
        }else if(citatel<menovatel){
            for(int i = citatel; i > 0; i--){
                if(menovatel%i==0 && citatel%i==0){
                    citatel = citatel/i;
                    menovatel = menovatel/i;
                }
            }
            System.out.println("Zakladny tvar je: " + citatel + "/" + menovatel);
        }
        else if(menovatel<citatel){
            for(int i = menovatel; i > 0; i--){
                if(citatel%i==0 && menovatel%i==0){
                    citatel = citatel/i;
                    menovatel = menovatel/i;
                }
            }
            System.out.println("Zakladny tvar je: " + citatel + "/" + menovatel);
        }


        }

    ////1uloha
    public void skracujRetazecOdPredu(String retazec){
        int dlzka = retazec.length();
        for(int i = 0; i < dlzka; i++){
            for(int j = i; j < dlzka; j++){
                System.out.print(retazec.charAt(j));
            }
            System.out.println();
        }
        }


    ////2uloha
    //2. Vypiste vsetky cisla 8X75Y2, kde X a Y nahradite cislicami tak,
    //aby zadane cislo bolo delitelne cislom 91.
    public void vypisCislaDelitelne(){
    String retazec1 = "8X75Y2";
    //int cislo = 1;
    char[] pole = new char[retazec1.length()];
    String cisloRetazcove = "";
    int cisloMatematicke;
    int pocitadlo = 0;

    for(int i = 0; i < retazec1.length(); i++){
        pole[i] = retazec1.charAt(i);
    }

    for(int i = 0; i < 10; i++){
        pole[1] = (char)(i+48); //cislo 48dekadicke je char NULA a k nej sa pripocitava postupne 1
        for(int j = 0; j < 10; j++){
            pole[4] = (char)(j+48);
            for(int k = 0; k < retazec1.length(); k++){
                ///System.out.print(pole[k]);
                cisloRetazcove = cisloRetazcove + pole[k];
            }
            ///System.out.println();
            cisloMatematicke = Integer.valueOf(cisloRetazcove);
            //System.out.println(cisloMatematicke);
            if(cisloMatematicke%91 == 0){
                System.out.println(cisloMatematicke);
                pocitadlo++;
            }
            cisloRetazcove = "";
        }
    }
        if(pocitadlo == 0){
            System.out.println("Take cislo neexistuje");
        }
    }


    ////3uloha
    public void urobSucet(){
        double sucet = 0;
        for(int i = 1; i <= 100; i++){
            sucet = sucet + 1.0/i;
        }
        System.out.println("Sucet je: " + sucet);
    }


    ////4uloha KENO
    public void keno(){
        int[] keno = new int[20];
        int nahCislo;
        int pocet = 0;

            for(int i = 0; i < keno.length; i++){
                while(true){
                    nahCislo = (int)(Math.random()*80+1);
                    for(int j = 0; j < keno.length; j++){
                        if(keno[j] == nahCislo){
                            pocet++;
                        }
                    }
                    if(pocet == 0){
                        keno[i] = nahCislo;
                        break;
                    }
                    pocet = 0;
                }
            }
            System.out.println("Keno cislo je: ");
            for(int i = 0; i < keno.length; i++){
                System.out.print(keno[i] + " ");
            }
    }

    }


