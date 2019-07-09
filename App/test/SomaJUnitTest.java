/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import app.Soma;

import static org.junit.Assert.assertEquals;
import org.junit.Test;



/**
 *
 * @author ronaldo
 */
public class SomaJUnitTest {
    
    public SomaJUnitTest() {
    }
    
   
    @Test
    public void teste1() {
        assertEquals(Soma.run(0, 0), 0);
    }
    
    @Test
    public void teste2() {
        assertEquals(Soma.run(2, 0), 2);
    }
}
