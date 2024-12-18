package com.aluracursos.foro_hub.domain.curso.validaciones;

import com.aluracursos.foro_hub.domain.curso.CursoRepository;
import com.aluracursos.foro_hub.domain.curso.DatosCrearCurso;
import com.aluracursos.foro_hub.infra.errores.ValidacionDeIntegridad;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoExistenteValidacionCurso implements ValidadorCurso{

    @Autowired
    CursoRepository repository;

    @Override
    public void validar(DatosCrearCurso datos) {
        if (repository.existsByNombre(datos.nombre())) {
            throw new ValidationException("Ya existe un curso con ese nombre");
        }
        if (datos.nombre() == null) {
            throw new ValidacionDeIntegridad("El nombre del curso no puede quedar vacio");
        }
    }
}
