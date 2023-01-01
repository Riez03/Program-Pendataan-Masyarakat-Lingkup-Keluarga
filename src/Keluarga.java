import java.util.Scanner;

public class Keluarga {
    public int no_kk=1000;
    public Subjek[] daftar = new Subjek[10];
    public int jmlKTP=0;
    public void AddSubjek(Subjek ayah, Subjek ibu, Subjek anak) {
        this.daftar[jmlKTP] = ayah;
        jmlKTP++;
        this.daftar[jmlKTP] = ibu;
        jmlKTP++;
        this.daftar[jmlKTP] = anak;
        jmlKTP++;
    }
    public void displayKK() {
        int i;
        System.out.println("NO KK : "+no_kk);
        System.out.println("Daftar Anggota Keluarga : ");
        for (i = 0; i < jmlKTP; i++) {
            System.out.println("No||\tNama Lengkap ||\tNIK \t ||\tJenis Kelamin ||\tTempat/Tgl Lahir ||\tAgama ||\tKewarganegaraan||");
            System.out.println(i+1 + ".||\t"+daftar[i].nama+"\t||" + daftar[i].nik+"||\t"+daftar[i].jk+
                    "\t||\t"+daftar[i].ttl+"||\t"+daftar[i].agama+"||\t"+daftar[i].kewarganegaraan+"||");
        }
    }
    public void inputKK(Subjek ayah, Subjek ibu, Subjek anak){
        int menu;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println();
            System.out.println("\tMenu Inputan");
            System.out.println("\t1. Input Data Kepala Keluarga");
            System.out.println("\t2. Input Data Ibu");
            System.out.println("\t3. Input Data Anak");
            System.out.println("\t4. Keluar");
            System.out.print("\tPilih Menu : ");
            no_kk++;
            menu = input.nextInt();
            switch (menu) {
                case 1 -> {
                    int jum_ayah = 0;
                    ayah.inputData();
                    jum_ayah++;
                }
                case 2 -> {
                    int jum_ibu = 0;
                    ibu.inputData();
                    jum_ibu++;
                }
                case 3 -> {
                    int jum_anak = 0;
                    anak.inputData();
                    jum_anak++;
                }
                case 4 -> {
                    System.out.println("Anda Telah Keluar");
                    System.out.println();
                }
                default -> System.out.println("Menu Tidak Tersedia");
            }
        }while (menu!=4);
    }
}
