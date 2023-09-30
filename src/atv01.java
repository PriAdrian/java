import java.util.Scanner;

public class atv01 {
    public static void main(String[] args) {
        Scanner receberSenha = new Scanner(System.in);
        int senha;

        do {
            System.out.println("digite sua senha");
            senha = receberSenha.nextInt();
            if(senha != 123){
                System.out.println("senha errada");
            }
        } while (senha != 123);
        System.out.println("senha correta");

    }}