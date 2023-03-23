package aula2303;

public class Cilindro {
    private double raioBase;
    private double altura;

    public Cilindro(double raioBase, double altura){
        this.raioBase = raioBase;
        this.altura = altura;
    }

    public double getRaioBase(){
        return this.raioBase;
    }

    public double setRaioBase( double raioBase){
        return this.raioBase;
    }
    public double getAltura(){
        return this.altura;
    }
    public double setAltura(double altura){
        return this.altura;
    }

}




----------------------------------------------------------------------------



package aula2303;

public class testeCilindro {
    public static void main(String[] args) {
        Cilindro cilindro1 = new Cilindro(2,6);  // base 2, altura 6 ---- 2 por 6
        double raioBase = cilindro1.getRaioBase();
        double altura = cilindro1.getAltura();
        System.out.println("Raio base do cilindro " + raioBase);
        System.out.println("Altura do cilindro " + altura);
    }
}
