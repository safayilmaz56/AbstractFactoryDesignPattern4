public class Araba {

    private Factory factory;
    private AbstractArabaLastigi abstractArabaLastigi;
    private AbstractArabaKasasi abstractArabaKasasi;

    public Araba(Factory factory) {
        this.factory = factory;
        abstractArabaKasasi = factory.kasaOlustur();
        abstractArabaLastigi = factory.lastikOlustur();
    }

    public void arabaOlustur(){
        abstractArabaKasasi.lastikTak(abstractArabaLastigi.lastikTuru());
        //abstractArabaLastigi.lastikTuru();
    }
}
