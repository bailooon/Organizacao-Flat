package br.com.flat.service;

import br.com.flat.domain.model.Tarefa;

import java.util.List;

public interface TarefaService {

    List<Tarefa> listarTodas();

    Tarefa buscarPorId(Long id);

    void adicionar(Tarefa tarefa);

    void atualizar(Long id, Tarefa tarefa);

    void excluir(Long id);
}
