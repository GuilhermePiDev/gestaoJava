import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner (System.in);

        Dados dados = new Dados(8000, 47000, 8000, 1000, 55, 65, 80, 0, 590, 630, 9, 1, 25, 3, "TipoCarga", 5300);
        dados.contas();
    }
}
