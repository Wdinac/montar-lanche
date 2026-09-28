public class QueijoDecorator extends SanduicheDecorator {

    public QueijoDecorator(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Queijo";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 3.00;
    }
}