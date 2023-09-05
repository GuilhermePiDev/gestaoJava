import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sca = new Scanner (System.in);

        Dados caminhao1 = new Dados(8000.0, 47000.0, 8000.0, 1000.0, 55.0, 65.0, 80.0, 0, 590.0, 630, 9, 1, 25, 3, "Feijão", 5300.0);
        
        caminhao1.contas();
    }
}
