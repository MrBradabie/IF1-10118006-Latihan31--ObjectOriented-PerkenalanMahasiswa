/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118006.latihan31.objectoriented.perkenalanmahasiswa;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan target saldo perbulan  
 */
public class if110118006Latihan31ObjectOrientedPerkenalanMahasiswa {

    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();
    }
    
}
