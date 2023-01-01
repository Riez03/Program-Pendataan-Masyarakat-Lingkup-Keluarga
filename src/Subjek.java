import java.util.Scanner;

public class Subjek extends KTP{
    public int jum_data;
    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("NIK              : ");
        nik=input.nextLine();
        System.out.print("Nama             : ");
        nama=input.nextLine();
        System.out.print("Tempat/tgl lahir : ");
        ttl=input.nextLine();
        System.out.print("Alamat           : ");
        alamat=input.nextLine();
        System.out.print("Jenis Kelamin    : ");
        jk=input.nextLine();
        System.out.print("Agama            : ");
        agama=input.nextLine();
        System.out.print("Pendidikan       : ");
        pendidikan=input.nextLine();
        System.out.print("Status           : ");
        status=input.nextLine();
        System.out.print("Pekerjaan        : ");
        kerja=input.nextLine();
        kewarganegaraan="WNI";
        jum_data++;
    }
}
