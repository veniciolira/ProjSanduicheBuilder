package br.edu.catolica.es.subway;

import java.util.Collections;
import java.util.List;

public class SanduicheBuilder implements Builder<SanduicheBuilder,Sanduiche>{

    private final String tipoDePao;
    private String recheio, molho, extra;

    public SanduicheBuilder(String tipoDePao) {
        this.tipoDePao = tipoDePao;
    }

    @Override
    public SanduicheBuilder recheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    @Override
    public SanduicheBuilder molho(List<String> molhos) {
        this.molho = molhos.toString();
        return this;
    }

    @Override
    public SanduicheBuilder extra(String extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public Sanduiche create() {
        var sanduiche = new Sanduiche();

        sanduiche.setRecheio(this.recheio);
        sanduiche.setMolhos(Collections.singletonList(this.molho));
        sanduiche.setExtra(this.extra);
        sanduiche.setTipoDePao(this.tipoDePao);

        return sanduiche;
    }
}
