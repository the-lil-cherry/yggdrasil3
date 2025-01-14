package usp.models

import kotlinx.serialization.Serializable
import usp.responses.AlunoResponse
import java.util.*

@Serializable
data class Aluno (
    val id: String,
    val nome: String,
    val nusp: String,
    val emailUSP: String,
);

val alunos = mutableListOf<Aluno>()