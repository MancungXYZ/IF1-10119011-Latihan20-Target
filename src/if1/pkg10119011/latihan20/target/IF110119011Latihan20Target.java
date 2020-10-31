/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan20.target;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan20Target {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoawal = 3500000;
        double bunga = 0.08;
        double saldobulanan = 0;
        int i=0;       
        
        while ( saldoawal <= 6000000) {
            i = i + 1;
            saldobulanan = saldoawal * bunga;
            saldoawal = (int) (saldobulanan + saldoawal);
            System.out.println("Saldo di bulan ke-" + i + " Rp " + saldoawal);
        }
    }
    
}
