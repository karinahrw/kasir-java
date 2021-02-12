package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mulai;
        do {
        int harga = 0;
        int[] harga_item = new int[]{25000, 36000, 22000, 11000, 44000, 56000, 14000, 23000, 24000, 40000};
        String menu = null;
            System.out.println("");
            System.out.println("|_________________________________________________|");
            System.out.println("|                  DAFTAR BARANG                  |");
            System.out.println("|_________________________________________________|");
            System.out.println("|             Nama                  |    Harga    |");
            System.out.println("|___________________________________|_____________|");
            System.out.println("| 1.  Buku Tulis 38                 |   Rp 25000  |");
            System.out.println("| 2.  Buku Tulis 58                 |   Rp 36000  |");
            System.out.println("| 3.  Bolpoin Gel                   |   Rp 22000  |");
            System.out.println("| 4.  Bolpoin Standard              |   Rp 11000  |");
            System.out.println("| 5.  Tipe-X Cair                   |   Rp 44000  |");
            System.out.println("| 6.  Tipe-X Kertas                 |   Rp 56000  |");
            System.out.println("| 7.  Penghapus Kecil               |   Rp 14000  |");
            System.out.println("| 8.  Penghapus Besar               |   Rp 23000  |");
            System.out.println("| 9.  Pensil 2B                     |   Rp 24000  |");
            System.out.println("| 10. Pensil Mekanik                |   Rp 40000  |");
            System.out.println("|___________________________________|_____________|");
            System.out.println("| => [PROMO] Setiap pembelian diatas Rp 100.000   |");
            System.out.println("| mendapatkan CASHBACK sebesar 10%                |");
            System.out.println("|_________________________________________________|");

            for (String a = "Y"; a.equals("Y") || a.equals("y"); a = input.next()) {
                System.out.println("");
                System.out.print("Masukkan Nomor Item  : ");
                int input_item = input.nextInt();
                System.out.print("Masukkan Banyak Item : ");
                int jumlah = input.nextInt();
                System.out.println("________________________________________________");
                int total;
                if (input_item == 1) {
                    menu = " Buku Tulis 38 ";
                    harga += harga_item[0] * jumlah;
                    total = harga_item[0] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 2) {
                    menu = "Buku Tulis 58 ";
                    harga += harga_item[1] * jumlah;
                    total = harga_item[1] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 3) {
                    menu = " Bolpoin Gel ";
                    harga += harga_item[2] * jumlah;
                    total = harga_item[2] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 4) {
                    menu = " Bolpoin Standard ";
                    harga += harga_item[3] * jumlah;
                    total = harga_item[3] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 5) {
                    menu = " Tipe-X Cair  ";
                    harga += harga_item[4] * jumlah;
                    total = harga_item[4] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 6) {
                    menu = " Tipe-X Kertas  ";
                    harga += harga_item[5] * jumlah;
                    total = harga_item[5] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 7) {
                    menu = " Penghapus Kecil ";
                    harga += harga_item[6] * jumlah;
                    total = harga_item[6] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 8) {
                    menu = " Penghapus Besar ";
                    harga += harga_item[7] * jumlah;
                    total = harga_item[7] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 9) {
                    menu = " Pensil 2B ";
                    harga += harga_item[8] * jumlah;
                    total = harga_item[8] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else if (input_item == 10) {
                    menu = " Pensil Mekanik ";
                    harga += harga_item[9] * jumlah;
                    total = harga_item[9] * jumlah;
                    System.out.println("Menu Pesanan Anda : ");
                    System.out.println(menu + "    x" + jumlah + "   |  Rp. " + total);
                } else {
                    System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
                }

                System.out.println("Apakah anda mau memesan lagi? Y/T");
            }

            double diskon;
            if (harga >= 100000) {
                diskon = (double) harga * 0.1D;
            } else {
                diskon = 0.0D;
            }

            double bayar = (double) harga - diskon;
            System.out.println("________________________________________________");
            System.out.println("Pembayaran sebesar           :  Rp." + harga);
            System.out.println("Anda mendapat diskon sebesar :  Rp." + diskon);
            System.out.println("Total yang harus anda bayar  :  Rp." + bayar);
            System.out.println("________________________________________________");
            System.out.print("Jumlah uang yang diberikan   :  RP.");

            int pembayaran;
            for (pembayaran = input.nextInt(); (double) pembayaran < bayar; pembayaran = input.nextInt()) {
                System.out.println("________________________________________________");
                System.out.println("           Mohon maaf uang anda kurang          ");
                System.out.println("________________________________________________");
                System.out.println("    Silahkan bayar sesuai harga yang diterima   ");
                System.out.print("Jumlah uang yang dibayarkan : Rp ");
            }

            double kembalian = (double) pembayaran - bayar;
            System.out.println("Kembalian Anda Sebesar       :  Rp." + kembalian);
            System.out.println("________________________________________________");
            System.out.println("         Terimakasih atas kunjungan Anda.       ");
            System.out.println("________________________________________________");

            System.out.println("Transaksi lagi? y/t");
            mulai = input.next();

        }while (mulai.equals("y"));

    }

}
