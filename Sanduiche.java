package br.edu.catolica.es.subway;
import lombok.Data;
import java.util.List;

@Data
public class Sanduiche {

    private String tipoDePao, recheio, extra;
    private List<String> molhos;
    public void setMolho(List<String> molhos){
        this.molhos = molhos;
    }
}
