package model

class Pessoa {
    var nome: String ="Alex Silva"
    var cpf : String = "2871574582"
}
fun main(){
    val alex = Pessoa()
    print(alex.nome)
    print(alex.cpf)
}