
package programaçãoii.caixa.eletronico;

/**
 *
 * @author big
 */
public class Cliente {
String cpf,nome,endereco,data;
Boolean negativadospc,negativadoserasa;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Boolean getNegativadospc() {
        return negativadospc;
    }

    public void setNegativadospc(Boolean negativadospc) {
        this.negativadospc = negativadospc;
    }

    public Boolean getNegativadoserasa() {
        return negativadoserasa;
    }

    public void setNegativadoserasa(Boolean negativadoserasa) {
        this.negativadoserasa = negativadoserasa;
    }
}
