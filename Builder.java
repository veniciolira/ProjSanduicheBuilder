package br.edu.catolica.es.subway;

import java.util.List;

public interface Builder <K, T>{
    K recheio(String recheio);
    K molho(List<String> molho);
    K extra(String extra);

    T create();
}
