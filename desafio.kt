// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val id: Int, val nome: String, val email: String) {
    override fun equals(other: Any?) =
        other is Usuario && other.id == this.id

    override fun hashCode(): Int {
        return id
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<Any>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
//        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.addAll(listOf(usuario))

    }
}

fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val usuario1 = Usuario(1, "João", "joao@wbn.com")
    val usuario2 = Usuario(2, "Maria", "maria@wbn.com")
    val usuario3 = Usuario(3, "Paulo", "paulo@wbn.com")

    val formacao1 = Formacao("Kotlin", listOf(ConteudoEducacional("Introdução ao Kotlin", 120), Nivel.BASICO))
    val formacao2 = Formacao("Java", listOf(ConteudoEducacional("Orientação ao Objeto com Java", 180), Nivel.INTERMEDIARIO))
    val formacao3 = Formacao("Python", listOf(ConteudoEducacional("Ciência de dados e IA com Python", 120),  Nivel.AVANCADO))

    formacao1.matricular(usuario1)
    formacao2.matricular(usuario3)
    formacao3.matricular(usuario2)

    println(formacao1)
    println(formacao2)
    println(formacao3)

    println("\n================================")

    println("${formacao1.inscritos} está inscrito no curso ${formacao1.nome}")
    println("${formacao2.inscritos} está inscrito no curso ${formacao2.nome}")
    println("${formacao3.inscritos} está inscrito no curso ${formacao3.nome}")

}
