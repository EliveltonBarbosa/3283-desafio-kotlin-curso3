package br.com.alura.musicasBD.dados

import jakarta.persistence.EntityManager
import jakarta.persistence.Persistence

object Banco {
    fun getEntityManager(): EntityManager {
        val factory = Persistence.createEntityManagerFactory("musicas")
        return factory.createEntityManager()
    }
}