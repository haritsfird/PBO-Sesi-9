//PBO Sesi 9 Nomer 2
package collection;

import java.util.ArrayDeque;

public class Obat {
  public static void main(String[] args) {
    ArrayDeque<String> AntriObat = new ArrayDeque<>();

    // Menambahkan beberapa pasien ke antrianObat
    AntriObat.add("Pasien 1");
    AntriObat.add("Pasien 2");
    AntriObat.add("Pasien 3");
    AntriObat.add("Pasien 4");
    AntriObat.add("Pasien 5");

    // Mencetak daftar Pasien di antrianObat
    System.out.println("Daftar Pasien:");
    for (String Obat : AntriObat) {
      System.out.println(Obat);
    }

    // Membayar untuk Pasien pertama di antrianObat
    String PasienSedangDiproses = AntriObat.poll();
    System.out.println("\nSedang melakukan pembayaran untuk pasien: " + PasienSedangDiproses);

    
    // Mencetak daftar Obat di antrianObat setelah diproses
    System.out.println("\nDaftar Pasien Setelah Diproses:");
    for (String Obat : AntriObat) {
      System.out.println(Obat);
    }
  }
}
