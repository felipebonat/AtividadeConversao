import java.util.Scanner;
public class ConversaoDeTemperatura2 {
    public static void main(String[] args) {
        ConversaoDeTemperatura conversao = new ConversaoDeTemperatura();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus celsius: ");
        conversao.celsius = entrada.nextFloat();

        System.out.print("Para qual deseja converter(Fahrenheit = F ou Kelvin = K) ? ");
        conversao.conversao = entrada.next().charAt(0);

        conversao.conversaoFeK();

        entrada.close();
    }
}
