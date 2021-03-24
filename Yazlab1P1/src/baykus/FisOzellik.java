package baykus;

public class FisOzellik {
    
    private int fis_no;
    private String fis_isletme;
    private String fis_tarih;
    private String fis_urun;
    private String fis_urun_fiyat;
    private String fis_urun_kdv; 
    private String fis_toplam_fiyat;
    private String fis_toplam_kdv;  



    public FisOzellik(int fis_no, String fis_isletme, String fis_tarih, String fis_urun, String fis_urun_fiyat, String fis_urun_kdv, String fis_toplam_fiyat, String fis_toplam_kdv) {
        this.fis_no = fis_no;
        this.fis_isletme = fis_isletme;
        this.fis_tarih = fis_tarih;
        this.fis_urun = fis_urun;
        this.fis_urun_fiyat = fis_urun_fiyat;
        this.fis_urun_kdv = fis_urun_kdv;
        this.fis_toplam_fiyat = fis_toplam_fiyat;
        this.fis_toplam_kdv = fis_toplam_kdv;
    }
    
    
    public int getFis_no() {
        return fis_no;
    }

    public void setFis_no(int fis_no) {
        this.fis_no = fis_no;
    }

    public String getFis_isletme() {
        return fis_isletme;
    }

    public void setFis_isletme(String fis_isletme) {
        this.fis_isletme = fis_isletme;
    }

    public String getFis_tarih() {
        return fis_tarih;
    }

    public void setFis_tarih(String fis_tarih) {
        this.fis_tarih = fis_tarih;
    }

    public String getFis_urun() {
        return fis_urun;
    }

    public void setFis_urun(String fis_urun) {
        this.fis_urun = fis_urun;
    }

    public String getFis_urun_fiyat() {
        return fis_urun_fiyat;
    }

    public void setFis_urun_fiyat(String fis_urun_fiyat) {
        this.fis_urun_fiyat = fis_urun_fiyat;
    }

    public String getFis_urun_kdv() {
        return fis_urun_kdv;
    }

    public void setFis_urun_kdv(String fis_urun_kdv) {
        this.fis_urun_kdv = fis_urun_kdv;
    }

    public String getFis_toplam_fiyat() {
        return fis_toplam_fiyat;
    }

    public void setFis_toplam_fiyat(String fis_toplam_fiyat) {
        this.fis_toplam_fiyat = fis_toplam_fiyat;
    }

    public String getFis_toplam_kdv() {
        return fis_toplam_kdv;
    }

    public void setFis_toplam_kdv(String fis_toplam_kdv) {
        this.fis_toplam_kdv = fis_toplam_kdv;
    }
    
}
