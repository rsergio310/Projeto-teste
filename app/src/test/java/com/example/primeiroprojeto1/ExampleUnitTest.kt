package com.example.primeiroprojeto1

import org.junit.Test

import org.junit.Assert.*
import java.io.PrintStream
import java.time.temporal.ValueRange
import java.util.zip.Inflater

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {


        var texto: String = "ovo"
        var editorTexto: String = "ovu"

        var x: Int = 5


        if (texto == editorTexto) {
            // entra aqui caso a comparação seja verdadeira
            x = x + 1
        } else {
            // entra aqui caso a comparação seja falsa
            x = x - 1
        }

        assertEquals(6, x)
    }

    @Test
    fun resolverAtividade1() {

        imprimeNumero(2000)

        var n1 = 4
        var n2: Int = 5

        var condicao = n1 > n2

        if (condicao) {
            // caso o valor seja maior
            print("n1 é maior que n2")

        } else {
            // caso o valor seja menor
            print("n1 nâo é maior que n2")
        }

        imprimeNumero(10)
    }

    @Test
    fun exercicio2() {

        var valor: Int = -50

        if (valor >= 0) {
            print("positivo")

        } else {
            print("negativo")

        }
    }

    fun imprimeNumero(numero: Int) {
        print(numero)
    }

    @Test
    fun resolverAtividade3() {
        var femeninoMasculino: String = "f"

        var a = false && true
        var b = false || true
        var c = (false || true) && false
        var d = (false || true) && !false

        if ((femeninoMasculino == "f" && femeninoMasculino == "F") || femeninoMasculino == "f" || femeninoMasculino == "Femenino") {
            print("femenino")
        } else if (femeninoMasculino == "m" || femeninoMasculino == "M" || femeninoMasculino == "masculino" || femeninoMasculino == "Masculino") {
            print("masculino")
        } else {
            print("invalido")
        }

    }

    @Test
    fun exercio4() {

        var letra: String = "l"
        var vogais: String = "aeiou"

        if (vogais.contains(letra)) {
            print("vogal")
        } else {
            print("consoante")
        }
    }

    @Test
    fun exercicio5() {

        var nota1: Int = 5
        var nota2: Int = 5
        var media: Int = (nota1 + nota2) / 2

        if (media >= 7 && media <= 9.9) {
            print("aprovado")
        } else if (media == 10) {
            print("aprovado com distinção")
        } else {
            print("reprovado")
        }
    }

    @Test
    fun exercicio0_5() {

        var nota1: Int = 10
        var nota2: Int = 10
        var media: Int = (nota1 + nota2) / 2

        if (media == 10) {
            print("aprovado com distinção")
        } else if (media >= 7) {
            print("aprovado")
        } else {
            print("reprovado")
        }
    }

    @Test
    fun exercicio06() {

        var contador: Int = 0
        while (contador < 5) {
            print("exercicio\n")
            contador = contador + 1

        }

        contador = 0
        do {
            contador += 1
        } while (contador < 5)
    }

    @Test
    fun exercicio07() {

        for (contador in 0..5) {
            print("forma 1 $contador \n")
            print("forma 2 " + contador + "\n")
            print("forma 3 ".plus(contador).plus("\n"))
        }

    }

    @Test
    fun exercicio08() {
        var x: Int = 9
        var contador: Int = 1
        for (i in 2..x) {

            if (x % i == 0) {
                contador = contador + 1
            }
        }

        if (contador <= 2) {
            print("primo")

        } else {
            print("não primo")

        }
    }

    @Test
    fun exercicio09() {
        var x: Int = 10
        var y: Int = 10

        if (x > y) {
            print("x é maior")
        } else if (y > x) {
            print("y e maior")
        } else {
            print("x e y são iguais")
        }
    }

    @Test
    fun exercicio10() {
        var nascimento: Int = 2007
        var anoAtual: Int = 2022
        var idade: Int = anoAtual - nascimento

        if (idade >= 18) {
            print("Votação obrigatoria")
        } else if (idade >= 16) {
            print("Apto para votação")
        } else {
            print("Inapto para votação")
        }
    }

    @Test
    fun exercicio11() {
        var senha: String = "1234"

        if (senha == 1234.toString()) {
            print("Acesso permitido")
        } else {
            print("Acesso negado")
        }
    }

    @Test
    fun exercicio12() {
        var macasCompradas: Int = 12

        if (macasCompradas >= 12) {
            print(macasCompradas * 0.25)
        } else {
            print(macasCompradas * 0.30)
        }
    }

    @Test
    fun exercicio13() {
        var n1: Int = 7
        var n2: Int = 9
        var n3: Int = 3

        if (n1 > n2){
            print("n1 é maior")
        } else if (n2 > n3){
            print("n2 é maior")
        } else {
            print("n3 é maior")
        }
    }

    @Test
    fun exercicio14(){
        var genero: Int = 2
        var altura: Double = 1.74

        if (genero == 1){
            var resultado: Double = 62.1 * altura
            resultado = resultado - 44.7
            print("seu peso ideal $resultado")
        }else{
            var resultado: Double = 72.7 * altura
            resultado = resultado - 58
            print("seu peso ideal $resultado")

        }

    }

    @Test
    fun Exercicio15(){
        var lados: Int = 3
        var medida: Int = 10

        if (lados == 3){
            var area: Int = (medida * (medida /2))/2
            print("triangulo $area")
        }else if(lados == 4){
            var area: Int = medida * medida
            print("quadrado $area cm2")
        }else if (lados < 3) {
            print("não é um poligono")
        }else if(lados > 5){
            print("poligono não identificado")
        }else{
            print("pentagono")
        }
    }

    @Test
    fun Exercicio16(){
        var inferior: Int = 5
        var esquerdo: Int = 7
        var direito: Int = 8

        if (inferior == 5 && esquerdo == 5 && direito == 5){
            print("triangulo equilátero")
        }else if (inferior == 5 || esquerdo != 5 || direito == 5){
            print("triangulo isósele")
        }else{
            print("triangulo escaleno")
        }
    }

    @Test
    fun Exercicio17(){
        var angulo1: Int = 90
        var angulo2: Int = 51
        var angulo3: Int = 150

        if (angulo1 == 90 || angulo2 < 90 || angulo3 < 90){
            print("triângulo retângulo")
        }else if (angulo1 < 90 || angulo2 < 90 || angulo3 > 90 && angulo3 < 180){
            print("triângulo obtusângulo")
        }else{
            print("triângulo acutângulo")
        }
        //victor careca

    }
}

