/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author salmanfaris
 */
public class tugas1 {
      public static void main(String[] args) {
        Apel apel = new Apel("Merah", 150);
        Jeruk jeruk = new Jeruk("Oranye", 200);
        Pisang pisang = new Pisang("Kuning", 120);

        // Menampilkan deskripsi buah
        apel.deskripsi();
        jeruk.deskripsi();
        pisang.deskripsi();

        System.out.println();

        // Menampilkan manfaat buah
        apel.kayaVitamin();
        apel.baikUntukKesehatan();
        apel.rasa();

        System.out.println();

        jeruk.kayaVitamin();
        jeruk.baikUntukKesehatan();
        jeruk.rasa();

        System.out.println();

        pisang.kayaVitamin();
        pisang.baikUntukKesehatan();
        pisang.rasa();
    }
}

// Kelas Abstrak Buah
abstract class Buah {
    String nama;
     String warna;
    double berat; // dalam gram

    public Buah(String nama, String warna, double berat) {
        this.nama = nama;
        this.warna = warna;
        this.berat = berat;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void deskripsi();
}

// Interface ManfaatBuah
interface ManfaatBuah {
    void kayaVitamin();
    void baikUntukKesehatan();
    void rasa();
}

// Kelas Apel sebagai subclass dari Buah dan implementasi ManfaatBuah
class Apel extends Buah implements ManfaatBuah {
    public Apel(String warna, double berat) {
        super("Apel", warna, berat);
    }

    @Override
    public void deskripsi() {
        System.out.println(nama + " berwarna " + warna + " dengan berat " + berat + " gram.");
    }

    @Override
    public void kayaVitamin() {
        System.out.println(nama + " kaya akan vitamin C dan serat.");
    }

    @Override
    public void baikUntukKesehatan() {
        System.out.println(nama + " baik untuk kesehatan jantung dan pencernaan.");
    }

    @Override
    public void rasa() {
        System.out.println(nama + " memiliki rasa manis dan sedikit asam.");
    }
}

// Kelas Jeruk sebagai subclass dari Buah dan implementasi ManfaatBuah
class Jeruk extends Buah implements ManfaatBuah {
    public Jeruk(String warna, double berat) {
        super("Jeruk", warna, berat);
    }

    @Override
    public void deskripsi() {
        System.out.println(nama + " berwarna " + warna + " dengan berat " + berat + " gram.");
    }

    @Override
    public void kayaVitamin() {
        System.out.println(nama + " mengandung banyak vitamin C yang baik untuk daya tahan tubuh.");
    }

    @Override
    public void baikUntukKesehatan() {
        System.out.println(nama + " membantu menjaga kesehatan kulit dan meningkatkan sistem imun.");
    }

    @Override
    public void rasa() {
        System.out.println(nama + " memiliki rasa manis dan sedikit asam yang segar.");
    }
}

// Kelas Pisang sebagai subclass dari Buah dan implementasi ManfaatBuah
class Pisang extends Buah implements ManfaatBuah {
    public Pisang(String warna, double berat) {
        super("Pisang", warna, berat);
    }

    @Override
    public void deskripsi() {
        System.out.println(nama + " berwarna " + warna + " dengan berat " + berat + " gram.");
    }

    @Override
    public void kayaVitamin() {
        System.out.println(nama + " kaya akan kalium dan vitamin B6.");
    }

    @Override
    public void baikUntukKesehatan() {
        System.out.println(nama + " sangat baik untuk pencernaan dan energi tubuh.");
    }

    @Override
    public void rasa() {
        System.out.println(nama + " memiliki rasa manis dan tekstur lembut.");
    }
}
