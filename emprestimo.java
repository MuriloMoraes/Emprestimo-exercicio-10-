import java.util.Scanner;
public class exercicio10
{
    public static void main(String[] args){
    double bruto,desconto;
    System.out.println(" Digite o valor do seu salario bruto e o valor do seu desconto: ");
    bruto = new Scanner(System.in).nextDouble();
    desconto = new Scanner(System.in).nextDouble();
        if(desconto<bruto){
            double liquido = bruto - desconto;
            System.out.println(" Digite o valor do seu emprestimo: ");
            double emprestimo = new Scanner(System.in).nextDouble();
                if(emprestimo>liquido*0.3){
                    System.out.println("voce nao pode ter o emprestimo ");
                }
                else{
                    System.out.println( " voce pode ter o emprestimo ");
                }
        
        
        }
}
}
