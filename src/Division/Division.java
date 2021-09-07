
package Division;

public class Division {
    double dividendo;
    double divisor;
    double resultado;
    public static void main(String[]args){
        Division op = new Division();
        op.numeros();
        op.dividir();
        op.imprimir();
    }
    public void numeros(){
        
        this.dividendo = 12;
        this.divisor = 6;
    }
    public void dividir(){
        resultado = dividendo/divisor;
    }
    public void imprimir(){
        System.out.println("El resultado de la division es: "+resultado);
    }
    
}
