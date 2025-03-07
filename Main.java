public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria("12345-6", "Alice");
        ContaBancaria banco = new ContaBancaria("PicPay", "PicPay");


        conta1.exibirSaldo();

        conta1.depositar(500);

        conta1.exibirSaldo();

        conta1.sacar(200);

        conta1.exibirSaldo();

        conta1.transferir(banco, 150);


        conta1.exibirSaldo();

    }
}
