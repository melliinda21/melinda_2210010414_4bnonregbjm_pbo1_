/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOTANAMAN;

/**
 *
 * @author ASUS
 */
//class
public class Tanaman {
    //atribut
 private final String nama;
    private final String jenis;
 private double tinggi;

    //constructor
    public Tanaman(String nama, String jenis, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getTinggi() {
        return tinggi;
    }

 //mutator
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    //polymorphish
    @Override
    public String toString() {
        return "Tanaman{" +
                "nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", tinggi=" + tinggi +
                '}';
    }
    //class
    public class Pohon extends Tanaman {
 //atribut
    private boolean berbuah;

    //constructor
    public Pohon(String nama, String jenis, double tinggi, boolean berbuah) {
        super(nama, jenis, tinggi);
        this.berbuah = berbuah;
    }

  //mutator dan accessor tambahan
    public boolean isBerbuah() {
        return berbuah;
    }

    public void setBerbuah(boolean berbuah) {
        this.berbuah = berbuah;
    }

    //polymorphish
    @Override
    public String toString() {
        return "Pohon{" +
                "nama='" + getNama() + '\'' +
                ", jenis='" + getJenis() + '\'' +
                ", tinggi=" + getTinggi() +
                ", berbuah=" + berbuah +
                '}';
    }
}
}