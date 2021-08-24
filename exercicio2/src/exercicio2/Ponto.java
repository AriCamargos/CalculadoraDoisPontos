package exercicio2;
public class Ponto{
    
    //atributos
    protected int x;
    protected int y;
    
    //métodos
    public double calculeDistancia(Ponto p){
      
        double distanciaXY = Math.sqrt(Math.pow(this.x - p.pegueCoordenadaX(),2) + Math.pow(p.pegueCoordenadaY()- this.y, 2)) ;
        return distanciaXY;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    

    public int pegueCoordenadaX() {
       return this.x; //retorna x
    }

    public int pegueCoordenadaY() {
        return this.y; 
    }

    

}
