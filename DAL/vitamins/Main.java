import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service(scanner.next());
        scanner.close();

        service.start();
    }
}
