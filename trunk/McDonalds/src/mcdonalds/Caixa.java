package mcdonalds;

public class Caixa {

    private String Nome;
    private String Data_Nasc;
    private String Cpf;
    private String Horario;
    
    public double Salario_Caixa(double Salario_Caixa){
    
        Salario_Caixa = 1.200 ;
        return Salario_Caixa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getData_Nasc() {
        return Data_Nasc;
    }

    public void setData_Nasc(String Data_Nasc) {
        this.Data_Nasc = Data_Nasc;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }
}
