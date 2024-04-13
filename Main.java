import java.util.Scanner;

/*Faça um programa que calcule e imprima o sálario a ser transferido para um
funcionário.
Para realizar o calculo receba o valor bruto do salário e o adicional dos benefícios.
O salário a ser transferido é calculado da seguinte maneira:
Valor bruto do salário - percentual de imposto mediante a faixa salarial + adicional dos
benefícios, Para calcular o percentual de imposto segue as aliquotas:
-----De R$ 0.00 a R$ 1400.00 = 5.00%
-----De R$ 1400.00 a R$ 2800.00 = 10.00%
-----Maior que R$ 2800.00 = 15.00%
*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorSalarioBruto = scanner.nextDouble();
        double adicionalDosBeneficios = scanner.nextDouble();

    }
}