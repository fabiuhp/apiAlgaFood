package com.algaworks.algafoodapi.domain.service;

import com.algaworks.algafoodapi.domain.model.Cidade;
import com.algaworks.algafoodapi.domain.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CadastroCidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade salvar(Cidade cidade) {
        return cidadeRepository.salvar(cidade);
    }

    public void excluir(Long cidadeId) {
        Cidade cidade = cidadeRepository.buscar(cidadeId);

        if (cidade == null) {
            throw new EmptyResultDataAccessException(1);
        }

        cidadeRepository.remover(cidadeId);
    }
}
