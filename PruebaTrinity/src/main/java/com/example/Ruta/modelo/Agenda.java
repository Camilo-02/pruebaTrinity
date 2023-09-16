package com.example.Ruta.modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name_auditoria;
    private String ente_control;
    private String fecha_inicio;
    private String fecha_fin;
    private String estado;

    public Agenda() {

    }


    public Agenda(int id, String name_auditoria, String ente_control, String fecha_inicio, String fecha_fin, String estado) {
        this.id = id;
        this.name_auditoria = name_auditoria;
        this.ente_control = ente_control;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getName_auditoria() {return name_auditoria;}

    public void setName_auditoria(String name_auditoria) {this.name_auditoria = name_auditoria;}

    public String getEnte_control() {return ente_control;}

    public void setEnte_control(String ente_control) {this.ente_control = ente_control;}

    public String getFecha_inicio() {return fecha_inicio;}

    public void setFecha_inicio(String fecha_inicio) {this.fecha_inicio = fecha_inicio;}

    public String getFecha_fin() {return fecha_fin;}

    public void setFecha_fin(String fecha_fin) {this.fecha_fin = fecha_fin;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}

}



