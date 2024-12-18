package com.aluracursos.foro_hub.domain.topico;

import com.aluracursos.foro_hub.domain.topico.respuesta.DatosRespuesta;
import org.springframework.data.domain.Page;

public record DatosTopicoRespuestas(DatosTopico topico, Page<DatosRespuesta> respuestas) {
}
