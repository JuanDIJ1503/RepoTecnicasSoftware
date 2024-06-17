package UTILS.OptAreaFiguras;
import  MODEL.AreaFiguras.AreaCuadrado;
public class OperationAreaCuadrado {
    AreaCuadrado areaCuadrado;

    public OperationAreaCuadrado(AreaCuadrado areacuadrado){this.areaCuadrado=areacuadrado;
    }

    public double OAreaCuadrado(){return Math.pow(areaCuadrado.getLado(),2);}
}
