import java.util.Scanner;

public class KTP {
    public String nik,nama,ttl,alamat,agama,kerja,warga="Indonesia";
    public KTP next;
    public int jmlKTP=0;
    public void cetakKTP(){
        System.out.println("NIK              : "+nik);
        System.out.println("Nama             : "+nama);
        System.out.println("Tempat/tgl lahir : "+ttl);
        System.out.println("Alamat           : "+alamat);
        System.out.println("Agama            : "+agama);
        System.out.println("Pekerjaan        : "+kerja);
        System.out.println("Kewarganegaraan  : "+warga);
    }
    public void inputKTP(){
        Scanner input = new Scanner(System.in);
//        KTP ktp = new KTP();
        System.out.print("NIK              : ");
        nik=input.next();
        System.out.print("Nama             : ");
        nama=input.next();
        System.out.print("Tempat/tgl lahir : ");
        ttl=input.next();
        System.out.print("Alamat           : ");
        alamat=input.next();
        System.out.print("Agama            : ");
        agama=input.next();
        System.out.print("Pekerjaan        : ");
        kerja=input.next();
        jmlKTP++;
    }
}
