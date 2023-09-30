
public class Main {
    public static void main(String[] args) {
        String[] listaProfessores = {"alana", "Thiago", "Samanta", "Alexia", "Odirlei"};
        for (int contador = 0; contador < listaProfessores.length; contador++) {
            System.out.println("0 indice atual é" + contador);
            if (contador == 0) {
                System.out.println("Ö numero de indice do(a) professor(a)" + listaProfessores[contador] + " é zero");
            } else if (contador % 2 == 0) {
                System.out.println("O numero do indice do(a) professor(a)" + listaProfessores[contador] + "e par");
            } else {
                System.out.println("O numero do indice do(a) professor(a)" + listaProfessores[contador] + "e impar");
            }
        }
    }
}