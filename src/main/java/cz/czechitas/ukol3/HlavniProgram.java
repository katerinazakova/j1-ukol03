package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.


        Pocitac laptopLenovo = new Pocitac();
        System.out.println(laptopLenovo);
        laptopLenovo.zapniSe();


        Disk laptopLenovoDisk = new Disk();
        laptopLenovoDisk.setKapacita(477_000_000_000L);
        laptopLenovoDisk.setVyuziteMisto(201_000_000_000L);

        Pamet laptopLenovoPamet = new Pamet();
        laptopLenovoPamet.setKapacita(8_000_000_000L);

        Procesor laptopLenovoProcesor = new Procesor();
        laptopLenovoProcesor.setVyrobce("Lenovo");
        laptopLenovoProcesor.setRychlost(2_300_000_000L);

        laptopLenovo.setCpu(laptopLenovoProcesor);
        laptopLenovo.setPevnyDisk(laptopLenovoDisk);
        laptopLenovo.setRam(laptopLenovoPamet);


        System.out.println(laptopLenovo);
        laptopLenovo.zapniSe();
        laptopLenovo.vytvorSouborOVelikosti(100_000_000_000L);

        laptopLenovo.vymazSouboryOVelikosti(100_000_000_000L);


        laptopLenovo.zapniSe();


        laptopLenovo.vypniSe();

        laptopLenovo.vytvorSouborOVelikosti(100_000_000_000L);
        laptopLenovo.vymazSouboryOVelikosti(100_000_000_000L);


    }

}
