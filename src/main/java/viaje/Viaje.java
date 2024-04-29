package viaje;


import java.util.List;

public class Viaje {
    List<Ubicacion> destinos;
    Modo modo;

    public List<Integer> calcularDemora(){
        return modo.calcularDemora(destinos);
    }
}
