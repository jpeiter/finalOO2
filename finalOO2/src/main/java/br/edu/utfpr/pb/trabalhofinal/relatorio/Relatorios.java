package br.edu.utfpr.pb.trabalhofinal.relatorio;

import br.edu.utfpr.pb.trabalhofinal.db.DatabaseConnection;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jpeit
 */
public class Relatorios {

    public void reciboVenda(Long idVenda) {
        try {
            GerarRelatorio relatorio = new GerarRelatorio();
            InputStream arquivo = this.getClass().getResourceAsStream("/reports/reciboVenda.jasper");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ID_VENDA", idVenda);

            DatabaseConnection conn = DatabaseConnection.getInstance();
            JasperViewer viewer;
            viewer = relatorio.gerarRelatorio(
                    conn.getConnection(),
                    parametros,
                    arquivo);
            viewer.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o relatório!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void recibo2aVia(Long idVenda) {
        try {
            GerarRelatorio relatorio = new GerarRelatorio();
            InputStream arquivo = this.getClass().getResourceAsStream("/reports/recibo2avia.jasper");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("ID_VENDA", idVenda);

            DatabaseConnection conn = DatabaseConnection.getInstance();
            JasperViewer viewer;
            viewer = relatorio.gerarRelatorio(
                    conn.getConnection(),
                    parametros,
                    arquivo);
            viewer.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o relatório!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void contasAReceber(java.util.Date dataInicial, java.util.Date dataFinal) {
        try {
            GerarRelatorio relatorio = new GerarRelatorio();
            InputStream arquivo = this.getClass().getResourceAsStream("/reports/contasReceber.jasper");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("DATA_INICIAL", dataInicial);
            parametros.put("DATA_FINAL", dataFinal);

            DatabaseConnection conn = DatabaseConnection.getInstance();
            JasperViewer viewer;
            viewer = relatorio.gerarRelatorio(
                    conn.getConnection(),
                    parametros,
                    arquivo);
            viewer.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o relatório!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void comissaoUsuarios(Date dataInicial, Date dataFinal) {
        try {
            GerarRelatorio relatorio = new GerarRelatorio();
            InputStream arquivo = this.getClass().getResourceAsStream("/reports/comissaoUsuarios.jasper");
            Map<String, Object> parametros = new HashMap<>();
            parametros.put("DATAINICIAL", dataInicial);
            parametros.put("DATAFINAL", dataFinal);

            DatabaseConnection conn = DatabaseConnection.getInstance();
            JasperViewer viewer;
            viewer = relatorio.gerarRelatorio(
                    conn.getConnection(),
                    parametros,
                    arquivo);
            viewer.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao exibir relatório!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void vendas(Date dataInicial, Date dataFinal) {
        try {
            GerarRelatorio relatorio = new GerarRelatorio();
            InputStream arquivo = this.getClass().getResourceAsStream("/report/vendas.jasper");
            Map<String, Object> parametros
                    = new HashMap<>();

            parametros.put("DATAINICIAL", dataInicial);
            parametros.put("DATAFINAL", dataFinal);

            DatabaseConnection conn = DatabaseConnection.getInstance();
            JasperViewer viewer;
            viewer = relatorio.gerarRelatorio(
                    conn.getConnection(),
                    parametros,
                    arquivo);

            viewer.setVisible(true);
        } catch (JRException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Erro ao exibir relatório!",
                    "Atenção!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}
