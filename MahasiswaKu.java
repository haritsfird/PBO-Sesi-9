//PBO Sesi 9 Nomer 1
package mahasiswaku;

public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClass(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClass());
    }
}