package sk.kosickaakademia.nebus.prevody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int volba, cislo;
            String retazec;

    do{
                System.out.println("-----PREVOD SUSTAV-----");
                System.out.println("Zadaj co chces urobit (stlac 1, 2 alebo 3)");
                System.out.println("1: Prevod do dvojkovej");
                System.out.println("2: Prevod do osmickovej");
                System.out.println("3: Prevod do sesnastkovej");
                System.out.println("4: Prevod z dvojkovej do desiatkovej");
                System.out.println("5: Prevod z osmickovej do desiatkovej");
                System.out.println("6: Prevod zo sesnastkovej do desiatkovej");
                System.out.println(("7: Nekonecny cyklus na vypocet suctu"));
                volba = sc.nextInt();
            }while(volba<1 || volba>7);

    switch (volba){
        case (1):
            System.out.println("Zadaj cislo ktore chces previest: ");
            cislo = sc.nextInt();
            convertToBinary(cislo);
            break;
        case (2):
            System.out.println("Zadaj cislo ktore chces previest: ");
            cislo = sc.nextInt();
            convertToOcta(cislo);
            break;
        case (3):
            System.out.println("Zadaj cislo ktore chces previest: ");
            cislo = sc.nextInt();
            convertToHexa(cislo);
            break;
        case (4):
            System.out.println("Zadaj cislo ktore chces previest: ");
            cislo = sc.nextInt();
            convertFromBinToDec(cislo);
            break;
        case (5):
            System.out.println("Zadaj cislo ktore chces previest: ");
            cislo = sc.nextInt();
            convertFromOctToDec(cislo);
            break;
        case (6):
            System.out.println("Zadaj cislo ktore chces previest: ");
            Scanner in = new Scanner(System.in);
            retazec = in.nextLine();
            convertFromHexToDec(retazec);
            break;
        case (7):
            countInfinity();
            break;
    }
        }

    private static void convertToBinary(int cislo){
        //inicializacia premennych
        int velkostPola = 0;
        int pomocneCislo = cislo;
        //zisti velkost pola
        while(pomocneCislo != 0){
            pomocneCislo = pomocneCislo/2;
            velkostPola++;
        }
        int[] pole = new int[velkostPola];
        //ulozenie do pola
        for(int i = 0; i < velkostPola; i++){
            pole[i] = cislo%2;
            cislo = cislo/2;
        }
        //vypis pola od zadu
        for(int j = velkostPola-1; j >= 0; j--){
            System.out.print(pole[j]);
        }
    }

    private static void convertToOcta(int cislo){
        //inicializacia premennych
        int velkostPola = 0;
        int pomocneCislo = cislo;
        //zisti velkost pola
        while(pomocneCislo != 0){
            pomocneCislo = pomocneCislo/8;
            velkostPola++;
        }
        int[] pole = new int[velkostPola];
        //ulozenie do pola
        for(int i = 0; i < velkostPola; i++){
            pole[i] = cislo%8;
            cislo = cislo/8;
        }
        //vypis pola od zadu
        for(int j = velkostPola-1; j >= 0; j--){
            System.out.print(pole[j]);
        }
    }

    private static void convertToHexa(int cislo){
        //inicializacia premennych
        int velkostPola = 0;
        int pomocneCislo = cislo;
        //zisti velkost pola
        while(pomocneCislo != 0){
            pomocneCislo = pomocneCislo/16;
            velkostPola++;
        }
        int[] pole = new int[velkostPola];
        //ulozenie do pola
        for(int i = 0; i < velkostPola; i++){
            pole[i] = cislo%16;
            cislo = cislo/16;
        }
        //vypis pola od zadu
        for(int j = velkostPola-1; j >= 0; j--){
            //System.out.print(pole[j]);
            /*
            if(pole[j] == 10){
                System.out.print("A");
            }else if(pole[j] == 11){
                System.out.print("B");
            }else if(pole[j] == 12){
                System.out.print("C");
            }else if(pole[j] == 13){
                System.out.print("D");
            }else if(pole[j] == 14){
                System.out.print("E");
            }else if(pole[j] == 15){
                System.out.print("F");
            }else{
                System.out.print(pole[j]);
            }
             */
            //vypis cez switch
            switch(pole[j]){
                case (10):
                    System.out.print("A");
                    break;
                case (11):
                    System.out.print("B");
                    break;
                case (12):
                    System.out.print("C");
                    break;
                case (13):
                    System.out.print("D");
                    break;
                case (14):
                    System.out.print("E");
                    break;
                case (15):
                    System.out.print("F");
                    break;
                default:
                    System.out.print(pole[j]);
            }
        }
    }

    private static void convertFromBinToDec(int cislo){
        int dlzka = 0;
        int pomocneCislo = cislo;
        int vysledok = 0;
        //zisti velkost pola
        while(pomocneCislo != 0){
            pomocneCislo = pomocneCislo/10;
            dlzka++;
        }
        int[] pole = new int[dlzka];
        //ulozi do pola cisla na kazdy index jedno cislo
        for(int i = 0; i < dlzka; i++){
            pole[i] = cislo%10;
            cislo = cislo/10;
        }
        //od zadu pola robim mocniny
        for(int i = dlzka-1; i >= 0; i--){
            vysledok = vysledok + pole[i]*(int)Math.pow(2,i);
        }
        System.out.println("Hodnota je: " + vysledok);
    }

    private static void convertFromOctToDec(int cislo){
        int dlzka = 0;
        int pomocneCislo = cislo;
        int vysledok = 0;
        //zisti velkost pola
        while(pomocneCislo != 0){
            pomocneCislo = pomocneCislo/10;
            dlzka++;
        }
        int[] pole = new int[dlzka];
        //ulozi do pola cisla na kazdy index jedno cislo
        for(int i = 0; i < dlzka; i++){
            pole[i] = cislo%10;
            cislo = cislo/10;
        }
        //od zadu pola robim mocniny
        for(int i = dlzka-1; i >= 0; i--){
            vysledok = vysledok + pole[i]*(int)Math.pow(8,i);
        }
        System.out.println("Hodnota je: " + vysledok);
    }

    private static void convertFromHexToDec(String retazec){
    //System.out.println("Testovanie " + retazec);
    int dlzka = retazec.length();
    int vysledok = 0;
    int j = 0;

        for(int i = dlzka-1; i >=0; i--){
            if(retazec.charAt(i) == '0'){
                vysledok = vysledok + 0*(int)Math.pow(16,j);
            }
            else if(retazec.charAt(i) == '1'){
                vysledok = vysledok + 1*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '2'){
                vysledok = vysledok + 2*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '3'){
                vysledok = vysledok + 3*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '4'){
                vysledok = vysledok + 4*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '5'){
                vysledok = vysledok + 5*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '6'){
                vysledok = vysledok + 6*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '7'){
                vysledok = vysledok + 7*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '8'){
                vysledok = vysledok + 8*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == '9'){
                vysledok = vysledok + 9*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'A'){
                vysledok = vysledok + 10*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'B'){
                vysledok = vysledok + 11*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'C'){
                vysledok = vysledok + 12*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'D'){
                vysledok = vysledok + 13*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'E'){
                vysledok = vysledok + 14*(int)Math.pow(16,j);
            }else if(retazec.charAt(i) == 'F'){
                vysledok = vysledok + 15*(int)Math.pow(16,j);
            }
            j++;
        }
        System.out.println("Hodnota je: " + vysledok);
    }

    private static void countInfinity(){
        Scanner sc = new Scanner(System.in);
        int cislo;
        int sucet = 0;
        int pamataPredchadzajuce = 0;
        while (true){
            System.out.println("Zadaj cislo: ");
            cislo = sc.nextInt();
            if(cislo != 0 && cislo != pamataPredchadzajuce){
                sucet = sucet + cislo;
            }else{
                break;
            }
            pamataPredchadzajuce = cislo;
            System.out.println("Zadaj cislo: ");
            cislo = sc.nextInt();
            if(cislo != pamataPredchadzajuce && cislo != 0){
                sucet = sucet + cislo;
            }else{
                break;
            }
            pamataPredchadzajuce = cislo;
        }
        System.out.println("Zadal si 0 alebo dve hodnoty rovnake po sebe");
        System.out.println("Sucet cisel je: " + sucet);
    }

    }

