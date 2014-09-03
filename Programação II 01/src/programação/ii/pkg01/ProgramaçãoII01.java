package programação.ii.pkg01;
import java.util.Scanner;
public class ProgramaçãoII01 {
    

    
    public static void main(String[] args) {
        double resultado= 0;
        Scanner ler = new Scanner (System.in);    
        Calculadora calc = new Calculadora();
    int y = 0;
    while ( y < 1){
     System.out.println ("1. Soma\n2. Subitração\n3. Multiplicação\n4. Subitração");
    int x = ler.nextInt();
    switch (x){
        case 1 : {
            calc.atribuirA(3);
    calc.atribuirB(8);
    resultado = calc.somar();
    y=1;    
    break;
        }
        case 2 : {
    calc.atribuirA(8);
    calc.atribuirB(3);
            resultado = calc.sub();
            y=1;
            break;
        }
        case 3 : {
    calc.atribuirA(3);
    calc.atribuirB(8);
            resultado = calc.multi();
            y=1;
            break;
        }
        case 4 : {
    calc.atribuirA(24);
    calc.atribuirB(8);
            resultado = calc.div();
            y=1;
            break;
        }
        default : {
       
            System.out.println("Por Favor digite um numero de 1 a 4");
                   
        }
    }
    }
    
    System.out.println (resultado);
    }
}
