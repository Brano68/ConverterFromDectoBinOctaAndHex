package sk.kosickaakademia.nebus.prevody;

import java.util.Scanner;
/**
 * Toto je trieda Main a v nej je vytvoreny objekt
 * converter cez ktoreho volam metody z triedy Converter.java
*/


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Converter converter = new Converter();
        int volba, cislo;
        String retazec;

        do {
            System.out.println("-----PREVOD SUSTAV-----");
            System.out.println("Zadaj co chces urobit (stlac 1, 2 - 12)");
            System.out.println("1: Prevod do dvojkovej");
            System.out.println("2: Prevod do osmickovej");
            System.out.println("3: Prevod do sesnastkovej");
            System.out.println("4: Prevod z dvojkovej do desiatkovej");
            System.out.println("5: Prevod z osmickovej do desiatkovej");
            System.out.println("6: Prevod zo sesnastkovej do desiatkovej");
            System.out.println(("7: Nekonecny cyklus na vypocet suctu"));
            System.out.println(("8: Napisem retazec od zadu"));
            System.out.println(("9: Zisti pocet samohlasok"));
            System.out.println(("10: Zisti ci to je hexa cislo"));
            System.out.println(("11: Zisti ci to je binarne cislo"));
            System.out.println(("12: Zisti ci to je octa cislo"));
            System.out.println(("13: Prekopiruj kladne cisla z pola do druheho pola"));
            volba = sc.nextInt();
        } while (volba < 1 || volba > 13);

        switch (volba) {
            case (1):
                System.out.println("Zadaj cislo ktore chces previest: ");
                cislo = sc.nextInt();
                converter.convertToBinary(cislo);
                break;
            case (2):
                System.out.println("Zadaj cislo ktore chces previest: ");
                cislo = sc.nextInt();
                converter.convertToOcta(cislo);
                break;
            case (3):
                System.out.println("Zadaj cislo ktore chces previest: ");
                cislo = sc.nextInt();
                converter.convertToHexa(cislo);
                break;
            case (4):
                System.out.println("Zadaj cislo ktore chces previest: ");
                cislo = sc.nextInt();
                converter.convertFromBinToDec(cislo);
                break;
            case (5):
                System.out.println("Zadaj cislo ktore chces previest: ");
                cislo = sc.nextInt();
                converter.convertFromOctToDec(cislo);
                break;
            case (6):
                System.out.println("Zadaj cislo ktore chces previest: ");
                Scanner in = new Scanner(System.in);
                retazec = in.nextLine();
                converter.convertFromHexToDec(retazec);
                break;
            case (7):
                converter.countInfinity();
                break;
            case (8):
                System.out.println("Zadaj retazec a napisem ho odzadu: ");
                Scanner inS = new Scanner(System.in);
                retazec = inS.nextLine();
                converter.vypisemOdZadu(retazec);
                break;
            case (9):
                converter.zistiPocetSamohlasok();
                break;
            case(10):
                System.out.println("Zadaj cislo: ");
                Scanner inH = new Scanner(System.in);
                retazec = inH.nextLine();
                boolean hodnota = converter.isHexadecimalNumber(retazec);
                if(hodnota == true){
                    System.out.println("Je to HEXA cislo");
                }else{
                    System.out.println("Nie je to HEXA cislo");
                }
                break;
            case(11):
                System.out.println("Zadaj cislo: ");
                Scanner inB = new Scanner(System.in);
                retazec = inB.nextLine();
                hodnota = converter.isBinaryNumber(retazec);
                if(hodnota == true){
                    System.out.println("Je to Binary cislo");
                }else{
                    System.out.println("Nie je to Binary cislo");
                }
                break;
            case(12):
                System.out.println("Zadaj cislo: ");
                Scanner inO = new Scanner(System.in);
                retazec = inO.nextLine();
                hodnota = converter.isOctalNumber(retazec);
                if(hodnota == true){
                    System.out.println("Je to Octa cislo");
                }else{
                    System.out.println("Nie je to Octa cislo");
                }
                break;
            case(13):
                int[] pole = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                        18, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37,
                        38, 39, 40};
                int[] novePole = converter.getArray(pole);
                int dlzka = novePole.length;
                for(int i = 0; i < dlzka; i++){
                    System.out.print(" " + novePole[i]);
                }
                break;
        }
    }
}

