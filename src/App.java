public class App {
    public static void main(String[] args) throws Exception {

   TipoPagamento tp = new TipoPagamento();
   Pagamento p01 = new Pagamento();

   tp.setValor(100);
 System.out.println(tp.credito());
    }
}
