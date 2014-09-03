package programação.ii.pkg01;
public class Calculadora {
 double a;
 double b;
 
 void atribuirA(double valor){
     a = valor;
 }
    void atribuirB (double valor){
        b = valor;
    }
    double somar ()
    {
        return a+b;
    }
    double sub (){
        return a-b;
    }
            double multi(){
                return a*b;
            }
            double div (){
                return a/b;
            }
}
