package if1.pkg10118006.latihan31.objectoriented.perkenalanmahasiswa;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan target saldo perbulan  
 */
public class Mahasiswa {
    public String nim;
    public String nama;


    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void perkenalkanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama+"\n");
    }
    
}
