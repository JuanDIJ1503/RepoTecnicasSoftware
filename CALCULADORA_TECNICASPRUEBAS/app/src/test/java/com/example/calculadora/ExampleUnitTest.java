package com.example.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

import MODEL.Suma;
import UTILS.OperationSuma;

public class ExampleUnitTest {
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
}

