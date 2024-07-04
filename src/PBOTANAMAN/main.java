/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOTANAMAN;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */

   public class main {
 public static void main(String[] args) {
        // Array untuk menyimpan objek tanaman
        ArrayList<Tanaman> kebun = new ArrayList<>();

        // Menambahkan objek Pohon ke ArrayList
        kebun.add(new Pohon("Mangga", "Buah", 5.2, true));
        kebun.add(new Pohon("Jambu", "Buah", 4.5, false));

     // Menampilkan info tanaman menggunakan perulangan
     kebun.forEach((t) -> {
         System.out.println(t);
     });
    }   
}
