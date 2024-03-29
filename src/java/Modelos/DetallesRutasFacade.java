/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omarb
 */
@Stateless
public class DetallesRutasFacade extends AbstractFacade<DetallesRutas> {

    @PersistenceContext(unitName = "BMWMotorradJSFPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallesRutasFacade() {
        super(DetallesRutas.class);
    }
    
}
