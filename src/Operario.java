public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double vencimentoBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(int codigoSetor, double vencimentoBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, vencimentoBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = valorProducao*comissao;
    }

    @Override
    public void calcularSalario() {
        double result = (getVencimentoBase() + comissao);
        System.out.println("Salário final do operário = " + result);
    }
}
