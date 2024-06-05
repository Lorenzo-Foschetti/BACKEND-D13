package lorenzofoschetti.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table
public class Partecipazione {
    @Id
    @GeneratedValue
    private UUID id;

    private Stato stato;


}
