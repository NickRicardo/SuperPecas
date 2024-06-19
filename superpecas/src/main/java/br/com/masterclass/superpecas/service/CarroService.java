package br.com.masterclass.superpecas.service;

import br.com.masterclass.superpecas.dto.CarroCriarDTO;
import br.com.masterclass.superpecas.handler.AtributosVazioExcpetion;
import br.com.masterclass.superpecas.handler.ObjetoNaoEncontrado;
import br.com.masterclass.superpecas.model.CarroModel;
import br.com.masterclass.superpecas.repository.CarroRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<CarroModel> ListarTodos() {
        return carroRepository.findAll();
    }

    public Optional<CarroModel> ObterPorId(int carroID) {
        Optional<CarroModel> carro = carroRepository.findById(carroID);
        return carroRepository.findById(carroID);
    }

    public List<String> listarTodosFabricantes() {
        return carroRepository.listarTodosFabricantes();
    }


    public void excluirCarro(Integer carroID){
        carroRepository.deleteById(carroID);
    }

    public void adicionarNovoCarro(CarroCriarDTO carroCriarDTO){

        this.validarCriarCarroDTO(carroCriarDTO);
        this.verificarModeloOuCodigoUnico(carroCriarDTO.getModelo(), carroCriarDTO.getCodigoUnico());

        carroRepository.save(this.criaCarro(carroCriarDTO));
    }

    public void validarCriarCarroDTO( CarroCriarDTO carroCriarDTO){
        if (carroCriarDTO == null){
            throw new AtributosVazioExcpetion();
        }

        if (carroCriarDTO.getFabricante() == null || carroCriarDTO.getModelo() == null){
            throw new AtributosVazioExcpetion();
        }
    }

    public void verificarModeloOuCodigoUnico(String modelo, String codigoUnico){

        List<CarroModel> carroModels = carroRepository.findByNomeModeloOrCodigoUnico(modelo, codigoUnico);

        if (!carroModels.isEmpty()){
            throw new ObjetoNaoEncontrado("Este carro já consta no Banco de Dados.");
        }
    }

    public <T> CarroModel criaCarro(T carroDTO){
        CarroModel carro = modelMapper.map(carroDTO, CarroModel.class);
        return carro;
    }

}
