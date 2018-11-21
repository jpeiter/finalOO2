package br.edu.utfpr.pb.trabalhofinal.model;

import br.edu.utfpr.pb.trabalhofinal.enums.EPermissao;
import br.edu.utfpr.pb.trabalhofinal.util.PermissaoConverter;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;

@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findByEmailAndSenha",
            query = "Select u from Usuario u "
            + " where u.email=:email AND u.senha=:senha")
    ,
    @NamedQuery(name = "Usuario.findAll",
            query = "Select u from Usuario u")
})
public class Usuario implements AbstractModel, Serializable {

    private static final long serialVersionUID = 1L;
    public static final String FIND_ALL = "Usuario.findAll";
    public static final String FIND_BY_EMAIL_AND_SENHA
            = "Usuario.findByEmailAndSenha";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 14, nullable = false)
    private String cpf;

    @DecimalMin(value = "0.01", message = "O salário deve ser maior que R$ 0.00.")
    private Double salario;

    @DecimalMin(value = "0.01")
    private Double comissao;

    @Lob
    @Column()
    private byte[] foto;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 512, nullable = false)
    private String senha;

    @Convert(converter = PermissaoConverter.class)
    private EPermissao permissoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public EPermissao getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(EPermissao permissoes) {
        this.permissoes = permissoes;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
