package TubesATM;


import java.io.*;
import java.util.Scanner;



public class ATM {
    private Bank bank;
    private static final String LOKASI_BERKAS_DATA = "bankdata.dat";

    public ATM() {
        this.bank = muatDataBank();
    }

    public void jalankan() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu ATM:");
            System.out.println("1. Daftar");
            System.out.println("2. Masuk");
            System.out.println("3. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    daftar(scanner);
                    break;
                case 2:
                    masuk(scanner);
                    break;
                case 3:
                    simpanDataBank(bank);
                    System.out.println("Keluar dari ATM. Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private void daftar(Scanner scanner) {
        System.out.print("Masukkan nomor akun baru Anda: ");
        String nomorAkunBaru = scanner.next();

        // Periksa apakah nomor akun sudah ada
        if (bank.cekSaldo(nomorAkunBaru) != 0.0) {
            System.out.println("Nomor akun sudah ada. Harap pilih nomor akun lain.");
            return;
        }

        System.out.print("Masukkan jumlah setoran awal: $");
        double setoranAwal = scanner.nextDouble();

        // Periksa apakah PIN memiliki 4 digit
        int pin;
        do {
            System.out.print("Atur PIN 4 digit Anda: ");
            pin = scanner.nextInt();
            if (String.valueOf(pin).length() != 4) {
                System.out.println("PIN tidak valid. Harap masukkan PIN 4 digit.");
            }
        } while (String.valueOf(pin).length() != 4);

        // Buat akun dan set saldo awal
        bank.buatAkun(nomorAkunBaru, setoranAwal, pin);
        bank.setor(nomorAkunBaru, setoranAwal); // Tambahkan baris ini untuk menetapkan saldo awal
        System.out.println("Pendaftaran berhasil. Silakan masuk untuk melanjutkan.");
    }
    
    private void transfer(String nomorAkun, Scanner scanner) {
        System.out.print("Masukkan nomor akun tujuan: ");
        String nomorAkunTujuan = scanner.next();

        if (bank.cekSaldo(nomorAkunTujuan) == 0.0) {
            System.out.println("Akun tujuan tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan jumlah transfer: $");
        double jumlahTransfer = scanner.nextDouble();

        bank.transfer(nomorAkun, nomorAkunTujuan, jumlahTransfer);
    }



    private void masuk(Scanner scanner) {
        System.out.print("Masukkan nomor akun Anda: ");
        String nomorAkun = scanner.next();

        if (bank.cekSaldo(nomorAkun) == 0.0) {
            System.out.println("Akun tidak ditemukan. Harap mendaftar terlebih dahulu.");
            return;
        }

        System.out.print("Masukkan PIN 4 digit Anda: ");
        int pinDimasukkan = scanner.nextInt();

        if (bank.autentikasiPengguna(nomorAkun, pinDimasukkan)) {
            while (true) {
                System.out.println("\nMenu ATM:");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor");
                System.out.println("3. Tarik");
                System.out.println("4. Keluar");
                System.out.println("5. Transfer Uang");
                System.out.println("6. Tampilkan Informasi Akun");


                System.out.print("Masukkan pilihan Anda: ");
                int pilihanDalam = scanner.nextInt();

                switch (pilihanDalam) {
                    case 1:
                        System.out.println("Saldo Saat Ini: $" + bank.cekSaldo(nomorAkun));
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah setoran: $");
                        double jumlahSetoran = scanner.nextDouble();
                        bank.setor(nomorAkun, jumlahSetoran);
                        System.out.println("Setoran berhasil.");
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah penarikan: $");
                        double jumlahPenarikan = scanner.nextDouble();
                        bank.tarik(nomorAkun, jumlahPenarikan);
                        break;
                    case 4:
                        simpanDataBank(bank);
                        System.out.println("Keluar. Terima kasih!");
                        return;
                    case 5:
                        transfer(nomorAkun, scanner);
                        break;
                    case 6:
                        bank.tampilkanInformasiAkun(nomorAkun);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        } else {
            System.out.println("PIN salah. Masuk gagal.");
        }
    }

    private void simpanDataBank(Bank bank) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(LOKASI_BERKAS_DATA))) {
            outputStream.writeObject(bank);
            System.out.println("Data bank berhasil disimpan.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error menyimpan data bank.");
        }
    }

    private Bank muatDataBank() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(LOKASI_BERKAS_DATA))) {
            return (Bank) inputStream.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println("Tidak ada data bank yang ditemukan. Membuat bank baru.");
            return new Bank();
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.jalankan();
