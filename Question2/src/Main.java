import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fun = 0;
        int upset = 0;
        System.out.println("Write a message with a Emotion: ");
        System.out.println("You can use :-) or :-(");
        String message = sc.nextLine();
        for(int i = 0; i < message.length(); i++){
            if(message.charAt(i) == ':'){ //Compara se o caractere é igual a ":"
                if(i <= (message.length() - 2)){ //Isso é para evitar indexOutOfRange
                    if(message.charAt(i + 1) == '-'){ //Verifica se o caractere seguinte é igual a "-"
                        if(message.charAt(i + 2) == ')'){//Se o caractere depois do "-" foi ")" então significa que o conjunto de caracteres verificado é igual a ":-)"
                            fun++;
                        }
                        else if(message.charAt(i + 2) == '('){//Se o caractere depois do "-" foi ")" então significa que o conjunto de caracteres verificado é igual a ":-("
                            upset++;
                        }
                    }
                }
            }
        }
        if(fun > upset){
            System.out.println("fun");
        } else if (fun < upset) {
            System.out.println("upset");
        }else {
            System.out.println("neutral");
        }
    }
}