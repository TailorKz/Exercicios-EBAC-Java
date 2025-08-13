package Domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 10, nullable = false)
    private String nome;

    @Column(name = "MODELO", length = 50, nullable = false)
    private String modelo;

    @Column(name = "ANO", length = 4, nullable = false)
    private Long ano;


    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_carro_marca"))
    private Marca marca;  // Adicionado este campo

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(
            name = "TB_CARRO_ACESSORIO",
            joinColumns = @JoinColumn(name = "ID_CARRO_FK"),
            inverseJoinColumns = @JoinColumn(name = "ID_ACESSORIO_FK")
    )
    private List<Acessorio> acessorios;


    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }
}