//PBO Sesi 9 Nomer 1
package mahasiswaku;

public class Mahasiswa<mahanim, mahaname, mahakelas> {
    public static void main(String[] args) {
    }
    private mahanim nim;
    private mahaname name;
    private mahakelas kelas;
    
    public void setNim(mahanim nim) {
        this.nim = nim;
    }
    
    public mahanim getNim() {
        return nim;
    }
    
    public void setName(mahaname name) {
        this.name = name;
    }
    
    public mahaname getName() {
        return name;
    }
    
    public void setClass(mahakelas kelas) {
        this.kelas = kelas;
    }
    
    public mahakelas getKelas() {
        return kelas;
    }
}