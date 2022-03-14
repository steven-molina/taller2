package taller;


public class punto_2 {
    public static void main(String[] args){
        int num_1, num_2, num_3;
        float suma, promedio, producto, cociente, modulo;
        
        num_1 = 20;
        num_2 = 15;
        num_3 = 10;
        
        suma = num_1 + num_2 + num_3;
        promedio = suma / 3;
        producto = num_1 * num_2 * num_3;
        cociente = (num_1 / num_2) / num_3;
        modulo = (num_1 % num_2) % num_3;
        
        System.out.println("la suma de los 3 numeros es: "+suma);
        System.out.println("el promedio de los 3 numero es: "+promedio);
        System.out.println("el producto de los 3 numero es: "+producto);
        System.out.println("el cociente de los 3 numeros es: "+cociente);
        System.out.println("el modulo de los 3 numeros es: "+modulo);
    }
}
