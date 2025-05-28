package ar.edu.info.unlp.ejercicioDemo;

public class Main {
    public static void main(String[] args) {
        
    	SubteWayDirector director = new SubteWayDirector(new SandwichClasicoBuilder());

        Sandwich clasico = director.armarSandwich();
        System.out.println("Precio Sándwich Clásico: $" + clasico.calcularPrecio());

        director.setBuilder(new SandwichVegetarianoBuilder());
        Sandwich vegetariano = director.armarSandwich();
        System.out.println("Precio Sándwich Vegetariano: $" + vegetariano.calcularPrecio());

        director.setBuilder(new SandwichVeganoBuilder());
        Sandwich vegano = director.armarSandwich();
        System.out.println("Precio Sándwich Vegano: $" + vegano.calcularPrecio());

        director.setBuilder(new SandwichSinTaccBuilder());
        Sandwich sinTacc = director.armarSandwich();
        System.out.println("Precio Sándwich Sin TACC: $" + sinTacc.calcularPrecio());
    }
}

