package hitung;

public class matematika {
    //membuat variabel 
   private double bil1, bil2;
   
   //membuat konstruktor
   public matematika(double bil1, double bil2){
      this.bil1 = bil1;
      this.bil2 = bil2;
   }
   
   //membuat method setPenjumlahan
   public double setPenjumlahan(){
       return bil1 + bil2;
   }
}
