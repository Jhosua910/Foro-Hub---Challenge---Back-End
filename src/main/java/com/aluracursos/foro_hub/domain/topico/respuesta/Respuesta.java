package com.aluracursos.foro_hub.domain.topico.respuesta;

import com.aluracursos.foro_hub.domain.topico.Topico;
import com.aluracursos.foro_hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "respuestas")
@Entity(name = "Respuesta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "topico_id")
    private Topico topico;
    private LocalDateTime fechaCreacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "autor_respuesta_id")
    private Usuario autorRespuesta;
    private Boolean solucion;

    public Long getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Topico getTopico() {
        return topico;
    }

    public Boolean getSolucion() {
        return solucion;
    }

    public Respuesta(){

    }

    public Respuesta(String mensaje, Usuario autor, Topico topico) {
        this.mensaje = mensaje;
        this.topico = topico;
        this.autorRespuesta = autor;
        this.fechaCreacion = LocalDateTime.now();
        this.solucion = false;
    }

    public Usuario getAutorRespuesta() {
        return autorRespuesta;
    }

    public void setSolucion() {
        this.solucion = !solucion;
    }

    public void actualizarMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
