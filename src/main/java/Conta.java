import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public abstract class Conta implements IConta {

    private static final int CONTA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroAgencia;
    protected double saldo;


    public Conta(){
        this.agencia = CONTA_PADRAO;
        this.numeroAgencia = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
