import java.util.Scanner;
import java.util.regex.Pattern;

public class DesafioSenha {
    public static final Pattern textPatternUper = Pattern.compile("^(?=.*[A-Z]).+$");
    public static final Pattern textPatternLower = Pattern.compile("^(?=.*[a-z]).+$");
    public static final Pattern textPatternDigite = Pattern.compile("^(?=.*\\d).+$");
    public static void main (String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite a senha");
        final int minimo = 6;
        String teste = "!@#$%^&*()-+";
        boolean temMaiusculo = false;
        boolean temMinusculo = false;


        //Pegando a entrada da quantidade de caracteres
        String caracSenha = myScanner.nextLine();

        if (  caracSenha.length() < minimo) {
            System.out.println(minimo - caracSenha.length());
        } else if (!temLetraMaiuscula(caracSenha)){
            System.out.println(1);
        } else if (!temLetraMinuscula(caracSenha)){
            System.out.println(1);
        } else if (!temDigito(caracSenha)){
            System.out.println(1);
        } else if (!temCaractereEspecial(caracSenha)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
    //Função para ver se possui letra maiuscula

    static public boolean temLetraMaiuscula(String textToCheck) {
        return textPatternUper.matcher(textToCheck).matches();
    }

    //Função para ver se possui letra minuscula

    static public boolean temLetraMinuscula(String textToCheck) {
        return textPatternLower.matcher(textToCheck).matches();
    }
    //Função para ver se possui digito

    static public boolean temDigito(String textToCheck) {
        return textPatternDigite.matcher(textToCheck).matches();
    }
    //Função para ver se possui caracteres especiais

    static public boolean temCaractereEspecial(String textToCheck) {
        char[] charArray2 = new char[]{'!','@','#','$','%','^','&','*','(',')','-','+'};
        boolean resultado = false;

        for(char c: charArray2){
            if (textToCheck.contains(String.valueOf(c))){
                resultado = true;
            }
        }
        return resultado;

    }

}
