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

        Disk laptopLenovoPevnydisk = new Disk();
        laptopLenovoPevnydisk.setKapacita(477_000_000_000L);
        laptopLenovoPevnydisk.setVyuziteMisto(201_000_000_000L);

        Disk laptopLenovoDruhyDisk = new Disk();
        laptopLenovoDruhyDisk.setKapacita(400_000_000_000L);
        laptopLenovoDruhyDisk.setVyuziteMisto(0L);

        Pamet laptopLenovoPamet = new Pamet();
        laptopLenovoPamet.setKapacita(8_000_000_000L);

        Procesor laptopLenovoProcesor = new Procesor();
        laptopLenovoProcesor.setVyrobce("Lenovo");
        laptopLenovoProcesor.setRychlost(2_300_000_000L);

        laptopLenovo.setCpu(laptopLenovoProcesor);
        laptopLenovo.setPevnyDisk(laptopLenovoPevnydisk);
        laptopLenovo.setDruhyDisk(laptopLenovoDruhyDisk);
        laptopLenovo.setRam(laptopLenovoPamet);

        System.out.println(laptopLenovo);
        laptopLenovo.zapniSe();
        laptopLenovo.zapniSe();
        laptopLenovo.zapniSe();
        laptopLenovo.zapniSe();

        laptopLenovo.vytvorSouborOVelikosti(100_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vytvorSouborOVelikosti(255_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vytvorSouborOVelikosti(255_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vytvorSouborOVelikosti(145_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vytvorSouborOVelikosti(145_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(200_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(250_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(250_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(246_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(150_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vymazSouboryOVelikosti(150_000_000_000L);
        System.out.println(laptopLenovo.getPevnyDisk());
        System.out.println(laptopLenovo.getDruhyDisk());

        laptopLenovo.vypniSe();
        laptopLenovo.vypniSe();
        laptopLenovo.vypniSe();

        laptopLenovo.vytvorSouborOVelikosti(100_000_000_000L);
        laptopLenovo.vymazSouboryOVelikosti(100_000_000_000L);

    }

}
