//PBO Sesi 9 Nomer 2
import java.util.ArrayList;

public class DaftarObat {
 public static void main(String[] args) {
    // Membuat ArrayList bernama DaftarObat
    ArrayList<String> DaftarObat = new ArrayList<>();

    // Menambahkan beberapa makanan ke DaftarObat
    DaftarObat.add("Paracetamol");
    DaftarObat.add("Oralit");
    DaftarObat.add("Antasida");
    DaftarObat.add("CTM");
    DaftarObat.add("Zink");

    // Mencetak daftar makanan di DaftarObat
    System.out.println("Daftar Obat:");
    for (int i = 0; i < DaftarObat.size(); i++) {
      System.out.println((i+1) + ". " + DaftarObat.get(i));
    }

    // Menghapus minuman dari DaftarObat
    DaftarObat.remove(3); // Menghapus "Antasida"
    DaftarObat.remove(2); // Menghapus "CTM"

    // Mencetak daftar Obat di DaftarObat setelah dihapus
    System.out.println("\nDaftar Obat Setelah Dihapus:");
    for (int i = 0; i < DaftarObat.size(); i++) {
      System.out.println((i+1) + ". " + DaftarObat.get(i));
    }
  }
}