package ArmasMagias;

public class Relampago {
    String nome;
    float poder;
    float custoMana;

           public Relampago(String nome, float poder, float custoMana){
            this.nome = nome;
            this.poder = poder;
            this.custoMana = custoMana;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPoder() {
        return poder;
    }

    public void setPoder(float poder) {
        this.poder = poder;
    }

    public float getCustoMana() {
        return custoMana;
    }

    public void setCustoMana(float custoMana) {
        this.custoMana = custoMana;
    }
}
