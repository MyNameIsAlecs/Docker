import com.github.gerardfp.NanoClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Introduce la tarea:");

            String tarea = scanner.nextLine();

           NanoClient.fetch("http://miserver:8001/add?"+tarea);


            System.out.println("Lista de tareas");


            String response = NanoClient.fetch("http://miserver:8001/get");

            System.out.println(response);


        }
    }
}
