import java.util.Scanner;

public class TesteEstagio{
    
    public static boolean testarFibonacci(int numero){
        
        int anterior = 0;
        int atual = 0;

        System.out.print("Sequencia: ");
        for(int i = 0; i < numero;i++){
            if(i == 1){
                atual = 1;
                anterior = 0;
                System.out.print(atual+", ");
                if(atual == numero){
                    return true;
                }
            }else if(i == 0){
                System.out.print("[" + atual + ", ");
            }else{
                atual += anterior;
                anterior = atual - anterior;
                if(atual == numero){
                    System.out.print(atual+"]");
                    return true;
                }else if(atual > numero){
                    return false;
                }else{
                    System.out.print(atual + ", ");
                }
            }
        }
        return false;
    }
    public static int testarString(char[] palavra){
        
        int cont = 0;
        
        for(int i = 0; i < palavra.length; i++){
            if(palavra[i] == 'a'){
                cont++;
            }
        }
        return cont;
    }
    public static int somaGeral(){
            int soma = 0;
            int indice = 12;
            int k = 1;
            while(k<indice){
                k+=1;
                soma = soma + k;
            // System.out.println("Soma atual: " + soma);
            }
        return soma;
    }
    public static void main(String Args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o numero para verificar se ele existe na sequencia de fibonacci: ");
        int numFibo = Integer.parseInt(scan.nextLine());
        System.out.println(" Fibonacci: " + testarFibonacci(numFibo));
        System.out.println();
        System.out.print("Digite a palavra para conferir quantas vezes a letra 'a' aparece nela: ");
        String palavra = scan.nextLine();
        char[] palavraChar = palavra.toCharArray();
        System.out.println("Qtd de 'a' na palavra " + palavra + ": " + testarString(palavraChar));
        System.out.println("\nResultado da soma geral: " + somaGeral());
        scan.close();
    }
}
/*
   Questão número 4:
 * a) 1,3,5,7,9                          explicação: a sequência soma 2 a cada número iterado.
 * b) 2,4,8,16,32,64,128                 explicação: a sequência continua com o último número multiplicado por 2.   
 * c) 0,1,4,9,16,25,36,49                explicação: a sequência se dá pra todos os números elevados por 2, sendo do 1 ao 7.
 * d) 4,16,36,64,100                     explicação: a sequência se dá por somente números pares elevados a 2.
 * e) 1,1,2,3,5,8,13                     explicação: é a sequência de fibonacci onde o número seguinte será a soma do anterior - 1.
 * f) 2,10,12,16,17,18,19,200            explicação: a sequência é o próximo número que começa com a letra D, sendo o próximo após o 19, o 200.
 * 
 *  Questão número 5:
 *  Resposta: Primeiro ligaria 1 interruptor e veria qual lâmpada foi acesa, depois voltaria e ligaria 
 *  outro interruptor já que eu já sei qual é o que eu liguei anteriormente, e por eliminação o último
 *  interruptor seria o que manteve a lâmpada desligada.
 */