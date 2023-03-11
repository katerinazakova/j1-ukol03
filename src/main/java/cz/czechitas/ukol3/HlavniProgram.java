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


        Disk lenovoDisk = new Disk();
        lenovoDisk.setKapacita(477_000_000_000L);
        lenovoDisk.setVyuziteMisto(201_000_000_000L);

        Pamet lenovoPamet = new Pamet();
        lenovoPamet.setKapacita(8_000_000_000L);

        Procesor lenovoProcesor = new Procesor();
        lenovoProcesor.setVyrobce("Lenovo");
        lenovoProcesor.setRychlost(2_300_000_000L);

        laptopLenovo.setCpu(lenovoProcesor);
        laptopLenovo.setPevnyDisk(lenovoDisk);
        laptopLenovo.setRam(lenovoPamet);

        System.out.println(laptopLenovo);
        laptopLenovo.zapniSe();

        laptopLenovo.vypniSe();


    }

}
