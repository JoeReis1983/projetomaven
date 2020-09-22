package br.gov.sp.fatec;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
    
{
    
 

    /**
     * Rigourous Test :-)
     */
	@Test
    public void testSoma()
    {
		Calculadora calc= new Calculadora();
        assertTrue(calc.soma()==2 );
    }
}
