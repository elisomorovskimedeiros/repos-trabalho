
import java.util.Scanner;


public class Trabalho {
	public static void main (String[] args) {
        String[] array;
        array = gerador();
        System.out.print("Os elementos do array são os seguintes:\n");
        for (int i=0;i<array.length;i++) {
            if (i==0)
            System.out.print("'");
            System.out.print(array[i]);
            if ((array.length-1)==i)
                System.out.print(".'");
            else
                System.out.print(", ");
        }
         
        int a = lerInteiro("Qual deles você quer alterar?\n");
        array[a-1] = (captura("Informe a alteração na posição "+(a)+"\n"));
         
        for (int i=0;i<array.length;i++) {
            if (i==0)
            System.out.print("'");
            System.out.print(array[i]);
            if ((array.length-1)==i)
                System.out.print(".'");
            else
                System.out.print(", ");
        }
        ///alteração
    }
     
    static String[] gerador () {
        String[] array = new String[10];
        for (int i=0;i<array.length;i++) {
            array[i] = "elemento "+(i+1);
        }
        return array;
    }
 
static int  lerInteiro (String mensagem){
    int a;
    System.out.print(mensagem);
    Scanner in = new Scanner (System.in);
    a = in.nextInt();
        return a;
     
     
}
static String captura(String mensagem) {
        String retorno;
        System.out.print(mensagem);
        Scanner in = new Scanner (System.in);
        retorno = in.next();
        return retorno;
    }

//Alteração para o git
}
