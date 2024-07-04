# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, jenis dan tanaman , dan memberikan output berupa informasi detail dari tinggi tersebut seperti ketinggian pohon jambu 4,5
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Tanaman`, Pohon`, dan `Main` adalah contoh dari class.

```bash
public class Tanaman {
    ...
}

public class Pohon extends Tanaman {
    ...
}

public class Pohon extends Tanaman {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, kebun.add(new Pohon("Mangga", "Buah", 5.2, true)); adalah contoh pembuatan object.

```bash
kebun.add(new Pohon("Mangga", "Buah", 5.2, true));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `jenis` dan tinggi adalah contoh atribut.

```bash
String nama;
String jenis;
String tinggi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `tanaman` dan `pohon`.

```bash
   public Tanaman(String nama, String jenis, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
}

 public Pohon(String nama, String jenis, double tinggi, boolean berbuah) {
        super(nama, jenis, tinggi);
        this.berbuah = berbuah;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setTinggi` dan `setberbuah` adalah contoh method mutator.

```bash
  public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
}
```
  public void setBerbuah(boolean berbuah) {
        this.berbuah = berbuah;
    }

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenis`, `getTinggi`, `isBerbuah` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getTinggi() {
        return tinggi;
    }
 public boolean isBerbuah() {
        return berbuah;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `jenis`dan tinggi dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
  private final String nama;
    private final String jenis;
 private double tinggi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `pohon` mewarisi `tanaman` dengan sintaks `extends`.

```bash
 public class Pohon extends Tanaman {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `toString()` di `tanaman` merupakan overriding method 
 @Override
    public String toString() {
        return "Tanaman{" +
                "nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", tinggi=" + tinggi +
                '}';
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `.

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `fot` untuk meminta input dan menampilkan data.

```bash
kebun.forEach((t) -> {
         System.out.println(t);
     });
    }   
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.
System.out.println(t);

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `kebun.add(new Pohon("Mangga", "Buah", 5.2, true)); kebun.add(new Pohon("Jambu", "Buah", 4.5, false));` adalah contoh penggunaan array.

```bash
kebun.add(new Pohon("Mangga", "Buah", 5.2, true));
        kebun.add(new Pohon("Jambu", "Buah", 4.5, false));
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Perulangan     |    5    |
| 11  | Array          |   15    |
|     | **TOTAL**      | **70** |

## Pembuat

Nama: Melinda
NPM: 2110010414
