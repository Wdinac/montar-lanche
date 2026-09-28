public class SanduicheBase implements Sanduiche {

    private String tipo;
    private double preco;

    public SanduicheBase(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public String getDescricao() {
        return tipo;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}