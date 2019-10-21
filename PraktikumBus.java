
package pbo2.newpackage;


public class PraktikumBus {
    private double penumpang;
    private double maxPenumpang;
    private int counter;

    //konstruksi kelas bus
    public PraktikumBus(double maxPenumpang) 
    {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method Mutator 
    public void addpenumpang(int penumpang) 
    {
        double temp;
        temp = this.penumpang + penumpang;

        if (temp >= maxPenumpang) {
            System.out.println("BERAT PENUMPANG BERLEBIH");
        } 
        else
        {
            this.penumpang = temp;
            counter++;
        }
    }
    
        public void getPenumpang(int password) 
        {
            if (password == 113) {
            System.out.println("Password Benar");
            addpenumpang(40); 
            
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("Berat Penumpang bus sekarang = " + penumpang + " Kg");
        System.out.println("Maksimum berat penumpang yang seharusnya adalah = " + maxPenumpang + " Kg");
    }

    public double getAverage() {
        return penumpang / counter;
    }

    public int counter() {
        return counter;
    }
}
