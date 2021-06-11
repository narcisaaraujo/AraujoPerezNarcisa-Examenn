package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.Comidas;
import ec.edu.ups.entidad.Pedidos;

@Stateless
public class ComidasFacade extends AbstractFacade<Comidas> {

    @PersistenceContext(unitName = "practica3")
    private EntityManager em;

    public ComidasFacade() {
        super(Comidas.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
