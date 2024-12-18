package com.aluracursos.foro_hub.domain.curso;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "cursos")
@Entity(name = "Curso")
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private Boolean activo;


    public Long getId() {
        return id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public Curso() {
    }

    public Curso(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.activo = true;
    }

    public void setNombtre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void actualizar(DatosActualizarCurso datos) {
        if (datos.nombre() != null) {
            this.nombre= datos.nombre();
        }

        if (datos.categoria() != null) {
            this.categoria = datos.categoria();
        }
    }

    public void setActivo() {
        this.activo = !activo;
    }
}
