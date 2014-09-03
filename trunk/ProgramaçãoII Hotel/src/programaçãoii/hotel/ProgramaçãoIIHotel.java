
package programaçãoii.hotel;
import javax.swing.JOptionPane;
public class ProgramaçãoIIHotel {

    public static void main(String[] args) {
        String nome,loc,dia;
        Float diaria,total;
        Integer telefone,ano;
        Hotel h = new Hotel ();
        
        nome = JOptionPane.showInputDialog("Informe o nome do Hotel");
        h.atribuirnome(nome);
        
        loc = JOptionPane.showInputDialog("Informe o endereço do Hotel");
        h.atribuirloc(loc);
        
        diaria = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da diaria do Hotel"));
        h.atribuirvalor(diaria);
        
        telefone = Integer.parseInt(JOptionPane.showInputDialog("Informe o telefone do Hotel"));
        h.atribuirtelefone(telefone);
        
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano que o hotel foi fundado"));
        h.atribuirano(ano);
        
        JOptionPane.showMessageDialog(null,"   Informações do hotel:   \n"+"Nome do hotel: "+ nome +"\n Endereço do hotel: "+loc+"\n Valor da diaria: "+diaria+" R$"+"\n Telefone do hotel: "+telefone+"\n Ano de fundação: "+ ano);
        
        dia = JOptionPane.showInputDialog("Informe quantos dias pretende ficar");
        total=h.preco(dia);
        
        JOptionPane.showMessageDialog(null,"          preço total das diarias:         \n Em dolares: "+(total * 2) + "\n Em euro: "+ (total * 3));
    }
}
