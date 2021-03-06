package com.curso.springdaohibernateanotaciones.dao.hibernate;

import com.curso.springdaohibernateanotaciones.dao.PersonaDao;
import com.curso.springdaohibernateanotaciones.dominio.Aficion;
import com.curso.springdaohibernateanotaciones.dominio.Persona;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class PersonaDaoHibernate extends HibernateDaoSupport implements PersonaDao {

    @Override
    public List<Persona> getPersonas() {
        return (List<Persona>) getHibernateTemplate().find("from Persona p order by p.nombre");
    }

    @Override
    public Persona insertPersona(Persona una) {
        getHibernateTemplate().save(una);
        return una;
    }

    @Override
    public void updatePersona(Persona una) {
        getHibernateTemplate().update(una);
    }

    @Override
    public void deletePersona(Persona una) {
        getHibernateTemplate().delete(una);
    }

    @Override
    public Persona getPersona(Integer id) {
        return getHibernateTemplate().load(Persona.class, id);
    }

    @Override
    public List<Persona> getPorNombreParecido(final String nombre) {
        return getHibernateTemplate().execute(new HibernateCallback<List<Persona>>() {
            @Override
            public List<Persona> doInHibernate(Session session) {
                Query query
                        = session.createQuery("from Persona p where p.nombre like :nombre");
                query.setString("nombre", "%" + nombre + "%");
                return query.list();
            }
        });
    }

    @Override
    public Long getNumeroDePersonas() {
        List<?> lista = getHibernateTemplate().find("select count(*) from Persona");
        return (Long) lista.get(0);
    }

    @Override
    public List<Aficion> getAficiones(Integer id) {
        final String orden = "select p.aficiones from Persona p where p.id = :id";
        return (List<Aficion>) getHibernateTemplate().findByNamedParam(orden, "id", id);
    }

    @Override
    public List<Aficion> getAficionesDeOtraManera(final Integer id) {
        return getHibernateTemplate().execute(
                session -> session.load(Persona.class, id).getAficiones()            
        );
    }

    @Override
    public List<Aficion> getAficionesDeOtraManeraMas(Integer id) {
        return getHibernateTemplate().load(Persona.class, id).getAficiones();
    }
}
