package hitung;

public class matematikaBeraksi {
    public static void main(String[] args) {
        //membuat obyek
        matematika fadil = new matematika(0,0);
        
        System.out.println("Hasil Penjumlahan   :  "+fadil.setPenjumlahan());
        System.out.println("Hasil Pengurangan  :  "+fadil.setPengurangan());
        System.out.println("Hasil Perkalian   :  "+fadil.setPerkalian());
        System.out.println("Hasil Pembagian   :  "+fadil.setPembagian());
    }
}
