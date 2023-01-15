public class FordFocusFactory extends Factory{
    @Override
    public AbstractArabaKasasi kasaOlustur() {
        return new FordFocus();
    }

    @Override
    public AbstractArabaLastigi lastikOlustur() {
        return new Lassa();
    }
}
