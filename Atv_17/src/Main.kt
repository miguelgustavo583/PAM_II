fun main(){
    val alunos = arrayListOf("Pablo","Ricardo","Guilherme")
    for ((indice,aluno) in alunos.withIndex()){
        println("$indice- $aluno \n")
    }

}