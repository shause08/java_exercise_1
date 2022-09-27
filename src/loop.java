import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        System.out.println("bienvenue");
        var scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"quit".equals(input)){
            if("fibo".equals(input)){
                System.out.println("entrez un nombre: ");
                int n = scanner.nextInt();
                int res = Fibo.fibo(n);
                System.out.println(res);
                input = scanner.nextLine();
            }
            else{
                System.out.println("unknown command");
                input = scanner.nextLine();
            }
        }
    }
}
