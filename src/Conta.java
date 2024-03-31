//Criação da classe conta 
public class Conta {
    private String titular; //titular da conta
    private double saldo = 0; //saldo da conta
    private boolean estado; // estado de funcionamento; true = aberto, false = fechado
    private String tipo; //tipo: poupança ou corrente

    //Construtor
    public Conta (String titular, String tipo){
        this.titular = titular;
        this.tipo = tipo;
        this.estado = true; //valor de inicialização da conta sendo o padrão aberta
        if(tipo.equalsIgnoreCase("corrente")){
            this.saldo = 10.00;
        }else if(tipo.equalsIgnoreCase("poupança")){
            this.saldo = 20.00;
        }
    }
    // Função para Despositar valores na conta
    public void Depositar(double valor){
        if(estado){
            saldo += valor;
            System.out.println("Depósito de: R$"+valor+"reais realizado com sucesso");
        }else{
            System.out.println("A conta está fechada! Não é possível realizar o depósito!");
        }        
    }
    //Função para Sacar valores da conta
    public void Sacar(double valor){
        if(estado){
            if(saldo>=valor){
                saldo-=valor;
                System.out.println("Saque de valor R$: "+valor +"reais realizado com sucesso");
            }else{
                System.out.println("Saldo insuficiente para efetuar o saque");
            }
        }else{
            System.out.println("Conta Fechada!! Não é possível realizar saques");
        }
    }
    //Função para Encerrar funcionalidade da Conta, com condição que o saldo seja nulo
    public void FecharConta(){
        if (saldo == 0) {
            estado =false;
            System.out.println("Operação realizada com sucesso! Conta de "+ titular+" foi fechada");
        }else{
            System.out.println("Saldo diferente de 0. Não é possível fechar a conta");
        }
    }
    //Função para cobrar a taxa de mensalidade referente ao tipo de conta
    public void Mensalidade(){
        if(estado){
            if (tipo.equalsIgnoreCase("poupança")) {
                saldo-=5;
            }else if(tipo.equalsIgnoreCase("corrente")){
                saldo-=10;
            }
        }else{
            System.out.println("Conta Fechada!! Operação Indisponível");
        }
    }
    //Função para mostrar o Saldo da Conta
    public void Saldo(){
        System.out.println("O saldo da Conta de: "+ titular + " é de: R$" + saldo + "reais");
    }
}