public abstract class SanduicheDecorator implements Sanduiche {

    protected Sanduiche sanduiche;

    public SanduicheDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }
}