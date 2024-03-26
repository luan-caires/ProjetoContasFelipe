public class Conta {
    private String titular;
    private double saldo = 0;
    private boolean estado;
    private String tipo;

    public Conta (String titular, String tipo){
        this.titular = titular;
        this.tipo = tipo;
        this.estado = true;
        if(tipo.equalsIgnoreCase("corrente")){
            this.saldo = 10.00;
        }else if(tipo.equalsIgnoreCase("poupança")){
            this.saldo = 20.00;
        }
    }
    public void depositar(double valor){
        if(estado){
            saldo += valor;
        }else{
            System.out.println("A conta está fechada! Não é possível realizar o depósito!");
        }        
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
