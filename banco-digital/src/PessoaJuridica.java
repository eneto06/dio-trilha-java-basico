public class PessoaJuridica extends Conta{
    
    private String razaoSocial;
    private String cnpj;
    private String telefone;

    public PessoaJuridica() {}

    public PessoaJuridica(String razaoSocial, String cnpj, String telefone, int id, double saldo) {
        super(id, saldo);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void depositar(double valor) {
            if(valor > 0) {
                setSaldo(getSaldo() + valor);
            } else {
                System.out.println("O valor de depósito deve ser maior do que zero");
            }        
        }

    @Override
    public void sacar(double valor) {
            if (getSaldo() > valor) {
                setSaldo(getSaldo() - valor);
            }else {
                System.out.println("saldo insuficiente");
            }        
    }

    






    
}
