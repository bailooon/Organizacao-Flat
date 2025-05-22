package br.com.flat.controller;


import br.com.flat.domain.model.Item;
import br.com.flat.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/itens")
public class ItemController {

    public final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public ResponseEntity<List<Item>> listar() {
        return ResponseEntity.ok(itemService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> listarById(@PathVariable Long id) {
        return ResponseEntity.ok(itemService.buscarPorId(id));
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Item>> listarByNome(@PathVariable String nome) {
        return ResponseEntity.ok(itemService.buscarPorNome(nome));
    }

    @PostMapping
    public ResponseEntity<Item> adicionar(@RequestBody Item item) {
        itemService.adicionar(item);
        return ResponseEntity.ok(item);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> atualizar(@PathVariable Long id, @RequestBody Item item) {
        itemService.atualizar(id, item);
        return ResponseEntity.ok(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Item> remover(@PathVariable Long id) {
        itemService.remover(id);
        return ResponseEntity.ok().build();
    }


}
