package br.com.masterclass.superpecas.service;

import br.com.masterclass.superpecas.model.PecaModel;
import br.com.masterclass.superpecas.repository.PecaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PecaService {

    @Autowired
    private PecaRepository pecaRepository;

    @Autowired
    private ModelMapper modelMapper;


    public Optional<PecaModel> ObterPorId(int pecaID) {
        Optional<PecaModel> peca = pecaRepository.findById(pecaID);
        return pecaRepository.findById(pecaID);
    }
}
