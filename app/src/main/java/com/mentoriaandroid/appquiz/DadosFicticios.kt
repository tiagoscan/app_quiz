package com.mentoriaandroid.appquiz



class DadosFicticios {

    companion object{
        //Lista de perguntas

        fun recuperarListaPerguntas() : Array<Pergunta>{

            val pergunta1 = Pergunta(
                1, "1) Qual foi a duração do primeiro video do YouTube?",
                "3 minutos", "1 minuto", "18 segundos",
                3
            )

            val pergunta2 = Pergunta(
                2, "2) Quantas pesquisas totalmente novas são feitas no Google todo dia?",
                "450 milhões", "1 bilhão", "10 bilhões",
                1
            )

            val pergunta3 = Pergunta(
                3, "3) Qual foi a primeira rede social da história da Internet?",
                "MySpace", "ClassMate", "Orkut",
                2
            )

            val pergunta4 = Pergunta(
                4, "4) Quantos Bits cabem em um Byte?",
                "1 bit", "4 bits", "8 bits",
                3
            )

            return arrayOf(
                pergunta1, pergunta2, pergunta3, pergunta4
            )

        }
    }
}