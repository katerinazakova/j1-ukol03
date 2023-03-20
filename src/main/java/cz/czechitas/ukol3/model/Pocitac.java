package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


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


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            System.out.println("Chyba: počítač nelze zapnout bez všech komponent.");
            return;
        }

        if (jeZapnuty) {
            System.out.println("Chyba: počítač je již zapnutý.");
        } else {
            System.out.println("Počítač se právě zapnul.");
            jeZapnuty = true;
        }

    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se vypnul.");
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {

        if (!jeZapnuty) {
            System.out.println("Chyba: nelze vytvářet soubory při vypnutém počítači.");
            return;
        }

        long zvetseneMisto = pevnyDisk.getVyuziteMisto() + velikost;


        if (zvetseneMisto <= pevnyDisk.getKapacita()) {
            pevnyDisk.setVyuziteMisto(zvetseneMisto);
            System.out.println("Soubor vytvořen.");
        } else {
            System.out.println("Chyba: soubor nelze vytvořit - nedostatek místa.");

        }

    }

    public void vymazSouboryOVelikosti(long velikost) {

        if (!jeZapnuty) {
            return;

        }
        long zmenseneMisto = pevnyDisk.getVyuziteMisto() - velikost;

        if (zmenseneMisto >= 0) {
            pevnyDisk.setVyuziteMisto(zmenseneMisto);
            System.out.println("Soubor odstraněn.");

        } else {
            System.out.println("Chyba: soubor nelze odstranit");

        }

    }


    @Override
    public String toString() {
        return "CPU: " + cpu + ". Pevný disk: " + pevnyDisk + " RAM: " + ram;
    }
}


