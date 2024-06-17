package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MODEL.AreaFiguras.AreaCirculo;
import MODEL.AreaFiguras.AreaTriangulo;
import MODEL.AreasFiguras3D.AreaCilindro;
import UTILS.OptAreaFiguras.OperationAreaCirculo;
import UTILS.OptAreaFiguras.OperationAreaTriangulo;
import UTILS.OptAreasFiguras3D.OperationAreaCilindro;

public class TestAreaFiguras {
    @Test
    public void AreaCirculo(){
        //GIVEN
        AreaCirculo areaCirculo = new AreaCirculo();
        areaCirculo.setRadio(5);

        //WHEN
        OperationAreaCirculo operationAreaCirculo = new OperationAreaCirculo(areaCirculo);

        //THEN
        assertEquals(78.5,operationAreaCirculo.OAreaCirculo(),0.1);
    }
    @Test
    public void AreaTriangulo(){
        //Given
        AreaTriangulo areaTriangulo = new AreaTriangulo();
        areaTriangulo.setBase(10);
        areaTriangulo.setHeight(20);

        //wen
        OperationAreaTriangulo operationAreaTriangulo = new OperationAreaTriangulo(areaTriangulo);

        //then
        assertEquals(100,operationAreaTriangulo.OAreaTriangulo(),0.1);
    }
}
