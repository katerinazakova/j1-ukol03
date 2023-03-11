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
        if (this.cpu == null || ram == null || pevnyDisk == null) {
            System.err.println("Pocitac nelze zapnout bez vsech komponent.");
            return;
        }

        if (jeZapnuty == true) {
            System.err.println("Pocitac je jiz zapnuty");
        } else {
            System.out.println("Pocitac se prave zapnul.");
            jeZapnuty = true;
        }

    }

    public void vypniSe() {
        if (jeZapnuty == true) {
            jeZapnuty = false;
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {


    }

    public void vymazSouboryOVelikosti(long velikost) {


    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ". Pevný disk: " + pevnyDisk + ". RAM: " + ram + ".";
    }
}


