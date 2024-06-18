package br.com.masterclass.superpecas.service;

import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<CarroModel> ListarTodos() {
        return carroRepository.findAll();
    }

    public Optional<CarroModel> ObterPorId(int carro_id){
        Optional<CarroModel> carro = carroRepository.findById(carro_id);
        return carroRepository.findById(carro_id);
    }

    public List<CarroModel> listarTodosFabricantes(String fabricante){
        return carroRepository.listarTodosFabricantes(fabricante);
    }
}
