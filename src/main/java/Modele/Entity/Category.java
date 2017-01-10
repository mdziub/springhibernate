package Modele.Entity;

import javax.persistence.*;
import java.util.Collection;


@Entity
@NamedQueries({
        @NamedQuery(name = "category.all", query = "Select c from Category c"),
        @NamedQuery(name = "category.byNazwa",query = "select c from Category c where c.nazwaKat=:name")

})
public class Category {

    private Long id_kategoria;
    private String nazwaKat;
    private String opis;
    private int numer;
    private Collection<Model> models;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="IDCategory")
    public Long getId() {
        return id_kategoria;
    }

    public void setId(Long id_kategoria) {
        this.id_kategoria = id_kategoria;
    }
    @Column(unique = true,nullable = false)
    public String getNazwaKat() {
        return nazwaKat;
    }

    public void setNazwaKat(String nazwaKat) {
        this.nazwaKat = nazwaKat;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }
    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    public Collection<Model> getModels() {
        return models;
    }

    public void setModels(Collection<Model> models) {
        this.models = models;
    }
}
