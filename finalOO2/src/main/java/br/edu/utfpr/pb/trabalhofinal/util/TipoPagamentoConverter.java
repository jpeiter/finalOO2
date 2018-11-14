package br.edu.utfpr.pb.trabalhofinal.util;

import br.edu.utfpr.pb.trabalhofinal.enums.EPermissao;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author jpeit
 */
@Converter(autoApply = true)
public class TipoPagamentoConverter implements AttributeConverter<EPermissao, Integer> {

    @Override
    public Integer convertToDatabaseColumn(EPermissao attribute) {
        return attribute.getId();
    }

    @Override
    public EPermissao convertToEntityAttribute(Integer dbData) {
        return EPermissao.findById(dbData);
    }

}
