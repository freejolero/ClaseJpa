/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olva.clasejpa.dao;

import com.olva.clasejpa.be.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author christian
 */
public class PersonaJpaControllerTest {

    public PersonaJpaControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void testCreate() {
        System.out.println("create");
        Persona persona = new Persona();
        persona.setNombre("Christian");
        persona.setApellidos("Tello");
        PersonaJpaController instance = new PersonaJpaController();
        instance.create(persona);
        assertNotNull(persona.getId());
    }
}
