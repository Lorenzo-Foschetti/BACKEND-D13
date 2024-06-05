package lorenzofoschetti.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue
    private UUID ID;

    private String nome;

    private String città;

    @OneToMany(mappedBy = "location")
    private List<Evento> eventi;

    public Location(String nome, String città, List<Evento> eventi) {
        this.nome = nome;
        this.città = città;
        this.eventi = eventi;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public List<Evento> getEventi() {
        return eventi;
    }

    public void setEventi(List<Evento> eventi) {
        this.eventi = eventi;
    }

    @Override
    public String toString() {
        return "Location{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", città='" + città + '\'' +
                ", eventi=" + eventi +
                '}';
    }
}
