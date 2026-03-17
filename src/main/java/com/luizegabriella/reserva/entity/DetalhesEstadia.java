package com.luizegabriella.reserva.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TB_DETALHES_ESTADIA")
public class DetalhesEstadia {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  @NotBlank
  private String numeroQuarto;

  @Column
  @NotNull
  @Min(1)
  private Integer andar;

  @Column
  private boolean possuiFrigobar;

  @Column
  private boolean possuiVaranda;

  @Column
  private boolean acessibilidade;

  @Column
  @Size(max = 300)
  private String observacoesQuarto;

  @OneToOne(mappedBy = "detalhes")
  @JsonBackReference
  private Reserva reserva;

  public DetalhesEstadia() {
  }

  public DetalhesEstadia(Long id, @NotBlank String numeroQuarto, @NotNull @Min(1) Integer andar, boolean possuiFrigobar,
      boolean possuiVaranda, boolean acessibilidade, @Size(max = 300) String observacoesQuarto) {
    this.id = id;
    this.numeroQuarto = numeroQuarto;
    this.andar = andar;
    this.possuiFrigobar = possuiFrigobar;
    this.possuiVaranda = possuiVaranda;
    this.acessibilidade = acessibilidade;
    this.observacoesQuarto = observacoesQuarto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumeroQuarto() {
    return numeroQuarto;
  }

  public void setNumeroQuarto(String numeroQuarto) {
    this.numeroQuarto = numeroQuarto;
  }

  public Integer getAndar() {
    return andar;
  }

  public void setAndar(Integer andar) {
    this.andar = andar;
  }

  public boolean isPossuiFrigobar() {
    return possuiFrigobar;
  }

  public void setPossuiFrigobar(boolean possuiFrigobar) {
    this.possuiFrigobar = possuiFrigobar;
  }

  public boolean isPossuiVaranda() {
    return possuiVaranda;
  }

  public void setPossuiVaranda(boolean possuiVaranda) {
    this.possuiVaranda = possuiVaranda;
  }

  public boolean isAcessibilidade() {
    return acessibilidade;
  }

  public void setAcessibilidade(boolean acessibilidade) {
    this.acessibilidade = acessibilidade;
  }

  public String getObservacoesQuarto() {
    return observacoesQuarto;
  }

  public void setObservacoesQuarto(String observacoesQuarto) {
    this.observacoesQuarto = observacoesQuarto;
  }

  public Reserva getReserva() {
    return reserva;
  }

  public void setReserva(Reserva reserva) {
    this.reserva = reserva;
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, numeroQuarto, andar, possuiFrigobar, possuiVaranda, acessibilidade,
        observacoesQuarto);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())

      return false;
    DetalhesEstadia that = (DetalhesEstadia) o;
    return possuiFrigobar == that.possuiFrigobar && possuiVaranda == that.possuiVaranda
        && acessibilidade == that.acessibilidade && java.util.Objects.equals(id, that.id)
        && java.util.Objects.equals(numeroQuarto, that.numeroQuarto) && java.util.Objects.equals(andar, that.andar)
        && java.util.Objects.equals(observacoesQuarto, that.observacoesQuarto);
  }

  @Override
  public String toString() {
    return "DetalhesEstadia{" +
        "id=" + id +
        ", numeroQuarto='" + numeroQuarto + '\'' +
        ", andar=" + andar +
        ", possuiFrigobar=" + possuiFrigobar +
        ", possuiVaranda=" + possuiVaranda +
        ", acessibilidade=" + acessibilidade +
        ", observacoesQuarto='" + observacoesQuarto + '\'' +
        '}';
  }
}
