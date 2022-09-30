package praktikumIII;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga = 0, diskon = 0, jumlah = 0;
        
        System.out.println("1. beli minuman\t\t2. keluar");
        System.out.print("Plih menu: ");
        int masukkan = input.nextInt();
        
        if(masukkan == 1 || masukkan == 2){
            if(masukkan == 1){
                System.out.print("Jumlah Pembelian minuman: ");
                int drink = input.nextInt();
                
                harga = drink*10000;
                
                if(drink > 5){
                    diskon = 10*harga/100;
                    jumlah = harga-diskon;
                }else if(drink > 3){
                    diskon = 5*harga/100;
                    jumlah = harga-diskon;
                }else{
                    jumlah = harga;
                }
                System.out.println("Anda membeli minuman sebanyak "+drink);
                System.out.print("dengan total harga Rp."+harga+" dan potongan RP."+diskon);
                System.out.println(",\ntotal belanja keseluruhan Rp."+jumlah);
            }else{
                System.out.println("Anda keluar dari program");
            }
        }else{
            System.out.println("Menu tidak tersedia");
        }
    }
}
