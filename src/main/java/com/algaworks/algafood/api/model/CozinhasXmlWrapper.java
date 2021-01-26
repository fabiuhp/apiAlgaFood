package com.algaworks.algafood.api.model;

import com.algaworks.algafood.domain.model.Cozinha;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@JsonRootName("cozinhas")
@Data
public class CozinhasXmlWrapper {

    @NonNull
    private List<Cozinha> cozinhas;
}
