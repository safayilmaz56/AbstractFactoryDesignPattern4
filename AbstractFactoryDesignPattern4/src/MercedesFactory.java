public class MercedesFactory extends Factory{
    @Override
    public AbstractArabaKasasi kasaOlustur() {
        return new MercedesE200();
    }

    @Override
    public AbstractArabaLastigi lastikOlustur() {
        return new Michelin();
    }
}
