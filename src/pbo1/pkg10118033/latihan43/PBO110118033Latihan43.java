
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan  Gaji
 *                     Pegawai.
 *  
 */

package pbo1.pkg10118033.latihan43;

public class PBO110118033Latihan43 {
    public static void main(String[] args) {
        GajiPegawai gaji1 = new GajiPegawai();
        gaji1.tampilData("Rizki Adam Kurniawan", "Jalan Semar dlm 4 No 72/66", 250000, 300000, 4500000, gaji1.totalGaji(250000, 300000, 4500000));
        System.out.println("(Developed By : Ikrar AB)");
    }
}