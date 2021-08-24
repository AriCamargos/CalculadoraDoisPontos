package exercicio2;
public class Gerente {
    //atributo
    protected Ponto ponto1;
    protected Ponto ponto2;
    protected aInterface umaI;
   
    
    //método
    public void faca(){
        int x = this.umaI.pegueCoordenadaX(1);
        int y = this.umaI.pegueCoordenadaY(1);
        this.ponto1 = new Ponto(x,y);
        x = this.umaI.pegueCoordenadaX(2);
        y = this.umaI.pegueCoordenadaY(2);
        this.ponto2 = new Ponto(x,y);
        double distancia = this.ponto1.calculeDistancia(this.ponto2);
        this.umaI.mostreDistancia(distancia);
    }

    public Gerente() {
        this.umaI = new aInterface();
    }
    
}
