public class Main {
    public static void main(String[] args) {
       ContaBanco c1 = new ContaBanco("Alex");

       c1.abrirConta();
       c1.depositar(500);
       c1.extrato();
       c1.sacar(300);
       c1.pagarMensal();
       c1.extrato();
    }
}
