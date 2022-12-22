public class Keluarga {
    private Ayah[] daftar1 = new Ayah[5];
    private Ibu[] daftar2 = new Ibu[5];
    private Anak[] daftar3 = new Anak[5];
    private KTP[] ktp = new KTP[5];
    public KTP head,tail;
    Keluarga(){
        head=null;
        tail=null;
    }
    public String no_kk;
    private int jmlAnak = 0;
    private int jml = 0;
    public void setAyahIbu(Ayah ayah, Ibu ibu) {
        this.daftar1[jml] = ayah;
        this.daftar2[jml] = ibu;
    }
    public void addAnak(Anak anak) {
        this.daftar3[jmlAnggota] = anak;
        this.jmlAnak++;
    }
    private int jmlAnggota =jmlAnak+2;
    public void daftarAnggota() {
        System.out.println("Anggota Keluarga: ");
        System.out.println(1+"."+daftar1[jml].nik+"|"+daftar1[jml].nama+"|"+daftar1[jml].ttl+"|"+daftar1[jml].kerja);
        System.out.println(2+"."+daftar2[jml].nik+"|"+daftar2[jml].nama+"|"+daftar1[jml].ttl+"|"+daftar2[jml].kerja);
        for (int i=0;i<jmlAnak;i++)
        {
            System.out.println(i+2+"."+daftar3[i].nik+"|"+daftar3[jml].nama+"|"+daftar1[jml].ttl+"|"+daftar3[i].kerja);
        }
    }

}
