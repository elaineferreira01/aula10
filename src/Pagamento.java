public class Pagamento {
    private TipoPagamento tipoPagamento; 

    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public void imprimiIformacoes(){
        System.out.println(this.tipoPagamento.toString());
       
    }
    }