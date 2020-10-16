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
    }


