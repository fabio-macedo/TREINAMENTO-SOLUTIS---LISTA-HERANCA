public class Empregado extends Pessoa{
    private int codigoSetor;
    private double vencimentoBase;
    private double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double vencimentoBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.vencimentoBase = vencimentoBase;
        this.imposto = imposto;
    }

    public Empregado(int codigoSetor, double vencimentoBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.vencimentoBase = vencimentoBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getVencimentoBase() {
        return vencimentoBase;
    }

    public void setVencimentoBase(double vencimentoBase) {
        this.vencimentoBase = vencimentoBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public void calcularSalario(){
        double result = vencimentoBase - vencimentoBase * imposto;
        System.out.println("Salário final do Empregado: " + result);
    }
}
