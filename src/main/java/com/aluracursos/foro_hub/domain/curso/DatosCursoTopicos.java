package com.aluracursos.foro_hub.domain.curso;

import com.aluracursos.foro_hub.domain.topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}
