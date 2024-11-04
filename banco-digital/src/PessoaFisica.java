public class PessoaFisica extends Conta{
    
    private String nome;
    private String cpf;
    private String telefone;

    public PessoaFisica() {}

    public PessoaFisica(int id, double saldo, String nome, String cpf, String telefone) {
        super(id, saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    @Override
    public void depositar(double valor) {

        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("o valor depositado deve ser maior do que zero");
        }
        
    }
    @Override
    public void sacar(double valor) {
        if (getSaldo() > 0) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Você não possui saldo suficiente");
        }
    }

    

    

}
