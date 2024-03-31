public class Main {
    //Classe Main, chama a classe conta
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Luan", "Poupança");// Criação do obj do tipo poupança
        c1.Saldo();
        c1.Depositar(122.50);
        c1.Saldo();
        c1.Mensalidade();
        c1.Saldo();
        c1.Sacar(20);
        c1.Saldo();
        c1.FecharConta();
        System.out.println("----------------------------------------------------------------------------");
        Conta c2 = new Conta("Gilberto","Corrente");// criação do obj do tipo corrente
        c2.Saldo();
        c2.Depositar(526.33);
        c2.Saldo();
        c2.Mensalidade();
        c2.Saldo();
        c2.Sacar(526.33);
        c2.FecharConta();

    }
}
