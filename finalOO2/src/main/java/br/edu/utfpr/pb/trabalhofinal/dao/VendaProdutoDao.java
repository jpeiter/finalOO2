package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.VendaProduto;
import java.util.List;
import javax.persistence.Query;

public class VendaProdutoDao extends GenericDao<VendaProduto, Long> {

    public VendaProdutoDao() {
        super(VendaProduto.class);
    }

    public List<Object[]> getProdutosVendasMes() {
        Query query = em.createNativeQuery("SELECT sum(vp.quantidade) as qtde, "
                + "p.nome, DATE_PART('MONTH', v.data) AS mes "
                + "FROM VendaProduto vp "
                +"JOIN Venda v "
                + "ON vp.venda_id = v.id "
                + "JOIN Produto p "
                + "ON p.id = vp.produto_id "
                + "GROUP BY p.nome, (DATE_PART('MONTH', v.data)) "
                + "ORDER BY mes");
        return (List<Object[]>) query.getResultList();
    }

}
