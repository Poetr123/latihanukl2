# 🧮 Program Penghitung Faktorial

## 📝 Penjelasan Singkat
Program ini dibuat buat menghitung **faktorial dari sebuah bilangan bulat positif** yang dimasukkan oleh pengguna.  
Jadi, waktu pengguna masukin angka, program bakal ngitung hasil perkalian dari 1 sampai angka itu.

Contohnya:
- Kalau masukin 4 → hasilnya 1 × 2 × 3 × 4 = **24**
- Kalau masukin 5 → hasilnya 1 × 2 × 3 × 4 × 5 = **120**

Kalau pengguna tanpa sengaja masukin **angka negatif**, program nggak bakal error.  
Dia bakal ngasih pesan:
> "Angka harus positif! Tidak bisa menghitung faktorial dari bilangan negatif."

Dengan begitu, program tetap aman, nggak langsung crash, dan pesannya juga jelas buat pengguna.

---

## ⚙️ Fungsi Program
1. Program minta pengguna masukin satu bilangan bulat positif.  
2. Program mengecek dulu, angkanya valid atau nggak.  
3. Kalau valid, program ngitung faktorialnya pakai perulangan `for`.  
4. Hasil akhirnya langsung ditampilkan di layar.  
5. Kalau inputnya negatif, program bakal munculin pesan peringatan tanpa error.

---

## 📷 Screenshot Hasil Program
Berikut contoh hasil waktu program dijalankan:

**✅ Saat pengguna masukin angka positif:**
![Output Faktorial Positif](images/output1.png)

**⚠️ Saat pengguna masukin angka negatif:**
![Output Faktorial Negatif](images/output2.png)
