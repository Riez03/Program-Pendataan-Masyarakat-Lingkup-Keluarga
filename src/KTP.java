public class KTP{
    public String nama,ttl,alamat,nik,jk,agama,pendidikan;
    public String kerja,status,kewarganegaraan;
    public void cetakKTP(){
        System.out.println("NIK              : "+nik);
        System.out.println("Nama             : "+nama);
        System.out.println("Tempat/tgl lahir : "+ttl);
        System.out.println("Alamat           : "+alamat);
        System.out.println("Agama            : "+agama);
        System.out.println("Pekerjaan        : "+kerja);
        System.out.println("Kewarganegaraan  : "+kewarganegaraan);
    }
    public void outputKTP(Subjek ayah, Subjek ibu, Subjek anak){
        if(ayah==null & ibu==null & anak==null){
            System.out.println("Data KTP Masih Kosong");
        }else {
            System.out.println("Data KTP Ayah :");
            ayah.cetakKTP();
            System.out.println();
            System.out.println("Data KTP Ibu :");
            ibu.cetakKTP();
            System.out.println();
            System.out.println("Data KTP Anak :");
            anak.cetakKTP();
            System.out.println();
        }
    }
}
