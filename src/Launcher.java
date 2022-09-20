import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("bienvenue");
        var scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"quit".equals(input)){
            if("fibo".equals(input)){
                System.out.println("entrez un nombre: ");
                int n = scanner.nextInt();
                int res = Fibonacci.fibo(n);
                System.out.println(res);
                input = scanner.nextLine();
            }
            else if("freq".equals(input)){
                System.out.println("entrez un text: ");
                String text = scanner.nextLine();
                String resultat = Frequence.freq(text);
            }
            else{
                System.out.println("unknown command");
                input = scanner.nextLine();
            }
            input = scanner.nextLine();
        }
    }
}
