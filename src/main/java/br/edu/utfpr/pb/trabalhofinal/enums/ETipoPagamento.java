package br.edu.utfpr.pb.trabalhofinal.enums;

/**
 *
 * @author jpeit
 */
public enum ETipoPagamento {
    CREDITO(1),
    DEBITO(2),
    DINHEIRO(3);

    private final Integer id;

    ETipoPagamento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static ETipoPagamento findById(Integer id) {
        for (ETipoPagamento tp : ETipoPagamento.values()) {
            if (tp.getId().equals(id)) {
                return tp;
            }
        }
        throw new IllegalArgumentException("Forma de pagamento Inválida");
    }
}
