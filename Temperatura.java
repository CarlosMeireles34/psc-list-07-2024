import java.util.ArrayList;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> listaMeses = new ArrayList<String>();
    ArrayList<Double> temperaturas = new ArrayList<>();

    listaMeses.add("Janeiro");
    listaMeses.add("Fevereiro");
    listaMeses.add("Março");
    listaMeses.add("Abril");
    listaMeses.add("Maio");
    listaMeses.add("Junho");
    listaMeses.add("Julho");
    listaMeses.add("Agosto");
    listaMeses.add("Setembro");
    listaMeses.add("Outubro");
    listaMeses.add("Novembro");
    listaMeses.add("Dezembro");
    
    for (String mes : listaMeses) {
        System.out.print("Digite a temperatura média do mês " + mes +":");
        double temperatura = scanner.nextDouble();
        temperaturas.add(temperatura);




        System.out.println("Por favor insira as temperaturas de cada mês do ano:");
        double soma = 0;
        double[] temperaturas = new double[12];
        double i = 0;
        for(i = 0; i < temperaturas.length; i++){
            System.out.println("Por favor insira a temperatura" +(i + 1)+"do mês:");
        temperaturas = scanner.nextDouble();
        soma+=temperaturas[i];



        }


    }
}
