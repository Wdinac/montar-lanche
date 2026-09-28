public class BaconDecorator extends SanduicheDecorator {

    public BaconDecorator(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Bacon";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 5.00;
    }
}