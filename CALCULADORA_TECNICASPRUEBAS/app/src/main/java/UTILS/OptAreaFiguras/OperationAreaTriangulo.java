package UTILS.OptAreaFiguras;

import MODEL.AreaFiguras.AreaCirculo;
import MODEL.AreaFiguras.AreaTriangulo;

public class OperationAreaTriangulo {

    AreaTriangulo areaTriangulo;
    public OperationAreaTriangulo(AreaTriangulo areaTriangulo){this.areaTriangulo = areaTriangulo;}

    public double OAreaTriangulo(){return 0.5 * areaTriangulo.getBase() * areaTriangulo.getHeight();}
}
