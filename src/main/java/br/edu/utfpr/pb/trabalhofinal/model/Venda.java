package br.edu.utfpr.pb.trabalhofinal.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "venda")
public class Venda implements AbstractModel, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String numeroPedido;

    @Column(nullable = false)
    private LocalDate data;

    private LocalDate dataEntrega;

    @ManyToOne()
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(mappedBy = "venda",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY)
    private List<VendaProduto> vendaProdutos;

    public Venda() {
    }

    public Double getValorTotal() {
        return vendaProdutos.stream().mapToDouble(vp -> vp.getValor()
                * vp.getQuantidade()).sum();
    }

    public List<VendaProduto> getVendaProdutos() {
        return vendaProdutos;
    }

    public void setVendaProdutos(List<VendaProduto> vendaProdutos) {
        this.vendaProdutos = vendaProdutos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final Venda other = (Venda) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
