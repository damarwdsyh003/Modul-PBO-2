
package pbo2.newpackage;


public class PraktikumUjiBus {
    public static void main(String[] args) {
        PraktikumBus Bus = new PraktikumBus(150); 
        Bus.cetakpenumpang();

        Bus.getPenumpang(113);
        Bus.cetakpenumpang();

        Bus.getPenumpang(100);
        Bus.cetakpenumpang();

        Bus.getPenumpang(113);
        Bus.cetakpenumpang();

        Bus.getPenumpang(113);
        Bus.cetakpenumpang();

        Bus.getPenumpang(113);
        Bus.cetakpenumpang();

        System.out.println("Rata rata penumpang : " + Bus.getAverage() + " kg");
        System.out.println("jumlah penumpang sekarang : " + Bus.counter());
    }
}
