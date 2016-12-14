/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olva.clasejpa.dao;

import com.olva.clasejpa.be.Area;
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
 * @author CTELLO
 */
public class AreaJpaControllerTest {
    
    public AreaJpaControllerTest() {
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
        Area area = new Area();
        area.setCodigo("DIS");
        area.setNombre("Distribucion");
        AreaJpaController instance = new AreaJpaController();
        instance.create(area);
        assertNotNull(area.getId());
    }

}
