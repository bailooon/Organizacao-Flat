package br.com.flat.service;

import br.com.flat.domain.model.Item;

import java.util.List;

public interface ItemService {

    List<Item> listarTodos();

    Item buscarPorId(Long id);

    List<Item> buscarPorNome(String nome);

    void adicionar(Item item);

    void atualizar(Long id, Item item);

    void remover(Long id);
}
