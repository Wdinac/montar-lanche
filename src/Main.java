public class Main {

    public static void main(String[] args) {

        // Sanduíche básico
        Sanduiche sanduiche = new SanduicheBase("Frango", 15.00);

        // Adicionando queijo
        sanduiche = new QueijoDecorator(sanduiche);

        // Adicionando bacon
        sanduiche = new BaconDecorator(sanduiche);

        // Adicionando molho especial
        sanduiche = new MolhoEspecialDecorator(sanduiche);

        // Exibindo resultado
        System.out.println("Descrição: " + sanduiche.getDescricao());
        System.out.printf("Preço: R$ %.2f%n", sanduiche.getPreco());
    }
}