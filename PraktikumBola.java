
package pbo2.newpackage;


public class PraktikumBola {
    private double jarijari;

    public PraktikumBola(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setjarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        System.out.println("Diameter        : " + 2 * jarijari);
    }
    
    public void showVolume() {
        System.out.println("Volume          : " + (4 * Math.PI * Math.pow(jarijari, 2)));
    }

    public void showLuasPermukaanbola() {
        System.out.println("Luas Permukaan  : " + (4 / 3 * Math.PI * Math.pow(jarijari, 3)));
    }
    
}
