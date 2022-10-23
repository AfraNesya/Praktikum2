import java.io.IOException;

import javax.sql.rowset.spi.SyncResolver;

public class LatihanPerson{
    public static void main(String[] args) throws IOException
    {
        // Membuat object
        Person a = new Person();    


    /* memanggil atribut dan memberi nilai */
    a.setNama("Anton");
    a.setJenisKelamin("Laki-laki");
    a.setUmur(22);
    System.out.println("Nama : " + a.getNama());
    System.out.println("Jenis Kelamin : " + a.getJenisKelamin());
    System.out.println("Umur : " + a.getUmur());

    System.out.println("      ");

    Person b = new Person();         

     b.setNama("Riko");
     b.setJenisKelamin("Laki-laki");
     b.setUmur(19);
     System.out.println("Nama : " + b.getNama());
     System.out.println("Jenis Kelamin : " + b.getJenisKelamin());
     System.out.println("Umur : " + b.getUmur());
    }
}