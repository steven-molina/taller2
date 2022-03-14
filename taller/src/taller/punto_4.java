package taller;

import java.util.Scanner;
public class punto_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int dias, peaje ;
       float kilometros, gasolina, prom_kilometro, pagos_estacion, gasolina_total, kilometro_total,
               gastos_totales, promedio_gasolina, valor_por_galon, gastos_estacion, peajes_total;
         System.out.println("¿cuantos dias duró el viaje?");
         dias = sc.nextInt();
         
         System.out.println("¿cuantos kilometros recorrio por dia?");
         kilometros = sc.nextFloat();
         
         System.out.println("¿cunatos galones de gasolina gastó?");
         gasolina = sc.nextFloat();
         
         System.out.println("¿valor del galon?");
         valor_por_galon = sc.nextFloat();
         
         System.out.println("¿cuanto pagó por el estacionamiento por dia?");
         pagos_estacion = sc.nextFloat();
         
         System.out.println("¿cuanto pagó en peaje por dia?");
         peaje = sc.nextInt();
         
         gastos_estacion=dias*pagos_estacion;
         
         gasolina_total=gasolina*valor_por_galon;
         
         peajes_total=peaje*dias;
         
         kilometro_total=kilometros*dias;
         promedio_gasolina=(gasolina/kilometro_total);
         
         gastos_totales= gasolina_total+gastos_estacion+peajes_total;
         
         System.out.println("el costto total del viaje fue :"+gastos_totales);
         System.out.println("el promedio de galones de gasolina por kilometros fue de:"+promedio_gasolina+" galon/kg");
       
       
    }
}
