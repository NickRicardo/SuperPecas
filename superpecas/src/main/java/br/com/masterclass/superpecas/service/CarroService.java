package br.com.masterclass.superpecas.service;

import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<CarroModel> ListarTodos() {
        return carroRepository.findAll();
    }
}
