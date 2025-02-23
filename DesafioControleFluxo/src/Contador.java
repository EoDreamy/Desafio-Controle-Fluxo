import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int primeiroParametro = scan.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int segundoParametro = scan.nextInt();

        try{
            Contar(primeiroParametro, segundoParametro);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro. ");
        }
    }
    static void Contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }
        int contador = segundoParametro - primeiroParametro;
        for(int i = 1; i <= contador; i++){
            System.out.println(i);
        }
    }
}
