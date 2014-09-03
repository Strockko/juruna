
package programaçãoii.caixa.eletronico;
import javax.swing.JOptionPane;
public class ProgramaçãoIICaixaEletronico {

    
    public static void main(String[] args) {
     Boolean deucerto;
        String nome, nomec, numeroc;
       Conta c = new Conta ();
       
       c.abrirconta("juruna", "0500", "853");
       
       JOptionPane.showInputDialog("Quanto voce quer depositar?");
       deucerto= c.depositar(JOptionPane.showInputDialog("Quanto voce quer depositar?"));
       
       if (deucerto == true){
           JOptionPane.showMessageDialog (null,"Deposito realizado com sucesso");
           
       }else {
           JOptionPane.showMessageDialog (null, "Deposito não realizado");
       }
       
       deucerto = c.sacar(5.0);
       if (deucerto == true)
       {
           JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
           
       }else {
           JOptionPane.showMessageDialog(null, "Saque não realizado");
       }
    }
}
