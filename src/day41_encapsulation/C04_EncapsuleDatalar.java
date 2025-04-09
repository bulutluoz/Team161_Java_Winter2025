package day41_encapsulation;



public class C04_EncapsuleDatalar {

    private int satisTutari;
    // write ==> evet
    // read ==> hayir

    private int toplamSatisTutari;
    // write ==> hayir
    // read ==> evet


    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }
}
