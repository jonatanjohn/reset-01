package ArmasMagias;

public class FuriaDaNatureza {
    String nome;
    float intensidade;
    float custoFe;

    public FuriaDaNatureza(String nome, float intensidade, float custoFe) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.custoFe = custoFe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(float intensidade) {
        this.intensidade = intensidade;
    }

    public float getCustoFe() {
        return custoFe;
    }

    public void setCustoFe(float custoFe) {
        this.custoFe = custoFe;
    }
}
