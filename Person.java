public class Person {
    private String nama;
    private String jeniskelamin;
    private int umur;

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJenisKelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;        
    }

    // getter
    public String getNama() {
        return this.nama;
    }
    public String getJenisKelamin() {
        return this.jeniskelamin;
    }

    public int getUmur() {
        return this.umur;
    }
}