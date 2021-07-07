# title
## 7.2.3 Pertanyaan
1. Perhatikan class StackMain, apakah fungsi angka 5 pada potongan kode program berikut?
Stack stk = new Stack(5);
Jawab : fungsi angka 5 pada potongan kode program tersebut adalah untuk memberi tahu kepada
program bahwa kapasitas pada stack hanya dapat menampung sampai 5 angka
2. Lakukan penambahan data ke stack sebanyak dua kali, menggunakan angka 18 dan 40.
Tampilkan hasilnya!
Jawab : dimodifikasi pada bagian StackMain penambahan push(18) dan push(40)

## 7.3.3 Pertanyaan
1. Perhatikan class StackMain, pada saat memanggil fungsi push, parameter yang dikirimkan
adalah bk. Data apa yang tersimpan pada variabel bk tersebut?
st.push(bk);
Jawab : Data yang tersimpan pada variabel bk adalah objek buku yang berisi data (judul
buku,nama pengarang,tahun terbit, jumlah halaman, serta harga buku) yang telah diinputkan
2. Tunjukkan potongan kode program untuk menentukan kapasitas penampungan stack!
Jawab : menunjukkan bahwa kapasitas penampungan stack adalah maks 8
Stack st = new stack(8)
3. Apakah fungsi penggunaan do-while yang terdapat pada class StackMain?
Jawab : do-while pada StackMain berfungsi untuk menjalankan proses yang ada didalamnya satu
kali kemudian dilakukan pengecekan dan program akan menanyakan "Apakah Anda akan 
menambahkan data baru ke stack (y/n)? " dan jika memilih “y” maka akan mengulangi proses
input lagi yaitu menambahkan data kembali,dan jika memilih “n” maka proses akan diselesaikan
dan menampilkan hasilnya
4. Modifikasi kode program pada class StackMain sehingga pengguna dapat memilih operasioperasi pada stack (push, pop, peek, atau print) melalui pilihan menu program!

## 7.4.3 Pertanyaan
1. Perhatikan class Postfix, jelaskan alur kerja method derajat!
Jawab : jika nilai character adalah operator ^ maka akan memberikan nilai 3.Jika nilai dari
character c adalah & maka akan memberikan nilai 2.Jika nilai dari character c adalah / maka
akan memberikan nilai 2.Jika nilai dari character c adalah * maka akan memberikan nilai 2.Jika
nilai dari character c adalah – atau + maka akan memberikan nilai 1.Jika nilai dari character c
selain character yang sudah ada pada kode program,maka nilainya kan 0 sehingga derajat
operator tersebut digunakan untuk membandingkan sesuai dengan nilai angka tersebut.
2. Apa fungsi kode program berikut?
c = Q.charAt(i);
Jawab : untuk mengambil character ke I pada Q kemudian character disimpan pada variabel c
yang bertipe data char
3. Jalankan kembali program tersebut, masukkan ekspresi 3*5^(8-6)%3. Tampilkan hasilnya!
Jawab :
4. Pada soal nomor 2, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan!
Jawab : Karena pada program jika menemukan character ( akan dimasukkan kedalam stack.Jika
program selanjutnya menemukan character ) maka program akan mengeluarkan semua character
dalam stack sampai menemukan character ( didalam stack dan memasukkannya kedalam postfix
kecuali tanda “(“ dan “)” tersebut.