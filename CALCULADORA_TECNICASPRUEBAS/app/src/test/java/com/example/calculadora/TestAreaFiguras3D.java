package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MODEL.AreasFiguras3D.AreaCilindro;
import UTILS.OptAreasFiguras3D.OperationAreaCilindro;

public class TestAreaFiguras3D {
    @Test
    public void AreaCilindro(){
        //GIVEN
        AreaCilindro areaCilindro = new AreaCilindro();
        areaCilindro.setRadio(3);
        areaCilindro.setAltura(8);

        //WHEN
        OperationAreaCilindro operationAreaCilindro = new OperationAreaCilindro(areaCilindro);

        //THEN
        assertEquals(207.2,operationAreaCilindro.OAreaCilindro(),0.2);
    }
}
