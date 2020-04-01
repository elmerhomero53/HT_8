/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose ramos
 */
public class VectorHeapTest {
    
 
    /**
     * Test of remove method, of class VectorHeap.
     */
    @org.junit.jupiter.api.Test
    public void testRemove() {
        System.out.println("remove");
        Paciente pac = new Paciente("Mariana", "Fealdad", "A");
        VectorHeap instance = new VectorHeap();
        instance.add(pac);
        Object exp = pac;
        Object result = instance.remove();
        assertEquals(exp, result);
        // TODO review the generated test code and remove the default call to fail.    }
    }
    

    /**
     * Test of add method, of class VectorHeap.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        Object value = null;
        VectorHeap instance = new VectorHeap();
        instance.add(new Paciente("Mariana", "Fealdad", "A"));
        // TODO review the generated test code and remove the default call to fail.
    }

    
}
