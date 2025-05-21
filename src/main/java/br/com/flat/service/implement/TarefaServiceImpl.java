package br.com.flat.service.implement;

import br.com.flat.domain.model.Tarefa;
import br.com.flat.domain.repository.TarefaRepository;
import br.com.flat.service.TarefaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaServiceImpl implements TarefaService {

    private TarefaRepository tarefaRepository;

    public TarefaServiceImpl(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    @Override
    public Tarefa buscarPorId(Long id) {
        Optional<Tarefa> tarefa = tarefaRepository.findById(id);
        return tarefa.get();
    }

    @Override
    public void adicionar(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
    }

    @Override
    public void atualizar(Long id, Tarefa tarefa) {
        Optional<Tarefa> tarefaAtual = tarefaRepository.findById(id);
        if(tarefaAtual.isPresent()) {
            tarefaRepository.save(tarefa);
        }
    }

    @Override
    public void excluir(Long id) {
        tarefaRepository.deleteById(id);
    }
}
