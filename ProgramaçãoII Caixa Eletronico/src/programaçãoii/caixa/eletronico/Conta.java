package programaçãoii.caixa.eletronico;

public class Conta {

    private String agencia, nomecor, numeroc;
    private Boolean ativa;
    private Double saldo;

    void abrirconta(String valor, String valor2, String valor3) {

        agencia = valor;
        nomecor = valor3;
        numeroc = valor2;
        saldo = 0.0;
        ativa = true;
    }

    Boolean sacar(Double valor) {
        Boolean retorno = false;

        if (ativa == true) {
            if (valor <= saldo) {
                saldo = saldo - valor;
                retorno = true;
            } else {
                retorno = false;
            }
        }
        return retorno;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomecor() {
        return nomecor;
    }

    public void setNomecor(String nomecor) {
        this.nomecor = nomecor;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

   
    
    Boolean depositar (Double valor){
    Boolean retorno = null;
    if (ativa == true)
    {
        saldo = saldo + valor;
        retorno = true;
    }else {
        retorno = false;
    }
    return retorno;
    }
    
    void fecharconta (){
        ativa = false;
    }
    Boolean retornarfecharconta (){
        return ativa;
    }
}
