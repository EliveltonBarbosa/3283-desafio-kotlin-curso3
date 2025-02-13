package br.com.alura.musicasBD.dados

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "albuns")
class AlbumEntity(
    val titulo: String = "Título do álbum",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)