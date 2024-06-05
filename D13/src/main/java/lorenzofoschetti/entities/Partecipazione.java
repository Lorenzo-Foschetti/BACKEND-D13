package lorenzofoschetti.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Partecipazione {
    @Id
    @GeneratedValue
    private UUID id;

    private Stato stato;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;


}
