public class ConversaoDeTemperatura {
    float celsius;
    char conversao;
    float graus;

    float conversaoFeK(){
        switch (conversao){
        case 'F':
            graus = (celsius * 9/5)  + 32;
            System.out.println("A conversão foi de " + graus + " Fahrenheit.");
            break;
        case 'K':
            graus = celsius + 271.15f;
            System.out.println("A conversão foi de " + graus + " Kelvin.");
            break;
        }
        return graus;
    }
}
