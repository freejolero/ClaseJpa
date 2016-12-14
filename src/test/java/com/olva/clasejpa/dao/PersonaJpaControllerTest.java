/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olva.clasejpa.dao;

import com.olva.clasejpa.be.Area;
import com.olva.clasejpa.be.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author christian
 */
public class PersonaJpaControllerTest {
    
    private static PersonaJpaController instance;

    public PersonaJpaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        instance = new PersonaJpaController();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testfindByNombre(){
        String nombre = "Ca%";
        int cant = 1;
        List<Persona> personas = instance.findByNombre(nombre);
        assertEquals(cant, personas.size());
        assertEquals("Despacho", personas.get(0).getNombreArea());
    }

    @Ignore
    @Test
    public void testCreate() {
        System.out.println("create");
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellidos("Larico");
        persona.setIdArea(new Area(1L));
        
        instance.create(persona);
        assertNotNull(persona.getId());
    }
}
