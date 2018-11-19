package br.edu.utfpr.pb.trabalhofinal.enums;

/**
 *
 * @author jpeit
 */
public enum EPermissao {
    ADMIN(0),
    VENDEDOR(1),
    FINANCEIRO(2);

    private final Integer id;

    EPermissao(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public static EPermissao findById(Integer id) {
        for (EPermissao tp : EPermissao.values()) {
            if (tp.getId().equals(id)) {
                return tp;
            }
        }
        return null;
    }
}
