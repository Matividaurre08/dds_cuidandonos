package viaje;

import java.util.ArrayList;
import java.util.List;

public class AvisarPuntoAPunto implements Modo{
    public List<Integer> calcularDemora(List<Ubicacion> destinos){

        List<Integer> tiempos = new ArrayList<Integer>();
        Integer tiempoAcumulado = 0;
        for(int i = 0; i < destinos.size(); i++){
            Ubicacion ubicacionActual = destinos.get(i);
            Ubicacion ubicacionDestino = destinos.get(i+1);

            tiempoAcumulado += APIadapter.calcularTiempo(ubicacionActual, ubicacionDestino);
        }
        tiempos.add(tiempoAcumulado);
        return tiempos;
    }
}
