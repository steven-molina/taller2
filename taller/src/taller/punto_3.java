package taller;


public class punto_3 {
    public static void main(String[] args){
        float cost_fijo, por_iva, por_util, precio_final;
        String producto;
        
        producto = "camisa";
        cost_fijo = 1579419.00f;
        por_iva = 19;
        por_util = 40;
        
        precio_final = ((cost_fijo*por_iva)/100)+((cost_fijo*por_util)/100)+ cost_fijo;
         
        System.out.println("el precio final del producto "+producto+" es: "+precio_final);
        
    }
}
