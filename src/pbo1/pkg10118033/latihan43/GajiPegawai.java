package pbo1.pkg10118033.latihan43;

public class GajiPegawai {
    private String nama, alamat;
    private int uangTransport, uangTunjangan, gajiPokok, totalGaji;

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return uangTunjangan + uangTransport + gajiPokok;
    }
    
    public void tampilData(String nama, String alamat, int uangTransport, int uangTunjangan, int gajiPokok, int totalGaji){
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.println("Nama Karyawan  : "+nama);
        System.out.println("Alamat         : "+alamat);
        System.out.println("Uang Transport : Rp."+uangTransport);
        System.out.println("Uang Tunjangan : Rp."+uangTunjangan);
        System.out.println("Gaji Pokok     : Rp."+gajiPokok);
        System.out.println("Total Gaji     : Rp."+totalGaji);
    }
    
}
