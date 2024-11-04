public abstract class Conta {
    
    private int id;
    private double saldo;

    public Conta(){}
    
    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
}
