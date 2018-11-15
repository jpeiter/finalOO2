package br.edu.utfpr.pb.trabalhofinal.model;

import br.edu.utfpr.pb.trabalhofinal.enums.ETipoPagamento;
import br.edu.utfpr.pb.trabalhofinal.util.TipoPagamentoConverter;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jpeit
 */
@Entity
@Table(name = "contaPagar")
public class ContaPagar implements AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "id")
    private Fornecedor fornecedor;

    @Column(name = "dataVencimento", nullable = false)
    private LocalDate dataVencimento;

    @Column(name = "dataPagamento", nullable = true)
    private LocalDate dataPagamento;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "valorPago", nullable = false)
    private Double valorPago;

    @Convert(converter = TipoPagamentoConverter.class)
    private ETipoPagamento tipoPagamento;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public ContaPagar() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public ETipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(ETipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
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
        final ContaPagar other = (ContaPagar) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
