package FtthTests;

public enum Kullanici {

    GENELKULLANICI("50295036", "3aedba67Poyt2Ue");


    private String ad;
    private String sifre;

    public String getAd() {
        return ad;
    }

    public String getSifre() {
        return sifre;
    }

    Kullanici(String ad, String sifre) {
        this.ad = ad;
        this.sifre = sifre;
    }

}
