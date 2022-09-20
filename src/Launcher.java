import java.util.Scanner;

public class Launcher {
    public static void main(String[] args){
        System.out.println("bienvenue");
        var scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        if(!"quit".equals(input)){
            System.out.println("unknown command");
        }
    }
}
