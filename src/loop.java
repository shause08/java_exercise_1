import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        System.out.println("bienvenue");
        var scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        while(!"quit".equals(input)){
            System.out.println("unknown command");
            input = scanner.nextLine();
        }
    }
}
