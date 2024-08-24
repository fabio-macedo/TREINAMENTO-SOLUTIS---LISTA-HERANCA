public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double vencimentoBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(int codigoSetor, double vencimentoBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, vencimentoBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public void calcularSalario() {
        double result = (getVencimentoBase() + ajudaDeCusto);
        System.out.println("Salário final Administrador = " + result);
    }
}
