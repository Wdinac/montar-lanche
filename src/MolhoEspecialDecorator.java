public class MolhoEspecialDecorator extends SanduicheDecorator {

    public MolhoEspecialDecorator(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String getDescricao() {
        return sanduiche.getDescricao() + ", Molho Especial";
    }

    @Override
    public double getPreco() {
        return sanduiche.getPreco() + 1.50;
    }
}