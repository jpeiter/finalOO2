package test;

import br.edu.utfpr.pb.trabalhofinal.controller.ClienteController;
import br.edu.utfpr.pb.trabalhofinal.controller.ContaReceberController;
import br.edu.utfpr.pb.trabalhofinal.controller.ProdutoController;
import br.edu.utfpr.pb.trabalhofinal.controller.UsuarioController;
import br.edu.utfpr.pb.trabalhofinal.controller.VendaController;
import br.edu.utfpr.pb.trabalhofinal.controller.VendaProdutoController;
import br.edu.utfpr.pb.trabalhofinal.enums.ETipoPagamento;
import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import br.edu.utfpr.pb.trabalhofinal.model.Venda;
import br.edu.utfpr.pb.trabalhofinal.model.VendaProduto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author jpeit
 */
public class TesteVenda {

    VendaController vendaController;
    Venda venda;
    VendaProdutoController vendaProdutoController;
    VendaProduto vendaProduto;
    List<VendaProduto> listaProdutosVendidos;
    ContaReceber contaReceber;
    ContaReceberController contaReceberController;

    public TesteVenda() {
    }

    @Before
    public void setUp() {
        System.out.println("Iniciando teste de venda...");
        System.out.println("Inicializando variáveis...");

        vendaProdutoController = new VendaProdutoController();
        vendaProduto = new VendaProduto();
        vendaController = new VendaController();
        venda = new Venda();
        listaProdutosVendidos = new ArrayList<>();
        contaReceber = new ContaReceber();
        contaReceberController = new ContaReceberController();
    }

    @After
    public void tearDown() {
        Assert.assertEquals(vendaController.buscar(4L), venda);
        Assert.assertEquals(vendaProdutoController.buscar(6L), vendaProduto);
        Assert.assertEquals(contaReceberController.buscar(4L), contaReceber);
        System.out.println("Teste de venda finalizado!");
    }

    @Test()
    public void setProdutosVenda() {

        try {
            vendaProduto.setProduto(new ProdutoController().buscar(1L));
            vendaProduto.setQuantidade(2);
            vendaProduto.setValor(new ProdutoController().buscar(1L).getValor() * 2);
            vendaProduto.setVenda(vendaController.buscar(3L));
            listaProdutosVendidos.add(vendaProduto);
            vendaProdutoController.salvar(vendaProduto);
        } catch (Exception ex) {
            Logger.getLogger(TesteVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        efetuaVenda();
        criaContaReceber();
    }

    public void efetuaVenda() {
        try {
            venda.setNumeroPedido("ABC123");
            venda.setCliente(new ClienteController().buscar(3L));
            venda.setData(LocalDate.now());
            venda.setVendaProdutos(listaProdutosVendidos);
            venda.setTipoPagamento(ETipoPagamento.DINHEIRO);
            venda.setUsuario(new UsuarioController().buscar(1L));
            vendaController.salvar(venda);
        } catch (Exception ex) {
            Logger.getLogger(TesteVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void criaContaReceber() {
        try {
            contaReceber.setData(venda.getData());
            contaReceber.setNumeroRecibo("444");
            contaReceber.setTipoRecebimento(ETipoPagamento.DINHEIRO);
            contaReceber.setValor(venda.getValorTotal());
            contaReceber.setVenda(vendaController.buscar(6L));
            contaReceberController.salvar(contaReceber);
        } catch (Exception ex) {
            Logger.getLogger(TesteVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
