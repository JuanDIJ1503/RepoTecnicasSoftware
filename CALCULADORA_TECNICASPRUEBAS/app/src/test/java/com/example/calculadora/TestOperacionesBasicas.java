package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

import MODEL.Suma;
import UTILS.OperationResta;
import UTILS.OperationSuma;
import MODEL.Resta;

public class TestOperacionesBasicas {

    @Test
    public void Suma() {
        //GIVEN
        Suma suma = new Suma();
        suma.setNum2(30);
        suma.setNum1(30);

        //WHEN
        OperationSuma operationSuma = new OperationSuma(suma);

        //THEN
        assertEquals(60,operationSuma.OSuma());
    }



    @Test

    public void Resta(){
        //Given
        Resta resta = new Resta();
        resta.setNum1(20);
        resta.setNum2(10);

        //wen
        OperationResta operationResta = new OperationResta(resta);
        //then
        assertEquals(10,operationResta.Oresta());
    }

}

