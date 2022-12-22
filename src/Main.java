import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Keluarga[] keluarga = new Keluarga[100];
//        Keluarga keluarga2 = new Keluarga();
        KTP ktp = new KTP();
        Ayah[] ayah = new Ayah[50];
        Ibu[] ibu = new Ibu[50];
        Anak[] anak = new Anak[50];
        int menu,jml = 0;
        String kode;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Menu Input Data Keluarga");
            System.out.println(" 1. Input Data Keluarga");
            System.out.println(" 2. Tampilan KTP Keluarga");
            System.out.println(" 3. Input Anggota Keluarga");
            System.out.println(" 4. Daftar Kartu Keluarga");
            System.out.println(" 5. Keluar");
            System.out.print(" Pilihan Anda : ");
            menu=input.nextInt();
            switch (menu) {
                case 1:
                    int i=0;
                    System.out.println("Input Data Kepala Keluarga");
                    ayah[i].inputKTP();
                    System.out.println("Input Data Ibu");
                    ibu[i].inputKTP();
                    System.out.println("Berapa Data Anak?");
                    jml=input.nextInt();
                    for(int j=0;j<jml;j++){
                        System.out.println("Anak ke-"+j+1);
                        anak[j].inputKTP();
                    }
                    i++;
                    break;
                case 2:
                    if(ktp.jmlKTP==0){
                        System.out.println("Data Masih Kosong");
                    }else {
                        int k=0;
                        System.out.println("Data KTP Ayah :");
                        ayah[k].cetakKTP();
                        System.out.println();
                        System.out.println("Data KTP Ibu :");
                        ibu[k].cetakKTP();
                        System.out.println();
                        for(int j=0;j<jml;j++){
                            System.out.println("Data Anak ke-"+j);
                            anak[j].cetakKTP();
                        }
                    }
                    break;
                case 3:
                    int l=0;
                    System.out.println("Masukan Anggota Keluarga");
                    System.out.println("Ayah index ke");
                    kode=input.next();
                    keluarga[l].setAyahIbu(ayah[l],ibu[l]);
                    keluarga.addAnak(anak);
                    System.out.println("Daftar Anggota Telah ditambahkan");
                    break;
                case 4:
                    keluarga.daftarAnggota();
                    break;
                case 5:
                    System.out.println("Anda telah keluar");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        }while (menu!=7);
    }
}