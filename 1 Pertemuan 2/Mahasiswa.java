public class Mahasiswa{
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa (String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String info(){
        return "NIM : " +nim + "\n"+"Nama : "+nama+"\n"+"Kelas : "+kelas;
    }
}