package br.edu.utfpr.pb.trabalhofinal.charts;

import br.edu.utfpr.pb.trabalhofinal.controller.ContaPagarController;
import br.edu.utfpr.pb.trabalhofinal.controller.ContaReceberController;
import br.edu.utfpr.pb.trabalhofinal.controller.UsuarioController;
import br.edu.utfpr.pb.trabalhofinal.controller.VendaProdutoController;
import br.edu.utfpr.pb.trabalhofinal.enums.ETipoPagamento;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author jpeit
 */
public class ChartGen {

    public void produtosMes() {
        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            VendaProdutoController pc = new VendaProdutoController();

            pc.getProdutosVendasMes().forEach(
                    obj -> ds.setValue(
                            (Number) obj[0],
                            (String) obj[1],
                            getMes((Number) obj[2]))
            );

            JFreeChart grafico = ChartFactory.createBarChart(
                    "Vendas Produtos/Mês",
                    "Produtos",
                    "Quantidade vendida",
                    ds,
                    PlotOrientation.VERTICAL,
                    true, true, false);
            ChartFrame frm = new ChartFrame("Snow's Store", grafico);
            frm.pack();
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o gráfico!");
        }
    }

    public void comissaoUsuarios(Date dataInicial, Date dataFinal) {
        try {
            DefaultPieDataset dataset
                    = new DefaultPieDataset();
            UsuarioController uc = new UsuarioController();

            List<Object[]> dados = uc.getComissaoUsuarios(dataInicial, dataFinal);

            for (Object[] dado : dados) {
                dataset.setValue(
                        (String) dado[0],
                        (Number) dado[1]
                );
            }

            JFreeChart grafico = ChartFactory.createPieChart(
                    "Comissão de Usuários",
                    dataset,
                    true, true, false);

            ChartFrame frm = new ChartFrame("Snow's Store", grafico);
            frm.pack();
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o gráfico!");
        }
    }

    public void valoresPagosByTipoRecebimento() {
        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            ContaPagarController cp = new ContaPagarController();

            cp.valoresPagosByTipoRecebimento().forEach(
                    obj -> ds.setValue(
                            (Number) obj[0],
                            getFormaPagamento((Number) obj[1]),
                            getMes((Number) obj[2]))
            );

            JFreeChart grafico = ChartFactory.createBarChart(
                    "Valores Pagos/Forma Pagamento",
                    "Formas Pagamento",
                    "Valor Pago",
                    ds,
                    PlotOrientation.VERTICAL,
                    true, true, false);
            ChartFrame frm = new ChartFrame("Snow's Store", grafico);
            frm.pack();
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o gráfico!");
        }
    }

    public void valoresRecebidosByTipoRecebimento(Date dataInicial, Date dataFinal) {
        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            ContaReceberController cr = new ContaReceberController();

            cr.valoresRecebidosByTipoRecebimento(dataInicial, dataFinal).forEach(
                    obj -> ds.setValue(
                            (Number) obj[0],
                            getFormaPagamento((Number) obj[1]),
                            getMes((Number) obj[2]))
            );

            JFreeChart grafico = ChartFactory.createBarChart(
                    "Valores Recebidos/Forma Pagamento",
                    "Formas Pagamento",
                    "Valor Recebido",
                    ds,
                    PlotOrientation.HORIZONTAL,
                    true, true, false);
            ChartFrame frm = new ChartFrame("Snow's Store", grafico);
            frm.pack();
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o gráfico!");
        }
    }

    public void entradasESaidas(Date dataInicial, Date dataFinal) {
        try {
            DefaultCategoryDataset ds = new DefaultCategoryDataset();
            ContaReceberController cr = new ContaReceberController();
            ContaPagarController cp = new ContaPagarController();

            cr.entradaCaixa(dataInicial, dataFinal).forEach(
                    obj -> ds.addValue(
                            (Number) obj[0],
                            (String) obj[1],
                            getMes((Number) obj[2]))
            );

            cp.saidaCaixa(dataInicial, dataFinal).forEach(
                    obj -> ds.addValue(
                            (Number) obj[0],
                            (String) obj[1],
                            getMes((Number) obj[2]))
            );

            JFreeChart grafico = ChartFactory.createLineChart(
                    "Entradas x Saídas",
                    "Meses", "Valor",
                    ds,
                    PlotOrientation.VERTICAL,
                    true, true, false);
            ChartFrame frm = new ChartFrame("Snow's Store", grafico);
            frm.pack();
            frm.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o gráfico!");
        }
    }

    private String getMes(Number number) {
        Integer i = number.intValue();
        switch (i) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Inválido";
        }
    }

    private String getFormaPagamento(Number number) {
        return ETipoPagamento.findById((Integer) number).toString();
    }

}
