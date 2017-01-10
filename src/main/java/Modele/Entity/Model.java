package Modele.Entity;

import javax.persistence.*;


@Entity
@NamedQueries({
        @NamedQuery(name="model.all", query = "select m from Model m"),
        @NamedQuery(name = "model.byProd",query = "select m from Model m where m.producent=:prod "),
        @NamedQuery(name = "model.byCategory",query = "select b from Model b where b.category=:category")
})
public class Model {

    private Long id_modele;
    private String nazwaMod;
    private String producent;
    private String program;
    private Category category;

    @Id
    @Column(name = "IDModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id_modele;
    }

    public void setId(Long id_modele) {
        this.id_modele = id_modele;
    }

    public String getNazwaMod() {
        return nazwaMod;
    }

    public void setNazwaMod(String nazwaMod) {
        this.nazwaMod = nazwaMod;
    }
    @Column(unique = true,nullable = false)
    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    @ManyToOne
    @JoinColumn(name = "Category_IDCategory")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
