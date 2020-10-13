package sk.kosickaakademia.nebus.prevody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int volba, cislo;

    do{
                System.out.println("-----PREVOD SUSTAV-----");
                System.out.println("Zadaj co chces urobit (stlac 1, 2 alebo 3)");
                System.out.println("1: Prevod do dvojkovej");
                System.out.println("2: Prevod do osmickovej");
                System.out.println("3: Prevod do sesnastkovej");
                volba = sc.nextInt();
            }while(volba<1 || volba>3);

    System.out.println("Zadaj cislo ktore chces previst: ");
    cislo = sc.nextInt();

    switch (volba){
        case (1):
            convertToBinary(cislo);
            break;
        case (2):
            convertToOcta(cislo);
            break;
        case (3):
            convertToHexa(cislo);
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

    }

