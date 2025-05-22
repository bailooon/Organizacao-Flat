package br.com.flat.service.implement;

import br.com.flat.domain.model.Item;
import br.com.flat.domain.repository.ItemRepository;
import br.com.flat.service.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {


    private final ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public List<Item> listarTodos() {
        return itemRepository.findAll();
    }

    @Override
    public Item buscarPorId(Long id) {
        Optional<Item> item = itemRepository.findById(id);
        return  item.get();
    }

    @Override
    public List<Item> buscarPorNome(String nome) {
        return  itemRepository.findByNome(nome);
    }

    @Override
    public void adicionar(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void atualizar(Long id, Item item) {
        Optional<Item> itemOptional = itemRepository.findById(id);
        if (itemOptional.isPresent()) {
            itemRepository.save(item);
        }

    }

    @Override
    public void remover(Long id) {
        itemRepository.deleteById(id);
    }
}
