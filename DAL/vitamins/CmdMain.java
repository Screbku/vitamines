import java.io.IOException;
import java.util.Scanner;

public class CmdMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
       
        System.out.println(service.print(service.start(scanner.nextLine())));
        scanner.close();
    }
}
