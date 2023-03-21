package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;


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

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
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
        long zvetseneMistoDruhehoDisku = druhyDisk.getVyuziteMisto() + velikost;

        if (zvetseneMisto <= pevnyDisk.getKapacita()) {
            pevnyDisk.setVyuziteMisto(zvetseneMisto);
            System.out.println("Soubor vytvořen na pevném disku.");

        } else if (zvetseneMistoDruhehoDisku <= druhyDisk.getKapacita()) {
            druhyDisk.setVyuziteMisto(zvetseneMistoDruhehoDisku);
            System.out.println("Soubor vytvořen na druhém disku");

        } else {
            System.out.println("Chyba: soubor nelze vytvořit - nedostatek kapacity.");
        }

    }

    public void vymazSouboryOVelikosti(long velikost) {

        if (!jeZapnuty) {
            return;

        }
        long zmenseneMisto = pevnyDisk.getVyuziteMisto() - velikost;
        long zmenseneMistoDruhehoDisku = druhyDisk.getVyuziteMisto() - velikost;

        if (zmenseneMisto >= 0) {
            pevnyDisk.setVyuziteMisto(zmenseneMisto);
            System.out.println("Soubor odstraněn z pevného disku.");

        } else if (zmenseneMistoDruhehoDisku >= 0) {
            druhyDisk.setVyuziteMisto(zmenseneMistoDruhehoDisku);
            System.out.println("Soubor odstraněn z druhého disku.");

        } else {
            System.out.println("Chyba: soubor nelze odstranit.");

        }

    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ". Pevný disk: " + pevnyDisk + " Druhý Disk: " + druhyDisk + " RAM: " + ram;
    }
}


