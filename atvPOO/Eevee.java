public class Eevee{
    private String tipo; 
    private int altura, HP; 
    private double peso;
    public Eevee(String tipo, int altura, int hP, double peso) {
        this.tipo = tipo;
        this.altura = altura;
        HP = hP;
        this.peso = peso;
    }
    public String ataque() {
        return "Ataque rápido";
    }
    public String defesa() { 
        return "Desvio";
    }
    public String especial(){ 
        return "Tri-ataque";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void imprimir(){
        System.out.println("tipo: " + tipo + ", altura: " + altura + ", hp: " + HP + ", peso: " + peso);
    }
}