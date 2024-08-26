public class Vendedor extends Empregado{
    private double valorVenda;
    private double comissao;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double vencimentoBase, double imposto, double valorVenda, double comissao) {
        super(nome, endereco, telefone, codigoSetor, vencimentoBase, imposto);
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }

    public Vendedor(int codigoSetor, double vencimentoBase, double imposto, double valorVenda, double comissao) {
        super(codigoSetor, vencimentoBase, imposto);
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void calcularSalario() {
        double result = getValorVenda() * this.comissao;
        System.out.println("Salario vendedor: " + (result + getVencimentoBase()));
    }
}
