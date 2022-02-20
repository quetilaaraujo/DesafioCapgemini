import java.util.Scanner;

public class DesafioEscada {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus da escada");

        //Pegando a entrada da quantidade de degraus
        Integer numDegraus = myScanner.nextInt();
        System.out.println("O numero de degraus foi: "+ numDegraus);

        String[] arrayString = new String[numDegraus];

        //For para preencher a string com espaço em branco
        for (int i = 0; i < numDegraus; i++){
           arrayString[i] = " ";
        }

        //For preenchendo o array de trás para frente e imprimindo
        for (int i = 0; i < numDegraus; i++){
            arrayString[numDegraus - (i+1)] = "*";
           printArrayEscada(arrayString);
        }


    }
    //Função que imprime todas as posiçoes de um array sem pular linha e no final ele pula uma linha
    public static void printArrayEscada(String[] arrayToPrint) {

        for (int i = 0; i < arrayToPrint.length; i++){
            System.out.print(arrayToPrint[i]);
        }
        System.out.println();


    }


}
