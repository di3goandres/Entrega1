/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.uniandes.ecos;

import java.util.LinkedList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author COCO
 */
public class DesviacionEstandarTest extends TestCase {
     List<Double> listaNumeros =  new LinkedList<Double>();
    public DesviacionEstandarTest(String testName) {
        super(testName);
        
         listaNumeros.add(160d);
        listaNumeros.add(591d);
        listaNumeros.add(114d);
        listaNumeros.add(229d);
        listaNumeros.add(230d);
        listaNumeros.add(270d);
        listaNumeros.add(128d);
        listaNumeros.add(1657d);
        listaNumeros.add(624d);
        listaNumeros.add(1503d);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of DesviacionEstandarAdd method, of class DesviacionEstandar.
     */
    public void testDesviacionEstandarAdd() {
        System.out.println("DesviacionEstandarAdd");
       
        DesviacionEstandar instance = new DesviacionEstandar();
        instance.DesviacionEstandarAdd(this.listaNumeros);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of MediaAritmetica method, of class DesviacionEstandar.
     */
    public void testMediaAritmetica() {
        System.out.println("MediaAritmetica");
        DesviacionEstandar instance = new DesviacionEstandar();
        instance.DesviacionEstandarAdd(this.listaNumeros);
        double expResult = 550.6;
        double result = instance.MediaAritmetica();
        
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DesviacionStandard method, of class DesviacionEstandar.
     */
    public void testDesviacionStandard() {
        System.out.println("DesviacionStandard");
        DesviacionEstandar instance = new DesviacionEstandar();
        instance.DesviacionEstandarAdd(this.listaNumeros);
        Double expResult = 572.026844746915;
        Double result = instance.DesviacionStandard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
