import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga();
        KTP ktp = new KTP();
        Subjek ayah = new Subjek();
        Subjek ibu = new Subjek();
        Subjek anak = new Subjek();
        System.out.println("\n\t\t=======================================");
        System.out.println("\t\t  Selamat Datang Di Program Pendataan");
        System.out.println("\t\t Silahkan Menggunakan Fitur Program Ini");
        System.out.println("\t\t========================================");
        int menu;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("\n\t\tMenu Pendataan Keluarga");
            System.out.println("\t\t 1. Input Data Keluarga");
            System.out.println("\t\t 2. Daftar KTP Anngota Keluarga");
            System.out.println("\t\t 3. Tampilan Kartu Keluarga");
            System.out.println("\t\t 4. Keluar");
            System.out.print("\t\t Pilihan Anda : ");
            menu=input.nextInt();
            switch (menu) {
                case 1:
                    keluarga.inputKK(ayah,ibu,anak);
                    break;
                case 2:
                    ktp.outputKTP(ayah,ibu,anak);
                    break;
                case 3:
                    keluarga.AddSubjek(ayah,ibu,anak);
                    keluarga.displayKK();
                    break;
                case 4:
                    System.out.println("\tAnda telah keluar");
                    break;
                default:
                    System.out.println("\tMenu tidak tersedia");
                    break;
            }
        }while (menu!=4);
    }
}