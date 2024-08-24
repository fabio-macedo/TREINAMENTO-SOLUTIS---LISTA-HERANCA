
public class Application {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Flavio", "Rua das almas", "88788596");
        Fornecedor pessoa2 = new Fornecedor("José", "Rua alameda", "91152345", 6000, 2500);
        Empregado empregado = new Empregado("Edmilson", "Rua Epitacio Pessoa", "98996523",555,5000, 0.15);
        Administrador adm = new Administrador("Juliano", "Rua Ambrósio Fagundes", "98415589", 1200, 5000, 0.20, 850);
        Operario operario1 = new Operario("Jorge", "Rua João Cancio", "98148570", 1514, 3500,0.1, 1000, 0.1);


        pessoa2.obterSaldo();

        empregado.calcularSalario();

        adm.calcularSalario();

        operario1.calcularSalario();


        }
    }
