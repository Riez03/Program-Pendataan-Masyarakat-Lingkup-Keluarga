public class Ayah extends KTP implements Pekerjaan{
    public String gaji;

    @Override
    public void hitungGaji() {
        if(gaji==""){
            System.out.println("Gaji : 0");
        }else {
            System.out.println("Gaji dari "+kerja+" : "+gaji);
        }
    }

    @Override
    public void PendapatanKeluarga() {

    }

}
