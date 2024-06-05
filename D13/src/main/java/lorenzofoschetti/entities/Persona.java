package lorenzofoschetti.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "persone")
public class Persona {
    @Id
    @GeneratedValue
    private UUID ID;

    private String nome;

    private String cognome;

    private String email;

    private LocalDate dataDiNascita;
    @Column
    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> listaPartecipazioni;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", sesso=" + sesso +
                '}';
    }
}
