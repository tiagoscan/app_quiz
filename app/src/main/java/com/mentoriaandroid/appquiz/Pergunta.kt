package com.mentoriaandroid.appquiz

/*
        * Pergunta
        *  Titulo
        *       pergunta01, pergunta02, pergunta03
        *       resposta certa: pergunta01...
        */

data class Pergunta(
     val codigo: Int,//1
     val titulo: String,//Qual o tempo do primeiro video do Youtube?
     val resposta01: String,// 1minuto
     val resposta02: String,// 2minutos
     val resposta03: String,// 18 segundos
     val respostaCerta: Int,//1
)
