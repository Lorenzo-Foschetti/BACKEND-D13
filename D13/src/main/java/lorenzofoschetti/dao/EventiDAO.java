package lorenzofoschetti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lorenzofoschetti.entities.Evento;

public class EventiDAO {


    private final EntityManager em;

    public EventiDAO(EntityManager em) {
        this.em = em;
    }

    //primo metodo
    public void salvaEvento(Evento evento) {
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(evento);

        transaction.commit();

        System.out.println("Il tuo evento " + evento.getTitolo() + " è stato salvato nel Database!");
    }


    //secondo metodo
    public Evento cercaPerId(long id) {
        Evento evento = em.find(Evento.class, id);
        return (evento);
    }


    //terzometodo
    public void cercaElimina(long id) {

        Evento eventoTrovato = this.cercaPerId(id);


        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.remove(eventoTrovato);

        transaction.commit();
        System.out.println("L'evento " + eventoTrovato.getTitolo() + " è stato eliminato dal Database!");
    }
}
