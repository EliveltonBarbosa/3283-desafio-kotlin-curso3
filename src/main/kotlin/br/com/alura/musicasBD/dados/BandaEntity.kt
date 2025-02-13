package br.com.alura.musicasBD.dados

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "bandas")
class BandaEntity(
    val nome: String = "Nome da banda",
    val descricao: String = "Descrição da banda",
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
)