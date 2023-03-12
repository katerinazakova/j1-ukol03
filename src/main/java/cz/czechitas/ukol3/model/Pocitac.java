package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private long kapacita;
    private long vyuziteMisto;


    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (this.cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Pocitac nelze zapnout bez vsech komponent.");
            return;
        }

        if (jeZapnuty == true) {
            System.err.println("Pocitac je jiz zapnutý.");
        } else {
            System.out.println("Pocitac se prave zapnul.");
            jeZapnuty = true;
        }

    }

    public void vypniSe() {
        if (jeZapnuty == true) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {

        long novySoubor = vyuziteMisto + velikost;

        if (jeZapnuty == false) {
            return;
        }
        if (novySoubor < kapacita) {
            System.out.println("Soubor vytvořen.");

        } else {
            System.err.println("Soubor nelze vytvořit.");

        }

    }

    public void vymazSouboryOVelikosti(long velikost) {

        long zmenseneMisto = vyuziteMisto - velikost;

        if (jeZapnuty == false) {
            return;

        }
        if (zmenseneMisto > 0) {
            System.out.println("Soubor odstraněn.");

        } else {
            System.err.println("Soubor nelze odstranit");

        }

    }


    @Override
    public String toString() {
        return "CPU: " + cpu + ". Pevný disk: " + pevnyDisk + ". RAM: " + ram + ".";
    }
}


