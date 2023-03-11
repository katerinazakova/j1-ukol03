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
        if (cpu == null) {
            System.err.println("Počítač se nezapnul.");

        } else if (ram == null) {
            System.err.println("Počítač se nezapnul.");
        } else if (pevnyDisk == null) {
            System.err.println("Počítač se nezapnul.");
        } else {
            System.out.println("Počítač se zapnul.");
        }
        this.jeZapnuty = isJeZapnuty();

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


