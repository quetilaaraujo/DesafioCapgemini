import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesafioAnagramas {

        public static void main(String[] args)
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Digite o texto: ");
            String str = myScanner.nextLine();
            int n = str.length();
            List<List<Integer>> listaPare = new ArrayList<>();

            //For para verificar letra po letra se é um anagrama
            for (int i = 0; i < n; i++){
                List<Integer> par = findAnagrams(str,str.substring(i,i+1));
                if (!listaPare.contains(par) && par.size() == 2){
                    listaPare.add(par);
                }

            }

            //For para verificar as combinações da string digitada com ela mesma e achar anagramas
            for (int i = 0; i <= n; i++){

                List<Integer> par = findAnagrams(str,str.substring(0,i));
                if (!listaPare.contains(par) && par.size() == 2){
                    listaPare.add(par);
                }



            }
            System.out.println( "Total de Anagramas : " +listaPare.size());

        }

        //Função para verificar se uma string é anagrama da outra
        static public List<Integer> findAnagrams(String s, String p) {
            int sn = s.length();
            int pn = p.length();
            List<Integer> res = new ArrayList<>();
            if (sn<=0 || pn<=0) return res;

            int[] pArr = new int[26];
            for (int i = 0; i < pn; i ++)
            {
                char c = p.charAt(i);
                pArr[(int)(c-'a')] ++;
            }

            int[] sArr = new int[26];
            for (int i = 0; i < sn; i ++)
            {
                char c = s.charAt(i);
                sArr[(int)(c-'a')] ++;
                if (i>=pn)
                {
                    char c2 = s.charAt(i-pn);
                    sArr[(int)(c2-'a')] --;
                }

                if (Arrays.equals(pArr,sArr))
                {
                    res.add(i-pn+1);
                }
            }

            return res;
        }


    }
