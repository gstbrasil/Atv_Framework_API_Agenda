package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BancoDeDados {

    private static List<Agenda> agendas = new ArrayList<>();

    public Agenda criar(Agenda agenda) {
        agenda.setId(agendas.size() + 1L);
        agendas.add(agenda);
        return agenda;
    }

    public List<Agenda> listar() {
        return agendas;
    }

    public Agenda atualizar(Long id, Agenda novoAgenda) {
        Agenda agenda = null;
        for (Agenda item : agendas) {
            if (Objects.equals(item.getId(), id)) {
                agenda = item;
                item.setTitulo(novoAgenda.getTitulo());
                item.setDescricao(novoAgenda.getDescricao());
                break;
            }
        }
        return null;
    }


    public void deletar(Long id) {
        Agenda agenda = null;
        for (Agenda item : agendas) {
            if (Objects.equals(item.getId(), id)) {
                agenda = item;
                break;
            }
            agendas.remove(agenda);
        }
    }
}