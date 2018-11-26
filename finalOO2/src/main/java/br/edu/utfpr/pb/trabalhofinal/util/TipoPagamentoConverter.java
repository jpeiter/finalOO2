package br.edu.utfpr.pb.trabalhofinal.util;

import br.edu.utfpr.pb.trabalhofinal.enums.ETipoPagamento;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author jpeit
 */
@Converter(autoApply = true)
public class TipoPagamentoConverter implements AttributeConverter<ETipoPagamento, Integer> {

    @Override
    public Integer convertToDatabaseColumn(ETipoPagamento attribute) {
        return attribute.getId();
    }

    @Override
    public ETipoPagamento convertToEntityAttribute(Integer dbData) {
        return ETipoPagamento.findById(dbData);
    }

}
