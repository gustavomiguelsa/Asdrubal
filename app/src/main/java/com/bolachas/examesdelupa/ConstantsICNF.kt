package com.bolachas.examesdelupa

object ConstantsICNF {

    //const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            id = 0,
            question = "Poderão ser dispensados da carta de caçador?",
            image = R.drawable.transparent,
            optionOne = "Os agentes das autoridades com competência na fiscalização da caça",
            optionTwo = "Os membros do Governo, os Deputados à Assembleia da República e os funcionários do ICNF",
            optionThree = "Os estrangeiros não residentes em território português, desde que habilitados a caçarem no país da sua nacionalidade ou residência",
            correctAnswer = 3
        )
        questionsList.add(q1)

        val q2 = Question(
            id = 1,
            question = "Para a obtenção da carta de caçador, além de outros requisitos, é ainda necessário:",
            image = R.drawable.transparent,
            optionOne = "Ser cidadão nacional",
            optionTwo = "Ser residente em território nacional",
            optionThree = "Ter mais de 16 anos",
            correctAnswer = 3
        )
        questionsList.add(q2)

        val q3 = Question(
            id = 2,
            question = "A carta de caçador pode ser renovada:",
            image = R.drawable.transparent,
            optionOne = "Nos 12 meses que antecedem o final da sua validade",
            optionTwo = "Nos 18 meses que antecedem o final da sua validade",
            optionThree = "Nos 24 meses que antecedem o final da sua caducidade",
            correctAnswer = 1
        )
        questionsList.add(q3)

        val q4 = Question(
            id = 3,
            question = "Quando o seu titular é condenado por crime de caça, a carta de caçador:",
            image = R.drawable.transparent,
            optionOne = "Deve ser corrigida",
            optionTwo = "Caduca",
            optionThree = "Deve ser trocada",
            correctAnswer = 2
        )
        questionsList.add(q4)

        val q5 = Question(
            id = 4,
            question = "Qual das frases está correta?",
            image = R.drawable.transparent,
            optionOne = "Os membros do corpo diplomático podem ser dispensados de licença de caça",
            optionTwo = "A licença regional de caça autoriza o exercício da caça na área da região cinegética a que respeita",
            optionThree = "A licença regional de caça apenas é válida para algumas espécies",
            correctAnswer = 2
        )
        questionsList.add(q5)

        val q6 = Question(
            id = 5,
            question = "A licença de cão de caça é exigida para cães:",
            image = R.drawable.transparent,
            optionOne = "Com mais de 4 meses de idade",
            optionTwo = "Com mais de 12 meses de idade",
            optionThree = "Com mais de 6 meses de idade",
            correctAnswer = 3
        )
        questionsList.add(q6)

        val q7 = Question(
            id = 6,
            question = "Um caçador que pretenda caçar só às narcejas numa única região cinegética deve ser titular de:",
            image = R.drawable.transparent,
            optionOne = "Licença para caçar aves aquáticas",
            optionTwo = "Licença regional de caça ou licença nacional de caça",
            optionThree = "Licença regional de caça e licença de aves aquáticas",
            correctAnswer = 2
        )
        questionsList.add(q7)

        val q8 = Question(
            id = 7,
            question = "Um caçador para exercer o ato venatório pode ser dispensado da licença de caça?",
            image = R.drawable.transparent,
            optionOne = "Não, nunca pode ser dispensado",
            optionTwo = "Sim, se for estrangeiro, não residente em território nacional",
            optionThree = "Sim, se for membro do corpo diplomático acreditado em Portugal",
            correctAnswer = 1
        )
        questionsList.add(q8)

        val q9 = Question(
            id = 8,
            question = "Indique quem está dispensado da licença de caça para caçar:",
            image = R.drawable.transparent,
            optionOne = "Os membros do corpo diplomático e consular acreditados em Portugal",
            optionTwo = "Os estrangeiros não residentes em território português, desde que estejam habilitados a caçar no pais da sua nacionalidade ou residência",
            optionThree = "Ninguém",
            correctAnswer = 3
        )
        questionsList.add(q9)

        val q10 = Question(
            id = 9,
            question = "Um caçador que pretenda caçar só coelhos numa única região cinegética deve ser titular de:",
            image = R.drawable.transparent,
            optionOne = "Licença para caçar aves aquáticas",
            optionTwo = "Licença regional de caça ou licença nacional de caça",
            optionThree = "Licença regional de caça e licença de aves aquáticas",
            correctAnswer = 2
        )
        questionsList.add(q10)

        val q11 = Question(
            id = 10,
            question = "Consideram-se terrenos cinegéticos aqueles onde:",
            image = R.drawable.transparent,
            optionOne = "É permitido o exercício da caça",
            optionTwo = "As espécies cinegéticas vagueiam livremente",
            optionThree = "As espécies cinegéticas se reproduzem e alimentam",
            correctAnswer = 1
        )
        questionsList.add(q11)

        val q12 = Question(
            id = 11,
            question = "Consideram-se terrenos não cinegéticos aqueles onde:",
            image = R.drawable.transparent,
            optionOne = "Não existem espécies cinegéticas",
            optionTwo = "As espécies cinegéticas não se reproduzem nem se alimentam",
            optionThree = "É proibido o exercício da caça",
            correctAnswer = 3
        )
        questionsList.add(q12)

        val q13 = Question(
            id = 12,
            question = "Consideram-se terrenos cinegéticos:",
            image = R.drawable.transparent,
            optionOne = "Aqueles onde é permitido o exercício da caça, incluindo as áreas de jurisdição marítima e as águas interiores",
            optionTwo = "Aqueles onde não é permitido o exercício da caça",
            optionThree = "Os campos de treino de caça e as áreas de refúgio de caça",
            correctAnswer = 1
        )
        questionsList.add(q13)

        val q14 = Question(
            id = 13,
            question = "Consideram-se terrenos não cinegéticos:",
            image = R.drawable.transparent,
            optionOne = "Aqueles onde é proibido o exercício da caça",
            optionTwo = "As zonas de caça turísticas",
            optionThree = "As áreas de jurisdição marítima",
            correctAnswer = 1
        )
        questionsList.add(q14)

        val q15 = Question(
            id = 14,
            question = "Consideram-se terrenos não cinegéticos:",
            image = R.drawable.transparent,
            optionOne = "As áreas de proteção",
            optionTwo = "As zonas de caça nacionais",
            optionThree = "As áreas de jurisdição marítima",
            correctAnswer = 1
        )
        questionsList.add(q15)

        val q16 = Question(
            id = 15,
            question = "Consideram-se terrenos não cinegéticos:",
            image = R.drawable.transparent,
            optionOne = "Apenas as áreas de refúgio de caça e os aparcamentos de gado",
            optionTwo = "Apenas as áreas de não caça e os campos de treino de caça",
            optionThree = "Todos os terrenos onde é proibido o exercício da caça",
            correctAnswer = 3
        )
        questionsList.add(q16)

        val q17 = Question(
            id = 16,
            question = "Qual das seguintes áreas é considerada como terreno cinegético?",
            image = R.drawable.transparent,
            optionOne = "Campo de treino de caça",
            optionTwo = "Área de refúgio de caça",
            optionThree = "Zona de caça municipal",
            correctAnswer = 3
        )
        questionsList.add(q17)

        val q18 = Question(
            id = 17,
            question = "Quais das seguintes áreas podem ser consideradas terrenos cinegéticos?",
            image = R.drawable.transparent,
            optionOne = "Campos de treino de caça",
            optionTwo = "Áreas de jurisdição marítima",
            optionThree = "Áreas de proteção",
            correctAnswer = 2
        )
        questionsList.add(q18)

        val q19 = Question(
            id = 18,
            question = "Os matilheiros são auxiliares do caçador que têm como função:",
            image = R.drawable.transparent,
            optionOne = "Procurar, perseguir e levantar espécies de caça menor com a ajuda de cães",
            optionTwo = "Procurar, perseguir e levantar espécies de caça maior com a ajuda de cães",
            optionThree = "Procurar, perseguir e levantar espécies de caça maior sem a ajuda de cães",
            correctAnswer = 2
        )
        questionsList.add(q19)

        val q20 = Question(
            id = 19,
            question = "Considera-se época venatória o período anual:",
            image = R.drawable.transparent,
            optionOne = "Que decorre entre o dia 1 de junho de cada ano e o dia 31 de maio do ano seguinte",
            optionTwo = "Em que se pode praticar o exercício venatório",
            optionThree = "Que decorre entre o dia 15 de agosto e o último domingo do mês de fevereiro do ano seguinte",
            correctAnswer = 1
        )
        questionsList.add(q20)

        val q21 = Question(
            id = 20,
            question = "Dos auxiliares de caça indicados há um que não pode perseguir a caça com auxílio de cães:",
            image = R.drawable.transparent,
            optionOne = "Batedores",
            optionTwo = "Negaceiros",
            optionThree = "Matilheiros",
            correctAnswer = 2
        )
        questionsList.add(q21)

        val q22 = Question(
            id = 21,
            question = "Época venatória é:",
            image = R.drawable.transparent,
            optionOne = "O período anual que decorre entre o dia 1 de junho de cada ano e o dia 31 de maio do ano seguinte",
            optionTwo = "O intervalo de tempo em que cada uma das espécies pode ser caçada",
            optionThree = "O período estipulado no calendário venatório para o exercício da caça a espécies de caça menor",
            correctAnswer = 1
        )
        questionsList.add(q22)

        val q23 = Question(
            id = 22,
            question = "A utilização do barco na caça aos patos:",
            image = R.drawable.transparent,
            optionOne = "É permitida desde que o barco esteja em movimento",
            optionTwo = "É permitida só nas deslocações entre locais de espera e nas esperas",
            optionThree = "É permitida desde que se atire com o motor em movimento",
            correctAnswer = 2
        )
        questionsList.add(q23)

        val q24 = Question(
            id = 23,
            question = "Qual dos seguintes grupos de espécies se pode caçar de barco?",
            image = R.drawable.transparent,
            optionOne = "Patos, galinha-d’água e galeirão",
            optionTwo = "Patos, galinhola e galeirão",
            optionThree = "Patos, narcejas e galeirão",
            correctAnswer = 1
        )
        questionsList.add(q24)

        val q25 = Question(
            id = 24,
            question = "Que infração comete um caçador que no mês de outubro, numa zona de caça utiliza dez cães na caça à perdiz pelo processo de salto?",
            image = R.drawable.transparent,
            optionOne = "Utiliza um número de cães superior ao permitido",
            optionTwo = "Caça num mês em que não pode ser autorizada a caça a esta espécie",
            optionThree = "Utiliza um processo de caça proibido para a espécie no mês de outubro",
            correctAnswer = 1
        )
        questionsList.add(q25)

        val q26 = Question(
            id = 25,
            question = "O período venatório de uma espécie cinegética é:",
            image = R.drawable.transparent,
            optionOne = "O intervalo de tempo em que pode ser caçada",
            optionTwo = "O intervalo de tempo em que é válida uma licença de caça",
            optionThree = "O período que decorre entre 1 de junho e 31 de maio do ano seguinte",
            correctAnswer = 1
        )
        questionsList.add(q26)

        val q27 = Question(
            id = 26,
            question = "Em terrenos cobertos de neve, a qual das seguintes espécies não é proibida a caça?",
            image = R.drawable.transparent,
            optionOne = "Coelho",
            optionTwo = "Raposa",
            optionThree = "Javali",
            correctAnswer = 3
        )
        questionsList.add(q27)

        val q28 = Question(
            id = 27,
            question = "A qual das seguintes espécies é permitido o uso de chamarizes na caça?",
            image = R.drawable.transparent,
            optionOne = "Tordos",
            optionTwo = "Pombos",
            optionThree = "Patos",
            correctAnswer = 3
        )
        questionsList.add(q28)

        val q29 = Question(
            id = 28,
            question = "Um caçador, pode caçar pelo processo de salto com o auxilio de 10 cães que espécies cinegéticas?",
            image = R.drawable.transparent,
            optionOne = "Raposa",
            optionTwo = "Lebre",
            optionThree = "Coelho",
            correctAnswer = 3
        )
        questionsList.add(q29)

        val q30 = Question(
            id = 29,
            question = "No continente, na caça ao coelho-bravo por processo diferente do de batida, cada caçador ou grupo de caçadores pode utilizar no máximo:",
            image = R.drawable.transparent,
            optionOne = "10 cães",
            optionTwo = "15 cães e 2 cachorros",
            optionThree = "50 cães",
            correctAnswer = 1
        )
        questionsList.add(q30)

        val q31 = Question(
            id = 30,
            question = "Qual o número máximo de cães que pode ser utilizado na caça à raposa a corricão?",
            image = R.drawable.transparent,
            optionOne = "50",
            optionTwo = "100",
            optionThree = "Ilimitado",
            correctAnswer = 1
        )
        questionsList.add(q31)

        val q32 = Question(
            id = 31,
            question = "Assinale a afirmação correta:",
            image = R.drawable.transparent,
            optionOne = "É proibido capturar crias ou ovos de qualquer espécie, cinegética ou não",
            optionTwo = "É proibido caçar patos entre o nascer e o pôr-do-sol",
            optionThree = "É proibido caçar em terrenos cinegéticos não ordenados às quintas-feiras",
            correctAnswer = 1
        )
        questionsList.add(q32)

        val q33 = Question(
            id = 32,
            question = "Como regra, o exercício da caça só é permitido entre o nascer e o pôr-do-sol, exceto:",
            image = R.drawable.transparent,
            optionOne = "Na caça aos patos, pelo processo de espera, quando exercida até 200 m dos planos de água",
            optionTwo = "Na caça às espécies de caça maior, pelo processo de espera, que é autorizada em período de lua cheia",
            optionThree = "Na caça aos pombos, tordos e estorninho-malhado, que só é permitida até às 17 horas",
            correctAnswer = 2
        )
        questionsList.add(q33)

        val q34 = Question(
            id = 33,
            question = "A caça de aproximação é um processo de caça autorizado para:",
            image = R.drawable.transparent,
            optionOne = "Espécies de caça maior",
            optionTwo = "Espécies de caça menor",
            optionThree = "Aves aquáticas",
            correctAnswer = 1
        )
        questionsList.add(q34)

        val q35 = Question(
            id = 34,
            question = "O uso de negaças é permitido na caça:",
            image = R.drawable.transparent,
            optionOne = "Aos pombos, aos patos, à pega-rabuda e à gralha-preta",
            optionTwo = "Às narcejas e tarambola-dourada",
            optionThree = "Ao galeirão e galinha-d’água",
            correctAnswer = 1
        )
        questionsList.add(q35)

        val q36 = Question(
            id = 35,
            question = "Durante o exercício da caça, o caçador pode ser ajudado por auxiliares que:",
            image = R.drawable.transparent,
            optionOne = "Não podem fazer parte da linha de caçadores",
            optionTwo = "Não podem transportar munições",
            optionThree = "Não podem transportar armas de fogo, arco ou besta acondicionadas em estojo ou bolsa",
            correctAnswer = 1
        )
        questionsList.add(q36)

        val q37 = Question(
            id = 36,
            question = "Na caça à lebre a corricão podem ser utilizados no máximo:",
            image = R.drawable.transparent,
            optionOne = "Dois cães de busca e dois cães galgos por cada lebre",
            optionTwo = "Um cão de busca e três cães galgos por cada lebre",
            optionThree = "Três cães de busca e um cão galgo por cada lebre",
            correctAnswer = 1
        )
        questionsList.add(q37)

        val q38 = Question(
            id = 37,
            question = "No exercício da caça, cada caçador pode utilizar, no máximo:",
            image = R.drawable.transparent,
            optionOne = "Três cães na caça à perdiz-vermelha",
            optionTwo = "Dez cães na caça ao coelho-bravo, pelo processo de batida",
            optionThree = "Dois cães galgos e dois cães de busca a cada lebre, na caça à lebre a corricão",
            correctAnswer = 3
        )
        questionsList.add(q38)

        val q39 = Question(
            id = 38,
            question = "O processo de caça em que o caçador se desloca para capturar determinado exemplar de caça maior, designa-se:",
            image = R.drawable.transparent,
            optionOne = "De salto",
            optionTwo = "De batida",
            optionThree = "De aproximação",
            correctAnswer = 3
        )
        questionsList.add(q39)

        val q40 = Question(
            id = 39,
            question = "O processo de caça em que o caçador aguarda as espécies levantadas por batedores, denomina-se:",
            image = R.drawable.transparent,
            optionOne = "De montaria",
            optionTwo = "De batida",
            optionThree = "À espera",
            correctAnswer = 2
        )
        questionsList.add(q40)

        val q41 = Question(
            id = 40,
            question = "Aparelhos que funcionem a pilhas para atrair as espécies cinegéticas:",
            image = R.drawable.transparent,
            optionOne = "Podem ser utilizados na caça aos patos",
            optionTwo = "Podem ser utilizados no controle de predadores",
            optionThree = "Não podem ser utilizados na caça",
            correctAnswer = 3
        )
        questionsList.add(q41)

        val q42 = Question(
            id = 41,
            question = "Aparelhos que funcionem a pilhas para atrair as espécies cinegéticas:",
            image = R.drawable.transparent,
            optionOne = "Podem ser utilizados na caça aos patos",
            optionTwo = "Podem ser utilizados na caça aos tordos",
            optionThree = "Não podem ser utilizados na caça",
            correctAnswer = 3
        )
        questionsList.add(q42)

        val q43 = Question(
            id = 42,
            question = "Considera-se período venatório, o intervalo de tempo:",
            image = R.drawable.transparent,
            optionOne = "Em que só se pode caçar aos coelhos, lebres e perdizes",
            optionTwo = "Em que cada uma das espécies pode ser caçada",
            optionThree = "Em que só se pode caçar às espécies migradoras",
            correctAnswer = 2
        )
        questionsList.add(q43)

        val q44 = Question(
            id = 43,
            question = "No processo de caça a corricão não é permitido utilizar:",
            image = R.drawable.transparent,
            optionOne = "Pau e cavalo",
            optionTwo = "Cães de caça e cavalo",
            optionThree = "Armas de fogo",
            correctAnswer = 3
        )
        questionsList.add(q44)

        val q45 = Question(
            id = 44,
            question = "Cada caçador pode abater por dia de caça:",
            image = R.drawable.transparent,
            optionOne = "50 coelhos.",
            optionTwo = "Não tem limite.",
            optionThree = "O definido no calendário venatório anual.",
            correctAnswer = 3
        )
        questionsList.add(q45)

        val q46 = Question(
            id = 45,
            question = "A utilização de chamarizes na caça:",
            image = R.drawable.transparent,
            optionOne = "É sempre proibida",
            optionTwo = "É permitida na caça aos patos e tordos",
            optionThree = "É permitida na caça aos patos, à raposa, ao veado e ao corço",
            correctAnswer = 3
        )
        questionsList.add(q46)

        val q47 = Question(
            id = 46,
            question = "A utilização do cavalo como meio de caça é permitida:",
            image = R.drawable.transparent,
            optionOne = "Só na caça à raposa a corricão",
            optionTwo = "Na caça às espécies de caça maior, à raposa e à lebre e na caça de cetraria",
            optionThree = "Só na caça à lebre de cetraria",
            correctAnswer = 2
        )
        questionsList.add(q47)

        val q48 = Question(
            id = 47,
            question = "No processo de caça a corricão não é permitido utilizar:",
            image = R.drawable.transparent,
            optionOne = "Pau e cavalo",
            optionTwo = "Cães e cavalo",
            optionThree = "Armas de fogo",
            correctAnswer = 3
        )
        questionsList.add(q48)

        val q49 = Question(
            id = 48,
            question = "Como meio de caça, o uso do pau só é permitido em que processos de caça?",
            image = R.drawable.transparent,
            optionOne = "Corricão e de salto",
            optionTwo = "Batida e de salto",
            optionThree = "Montaria e de salto",
            correctAnswer = 1
        )
        questionsList.add(q49)

        val q50 = Question(
            id = 49,
            question = "Qual das seguintes frases está correta:",
            image = R.drawable.transparent,
            optionOne = "A utilização de barco é permitida na caça às narcejas e galinholas",
            optionTwo = "É permitido o uso de negaças às narcejas e tarambolas",
            optionThree = "Nas montarias não há limite de número de cães a utilizar",
            correctAnswer = 3
        )
        questionsList.add(q50)

        val q51 = Question(
            id = 50,
            question = "O processo de caça em que as espécies cinegéticas são capturadas por ave de presa adestrada para esse fim, denomina-se:",
            image = R.drawable.transparent,
            optionOne = "Batida",
            optionTwo = "Corricão",
            optionThree = "Cetraria",
            correctAnswer = 3
        )
        questionsList.add(q51)

        val q52 = Question(
            id = 51,
            question = "Um caçador não pode utilizar arma de fogo quando pretende caçar pelo processo de:",
            image = R.drawable.transparent,
            optionOne = "Corricão",
            optionTwo = "Montaria",
            optionThree = "Salto",
            correctAnswer = 1
        )
        questionsList.add(q52)

        val q53 = Question(
            id = 52,
            question = "Indique qual das frases está correta:",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar as espécies que constem do calendário venatório publicado anualmente",
            optionTwo = "É permitido caçar todas as espécies classificadas como cinegéticas",
            optionThree = "É permitido caçar qualquer espécie que cause prejuízos na agricultura",
            correctAnswer = 1
        )
        questionsList.add(q53)

        val q54 = Question(
            id = 53,
            question = "Em terrenos cinegéticos não ordenados, cada caçador pode ser acompanhado por:",
            image = R.drawable.transparent,
            optionOne = "Cinco auxiliares",
            optionTwo = "Três auxiliares",
            optionThree = "Um auxiliar",
            correctAnswer = 3
        )
        questionsList.add(q54)

        val q55 = Question(
            id = 54,
            question = "Os matilheiros são auxiliares do caçador que têm como função:",
            image = R.drawable.transparent,
            optionOne = "Procurar, perseguir e levantar espécies de caça menor com a ajuda de cães",
            optionTwo = "Procurar, perseguir e levantar espécies de caça maior com a ajuda de cães",
            optionThree = "Procurar, perseguir e levantar espécies de caça maior sem a ajuda de cães",
            correctAnswer = 2
        )
        questionsList.add(q55)

        val q56 = Question(
            id = 55,
            question = "Para terrenos cinegéticos não ordenados, qual das afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar ao javali pelo processo de aproximação",
            optionTwo = "Podem realizar-se batidas às raposas às quartas-feiras",
            optionThree = "A caça à raposa a corricão pode ser exercida às quartas-feiras e sábados",
            correctAnswer = 3
        )
        questionsList.add(q56)

        val q57 = Question(
            id = 56,
            question = "Em terrenos cinegéticos não ordenados, os dias de caça permitidos para caçar com arma de fogo, são:",
            image = R.drawable.transparent,
            optionOne = "As quintas-feiras, sábados e domingos",
            optionTwo = "As quintas-feiras, domingos e feriados nacionais obrigatórios",
            optionThree = "As quintas-feiras, domingos, feriados nacionais obrigatórios e feriados municipais",
            correctAnswer = 2
        )
        questionsList.add(q57)

        val q58 = Question(
            id = 57,
            question = "Em terrenos cinegéticos ordenados, a caça a espécies de caça maior:",
            image = R.drawable.transparent,
            optionOne = "É permitida nos dias previstos nos respetivos planos de ordenamento cinegético ou exploração",
            optionTwo = "Só é permitida em três dias da semana à escolha do concessionário",
            optionThree = "É permitida em qualquer dia da semana apenas nas zonas de caça turísticas",
            correctAnswer = 1
        )
        questionsList.add(q58)

        val q59 = Question(
            id = 58,
            question = "Em termos alimentares, o coelho é:",
            image = R.drawable.transparent,
            optionOne = "Um pequeno carnívoro",
            optionTwo = "Um pequeno omnívoro",
            optionThree = "Um pequeno herbívoro",
            correctAnswer = 3
        )
        questionsList.add(q59)

        val q60 = Question(
            id = 59,
            question = "Quando em fuga, a corrida do coelho caracteriza-se por ser:",
            image = R.drawable.transparent,
            optionOne = "Retilínea",
            optionTwo = "Em alongados ziguezagues",
            optionThree = "Em apertados ziguezagues",
            correctAnswer = 3
        )
        questionsList.add(q60)

        val q61 = Question(
            id = 60,
            question = "O coelho vive preferencialmente em:",
            image = R.drawable.transparent,
            optionOne = "Zonas de mato abundante",
            optionTwo = "Zonas de arvoredo muito denso",
            optionThree = "Zonas arenosas e húmidas",
            correctAnswer = 1
        )
        questionsList.add(q61)

        val q62 = Question(
            id = 61,
            question = "A alimentação do coelho é constituída essencialmente por:",
            image = R.drawable.transparent,
            optionOne = "Raízes, caules e pequenos insetos",
            optionTwo = "Plantas herbáceas, raízes, caules, grãos e cascas suculentas",
            optionThree = "Plantas herbáceas, raízes e pequenos batráquios",
            correctAnswer = 2
        )
        questionsList.add(q62)

        val q63 = Question(
            id = 62,
            question = "O coelho é um animal de hábitos:",
            image = R.drawable.transparent,
            optionOne = "Noturnos e crepusculares",
            optionTwo = "Essencialmente diurnos",
            optionThree = "Essencialmente noturnos",
            correctAnswer = 1
        )
        questionsList.add(q63)

        val q64 = Question(
            id = 63,
            question = "Os coelhos vivem, normalmente em:",
            image = R.drawable.transparent,
            optionOne = "Colónias, com galerias extensas e muito ramificadas",
            optionTwo = "Colónias, com galerias extensas não ramificadas",
            optionThree = "Tocas de habitação individuais",
            correctAnswer = 1
        )
        questionsList.add(q64)

        val q65 = Question(
            id = 64,
            question = "As coelhas prenhes têm as ninhadas:",
            image = R.drawable.transparent,
            optionOne = "Numa ramificação profunda da toca de habitação",
            optionTwo = "Numa toca especial afastada da colónia",
            optionThree = "Numa ramificação superficial da toca de habitação",
            correctAnswer = 2
        )
        questionsList.add(q65)

        val q66 = Question(
            id = 65,
            question = "As tocas de reprodução dos coelhos são formadas por:",
            image = R.drawable.transparent,
            optionOne = "Uma galeria simples e profunda",
            optionTwo = "Uma galeria complexa e profunda",
            optionThree = "Uma galeria simples e superficial",
            correctAnswer = 1
        )
        questionsList.add(q66)

        val q67 = Question(
            id = 66,
            question = "As tocas de reprodução dos coelhos são construídas:",
            image = R.drawable.transparent,
            optionOne = "Pelas fêmeas",
            optionTwo = "Por ambos os sexos",
            optionThree = "Só pelos machos",
            correctAnswer = 1
        )
        questionsList.add(q67)

        val q68 = Question(
            id = 67,
            question = "As tocas de reprodução dos coelhos são constituídas por:",
            image = R.drawable.transparent,
            optionOne = "Uma única abertura, forrada com ervas e folhas secas",
            optionTwo = "Uma única abertura, forrada com pelos da própria fêmea",
            optionThree = "Uma única abertura, forrada com ervas, folhas e cascas secas",
            correctAnswer = 2
        )
        questionsList.add(q68)

        val q69 = Question(
            id = 68,
            question = "Ao fim de quanto tempo, as coelhas mudam os filhos para as tocas de habitação?",
            image = R.drawable.transparent,
            optionOne = "1 Semana",
            optionTwo = "2 Semanas",
            optionThree = "3 Semanas",
            correctAnswer = 3
        )
        questionsList.add(q69)

        val q70 = Question(
            id = 69,
            question = "O coelho-bravo está apto a reproduzir-se a partir da idade seguinte:",
            image = R.drawable.transparent,
            optionOne = "Quatro meses",
            optionTwo = "Seis meses",
            optionThree = "Doze meses",
            correctAnswer = 2
        )
        questionsList.add(q70)

        val q71 = Question(
            id = 70,
            question = "Em comprimento, as orelhas do coelho são:",
            image = R.drawable.transparent,
            optionOne = "Maiores que as da lebre",
            optionTwo = "Maiores que o comprimento da sua cabeça",
            optionThree = "Menores que o comprimento da sua cabeça",
            correctAnswer = 3
        )
        questionsList.add(q71)

        val q72 = Question(
            id = 71,
            question = "A época de reprodução mais intensa do coelho ocorre de:",
            image = R.drawable.transparent,
            optionOne = "Março a maio",
            optionTwo = "Março a agosto",
            optionThree = "Durante todo o ano",
            correctAnswer = 1
        )
        questionsList.add(q72)

        val q73 = Question(
            id = 72,
            question = "Nas coelhas, o período de gestação é de:",
            image = R.drawable.transparent,
            optionOne = "25 a 30 dias",
            optionTwo = "27 a 30 dias",
            optionThree = "28 a 30 dias",
            correctAnswer = 3
        )
        questionsList.add(q73)

        val q74 = Question(
            id = 73,
            question = "As coelhas têm, em média, quantas ninhadas por ano?",
            image = R.drawable.transparent,
            optionOne = "1 a 4",
            optionTwo = "3 a 5",
            optionThree = "2 a 5",
            correctAnswer = 2
        )
        questionsList.add(q74)

        val q75 = Question(
            id = 74,
            question = "Os láparos nascem:",
            image = R.drawable.transparent,
            optionOne = "Cegos, surdos e sem pelo",
            optionTwo = "De olhos abertos e com pelo",
            optionThree = "Cegos, surdos e com pelo",
            correctAnswer = 1
        )
        questionsList.add(q75)

        val q76 = Question(
            id = 75,
            question = "Ao nível das doenças epidémicas do coelho, qual das frases está correta?",
            image = R.drawable.transparent,
            optionOne = "Nos repovoamentos proceda ao seu controlo sanitário e vacinação",
            optionTwo = "Pode esfolar os coelhos caçados no campo",
            optionThree = "Se esfolar os coelhos caçados dê as vísceras aos cães",
            correctAnswer = 1
        )
        questionsList.add(q76)

        val q77 = Question(
            id = 76,
            question = "Ao nível das doenças epidémicas, qual das seguintes medidas pode contribuir para o ordenamento do coelho-bravo?",
            image = R.drawable.transparent,
            optionOne = "Queimar os coelhos vítimas de doenças",
            optionTwo = "Não realizar a queima de restolhos",
            optionThree = "Construir tocas ou “morouços”",
            correctAnswer = 1
        )
        questionsList.add(q77)

        val q78 = Question(
            id = 77,
            question = "O coelho pode viver até aos:",
            image = R.drawable.transparent,
            optionOne = "5 anos",
            optionTwo = "10 anos",
            optionThree = "15 anos",
            correctAnswer = 2
        )
        questionsList.add(q78)

        val q79 = Question(
            id = 78,
            question = "O coelho é atacado por uma doença contagiosa grave. Indique qual:",
            image = R.drawable.transparent,
            optionOne = "Coccidiose",
            optionTwo = "Mixomatose",
            optionThree = "Brucelose",
            correctAnswer = 2
        )
        questionsList.add(q79)

        val q80 = Question(
            id = 79,
            question = "Os coelhos abrem os olhos ao fim de:",
            image = R.drawable.transparent,
            optionOne = "5 dias",
            optionTwo = "10 dias",
            optionThree = "15 dias",
            correctAnswer = 2
        )
        questionsList.add(q80)

        val q81 = Question(
            id = 80,
            question = "O aparelho auditivo do coelho está completamente desenvolvido aos:",
            image = R.drawable.transparent,
            optionOne = "8 dias",
            optionTwo = "10 dias",
            optionThree = "15 dias",
            correctAnswer = 1
        )
        questionsList.add(q81)

        val q82 = Question(
            id = 81,
            question = "A mixomatose, doença que ataca os coelhos, é:",
            image = R.drawable.transparent,
            optionOne = "Transmissível ao homem",
            optionTwo = "Não transmissível ao homem",
            optionThree = "Transmissível a outras espécies cinegéticas",
            correctAnswer = 2
        )
        questionsList.add(q82)

        val q83 = Question(
            id = 82,
            question = "Aos coelhos recém-nascidos dá-se, vulgarmente, o nome de:",
            image = R.drawable.transparent,
            optionOne = "Láparos",
            optionTwo = "Lebrachos",
            optionThree = "Listados",
            correctAnswer = 1
        )
        questionsList.add(q83)

        val q84 = Question(
            id = 83,
            question = "Relativamente ao coelho-bravo indique a frase correta:",
            image = R.drawable.transparent,
            optionOne = "É uma espécie de distribuição restrita",
            optionTwo = "É uma espécie pouco importante no equilíbrio ecológico do habitat mediterrânico",
            optionThree = "A mixomatose é uma doença que contribui para a diminuição das populações de coelho",
            correctAnswer = 3
        )
        questionsList.add(q84)

        val q85 = Question(
            id = 84,
            question = "O coelho-bravo é uma espécie que vive:",
            image = R.drawable.transparent,
            optionOne = "Em zonas onde o mato é raro, preferindo terrenos húmidos e argilosos",
            optionTwo = "Em zonas abertas sem mato, preferindo terrenos acidentados e rochosos",
            optionThree = "Em zonas onde o mato é abundante, preferindo terrenos secos e arenosos",
            correctAnswer = 3
        )
        questionsList.add(q85)

        val q86 = Question(
            id = 85,
            question = "Onde há maior probabilidade de encontrar o coelho-bravo?",
            image = R.drawable.transparent,
            optionOne = "Em terrenos húmidos e barrentos",
            optionTwo = "Em zonas onde o mato é abundante",
            optionThree = "Em zonas de pousios e terras cultivadas",
            correctAnswer = 2
        )
        questionsList.add(q86)

        val q87 = Question(
            id = 86,
            question = "Qual das medidas pode contribuir positivamente para o ordenamento do coelho-bravo:",
            image = R.drawable.transparent,
            optionOne = "Realizar repovoamentos independentemente da origem dos animais",
            optionTwo = "Construir tocas ou “morouços” em terrenos onde seja difícil escavar",
            optionThree = "Realizar repovoamentos com fêmeas de coelho-manso para aumentar a capacidade de reprodução",
            correctAnswer = 2
        )
        questionsList.add(q87)

        val q88 = Question(
            id = 87,
            question = "Em comprimento, as orelhas da lebre são:",
            image = R.drawable.transparent,
            optionOne = "Menores que as do coelho",
            optionTwo = "Maiores que o comprimento da sua cabeça",
            optionThree = "Menores que o comprimento da sua cabeça",
            correctAnswer = 2
        )
        questionsList.add(q88)

        val q89 = Question(
            id = 88,
            question = "Uma das características da lebre é:",
            image = R.drawable.transparent,
            optionOne = "Possuir orelhas pequenas, brancas na extremidade",
            optionTwo = "Possuir orelhas grandes, negras na extremidade",
            optionThree = "Possuir orelhas grandes e arredondadas, menores que o comprimento da cabeça",
            correctAnswer = 2
        )
        questionsList.add(q89)

        val q90 = Question(
            id = 89,
            question = "Uma das características da lebre é:",
            image = R.drawable.transparent,
            optionOne = "Possuir membros posteriores maiores que os anteriores",
            optionTwo = "Possuir membros anteriores maiores que os posteriores",
            optionThree = "Possuir tamanho semelhante ao do coelho",
            correctAnswer = 1
        )
        questionsList.add(q90)

        val q91 = Question(
            id = 90,
            question = "O maior tamanho dos membros posteriores da lebre permite-lhe:",
            image = R.drawable.transparent,
            optionOne = "Adquirir boa aderência",
            optionTwo = "Adquirir boa capacidade de fuga em ziguezague",
            optionThree = "Adquirir grande velocidade",
            correctAnswer = 3
        )
        questionsList.add(q91)

        val q92 = Question(
            id = 91,
            question = "A lebre é, geralmente mais abundante:",
            image = R.drawable.transparent,
            optionOne = "Na Estremadura e a Sul do Tejo",
            optionTwo = "Na Beira Interior e a Sul do Tejo",
            optionThree = "Na Beira Litoral e a Sul o Tejo",
            correctAnswer = 2
        )
        questionsList.add(q92)

        val q93 = Question(
            id = 92,
            question = "A lebre prefere:",
            image = R.drawable.transparent,
            optionOne = "Pousios e terras cultivadas",
            optionTwo = "Terrenos acidentados e pedregosos",
            optionThree = "Terrenos com grande densidade de coberto",
            correctAnswer = 1
        )
        questionsList.add(q93)

        val q94 = Question(
            id = 93,
            question = "A lebre é uma espécie que:",
            image = R.drawable.transparent,
            optionOne = "Vive em tocas com galerias pouco ramificadas",
            optionTwo = "Prefere terrenos com grande densidade de coberto.",
            optionThree = "Prefere terrenos planos, húmidos e pouco cobertos.",
            correctAnswer = 3
        )
        questionsList.add(q94)

        val q95 = Question(
            id = 94,
            question = "A lebre é:",
            image = R.drawable.transparent,
            optionOne = "Uma espécie herbívora",
            optionTwo = "Uma espécie carnívora",
            optionThree = "Uma espécie omnívora",
            correctAnswer = 1
        )
        questionsList.add(q95)

        val q96 = Question(
            id = 95,
            question = "A lebre é:",
            image = R.drawable.transparent,
            optionOne = "Um animal solitário",
            optionTwo = "Um animal que vive em grandes colónias",
            optionThree = "Um animal que vive aos casais",
            correctAnswer = 1
        )
        questionsList.add(q96)

        val q97 = Question(
            id = 96,
            question = "Às lebres recém-nascidas dá-se, vulgarmente, o nome de:",
            image = R.drawable.transparent,
            optionOne = "Láparos",
            optionTwo = "Lebrachos",
            optionThree = "Listados",
            correctAnswer = 2
        )
        questionsList.add(q97)

        val q98 = Question(
            id = 97,
            question = "O período de gestação da lebre é de:",
            image = R.drawable.transparent,
            optionOne = "40 a 44 dias",
            optionTwo = "40 a 42 dias",
            optionThree = "42 a 44 dias",
            correctAnswer = 3
        )
        questionsList.add(q98)

        val q99 = Question(
            id = 98,
            question = "Os lebrachos nascem:",
            image = R.drawable.transparent,
            optionOne = "De olhos abertos e com pelo",
            optionTwo = "Cegos, surdos e com pelo",
            optionThree = "De olhos fechados e com pelo",
            correctAnswer = 1
        )
        questionsList.add(q99)

        val q100 = Question(
            id = 99,
            question = "Os lebrachos são amamentados até às:",
            image = R.drawable.transparent,
            optionOne = "2 semanas",
            optionTwo = "3 semanas",
            optionThree = "4 semanas",
            correctAnswer = 2
        )
        questionsList.add(q100)

        val q101 = Question(
            id = 100,
            question = "A lebre tem, normalmente, quantas ninhadas por ano?",
            image = R.drawable.transparent,
            optionOne = "1 a 5",
            optionTwo = "2 a 4",
            optionThree = "1 a 3",
            correctAnswer = 3
        )
        questionsList.add(q101)

        val q102 = Question(
            id = 101,
            question = "Nas lebres, cada ninhada é, normalmente, constituída por quantos lebrachos?",
            image = R.drawable.transparent,
            optionOne = "1 ou 2",
            optionTwo = "2 a 3",
            optionThree = "2 a 4",
            correctAnswer = 1
        )
        questionsList.add(q102)

        val q103 = Question(
            id = 102,
            question = "A lebre reconhece-se facilmente por:",
            image = R.drawable.transparent,
            optionOne = "Ter os membros da frente muito maiores que os de trás",
            optionTwo = "Ter as orelhas grandes com a extremidade negra",
            optionThree = "Ter as orelhas pequenas e pontiagudas",
            correctAnswer = 2
        )
        questionsList.add(q103)

        val q104 = Question(
            id = 103,
            question = "A lebre é uma espécie que prefere como habitat:",
            image = R.drawable.transparent,
            optionOne = "Matagais densos e fechados",
            optionTwo = "Planícies abertas, cultivadas ou em pousio",
            optionThree = "Áreas acidentadas e pedregosas",
            correctAnswer = 2
        )
        questionsList.add(q104)

        val q105 = Question(
            id = 104,
            question = "A raposa é:",
            image = R.drawable.transparent,
            optionOne = "Um animal solitário",
            optionTwo = "Um animal que vive em grandes colónias",
            optionThree = "Um animal que vive aos casais",
            correctAnswer = 1
        )
        questionsList.add(q105)

        val q106 = Question(
            id = 105,
            question = "A raposa é:",
            image = R.drawable.transparent,
            optionOne = "Um mamífero de médio porte",
            optionTwo = "Um mamífero de grande porte",
            optionThree = "Um mamífero de pequeno porte",
            correctAnswer = 1
        )
        questionsList.add(q106)

        val q107 = Question(
            id = 106,
            question = "Os machos da raposa, por vezes, podem distinguir-se das fêmeas por:",
            image = R.drawable.transparent,
            optionOne = "Apresentarem uma cabeça menos forte e mais afilada",
            optionTwo = "Apresentarem uma cabeça mais forte e menos afilada",
            optionThree = "Apresentarem uma cabeça mais forte e mais afilada",
            correctAnswer = 2
        )
        questionsList.add(q107)

        val q108 = Question(
            id = 107,
            question = "A pelagem da raposa, durante o inverno é:",
            image = R.drawable.transparent,
            optionOne = "Menos espesso e mais denso que no verão",
            optionTwo = "Mais espesso e menos denso que no verão",
            optionThree = "Mais espesso e mais denso que no verão",
            correctAnswer = 3
        )
        questionsList.add(q108)

        val q109 = Question(
            id = 108,
            question = "O cio da raposa ocorre geralmente em:",
            image = R.drawable.transparent,
            optionOne = "Janeiro",
            optionTwo = "Fevereiro",
            optionThree = "Março",
            correctAnswer = 1
        )
        questionsList.add(q109)

        val q110 = Question(
            id = 109,
            question = "O período de gestação da raposa tem a duração aproximada de:",
            image = R.drawable.transparent,
            optionOne = "40 a 50 dias",
            optionTwo = "50 a 60 dias",
            optionThree = "60 a 70 dias",
            correctAnswer = 2
        )
        questionsList.add(q110)

        val q111 = Question(
            id = 110,
            question = "Na raposa, cada ninhada tem em média:",
            image = R.drawable.transparent,
            optionOne = "1 a 3 crias",
            optionTwo = "2 a 5 crias",
            optionThree = "3 a 6 crias",
            correctAnswer = 3
        )
        questionsList.add(q111)

        val q112 = Question(
            id = 111,
            question = "As raposas podem ser vistas em grupo:",
            image = R.drawable.transparent,
            optionOne = "Durante todo o ano",
            optionTwo = "Durante o período de inverno",
            optionThree = "Durante o cio das fêmeas",
            correctAnswer = 3
        )
        questionsList.add(q112)

        val q113 = Question(
            id = 112,
            question = "O saca-rabos é um animal:",
            image = R.drawable.transparent,
            optionOne = "Que habita em locais com vegetação pouco densa",
            optionTwo = "Solitário",
            optionThree = "Que tanto pode ser visto de dia como de noite",
            correctAnswer = 3
        )
        questionsList.add(q113)

        val q114 = Question(
            id = 113,
            question = "O saca-rabos possui orelhas:",
            image = R.drawable.transparent,
            optionOne = "Grandes e arredondadas",
            optionTwo = "Muito curtas e arredondadas",
            optionThree = "Muito curtas e afiladas",
            correctAnswer = 2
        )
        questionsList.add(q114)

        val q115 = Question(
            id = 114,
            question = "O saca-rabos é:",
            image = R.drawable.transparent,
            optionOne = "Um carnívoro de médio porte",
            optionTwo = "Um carnívoro de grande porte",
            optionThree = "Um carnívoro de pequeno porte",
            correctAnswer = 1
        )
        questionsList.add(q115)

        val q116 = Question(
            id = 115,
            question = "O saca-rabos é um animal:",
            image = R.drawable.transparent,
            optionOne = "Solitário",
            optionTwo = "Bastante sociável",
            optionThree = "Pouco sociável",
            correctAnswer = 2
        )
        questionsList.add(q116)

        val q117 = Question(
            id = 116,
            question = "O saca-rabos é um animal que, durante as suas atividades de caça:",
            image = R.drawable.transparent,
            optionOne = "Se desloca em grupos",
            optionTwo = "Se desloca aos casais",
            optionThree = "Se desloca sozinho",
            correctAnswer = 1
        )
        questionsList.add(q117)

        val q118 = Question(
            id = 117,
            question = "O saca-rabos é um animal:",
            image = R.drawable.transparent,
            optionOne = "Que habita locais com vegetação pouco densa",
            optionTwo = "Que habita locais húmidos e alagadiços",
            optionThree = "Que habita locais com vegetação densa",
            correctAnswer = 3
        )
        questionsList.add(q118)

        val q119 = Question(
            id = 118,
            question = "A seguinte figura representa:",
            image = R.drawable.q119,
            optionOne = "Um saca-rabos",
            optionTwo = "Um texugo",
            optionThree = "Um furão",
            correctAnswer = 1
        )
        questionsList.add(q119)

        val q120 = Question(
            id = 119,
            question = "O saca-rabos alimenta-se principalmente de:",
            image = R.drawable.transparent,
            optionOne = "Aves, mamíferos, répteis e frutos",
            optionTwo = "Produtos vegetais variados",
            optionThree = "Insetos",
            correctAnswer = 1
        )
        questionsList.add(q120)

        val q121 = Question(
            id = 120,
            question = "O saca-rabos alimenta-se fundamentalmente de:",
            image = R.drawable.transparent,
            optionOne = "Pequenas aves e mamíferos, répteis e frutos",
            optionTwo = "Produtos vegetais variados",
            optionThree = "Rebentos de árvores e arbustos",
            correctAnswer = 1
        )
        questionsList.add(q121)

        val q122 = Question(
            id = 121,
            question = "O saca-rabos tem uma alimentação:",
            image = R.drawable.transparent,
            optionOne = "Pouco variada, exclusivamente à base de peixes",
            optionTwo = "Pouco variada, exclusivamente à base de insetos",
            optionThree = "Muito variada, onde se incluem pequenas aves e mamíferos, invertebrados, répteis e frutos",
            correctAnswer = 3
        )
        questionsList.add(q122)

        val q123 = Question(
            id = 122,
            question = "A partir de que idade se pode reproduzir o javali?",
            image = R.drawable.transparent,
            optionOne = "A partir dos 6 meses",
            optionTwo = "A partir dos 8 meses",
            optionThree = "A partir dos 10 meses",
            correctAnswer = 2
        )
        questionsList.add(q123)

        val q124 = Question(
            id = 123,
            question = "Como se designam os grupos de javalis?",
            image = R.drawable.transparent,
            optionOne = "Varas ou companhias",
            optionTwo = "Rebanhos ou manadas",
            optionThree = "Bandos ou companhias",
            correctAnswer = 1
        )
        questionsList.add(q124)

        val q125 = Question(
            id = 124,
            question = "Qual a espécie de caça maior com mais ampla representação em Portugal?",
            image = R.drawable.transparent,
            optionOne = "Raposa",
            optionTwo = "Veado",
            optionThree = "Javali",
            correctAnswer = 3
        )
        questionsList.add(q125)

        val q126 = Question(
            id = 125,
            question = "No javali, dá-se o nome de navalhas aos dentes:",
            image = R.drawable.transparent,
            optionOne = "Caninos inferiores",
            optionTwo = "Caninos superiores",
            optionThree = "Pré-molares",
            correctAnswer = 1
        )
        questionsList.add(q126)

        val q127 = Question(
            id = 126,
            question = "No javali, dá-se o nome de amoladeiras aos dentes:",
            image = R.drawable.transparent,
            optionOne = "Caninos superiores",
            optionTwo = "Pré-molares",
            optionThree = "Caninos inferiores",
            correctAnswer = 1
        )
        questionsList.add(q127)

        val q128 = Question(
            id = 127,
            question = "Em hábitos alimentares, o javali é um animal:",
            image = R.drawable.transparent,
            optionOne = "Insectívoro",
            optionTwo = "Granívoro",
            optionThree = "Omnívoro",
            correctAnswer = 3
        )
        questionsList.add(q128)

        val q129 = Question(
            id = 128,
            question = "Com a idade, os javalis machos adultos, tendem a:",
            image = R.drawable.transparent,
            optionOne = "Formar casais",
            optionTwo = "Formar grandes grupos só de machos",
            optionThree = "Isolar-se progressivamente",
            correctAnswer = 3
        )
        questionsList.add(q129)

        val q130 = Question(
            id = 129,
            question = "A gestação do javali, dura em média:",
            image = R.drawable.transparent,
            optionOne = "100 dias",
            optionTwo = "110 dias",
            optionThree = "120 dias",
            correctAnswer = 3
        )
        questionsList.add(q130)

        val q131 = Question(
            id = 130,
            question = "Que nome se dá à cria de javali com menos de 6 meses de idade?",
            image = R.drawable.transparent,
            optionOne = "Listado",
            optionTwo = "Farropo",
            optionThree = "Leitão",
            correctAnswer = 1
        )
        questionsList.add(q131)

        val q132 = Question(
            id = 131,
            question = "Entre os 6 meses e 1 ano de idade, a cria de javali tem uma designação própria. Qual?",
            image = R.drawable.transparent,
            optionOne = "Bácoro",
            optionTwo = "Listado",
            optionThree = "Farropo",
            correctAnswer = 3
        )
        questionsList.add(q132)

        val q133 = Question(
            id = 132,
            question = "Indique qual das seguintes frases está correta:",
            image = R.drawable.transparent,
            optionOne = "O javali é um animal sociável durante toda a sua vida",
            optionTwo = "O trofeu do javali é a cabeça",
            optionThree = "O cio do javali não ocorre sempre numa época fixa",
            correctAnswer = 3
        )
        questionsList.add(q133)

        val q134 = Question(
            id = 133,
            question = "O javali apresenta diferentes pelagens consoante a idade. A pelagem conhecida como “raiada” é característica dos animais com:",
            image = R.drawable.transparent,
            optionOne = "Menos de 6 meses de idade",
            optionTwo = "2 anos de idade",
            optionThree = "Idade adulta",
            correctAnswer = 1
        )
        questionsList.add(q134)

        val q135 = Question(
            id = 134,
            question = "No javali adulto, um dos carateres que permitem distinguir o macho da fêmea é:",
            image = R.drawable.transparent,
            optionOne = "A cor mais clara do macho",
            optionTwo = "A presença de presas mais desenvolvidas nos machos",
            optionThree = "A cauda mais comprida no macho",
            correctAnswer = 2
        )
        questionsList.add(q135)

        val q136 = Question(
            id = 135,
            question = "Em termos de habitat, o javali necessita sobretudo de dois elementos. Indique quais:",
            image = R.drawable.transparent,
            optionOne = "Zonas abertas com amplas áreas de alimentação",
            optionTwo = "Extensas zonas de abrigo - essencialmente constituídas por matos cerrados - e presença de água",
            optionThree = "Zonas cerealíferas em áreas muito acidentadas e presença de água",
            correctAnswer = 2
        )
        questionsList.add(q136)

        val q137 = Question(
            id = 136,
            question = "Em que época do ano os gamos perdem as armações?",
            image = R.drawable.transparent,
            optionOne = "Março a abril",
            optionTwo = "Fevereiro a março",
            optionThree = "Janeiro a fevereiro",
            correctAnswer = 1
        )
        questionsList.add(q137)

        val q138 = Question(
            id = 137,
            question = "Quando se iniciam os nascimentos nas gamelas?",
            image = R.drawable.transparent,
            optionOne = "Abril",
            optionTwo = "Maio",
            optionThree = "Junho",
            correctAnswer = 2
        )
        questionsList.add(q138)

        val q139 = Question(
            id = 138,
            question = "A armação do gamo é constituída por:",
            image = R.drawable.transparent,
            optionOne = "Duas hastes espalmadas, arredondadas na base",
            optionTwo = "Duas hastes arredondadas, espalmadas na base",
            optionThree = "Duas hastes cilíndricas, mais ou menos ramificadas",
            correctAnswer = 1
        )
        questionsList.add(q139)

        val q140 = Question(
            id = 139,
            question = "A cabeça do gamo atinge a sua forma característica:",
            image = R.drawable.transparent,
            optionOne = "Aos 5 anos",
            optionTwo = "Aos 6 anos",
            optionThree = "Aos 7 anos",
            correctAnswer = 3
        )
        questionsList.add(q140)

        val q141 = Question(
            id = 140,
            question = "O gamo prefere:",
            image = R.drawable.transparent,
            optionOne = "Zonas com abundante arvoredo e matagal, com áreas de pasto",
            optionTwo = "Zonas abertas, com áreas de pasto e sombras",
            optionThree = "Zonas alagadiças e húmidas",
            correctAnswer = 1
        )
        questionsList.add(q141)

        val q142 = Question(
            id = 141,
            question = "O cio no gamo começa:",
            image = R.drawable.transparent,
            optionOne = "No princípio do verão",
            optionTwo = "No princípio do outono",
            optionThree = "No princípio do inverno",
            correctAnswer = 2
        )
        questionsList.add(q142)

        val q143 = Question(
            id = 142,
            question = "A seguinte figura representa um:",
            image = R.drawable.q143,
            optionOne = "Veado",
            optionTwo = "Corço",
            optionThree = "Gamo",
            correctAnswer = 1
        )
        questionsList.add(q143)

        val q144 = Question(
            id = 143,
            question = "Qual o nome da fêmea do veado?",
            image = R.drawable.transparent,
            optionOne = "Corça",
            optionTwo = "Cerva",
            optionThree = "Gama ou gamela",
            correctAnswer = 2
        )
        questionsList.add(q144)

        val q145 = Question(
            id = 144,
            question = "Em que época do ano os veados perdem as armações?",
            image = R.drawable.transparent,
            optionOne = "Finais de fevereiro a março",
            optionTwo = "Finais de março a abril",
            optionThree = "Finais de janeiro a fevereiro",
            correctAnswer = 1
        )
        questionsList.add(q145)

        val q146 = Question(
            id = 145,
            question = "A armação do veado atinge a forma característica por volta dos:",
            image = R.drawable.transparent,
            optionOne = "7 a 8 anos de vida",
            optionTwo = "8 a 9 anos de vida",
            optionThree = "6 a 7 anos de vida",
            correctAnswer = 1
        )
        questionsList.add(q146)

        val q147 = Question(
            id = 146,
            question = "A armação do veado, além de constituir um troféu de caça, é ainda:",
            image = R.drawable.transparent,
            optionOne = "Indicadora da idade do macho",
            optionTwo = "Indicadora da idade da fêmea",
            optionThree = "Indicadora da idade de ambos os sexos",
            correctAnswer = 1
        )
        questionsList.add(q147)

        val q148 = Question(
            id = 147,
            question = "Os habitats preferidos do veado são:",
            image = R.drawable.transparent,
            optionOne = "Bosques de folha caduca e matagais, muito fechados",
            optionTwo = "Bosques de folha caduca, com zonas abertas, e matagais",
            optionThree = "Bosques de coníferas, matagais e zonas húmidas",
            correctAnswer = 2
        )
        questionsList.add(q148)

        val q149 = Question(
            id = 148,
            question = "As cervas podem criar pela primeira vez com a idade de:",
            image = R.drawable.transparent,
            optionOne = "1 ano",
            optionTwo = "2 anos",
            optionThree = "3 anos",
            correctAnswer = 2
        )
        questionsList.add(q149)

        val q150 = Question(
            id = 149,
            question = "Dá-se o nome de brama:",
            image = R.drawable.transparent,
            optionOne = "Ao grito de desafio que o veado macho lança aos seus rivais na época do cio",
            optionTwo = "Ao grito que as cervas utilizam para chamar as crias",
            optionThree = "Ao grito que os veados machos utilizam para chamar as fêmeas",
            correctAnswer = 1
        )
        questionsList.add(q150)

        val q151 = Question(
            id = 150,
            question = "Quando começam os nascimentos nas cervas?",
            image = R.drawable.transparent,
            optionOne = "Março",
            optionTwo = "Abril",
            optionThree = "Maio",
            correctAnswer = 2
        )
        questionsList.add(q151)

        val q152 = Question(
            id = 151,
            question = "A armação do veado é composta por:",
            image = R.drawable.transparent,
            optionOne = "Duas hastes espalmadas, arredondadas na base",
            optionTwo = "Duas hastes cilíndricas, mais ou menos ramificadas",
            optionThree = "Duas hastes cilíndricas, espalmadas nas pontas",
            correctAnswer = 2
        )
        questionsList.add(q152)

        val q153 = Question(
            id = 152,
            question = "O termo “veludo” significa:",
            image = R.drawable.transparent,
            optionOne = "A pelagem das crias de veado até ás duas primeiras semanas de vida",
            optionTwo = "A cobertura de pele cinzenta com pelos que protege as hastes de veado em formação",
            optionThree = "O escudo anal do corço",
            correctAnswer = 2
        )
        questionsList.add(q153)

        val q154 = Question(
            id = 153,
            question = "As armações do veado adulto:",
            image = R.drawable.transparent,
            optionOne = "Só caem até ao sexto ano de vida",
            optionTwo = "Caem todos os anos durante a época do cio",
            optionThree = "Caem todos os anos depois da época do cio",
            correctAnswer = 3
        )
        questionsList.add(q154)

        val q155 = Question(
            id = 154,
            question = "Qual dos cervídeos portugueses é mais corpulento?",
            image = R.drawable.transparent,
            optionOne = "Corço",
            optionTwo = "Gamo",
            optionThree = "Veado",
            correctAnswer = 3
        )
        questionsList.add(q155)

        val q156 = Question(
            id = 155,
            question = "O veado distingue-se do corço por:",
            image = R.drawable.transparent,
            optionOne = "Ser mais corpulento",
            optionTwo = "Ter hastes ramificadas",
            optionThree = "Só os machos possuírem armação",
            correctAnswer = 1
        )
        questionsList.add(q156)

        val q157 = Question(
            id = 156,
            question = "Em que época do ano os machos de veado perdem as armações?",
            image = R.drawable.transparent,
            optionOne = "Outubro a novembro",
            optionTwo = "Fins de fevereiro e março",
            optionThree = "Nunca",
            correctAnswer = 2
        )
        questionsList.add(q157)

        val q158 = Question(
            id = 157,
            question = "Em qual das espécies as parições são frequentemente de gémeos?",
            image = R.drawable.transparent,
            optionOne = "Gamo",
            optionTwo = "Muflão",
            optionThree = "Corço",
            correctAnswer = 3
        )
        questionsList.add(q158)

        val q159 = Question(
            id = 158,
            question = "O cio do corço ocorre entre:",
            image = R.drawable.transparent,
            optionOne = "Julho e agosto",
            optionTwo = "Agosto e setembro",
            optionThree = "Setembro e outubro",
            correctAnswer = 1
        )
        questionsList.add(q159)

        val q160 = Question(
            id = 159,
            question = "No corço, os partos ocorrem geralmente em:",
            image = R.drawable.transparent,
            optionOne = "Janeiro",
            optionTwo = "Maio",
            optionThree = "Agosto",
            correctAnswer = 2
        )
        questionsList.add(q160)

        val q161 = Question(
            id = 160,
            question = "O tempo de gestação da corça é de:",
            image = R.drawable.transparent,
            optionOne = "8 meses",
            optionTwo = "9 meses",
            optionThree = "10 meses",
            correctAnswer = 3
        )
        questionsList.add(q161)

        val q162 = Question(
            id = 161,
            question = "O corço é um animal:",
            image = R.drawable.transparent,
            optionOne = "Fundamentalmente solitário",
            optionTwo = "Que forma rebanhos durante o inverno",
            optionThree = "Que forma rebanhos durante o verão",
            correctAnswer = 1
        )
        questionsList.add(q162)

        val q163 = Question(
            id = 162,
            question = "O cio do corço ocorre",
            image = R.drawable.transparent,
            optionOne = "No outono",
            optionTwo = "No verão",
            optionThree = "Na primavera",
            correctAnswer = 2
        )
        questionsList.add(q163)

        val q164 = Question(
            id = 163,
            question = "Durante a época do ano em que o corço não tem armações, como se pode distinguir o macho da fêmea?",
            image = R.drawable.transparent,
            optionOne = "Pela cor da pele",
            optionTwo = "Pelo escudo anal",
            optionThree = "Pelo tamanho das orelhas",
            correctAnswer = 2
        )
        questionsList.add(q164)

        val q165 = Question(
            id = 164,
            question = "Em que época ocorre o cio no muflão?",
            image = R.drawable.transparent,
            optionOne = "No mês de novembro",
            optionTwo = "No mês de dezembro",
            optionThree = "No mês de outubro",
            correctAnswer = 1
        )
        questionsList.add(q165)

        val q166 = Question(
            id = 165,
            question = "As parições no muflão verificam-se normalmente em:",
            image = R.drawable.transparent,
            optionOne = "Março",
            optionTwo = "Abril",
            optionThree = "Maio",
            correctAnswer = 2
        )
        questionsList.add(q166)

        val q167 = Question(
            id = 166,
            question = "Os muflões machos adultos reúnem-se em grupos independentes:",
            image = R.drawable.transparent,
            optionOne = "No inverno",
            optionTwo = "Na primavera",
            optionThree = "No verão",
            correctAnswer = 3
        )
        questionsList.add(q167)

        val q168 = Question(
            id = 167,
            question = "A seguinte figura representa:",
            image = R.drawable.q168,
            optionOne = "Perdiz-vermelha",
            optionTwo = "Faisão",
            optionThree = "Rola-comum",
            correctAnswer = 1
        )
        questionsList.add(q168)

        val q169 = Question(
            id = 168,
            question = "A seguinte figura representa:",
            image = R.drawable.q169,
            optionOne = "Uma codorniz",
            optionTwo = "Uma perdiz-vermelha",
            optionThree = "Um faisão",
            correctAnswer = 2
        )
        questionsList.add(q169)

        val q170 = Question(
            id = 169,
            question = "A perdiz-vermelha possui:",
            image = R.drawable.transparent,
            optionOne = "Bico e patas vermelhas",
            optionTwo = "Bico amarelo e patas vermelhas",
            optionThree = "Bico vermelho e patas amarelas",
            correctAnswer = 1
        )
        questionsList.add(q170)

        val q171 = Question(
            id = 170,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "Os machos serem menores e menos pesados que as fêmeas",
            optionTwo = "Os machos serem maiores e mais pesados que as fêmeas",
            optionThree = "Os machos serem do mesmo tamanho que as fêmeas",
            correctAnswer = 2
        )
        questionsList.add(q171)

        val q172 = Question(
            id = 171,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "A cabeça dos machos ser mais volumosa que a das fêmeas",
            optionTwo = "A cabeça dos machos ser menos volumosa que a das fêmeas",
            optionThree = "A cabeça das fêmeas ser mais volumosa que a dos machos",
            correctAnswer = 1
        )
        questionsList.add(q172)

        val q173 = Question(
            id = 172,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "As fêmeas terem tarsos mais curtos e delgados",
            optionTwo = "As fêmeas terem os tarsos mais compridos e grossos",
            optionThree = "As fêmeas terem os tarsos mais curtos e grossos",
            correctAnswer = 1
        )
        questionsList.add(q173)

        val q174 = Question(
            id = 173,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "Os machos terem tarsos mais curtos e grossos",
            optionTwo = "Os machos terem tarsos mais compridos e grossos",
            optionThree = "Os machos terem tarsos mais curtos e delgados",
            correctAnswer = 2
        )
        questionsList.add(q174)

        val q175 = Question(
            id = 174,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "Os machos terem esporões com base larga e extremidade arredondada",
            optionTwo = "Os machos terem esporões com base estreita e extremidade bicuda",
            optionThree = "Os machos terem esporões com base larga e extremidade bicuda",
            correctAnswer = 1
        )
        questionsList.add(q175)

        val q176 = Question(
            id = 175,
            question = "Na perdiz-vermelha, uma das formas de distinguir os machos das fêmeas é:",
            image = R.drawable.transparent,
            optionOne = "As fêmeas, quando apresentam esporões, estes têm a base estreita e são bicudos",
            optionTwo = "As fêmeas, quando apresentam esporões, estes têm a base estreita e são redondos",
            optionThree = "As fêmeas, quando apresentam esporões, estes têm a base larga e são bicudos",
            correctAnswer = 1
        )
        questionsList.add(q176)

        val q177 = Question(
            id = 176,
            question = "Na perdiz-vermelha, enquanto juvenil, a muda das penas tem início:",
            image = R.drawable.transparent,
            optionOne = "Ao primeiro mês de vida",
            optionTwo = "Ao segundo mês de vida",
            optionThree = "Ao terceiro mês de vida",
            correctAnswer = 1
        )
        questionsList.add(q177)

        val q178 = Question(
            id = 177,
            question = "Na perdiz-vermelha, enquanto juvenil, as duas últimas rémiges são:",
            image = R.drawable.transparent,
            optionOne = "Pontiagudas e podem apresentar uma pequena pinta branca na extremidade",
            optionTwo = "Arredondadas e podem apresentar uma pequena pinta branca na extremidade",
            optionThree = "Pontiagudas e sem apresentar uma pequena pinta branca na extremidade",
            correctAnswer = 1
        )
        questionsList.add(q178)

        val q179 = Question(
            id = 178,
            question = "Na perdiz-vermelha, o adulto inicia a muda de todas as rémiges primárias:",
            image = R.drawable.transparent,
            optionOne = "Ao mesmo tempo que o juvenil",
            optionTwo = "Duas ou três semanas antes do juvenil",
            optionThree = "Duas ou três semanas depois do juvenil",
            correctAnswer = 2
        )
        questionsList.add(q179)

        val q180 = Question(
            id = 179,
            question = "Na perdiz-vermelha adulta, as duas últimas penas:",
            image = R.drawable.transparent,
            optionOne = "Podem apresentar uma pequena pinta branca na extremidade",
            optionTwo = "Têm a extremidade arredondada",
            optionThree = "Têm a extremidade pontiaguda",
            correctAnswer = 2
        )
        questionsList.add(q180)

        val q181 = Question(
            id = 180,
            question = "A perdiz-vermelha, é uma ave que prefere especialmente:",
            image = R.drawable.transparent,
            optionOne = "Zonas alagadiças e incultas",
            optionTwo = "Zonas florestadas e com matos",
            optionThree = "Zonas de culturas cerealíferas",
            correctAnswer = 3
        )
        questionsList.add(q181)

        val q182 = Question(
            id = 181,
            question = "Qual destas atuações contribui para a boa gestão de uma população de perdizes?",
            image = R.drawable.transparent,
            optionOne = "A utilização de pesticidas nas culturas",
            optionTwo = "O abate de mais de 60% dos efetivos",
            optionThree = "O abate de menos de 50% dos efetivos",
            correctAnswer = 3
        )
        questionsList.add(q182)

        val q183 = Question(
            id = 182,
            question = "Na perdiz-vermelha, a alimentação durante o primeiro mês de vida é:",
            image = R.drawable.transparent,
            optionOne = "Essencialmente insectívora",
            optionTwo = "Essencialmente granívora",
            optionThree = "Essencialmente vegetal",
            correctAnswer = 1
        )
        questionsList.add(q183)

        val q184 = Question(
            id = 183,
            question = "Na perdiz-vermelha adulta, a alimentação é constituída por:",
            image = R.drawable.transparent,
            optionOne = "Insetos, bagas, flores e grãos",
            optionTwo = "Grãos, bolotas, folhas, raízes e insetos",
            optionThree = "Grãos, bolotas, folhas, rebentos, bagas, flores e raízes",
            correctAnswer = 3
        )
        questionsList.add(q184)

        val q185 = Question(
            id = 184,
            question = "A perdiz-vermelha, faz o ninho, geralmente:",
            image = R.drawable.transparent,
            optionOne = "No chão, com o fundo simplesmente coberto de plantas secas",
            optionTwo = "No chão, com o fundo simplesmente coberto de penas suas",
            optionThree = "No chão, com o fundo coberto de plantas secas e penas suas",
            correctAnswer = 1
        )
        questionsList.add(q185)

        val q186 = Question(
            id = 185,
            question = "Na perdiz-vermelha, a postura de ovos, no sul do País faz-se durante os meses de:",
            image = R.drawable.transparent,
            optionOne = "Março a abril",
            optionTwo = "Abril a maio",
            optionThree = "Abril a junho",
            correctAnswer = 1
        )
        questionsList.add(q186)

        val q187 = Question(
            id = 186,
            question = "Os perdigotos logo que nascem:",
            image = R.drawable.transparent,
            optionOne = "Permanecem no ninho durante duas semanas",
            optionTwo = "Permanecem no ninho pelo menos uma semana",
            optionThree = "Abandonam o ninho",
            correctAnswer = 3
        )
        questionsList.add(q187)

        val q188 = Question(
            id = 187,
            question = "Na perdiz-vermelha, a incubação dos ovos, dura cerca de:",
            image = R.drawable.transparent,
            optionOne = "21 dias",
            optionTwo = "23 dias",
            optionThree = "25 dias",
            correctAnswer = 2
        )
        questionsList.add(q188)

        val q189 = Question(
            id = 188,
            question = "Em média, o ninho de perdiz-vermelha contém:",
            image = R.drawable.transparent,
            optionOne = "10 ovos",
            optionTwo = "12 ovos",
            optionThree = "14 ovos",
            correctAnswer = 2
        )
        questionsList.add(q189)

        val q190 = Question(
            id = 189,
            question = "A perdiz-vermelha, durante o verão e até nova época de acasalamento, desloca-se:",
            image = R.drawable.transparent,
            optionOne = "Aos casais",
            optionTwo = "Isoladamente",
            optionThree = "Em bandos",
            correctAnswer = 3
        )
        questionsList.add(q190)

        val q191 = Question(
            id = 190,
            question = "Para bem gerir uma população de perdizes há que seguir certas regras. Qual está certa?",
            image = R.drawable.transparent,
            optionOne = "Colocar à sua disposição alimento, água e abrigo",
            optionTwo = "Abater, anualmente, 60% dos efetivos",
            optionThree = "Eliminar todos os predadores",
            correctAnswer = 1
        )
        questionsList.add(q191)

        val q192 = Question(
            id = 191,
            question = "Para manter o nível da população de perdizes há que seguir certas regras. Qual está errada?",
            image = R.drawable.transparent,
            optionOne = "Evitar o abuso de pesticidas",
            optionTwo = "Cuidar da maneira como são feitas as ceifas",
            optionThree = "Abater, anualmente, 60% dos efetivos",
            correctAnswer = 3
        )
        questionsList.add(q192)

        val q193 = Question(
            id = 192,
            question = "Para bem gerir uma população de perdizes há que seguir certas regras. Qual está certa?",
            image = R.drawable.transparent,
            optionOne = "Eliminar todos os predadores",
            optionTwo = "Abater, anualmente, todos os predadores",
            optionThree = "Evitar a deambulação de cães e gatos vadios",
            correctAnswer = 3
        )
        questionsList.add(q193)

        val q194 = Question(
            id = 193,
            question = "Numa população bem gerida, por cada ninho de perdiz, chegam em média à idade adulta:",
            image = R.drawable.transparent,
            optionOne = "3 perdigotos",
            optionTwo = "5 perdigotos",
            optionThree = "7 perdigotos",
            correctAnswer = 2
        )
        questionsList.add(q194)

        val q195 = Question(
            id = 194,
            question = "A perdiz-vermelha faz geralmente o ninho:",
            image = R.drawable.transparent,
            optionOne = "Em arbustos de pequeno porte",
            optionTwo = "No chão",
            optionThree = "Em buracos de muros e paredes",
            correctAnswer = 2
        )
        questionsList.add(q195)

        val q196 = Question(
            id = 195,
            question = "A perdiz-vermelha adulta distingue-se da juvenil:",
            image = R.drawable.transparent,
            optionOne = "Pela cor e tamanho",
            optionTwo = "Pela observação das rémiges primárias (as dez penas da extremidade da asa)",
            optionThree = "Pelos tarsos e esporões",
            correctAnswer = 2
        )
        questionsList.add(q196)

        val q197 = Question(
            id = 196,
            question = "A perdiz-vermelha é uma espécie que prefere:",
            image = R.drawable.transparent,
            optionOne = "Zonas de culturas cerealíferas",
            optionTwo = "Zonas com solos leves e húmidos",
            optionThree = "Zonas rochosas incluindo a orla marítima",
            correctAnswer = 1
        )
        questionsList.add(q197)

        val q198 = Question(
            id = 197,
            question = "A seguinte figura representa:",
            image = R.drawable.q198,
            optionOne = "Um pombo-torcaz",
            optionTwo = "Um pombo-bravo",
            optionThree = "Uma rola-comum",
            correctAnswer = 3
        )
        questionsList.add(q198)

        val q199 = Question(
            id = 198,
            question = "A rola-comum distingue-se dos pombos por:",
            image = R.drawable.transparent,
            optionOne = "Ser mais pequena e de silhueta mais esbelta",
            optionTwo = "Ser mais pequena e de silhueta menos esbelta",
            optionThree = "Ser mais pequena e de silhueta mais atarracada",
            correctAnswer = 1
        )
        questionsList.add(q199)

        val q200 = Question(
            id = 199,
            question = "A rola-comum distingue-se dos pombos por:",
            image = R.drawable.transparent,
            optionOne = "Em voo, ter um batimento de asas menos irregular",
            optionTwo = "Em voo, ter um batimento de asas mais irregular",
            optionThree = "Em voo, ter um batimento de asas mais lento",
            correctAnswer = 2
        )
        questionsList.add(q200)

        val q201 = Question(
            id = 200,
            question = "A rola-comum distingue-se dos pombos por:",
            image = R.drawable.transparent,
            optionOne = "Em voo, notar-se a cauda negra com barra terminal escura",
            optionTwo = "Em voo, notar-se a cauda branca com barra terminal escura",
            optionThree = "Em voo, notar-se a cauda negra com barra terminal branca",
            correctAnswer = 3
        )
        questionsList.add(q201)

        val q202 = Question(
            id = 201,
            question = "A rola-comum é uma ave migradora que inverna:",
            image = R.drawable.transparent,
            optionOne = "No continente africano e nidifica na Europa",
            optionTwo = "No continente europeu e nidifica em África",
            optionThree = "No continente americano e nidifica na Europa",
            correctAnswer = 1
        )
        questionsList.add(q202)

        val q203 = Question(
            id = 202,
            question = "A entrada das rolas na Europa dá-se a partir do mês de:",
            image = R.drawable.transparent,
            optionOne = "Março",
            optionTwo = "Abril",
            optionThree = "Maio",
            correctAnswer = 2
        )
        questionsList.add(q203)

        val q204 = Question(
            id = 203,
            question = "A rola-comum, é uma espécie que prefere:",
            image = R.drawable.transparent,
            optionOne = "Matas pouco densas alternando com zonas alagadiças",
            optionTwo = "Matas densas alternando com searas e pastos",
            optionThree = "Zonas alagadiças alternando com searas e pastos",
            correctAnswer = 2
        )
        questionsList.add(q204)

        val q205 = Question(
            id = 204,
            question = "A rola-comum, em termos alimentares, é:",
            image = R.drawable.transparent,
            optionOne = "Uma ave insectívora",
            optionTwo = "Uma ave insectívora e granívora",
            optionThree = "Uma ave granívora",
            correctAnswer = 3
        )
        questionsList.add(q205)

        val q206 = Question(
            id = 205,
            question = "A rola-comum baseia a sua alimentação em:",
            image = R.drawable.transparent,
            optionOne = "Sementes, cereais e também insetos, embora em pequena percentagem",
            optionTwo = "Sementes, rebentos novos e também insetos, embora em pequena percentagem",
            optionThree = "Cereais, rebentos novos e também insetos, embora em pequena percentagem",
            correctAnswer = 1
        )
        questionsList.add(q206)

        val q207 = Question(
            id = 206,
            question = "A rola-comum é normalmente avistada:",
            image = R.drawable.transparent,
            optionOne = "Aos pares ou em grandes grupos",
            optionTwo = "Aos pares ou isoladas",
            optionThree = "Aos pares ou em grupos muito pequenos",
            correctAnswer = 3
        )
        questionsList.add(q207)

        val q208 = Question(
            id = 207,
            question = "Os primeiros ninhos de rola-comum são feitos em:",
            image = R.drawable.transparent,
            optionOne = "Maio",
            optionTwo = "Abril",
            optionThree = "Junho",
            correctAnswer = 1
        )
        questionsList.add(q208)

        val q209 = Question(
            id = 208,
            question = "A postura da rola-comum é de:",
            image = R.drawable.transparent,
            optionOne = "Três ovos, raramente um",
            optionTwo = "Dois ovos, raramente um",
            optionThree = "Quatro ovos, raramente dois",
            correctAnswer = 2
        )
        questionsList.add(q209)

        val q210 = Question(
            id = 209,
            question = "A incubação dos ovos, no caso da rola-comum:",
            image = R.drawable.transparent,
            optionOne = "É feita só pelas fêmeas",
            optionTwo = "É feita só pelos machos",
            optionThree = "É feita por ambos os sexos",
            correctAnswer = 3
        )
        questionsList.add(q210)

        val q211 = Question(
            id = 210,
            question = "Em voo, a rola-comum distingue-se dos pombos por se notar:",
            image = R.drawable.transparent,
            optionOne = "A cauda negra com barra terminal escura",
            optionTwo = "A cauda branca com barra terminal escura",
            optionThree = "A cauda negra com barra terminal branca",
            correctAnswer = 3
        )
        questionsList.add(q211)

        val q212 = Question(
            id = 211,
            question = "Qual o habitat preferencial da rola-comum:",
            image = R.drawable.transparent,
            optionOne = "Matas densas alternando com campos abertos",
            optionTwo = "Florestas",
            optionThree = "Zonas húmidas",
            correctAnswer = 1
        )
        questionsList.add(q212)

        val q213 = Question(
            id = 212,
            question = "A codorniz é uma espécie:",
            image = R.drawable.transparent,
            optionOne = "Migradora invernante em todo o País",
            optionTwo = "Migradora estival em todo o País",
            optionThree = "Migradora invernante no norte do País",
            correctAnswer = 2
        )
        questionsList.add(q213)

        val q214 = Question(
            id = 213,
            question = "Pode afirmar-se que a codorniz é:",
            image = R.drawable.transparent,
            optionOne = "O mais pequeno animal europeu",
            optionTwo = "O mais pequeno herbívoro europeu",
            optionThree = "O mais pequeno galináceo europeu",
            correctAnswer = 3
        )
        questionsList.add(q214)

        val q215 = Question(
            id = 214,
            question = "A codorniz é uma espécie que:",
            image = R.drawable.transparent,
            optionOne = "Vem de África para criar na Europa",
            optionTwo = "Vem do Médio Oriente para criar na Europa",
            optionThree = "Sedentária no norte do País",
            correctAnswer = 1
        )
        questionsList.add(q215)

        val q216 = Question(
            id = 215,
            question = "A codorniz é uma espécie que:",
            image = R.drawable.transparent,
            optionOne = "Se pode encontrar durante todo o ano no norte do País",
            optionTwo = "Se pode encontrar durante todo o ano no sul do País",
            optionThree = "Se pode encontrar durante todo o ano no sul do País e nos Açores",
            correctAnswer = 3
        )
        questionsList.add(q216)

        val q217 = Question(
            id = 216,
            question = "O cantar da codorniz pode ser ouvido:",
            image = R.drawable.transparent,
            optionOne = "De dia e ao crepúsculo da manhã",
            optionTwo = "De noite e ao crepúsculo da tarde",
            optionThree = "Quer de dia quer de noite",
            correctAnswer = 3
        )
        questionsList.add(q217)

        val q218 = Question(
            id = 217,
            question = "A codorniz é uma espécie que prefere:",
            image = R.drawable.transparent,
            optionOne = "Campos cultivados, searas, pastos e espaços abertos em bosques",
            optionTwo = "Campos cultivados, searas, pastos e zonas alagadiças",
            optionThree = "Campos cultivados, searas, pastos e zonas pedregosas",
            correctAnswer = 1
        )
        questionsList.add(q218)

        val q219 = Question(
            id = 218,
            question = "A codorniz é uma espécie que:",
            image = R.drawable.transparent,
            optionOne = "Nidifica em arbustos de pequeno porte",
            optionTwo = "Nidifica no solo",
            optionThree = "Nidifica em arbustos de médio porte",
            correctAnswer = 2
        )
        questionsList.add(q219)

        val q220 = Question(
            id = 219,
            question = "O ninho da codorniz é formado por:",
            image = R.drawable.transparent,
            optionOne = "Uma ligeira depressão forrada com penas da própria codorniz",
            optionTwo = "Uma ligeira depressão forrada com detritos diversos",
            optionThree = "Uma ligeira depressão forrada com material vegetal",
            correctAnswer = 3
        )
        questionsList.add(q220)

        val q221 = Question(
            id = 220,
            question = "A codorniz é uma espécie que cria geralmente:",
            image = R.drawable.transparent,
            optionOne = "De meados de maio a junho",
            optionTwo = "De meados de maio a julho",
            optionThree = "De meados de abril a junho",
            correctAnswer = 1
        )
        questionsList.add(q221)

        val q222 = Question(
            id = 221,
            question = "Na codorniz, a incubação dos ovos é feita:",
            image = R.drawable.transparent,
            optionOne = "Só pelo macho",
            optionTwo = "Só pela fêmea",
            optionThree = "Por ambos os sexos",
            correctAnswer = 2
        )
        questionsList.add(q222)

        val q223 = Question(
            id = 222,
            question = "Na codorniz, a incubação dos ovos dura entre:",
            image = R.drawable.transparent,
            optionOne = "12 a 16 dias",
            optionTwo = "16 a 21 dias",
            optionThree = "18 a 21 dias",
            correctAnswer = 2
        )
        questionsList.add(q223)

        val q224 = Question(
            id = 223,
            question = "Na codorniz, a partir de que idade podem os pintos migrar juntamente com os adultos?",
            image = R.drawable.transparent,
            optionOne = "Com 2 meses",
            optionTwo = "Com 3 meses",
            optionThree = "Com 4 meses",
            correctAnswer = 1
        )
        questionsList.add(q224)

        val q225 = Question(
            id = 224,
            question = "Pode afirmar-se que a codorniz é:",
            image = R.drawable.transparent,
            optionOne = "O mais pequeno animal europeu",
            optionTwo = "O mais pequeno galináceo europeu",
            optionThree = "O mais pequeno herbívoro europeu",
            correctAnswer = 2
        )
        questionsList.add(q225)

        val q226 = Question(
            id = 225,
            question = "A codorniz faz geralmente o ninho:",
            image = R.drawable.transparent,
            optionOne = "Em arbustos e árvores de pequeno porte",
            optionTwo = "Em árvores de grande porte",
            optionThree = "No solo",
            correctAnswer = 3
        )
        questionsList.add(q226)

        val q227 = Question(
            id = 226,
            question = "Qual das afirmações está correta:",
            image = R.drawable.transparent,
            optionOne = "A rola inicia a construção do ninho em abril",
            optionTwo = "Os pintos da codorniz podem migrar com os adultos com dois meses de vida",
            optionThree = "A lebre tem apenas uma ninhada por ano",
            correctAnswer = 2
        )
        questionsList.add(q227)

        val q228 = Question(
            id = 227,
            question = "A seguinte figura representa:",
            image = R.drawable.q228,
            optionOne = "Um arrabio",
            optionTwo = "Um pato-trombeteiro",
            optionThree = "Um pato-real",
            correctAnswer = 1
        )
        questionsList.add(q228)

        val q229 = Question(
            id = 228,
            question = "A seguinte figura representa:",
            image = R.drawable.q229,
            optionOne = "Arrabio",
            optionTwo = "Frisada",
            optionThree = "Pato-real",
            correctAnswer = 3
        )
        questionsList.add(q229)

        val q230 = Question(
            id = 229,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem tamanho pequeno a médio",
            optionTwo = "Possuírem tamanho médio",
            optionThree = "Possuírem tamanho médio a grande",
            correctAnswer = 1
        )
        questionsList.add(q230)

        val q231 = Question(
            id = 230,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem pescoço, asas e patas curtas",
            optionTwo = "Possuírem pescoço e patas de tamanho médio",
            optionThree = "Possuírem pescoço e patas compridas",
            correctAnswer = 2
        )
        questionsList.add(q231)

        val q232 = Question(
            id = 231,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem espelho alar geralmente com brilho metálico",
            optionTwo = "Possuírem franja alar branca ou pálida",
            optionThree = "Possuírem coloração quase sempre escura",
            correctAnswer = 1
        )
        questionsList.add(q232)

        val q233 = Question(
            id = 232,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Apresentarem dimorfismo sexual variável conforme as espécies",
            optionTwo = "Não apresentarem dimorfismo sexual",
            optionThree = "Apresentarem dimorfismo sexual acentuado na maioria das espécies",
            correctAnswer = 3
        )
        questionsList.add(q233)

        val q234 = Question(
            id = 233,
            question = "Qual das espécies de patos seguintes não apresenta “espelho alar”?",
            image = R.drawable.transparent,
            optionOne = "Pato-real",
            optionTwo = "Frisada",
            optionThree = "Zarro-comum",
            correctAnswer = 3
        )
        questionsList.add(q234)

        val q235 = Question(
            id = 234,
            question = "Os patos que apresentam “espelho alar” geralmente com brilho metálico, são os:",
            image = R.drawable.transparent,
            optionOne = "Patos de superfície",
            optionTwo = "Patos marinhos",
            optionThree = "Patos mergulhadores",
            correctAnswer = 1
        )
        questionsList.add(q235)

        val q236 = Question(
            id = 235,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Terem uma alimentação preferencialmente animal",
            optionTwo = "Obterem a sua alimentação através do mergulho",
            optionThree = "Arrancarem as plantas do fundo com o terço posterior emerso",
            correctAnswer = 3
        )
        questionsList.add(q236)

        val q237 = Question(
            id = 236,
            question = "Uma das características dos patos de superfície é:",
            image = R.drawable.transparent,
            optionOne = "Levantarem voo quase na vertical",
            optionTwo = "Patinharem na água antes de levantar voo",
            optionThree = "Emergirem praticamente no local onde imergiram",
            correctAnswer = 1
        )
        questionsList.add(q237)

        val q238 = Question(
            id = 237,
            question = "A alimentação dos patos de superfície é constituída à base de:",
            image = R.drawable.transparent,
            optionOne = "Microrganismos em suspensão na água e plantas do fundo",
            optionTwo = "Moluscos, vermes e plantas",
            optionThree = "Moluscos, vermes e peixes",
            correctAnswer = 1
        )
        questionsList.add(q238)

        val q239 = Question(
            id = 238,
            question = "Uma das características dos patos mergulhadores é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem franja alar branca ou pálida",
            optionTwo = "Possuírem coloração quase sempre escura",
            optionThree = "Possuírem espelho com reflexos metálicos",
            correctAnswer = 1
        )
        questionsList.add(q239)

        val q240 = Question(
            id = 239,
            question = "Uma das características dos patos mergulhadores é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem tamanho pequeno a médio",
            optionTwo = "Possuírem tamanho médio",
            optionThree = "Possuírem tamanho médio a grande",
            correctAnswer = 1
        )
        questionsList.add(q240)

        val q241 = Question(
            id = 240,
            question = "Uma das características dos patos mergulhadores é:",
            image = R.drawable.transparent,
            optionOne = "Possuírem pescoço e patas compridas",
            optionTwo = "Possuírem pescoço, asas e patas curtas",
            optionThree = "Possuírem pescoço e patas de tamanho médio",
            correctAnswer = 2
        )
        questionsList.add(q241)

        val q242 = Question(
            id = 241,
            question = "Uma das características dos patos mergulhadores é:",
            image = R.drawable.transparent,
            optionOne = "Apresentarem dimorfismo sexual variável conforme as espécies",
            optionTwo = "Apresentarem dimorfismo sexual acentuado na maioria das espécies",
            optionThree = "Não apresentarem dimorfismo sexual",
            correctAnswer = 1
        )
        questionsList.add(q242)

        val q243 = Question(
            id = 242,
            question = "Uma das características dos patos mergulhadores é:",
            image = R.drawable.transparent,
            optionOne = "Patinharem na água antes de levantar voo",
            optionTwo = "Levantarem voo quase na vertical",
            optionThree = "Emergirem a alguns metros do local onde mergulharam",
            correctAnswer = 1
        )
        questionsList.add(q243)

        val q244 = Question(
            id = 243,
            question = "Dos seguintes conjuntos de espécies, qual deles é vulgar encontrar no mês de janeiro, num habitat classificado como zona húmida?",
            image = R.drawable.transparent,
            optionOne = "Pato-trombeteiro, galinha-d’água e galeirão",
            optionTwo = "Tarambola-dourada, pato-real e lebre",
            optionThree = "Arrabio, pombo-torcaz e galeirão",
            correctAnswer = 1
        )
        questionsList.add(q244)

        val q245 = Question(
            id = 244,
            question = "Nos patos mergulhadores, a alimentação é constituída à base de:",
            image = R.drawable.transparent,
            optionOne = "Moluscos, vermes e peixes",
            optionTwo = "Moluscos, vermes e plantas",
            optionThree = "Microrganismos em suspensão na água e plantas do fundo",
            correctAnswer = 2
        )
        questionsList.add(q245)

        val q246 = Question(
            id = 245,
            question = "À exceção do pato-real e do marreco, as restantes espécies de patos ocorrentes no País:",
            image = R.drawable.transparent,
            optionOne = "Invernam em Portugal e criam no Norte e Centro da Europa",
            optionTwo = "Invernam em Portugal e criam no Norte e Sul da Europa",
            optionThree = "Invernam em Portugal e criam no Sul e Centro da Europa",
            correctAnswer = 1
        )
        questionsList.add(q246)

        val q247 = Question(
            id = 246,
            question = "A maior parte da população de pato-real ocorrente no nosso País é:",
            image = R.drawable.transparent,
            optionOne = "Migradora invernante",
            optionTwo = "Migradora de passagem",
            optionThree = "Sedentária",
            correctAnswer = 3
        )
        questionsList.add(q247)

        val q248 = Question(
            id = 247,
            question = "A frisada é um pato de superfície, cujo macho possui um espelho alar:",
            image = R.drawable.transparent,
            optionOne = "Pequeno branco, orlado em cima por negro e ruivo vivo",
            optionTwo = "Verde brilhante",
            optionThree = "Verde bronze",
            correctAnswer = 1
        )
        questionsList.add(q248)

        val q249 = Question(
            id = 248,
            question = "O pato-trombeteiro macho distingue-se por possuir:",
            image = R.drawable.transparent,
            optionOne = "Dorso cinzento, pescoço, cabeça e peito cor de tijolo, fronte amarela",
            optionTwo = "Cabeça verde, peito branco, mancha castanha nos flancos e ventre",
            optionThree = "Dorso acinzentado, cabeça verde, peito castanho, partes inferiores claras",
            correctAnswer = 2
        )
        questionsList.add(q249)

        val q250 = Question(
            id = 249,
            question = "A fêmea do zarro-comum, distingue-se do macho por possuir:",
            image = R.drawable.transparent,
            optionOne = "Coloração acastanhada, com anel cinzento-azulado à volta do bico",
            optionTwo = "Um bico espatulado negro",
            optionThree = "Uma coloração acastanhada, com bico alaranjado",
            correctAnswer = 1
        )
        questionsList.add(q250)

        val q251 = Question(
            id = 250,
            question = "O arrabio é um pato de superfície que se pode distinguir dos outros patos por:",
            image = R.drawable.transparent,
            optionOne = "Possuir um bico espatulado muito desenvolvido",
            optionTwo = "Possuir pescoço branco e peito cor de tijolo",
            optionThree = "Possuir um pescoço comparativamente mais longo e esbelto",
            correctAnswer = 3
        )
        questionsList.add(q251)

        val q252 = Question(
            id = 251,
            question = "O zarro-comum macho é um pato mergulhador que se pode distinguir por:",
            image = R.drawable.transparent,
            optionOne = "Possuir cabeça e pescoço castanho avermelhado, peito e corpo cinzentos",
            optionTwo = "Possuir cabeça avermelhada com sobrancelha branca",
            optionThree = "Cor geral castanho acinzentada, pescoço, cabeça e peito cor de tijolo",
            correctAnswer = 1
        )
        questionsList.add(q252)

        val q253 = Question(
            id = 252,
            question = "Qual das seguintes espécies apresenta um “espelho azul”?",
            image = R.drawable.transparent,
            optionOne = "Zarro-comum",
            optionTwo = "Pato-real",
            optionThree = "Pato-trombeteiro",
            correctAnswer = 2
        )
        questionsList.add(q253)

        val q254 = Question(
            id = 253,
            question = "Como se distinguem os patos de superfície dos patos mergulhadores?",
            image = R.drawable.transparent,
            optionOne = "São maiores",
            optionTwo = "Levantam voo quase na vertical",
            optionThree = "Têm cores menos brilhantes",
            correctAnswer = 2
        )
        questionsList.add(q254)

        val q255 = Question(
            id = 254,
            question = "Qual das espécies de patos seguintes não apresenta “espelho alar”?",
            image = R.drawable.transparent,
            optionOne = "Pato-real",
            optionTwo = "Frisada",
            optionThree = "Zarro-comum",
            correctAnswer = 3
        )
        questionsList.add(q255)

        val q256 = Question(
            id = 255,
            question = "A galinha-d’água possui:",
            image = R.drawable.transparent,
            optionOne = "Bico vermelho com a ponta amarela",
            optionTwo = "Bico amarelo com ponta vermelha",
            optionThree = "Bico vermelho com ponta branca",
            correctAnswer = 1
        )
        questionsList.add(q256)

        val q257 = Question(
            id = 256,
            question = "A galinha-d’água possui:",
            image = R.drawable.transparent,
            optionOne = "Placa frontal branca",
            optionTwo = "Placa frontal amarela",
            optionThree = "Placa frontal vermelha",
            correctAnswer = 3
        )
        questionsList.add(q257)

        val q258 = Question(
            id = 257,
            question = "A galinha-d’água é muito comum em:",
            image = R.drawable.transparent,
            optionOne = "Charcos, lagoas, zonas alagadas e cursos de água lentos",
            optionTwo = "Charcos, lagoas e cursos de água muito rápidos",
            optionThree = "Lagoas, zonas alagadas e cursos de água temporários",
            correctAnswer = 1
        )
        questionsList.add(q258)

        val q259 = Question(
            id = 258,
            question = "A galinha-d’água é muito comum em:",
            image = R.drawable.transparent,
            optionOne = "Charcos, lagoas, zonas alagadas e cursos de água lentos",
            optionTwo = "Cursos de água muito rápidos sem vegetação nas margens",
            optionThree = "Zonas de matos e arvoredo abundante",
            correctAnswer = 1
        )
        questionsList.add(q259)

        val q260 = Question(
            id = 259,
            question = "A atividade da galinha-d’água é:",
            image = R.drawable.transparent,
            optionOne = "Essencialmente diurna",
            optionTwo = "Essencialmente noturna",
            optionThree = "Essencialmente crepuscular",
            correctAnswer = 3
        )
        questionsList.add(q260)

        val q261 = Question(
            id = 260,
            question = "A seguinte figura representa:",
            image = R.drawable.q261,
            optionOne = "Um galeirão",
            optionTwo = "Uma galinha-d’água",
            optionThree = "Um abibe",
            correctAnswer = 2
        )
        questionsList.add(q261)

        val q262 = Question(
            id = 261,
            question = "O galeirão, em relação à galinha-d’água, apresenta um aspeto:",
            image = R.drawable.transparent,
            optionOne = "Mais pesado e menos vivo",
            optionTwo = "Menos pesado e menos vivo",
            optionThree = "Mais pesado e mais vivo",
            correctAnswer = 1
        )
        questionsList.add(q262)

        val q263 = Question(
            id = 262,
            question = "O galeirão distingue-se da galinha-d’água por possuir:",
            image = R.drawable.transparent,
            optionOne = "Bico branco e placa frontal vermelha",
            optionTwo = "Bico branco e placa frontal branca",
            optionThree = "Bico vermelho e placa frontal branca",
            correctAnswer = 2
        )
        questionsList.add(q263)

        val q264 = Question(
            id = 263,
            question = "Os galeirões, durante o inverno:",
            image = R.drawable.transparent,
            optionOne = "Constituem grandes bandos",
            optionTwo = "Observam-se aos casais",
            optionThree = "São animais solitários",
            correctAnswer = 1
        )
        questionsList.add(q264)

        val q265 = Question(
            id = 264,
            question = "Os galeirões, durante a época de reprodução:",
            image = R.drawable.transparent,
            optionOne = "São animais muito sociáveis, constituindo grandes bandos",
            optionTwo = "São animais combativos e extremamente territoriais",
            optionThree = "São animais que andam sós ou em pequenos grupos",
            correctAnswer = 2
        )
        questionsList.add(q265)

        val q266 = Question(
            id = 265,
            question = "Qual a estação do ano em que os galeirões podem ser observados em grandes bandos?",
            image = R.drawable.transparent,
            optionOne = "Inverno",
            optionTwo = "Primavera",
            optionThree = "Outono",
            correctAnswer = 1
        )
        questionsList.add(q266)

        val q267 = Question(
            id = 266,
            question = "A seguinte figura representa:",
            image = R.drawable.q267,
            optionOne = "Uma perdiz-vermelha",
            optionTwo = "Uma rola-comum",
            optionThree = "Um pombo-torcaz",
            correctAnswer = 3
        )
        questionsList.add(q267)

        val q268 = Question(
            id = 267,
            question = "A seguinte figura representa:",
            image = R.drawable.q268,
            optionOne = "Uma rola-comum",
            optionTwo = "Um pombo-da-rocha",
            optionThree = "Um pombo-torcaz",
            correctAnswer = 2
        )
        questionsList.add(q268)

        val q269 = Question(
            id = 268,
            question = "Os pombos podem caracterizar-se por possuírem:",
            image = R.drawable.transparent,
            optionOne = "Aspeto robusto, asas pontiagudas, cabeça pequena, cauda comprida e voo rápido",
            optionTwo = "Aspeto robusto, asas arredondadas, cabeça grande, cauda comprida e voo rápido",
            optionThree = "Aspeto robusto, asas pontiagudas, cabeça média, cauda curta e voo muito rápido",
            correctAnswer = 1
        )
        questionsList.add(q269)

        val q270 = Question(
            id = 269,
            question = "Normalmente, os pombos, fora da época de criação:",
            image = R.drawable.transparent,
            optionOne = "Vivem aos pares",
            optionTwo = "Vivem isolados",
            optionThree = "Vivem em bandos",
            correctAnswer = 3
        )
        questionsList.add(q270)

        val q271 = Question(
            id = 270,
            question = "O pombo-torcaz, distingue-se dos restantes pombos por possuir:",
            image = R.drawable.transparent,
            optionOne = "Duas barras pretas nas asas",
            optionTwo = "Duas manchas brancas nos lados do pescoço e das asas",
            optionThree = "Pontas das asas negras e uropígio branco",
            correctAnswer = 2
        )
        questionsList.add(q271)

        val q272 = Question(
            id = 271,
            question = "Indique qual dos pombos apresenta maior envergadura:",
            image = R.drawable.transparent,
            optionOne = "Pombo-bravo",
            optionTwo = "Pombo-da-rocha",
            optionThree = "Pombo-torcaz",
            correctAnswer = 3
        )
        questionsList.add(q272)

        val q273 = Question(
            id = 272,
            question = "O pombo-torcaz distingue-se do pombo-bravo e do pombo-da-rocha por ser:",
            image = R.drawable.transparent,
            optionOne = "O menor dos três pombos",
            optionTwo = "O maior dos três pombos",
            optionThree = "Completamente escuro",
            correctAnswer = 2
        )
        questionsList.add(q273)

        val q274 = Question(
            id = 273,
            question = "A maioria da população de pombo-torcaz que nos visita é proveniente:",
            image = R.drawable.transparent,
            optionOne = "Do Norte da Europa",
            optionTwo = "Do Sul da Europa",
            optionThree = "Do Médio Oriente",
            correctAnswer = 1
        )
        questionsList.add(q274)

        val q275 = Question(
            id = 274,
            question = "O pombo-torcaz, normalmente constrói o ninho, em:",
            image = R.drawable.transparent,
            optionOne = "Árvores, a alturas geralmente elevadas",
            optionTwo = "Buracos de árvores e de edifícios",
            optionThree = "Árvores baixas e falésias",
            correctAnswer = 1
        )
        questionsList.add(q275)

        val q276 = Question(
            id = 275,
            question = "Dos pombos existentes entre nós, qual deles apresenta distribuição menos alargada?",
            image = R.drawable.transparent,
            optionOne = "Pombo-da-rocha",
            optionTwo = "Pombo-torcaz",
            optionThree = "Pombo-bravo",
            correctAnswer = 3
        )
        questionsList.add(q276)

        val q277 = Question(
            id = 276,
            question = "Dos pombos existentes entre nós, qual deles é parcialmente migrador?",
            image = R.drawable.transparent,
            optionOne = "Pombo-torcaz",
            optionTwo = "Pombo-da-rocha",
            optionThree = "Pombo-bravo",
            correctAnswer = 1
        )
        questionsList.add(q277)

        val q278 = Question(
            id = 277,
            question = "A qual dos pombos existentes entre nós também se dá o nome de seixa?",
            image = R.drawable.transparent,
            optionOne = "Pombo-torcaz",
            optionTwo = "Pombo-da-rocha",
            optionThree = "Pombo-bravo",
            correctAnswer = 3
        )
        questionsList.add(q278)

        val q279 = Question(
            id = 278,
            question = "A alimentação do pombo-da-rocha é à base de:",
            image = R.drawable.transparent,
            optionOne = "Bolota e azeitona",
            optionTwo = "Grãos e sementes",
            optionThree = "Grãos, bagas, sementes e bolotas",
            correctAnswer = 2
        )
        questionsList.add(q279)

        val q280 = Question(
            id = 279,
            question = "A seguinte figura representa:",
            image = R.drawable.q280,
            optionOne = "Uma narceja-comum",
            optionTwo = "Uma galinhola",
            optionThree = "Uma tarambola-dourada",
            correctAnswer = 2
        )
        questionsList.add(q280)

        val q281 = Question(
            id = 280,
            question = "Qual das frases está errada?",
            image = R.drawable.transparent,
            optionOne = "A galinhola é uma ave migradora em todo o território nacional",
            optionTwo = "A galinhola é uma ave sedentária nos Açores",
            optionThree = "A galinhola é uma ave migradora em Portugal Continental",
            correctAnswer = 1
        )
        questionsList.add(q281)

        val q282 = Question(
            id = 281,
            question = "O período de atividade da galinhola, é fundamentalmente:",
            image = R.drawable.transparent,
            optionOne = "Diurno e noturno",
            optionTwo = "Crepuscular e diurno",
            optionThree = "Crepuscular e noturno",
            correctAnswer = 3
        )
        questionsList.add(q282)

        val q283 = Question(
            id = 282,
            question = "A galinhola é uma ave:",
            image = R.drawable.transparent,
            optionOne = "Solitária",
            optionTwo = "Que se encontra aos casais",
            optionThree = "Que vive em bandos",
            correctAnswer = 1
        )
        questionsList.add(q283)

        val q284 = Question(
            id = 283,
            question = "A galinhola caracteriza-se por possuir:",
            image = R.drawable.transparent,
            optionOne = "Asas estreitas e arredondadas, bico comprido e direito",
            optionTwo = "Asas largas e arredondadas, bico curto e direito",
            optionThree = "Asas largas e arredondadas, bico comprido e direito",
            correctAnswer = 3
        )
        questionsList.add(q284)

        val q285 = Question(
            id = 284,
            question = "O voo da galinhola caracteriza-se por ser:",
            image = R.drawable.transparent,
            optionOne = "Rápido e silencioso entre as árvores",
            optionTwo = "Rápido e retilíneo",
            optionThree = "Lento e silencioso com o bico apontado para o solo",
            correctAnswer = 1
        )
        questionsList.add(q285)

        val q286 = Question(
            id = 285,
            question = "Quando em voo, a galinhola apresenta uma figura:",
            image = R.drawable.transparent,
            optionOne = "Longilínea, de asas redondas e bico apontado para o solo",
            optionTwo = "Atarracada, de asas redondas e bico apontado para o solo",
            optionThree = "Atarracada, de asas estreitas e bico apontado para o solo",
            correctAnswer = 2
        )
        questionsList.add(q286)

        val q287 = Question(
            id = 286,
            question = "A galinhola, para a sua criação, procura:",
            image = R.drawable.transparent,
            optionOne = "Países do centro e sul da Europa",
            optionTwo = "Países do norte de África",
            optionThree = "Países do centro e norte da Europa",
            correctAnswer = 3
        )
        questionsList.add(q287)

        val q288 = Question(
            id = 287,
            question = "A galinhola, em Portugal Continental é uma ave migradora:",
            image = R.drawable.transparent,
            optionOne = "Estival",
            optionTwo = "Invernante",
            optionThree = "Primaveril",
            correctAnswer = 2
        )
        questionsList.add(q288)

        val q289 = Question(
            id = 288,
            question = "A galinhola encontra-se geralmente:",
            image = R.drawable.transparent,
            optionOne = "Em bosques muito densos e fechados",
            optionTwo = "Em bosques associados a áreas de cultivo",
            optionThree = "Em bosques com vegetação arbustiva",
            correctAnswer = 3
        )
        questionsList.add(q289)

        val q290 = Question(
            id = 289,
            question = "Qual o tipo de zonas que a galinhola prefere para se alimentar?",
            image = R.drawable.transparent,
            optionOne = "Terras frescas e húmidas",
            optionTwo = "Terras pedregosas e húmidas",
            optionThree = "Terras argilosas e secas",
            correctAnswer = 1
        )
        questionsList.add(q290)

        val q291 = Question(
            id = 290,
            question = "A galinhola:",
            image = R.drawable.transparent,
            optionOne = "Encontra-se normalmente em bandos de grandes dimensões",
            optionTwo = "Encontra-se normalmente em bandos de pequenas dimensões",
            optionThree = "É uma ave solitária",
            correctAnswer = 3
        )
        questionsList.add(q291)

        val q292 = Question(
            id = 291,
            question = "Qual o habitat preferido da galinhola:",
            image = R.drawable.transparent,
            optionOne = "Zonas abertas e húmidas",
            optionTwo = "Montados de azinho",
            optionThree = "Bosques com vegetação arbustiva e terrenos frescos e húmidos",
            correctAnswer = 3
        )
        questionsList.add(q292)

        val q293 = Question(
            id = 292,
            question = "A seguinte figura representa:",
            image = R.drawable.q293,
            optionOne = "Narceja-galega",
            optionTwo = "Narceja-comum",
            optionThree = "Galinhola",
            correctAnswer = 2
        )
        questionsList.add(q293)

        val q294 = Question(
            id = 293,
            question = "As narcejas encontram-se geralmente ligadas a:",
            image = R.drawable.transparent,
            optionOne = "Bosques com vegetação arbustiva suficiente para lhes fornecer coberto",
            optionTwo = "Zonas com solos leves e húmidos",
            optionThree = "Grandes planícies cultivadas em zonas interiores",
            correctAnswer = 2
        )
        questionsList.add(q294)

        val q295 = Question(
            id = 294,
            question = "As narcejas para se alimentarem:",
            image = R.drawable.transparent,
            optionOne = "Esgravatam o solo com as patas à procura dos invertebrados de que se alimentam",
            optionTwo = "Utilizam o bico para extraírem da terra os invertebrados de que se alimentam",
            optionThree = "Perseguem os invertebrados de que se alimentam",
            correctAnswer = 2
        )
        questionsList.add(q295)

        val q296 = Question(
            id = 295,
            question = "As narcejas são caracterizadas por possuírem:",
            image = R.drawable.transparent,
            optionOne = "Grande bico, pernas e pescoço relativamente curtos",
            optionTwo = "Bico, pernas e pescoço relativamente curtos",
            optionThree = "Bico, pernas e pescoço relativamente compridos",
            correctAnswer = 1
        )
        questionsList.add(q296)

        val q297 = Question(
            id = 296,
            question = "As narcejas são animais:",
            image = R.drawable.transparent,
            optionOne = "Muito sociáveis",
            optionTwo = "Pouco sociáveis",
            optionThree = "Migradoras estivais",
            correctAnswer = 2
        )
        questionsList.add(q297)

        val q298 = Question(
            id = 297,
            question = "As narcejas, para criação, procuram:",
            image = R.drawable.transparent,
            optionOne = "Países do centro e sul da Europa",
            optionTwo = "Países do norte de África",
            optionThree = "Países do centro e norte da Europa",
            correctAnswer = 3
        )
        questionsList.add(q298)

        val q299 = Question(
            id = 298,
            question = "Entre nós, a narceja é uma ave:",
            image = R.drawable.transparent,
            optionOne = "Migradora estival",
            optionTwo = "Migradora invernante",
            optionThree = "Parcialmente migradora",
            correctAnswer = 2
        )
        questionsList.add(q299)

        val q300 = Question(
            id = 299,
            question = "Quantas espécies de narcejas ocorrem entre nós?",
            image = R.drawable.transparent,
            optionOne = "1",
            optionTwo = "2",
            optionThree = "3",
            correctAnswer = 3
        )
        questionsList.add(q300)

        val q301 = Question(
            id = 300,
            question = "Qual das espécies de narcejas ocorrentes é extremamente rara?",
            image = R.drawable.transparent,
            optionOne = "Narceja-comum",
            optionTwo = "Narceja-galega",
            optionThree = "Narceja-grande",
            correctAnswer = 3
        )
        questionsList.add(q301)

        val q302 = Question(
            id = 301,
            question = "Das espécies de narcejas que se podem caçar, qual a que tem maior envergadura?",
            image = R.drawable.transparent,
            optionOne = "Narceja-grande",
            optionTwo = "Narceja-comum",
            optionThree = "Narceja-galega",
            correctAnswer = 2
        )
        questionsList.add(q302)

        val q303 = Question(
            id = 302,
            question = "A alimentação das narcejas baseia-se em:",
            image = R.drawable.transparent,
            optionOne = "Moluscos, insetos, fragmentos vegetais, grãos",
            optionTwo = "Insetos, sementes e plantas aquáticas",
            optionThree = "Arroz, milho, caracóis e pequenas rãs",
            correctAnswer = 1
        )
        questionsList.add(q303)

        val q304 = Question(
            id = 303,
            question = "Qual destas afirmações é correta?",
            image = R.drawable.transparent,
            optionOne = "A lebre tem orelhas e tamanho diferente do coelho, mas uma coloração igual",
            optionTwo = "O pombo-torcaz distingue-se do pombo-bravo por ser mais pequeno",
            optionThree = "A narceja-comum distingue-se da narceja-galega por ser maior e ter o bico mais comprido",
            correctAnswer = 3
        )
        questionsList.add(q304)

        val q305 = Question(
            id = 304,
            question = "A alimentação da tarambola-dourada baseia-se sobretudo em:",
            image = R.drawable.transparent,
            optionOne = "Vermes, caracóis e grãos",
            optionTwo = "insetos e larvas",
            optionThree = "Moluscos, crustáceos e vermes",
            correctAnswer = 2
        )
        questionsList.add(q305)

        val q306 = Question(
            id = 305,
            question = "Quantas espécies de tarambolas se podem encontrar em Portugal?",
            image = R.drawable.transparent,
            optionOne = "3",
            optionTwo = "2",
            optionThree = "1",
            correctAnswer = 2
        )
        questionsList.add(q306)

        val q307 = Question(
            id = 306,
            question = "As tarambolas visitam Portugal:",
            image = R.drawable.transparent,
            optionOne = "Durante o inverno e primavera",
            optionTwo = "Durante o outono e inverno",
            optionThree = "Apenas durante o inverno",
            correctAnswer = 3
        )
        questionsList.add(q307)

        val q308 = Question(
            id = 307,
            question = "A tarambola-dourada encontra-se:",
            image = R.drawable.transparent,
            optionOne = "Em zonas florestais",
            optionTwo = "Especialmente em zonas interiores",
            optionThree = "Exclusivamente em áreas costeiras",
            correctAnswer = 2
        )
        questionsList.add(q308)

        val q309 = Question(
            id = 308,
            question = "Os tordos são:",
            image = R.drawable.transparent,
            optionOne = "Pássaros de tamanho pequeno",
            optionTwo = "Pássaros de tamanho grande",
            optionThree = "Pássaros de tamanho médio",
            correctAnswer = 3
        )
        questionsList.add(q309)

        val q310 = Question(
            id = 309,
            question = "Quantas espécies de tordos se podem encontrar em Portugal?",
            image = R.drawable.transparent,
            optionOne = "5",
            optionTwo = "4",
            optionThree = "3",
            correctAnswer = 2
        )
        questionsList.add(q310)

        val q311 = Question(
            id = 310,
            question = "A alimentação dos tordos baseia-se em:",
            image = R.drawable.transparent,
            optionOne = "Invertebrados e frutos",
            optionTwo = "Insetos, moluscos e caracóis",
            optionThree = "Insetos e larvas",
            correctAnswer = 1
        )
        questionsList.add(q311)

        val q312 = Question(
            id = 311,
            question = "Qual das espécies de tordos é a maior?",
            image = R.drawable.transparent,
            optionOne = "Tordeia",
            optionTwo = "Tordo-zornal",
            optionThree = "Tordo-comum",
            correctAnswer = 1
        )
        questionsList.add(q312)

        val q313 = Question(
            id = 312,
            question = "Qual das espécies de tordos é sedentária?",
            image = R.drawable.transparent,
            optionOne = "Tordo-comum",
            optionTwo = "Tordo-ruivo",
            optionThree = "Tordeia",
            correctAnswer = 3
        )
        questionsList.add(q313)

        val q314 = Question(
            id = 313,
            question = "Qual das seguintes espécies de tordos se pode identificar, em voo, por apresentar a parte inferior das asas de cor branca?",
            image = R.drawable.transparent,
            optionOne = "Tordo-ruivo",
            optionTwo = "Tordeia",
            optionThree = "Tordo-comum",
            correctAnswer = 2
        )
        questionsList.add(q314)

        val q315 = Question(
            id = 314,
            question = "O habitat dos tordos, está geralmente ligado a:",
            image = R.drawable.transparent,
            optionOne = "Zonas arborizadas ou às suas orlas",
            optionTwo = "Zonas húmidas ou às suas orlas",
            optionThree = "Zonas cerealíferas ou às suas orlas",
            correctAnswer = 1
        )
        questionsList.add(q315)

        val q316 = Question(
            id = 315,
            question = "O tordo-zornal e o tordo-ruivo são aves invernantes em Portugal que nidificam:",
            image = R.drawable.transparent,
            optionOne = "Em países do Sul da Europa",
            optionTwo = "Em países do Norte da Europa",
            optionThree = "Em países do Norte de África",
            correctAnswer = 2
        )
        questionsList.add(q316)

        val q317 = Question(
            id = 316,
            question = "Indique qual a frase correta:",
            image = R.drawable.transparent,
            optionOne = "Os saca-rabos têm uma alimentação essencialmente à base de coelho-bravo",
            optionTwo = "Os perdigotos têm uma alimentação semelhante à da perdiz adulta",
            optionThree = "Os tordos têm uma alimentação baseada em invertebrados e frutos",
            correctAnswer = 3
        )
        questionsList.add(q317)

        val q318 = Question(
            id = 317,
            question = "Os tordos encontram-se com frequência em:",
            image = R.drawable.transparent,
            optionOne = "Terrenos alagadiços",
            optionTwo = "Grandes planícies cultivadas",
            optionThree = "Zonas arborizadas ou nas suas orlas",
            correctAnswer = 3
        )
        questionsList.add(q318)

        val q319 = Question(
            id = 318,
            question = "A seguinte figura representa:",
            image = R.drawable.q319,
            optionOne = "Gralha-preta",
            optionTwo = "Melro",
            optionThree = "Estorninho-malhado",
            correctAnswer = 1
        )
        questionsList.add(q319)

        val q320 = Question(
            id = 319,
            question = "A seguinte figura representa:",
            image = R.drawable.q320,
            optionOne = "Pega-rabuda",
            optionTwo = "Gaio",
            optionThree = "Melro",
            correctAnswer = 2
        )
        questionsList.add(q320)

        val q321 = Question(
            id = 320,
            question = "O principal efeito das aves de rapina sobre as presas em geral e a caça em particular:",
            image = R.drawable.transparent,
            optionOne = "É de extermínio",
            optionTwo = "É de seleção",
            optionThree = "É insignificante",
            correctAnswer = 2
        )
        questionsList.add(q321)

        val q322 = Question(
            id = 321,
            question = "Qual das frases está incorreta?",
            image = R.drawable.transparent,
            optionOne = "O açor é uma ave de rapina diurna",
            optionTwo = "O grifo é um necrófago",
            optionThree = "A coruja-do-mato é uma ave de rapina diurna",
            correctAnswer = 3
        )
        questionsList.add(q322)

        val q323 = Question(
            id = 322,
            question = "Qual dos seguintes grupos é composto só por rapinas diurnas?",
            image = R.drawable.transparent,
            optionOne = "Abutres, águias e mochos",
            optionTwo = "Bufos, corujas e abutres",
            optionThree = "Milhafres, falcões e peneireiros",
            correctAnswer = 3
        )
        questionsList.add(q323)

        val q324 = Question(
            id = 323,
            question = "Qual das frases está correta?",
            image = R.drawable.transparent,
            optionOne = "As aves de rapina são importantes para a caça e para a agricultura",
            optionTwo = "As aves de rapina são um fator de desequilíbrio nas populações animais",
            optionThree = "As aves de rapina são o principal fator de diminuição da caça",
            correctAnswer = 1
        )
        questionsList.add(q324)

        val q325 = Question(
            id = 324,
            question = "Em termos alimentares, o lince-ibérico é uma espécie:",
            image = R.drawable.transparent,
            optionOne = "Exclusivamente insectívora",
            optionTwo = "Exclusivamente carnívora",
            optionThree = "Omnívora",
            correctAnswer = 2
        )
        questionsList.add(q325)

        val q326 = Question(
            id = 325,
            question = "A alimentação do lince-ibérico baseia-se em:",
            image = R.drawable.transparent,
            optionOne = "Coelhos-bravos",
            optionTwo = "Lebres",
            optionThree = "Perdizes",
            correctAnswer = 1
        )
        questionsList.add(q326)

        val q327 = Question(
            id = 326,
            question = "O lince-ibérico é um animal territorial. Cada animal vive numa área individual que oscila:",
            image = R.drawable.transparent,
            optionOne = "Entre 300 e 500 hectares",
            optionTwo = "Entre 500 e 800 hectares",
            optionThree = "Entre 700 e 900 hectares",
            correctAnswer = 2
        )
        questionsList.add(q327)

        val q328 = Question(
            id = 327,
            question = "Em Portugal, a abetarda é uma ave:",
            image = R.drawable.transparent,
            optionOne = "Residente",
            optionTwo = "Migradora de inverno",
            optionThree = "Migradora de verão",
            correctAnswer = 1
        )
        questionsList.add(q328)

        val q329 = Question(
            id = 328,
            question = "A abetarda pode ser observada:",
            image = R.drawable.transparent,
            optionOne = "Nas zonas rochosas e muito declivosas",
            optionTwo = "Nas planícies cerealíferas abertas",
            optionThree = "Nas zonas densamente arborizadas",
            correctAnswer = 2
        )
        questionsList.add(q329)

        val q330 = Question(
            id = 329,
            question = "Qual das afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "A abetarda é uma espécie cinegética embora não seja permitida a sua caça",
            optionTwo = "As aves de rapina são importantes para a caça e para a agricultura",
            optionThree = "As espécies que não constam do calendário venatório são consideradas protegidas",
            correctAnswer = 2
        )
        questionsList.add(q330)

        val q331 = Question(
            id = 330,
            question = "A abetarda:",
            image = R.drawable.transparent,
            optionOne = "É uma espécie cinegética e pode ser caçada de outubro a dezembro",
            optionTwo = "Não é uma espécie cinegética",
            optionThree = "É uma espécie cinegética e pode ser caçada nas condições definidas em edital do Instituto de Conservação da Natureza e das Florestas",
            correctAnswer = 2
        )
        questionsList.add(q331)

        val q332 = Question(
            id = 331,
            question = "Durante a maior parte do ano, as abetardas mantêm-se normalmente:",
            image = R.drawable.transparent,
            optionOne = "Em bandos separados por sexo",
            optionTwo = "Em casais",
            optionThree = "Em bandos com exemplares dos dois sexos",
            correctAnswer = 1
        )
        questionsList.add(q332)

        val q333 = Question(
            id = 332,
            question = "O lince-ibérico é:",
            image = R.drawable.transparent,
            optionOne = "Uma espécie de caça maior",
            optionTwo = "Uma espécie de caça menor",
            optionThree = "Uma espécie não cinegética",
            correctAnswer = 3
        )
        questionsList.add(q333)

        val q334 = Question(
            id = 333,
            question = "O habitat do lince-ibérico é tipicamente constituído por:",
            image = R.drawable.transparent,
            optionOne = "Matagais densos, em áreas de escassa influência humana",
            optionTwo = "Zonas cerealíferas, entrecortadas por bosques de árvores de folha caduca",
            optionThree = "Terrenos muito acidentados, entrecortados com áreas cultivadas",
            correctAnswer = 1
        )
        questionsList.add(q334)

        val q335 = Question(
            id = 334,
            question = "As aves de rapina merecem o estatuto de espécies integralmente protegidas, pelo que:",
            image = R.drawable.transparent,
            optionOne = "Só podem ser caçadas com autorização expressa do ICNF",
            optionTwo = "Podem ser caçadas sempre que provoquem prejuízos na agricultura",
            optionThree = "Nunca podem ser caçadas",
            correctAnswer = 3
        )
        questionsList.add(q335)

        val q336 = Question(
            id = 335,
            question = "A abundância e diversidade das aves de rapina são indicadores seguros de que uma região:",
            image = R.drawable.transparent,
            optionOne = "Possui comunidades animais ricas e sãs",
            optionTwo = "Possui uma elevada degradação do habitat",
            optionThree = "Possui fraca densidade das populações presa",
            correctAnswer = 1
        )
        questionsList.add(q336)

        val q337 = Question(
            id = 336,
            question = "Em que situação pode ser autorizada a caça à águia-pesqueira?",
            image = R.drawable.transparent,
            optionOne = "Quando se pretende utilizar em cetraria",
            optionTwo = "Desde que tenha carta de caçador de cetreiro",
            optionThree = "Nunca",
            correctAnswer = 3
        )
        questionsList.add(q337)

        val q338 = Question(
            id = 337,
            question = "Qual das frases está correta?",
            image = R.drawable.transparent,
            optionOne = "As aves de rapina capturam, preferencialmente, animais velhos e doentes, contribuindo para a sanidade das populações",
            optionTwo = "As aves de rapina exterminam a caça",
            optionThree = "A degradação do habitat provoca o aumento das populações de aves de rapina",
            correctAnswer = 1
        )
        questionsList.add(q338)

        val q339 = Question(
            id = 338,
            question = "Qual das espécies mencionadas não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "O gaio",
            optionTwo = "O melro",
            optionThree = "O gavião",
            correctAnswer = 3
        )
        questionsList.add(q339)

        val q340 = Question(
            id = 339,
            question = "Qual das espécies abaixo mencionadas não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Abibe",
            optionTwo = "Saca-rabos",
            optionThree = "Melro",
            correctAnswer = 1
        )
        questionsList.add(q340)

        val q341 = Question(
            id = 340,
            question = "Indique qual a situação em que se pode caçar uma perdiz-cinzenta ou charrela?",
            image = R.drawable.transparent,
            optionOne = "Nas condições definidas em edital do Instituto da Conservação da Natureza e das Florestas",
            optionTwo = "Em terrenos cinegéticos ordenados",
            optionThree = "Em nenhuma situação",
            correctAnswer = 3
        )
        questionsList.add(q341)

        val q342 = Question(
            id = 341,
            question = "A qual destas espécies não pode ser autorizada a sua caça?",
            image = R.drawable.transparent,
            optionOne = "Pato-trombeteiro",
            optionTwo = "Tarambola-dourada",
            optionThree = "Tarambola-prateada",
            correctAnswer = 3
        )
        questionsList.add(q342)

        val q343 = Question(
            id = 342,
            question = "Quando se pode caçar um açor?",
            image = R.drawable.transparent,
            optionOne = "Quando se pretende fazer criação em cativeiro",
            optionTwo = "Quando se pretende praticar cetraria",
            optionThree = "Nunca se pode caçar",
            correctAnswer = 3
        )
        questionsList.add(q343)

        val q344 = Question(
            id = 343,
            question = "Qual das espécies mencionadas não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Pega",
            optionTwo = "Gaio",
            optionThree = "Abetarda",
            correctAnswer = 3
        )
        questionsList.add(q344)

        val q345 = Question(
            id = 344,
            question = "Indique qual a situação em que se pode capturar uma ave de rapina?",
            image = R.drawable.transparent,
            optionOne = "Quando se pretende utilizar em cetraria",
            optionTwo = "Nenhuma",
            optionThree = "Desde que se tenha carta de cetreiro",
            correctAnswer = 2
        )
        questionsList.add(q345)

        val q346 = Question(
            id = 345,
            question = "Qual das espécies abaixo mencionadas não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Muflão",
            optionTwo = "Texugo",
            optionThree = "Corço",
            correctAnswer = 2
        )
        questionsList.add(q346)

        val q347 = Question(
            id = 346,
            question = "Qual das seguintes espécies não pode ser caçada?",
            image = R.drawable.transparent,
            optionOne = "Muflão",
            optionTwo = "Gamo",
            optionThree = "Charrela ou perdiz-cinzenta",
            correctAnswer = 3
        )
        questionsList.add(q347)

        val q348 = Question(
            id = 347,
            question = "As aves de rapina podem ser caçadas?",
            image = R.drawable.transparent,
            optionOne = "Não",
            optionTwo = "Sim, desde que constem na portaria do calendário venatório",
            optionThree = "Sim, com uma autorização do Instituto de Conservação da Natureza e das Florestas caso provoquem prejuízos",
            correctAnswer = 1
        )
        questionsList.add(q348)

        val q349 = Question(
            id = 348,
            question = "A abetarda:",
            image = R.drawable.transparent,
            optionOne = "É uma espécie cinegética cuja caça pode ser autorizada de outubro a dezembro",
            optionTwo = "Não é uma espécie cinegética",
            optionThree = "É uma espécie cinegética e pode ser caçada nas condições definidas em edital do Instituto de Conservação da Natureza e das Florestas",
            correctAnswer = 2
        )
        questionsList.add(q349)

        val q350 = Question(
            id = 349,
            question = "Normalmente as aves de rapina têm sobre as populações de espécies cinegéticas de que se alimentam:",
            image = R.drawable.transparent,
            optionOne = "Um efeito de seleção tornando-as mais saudáveis",
            optionTwo = "Um efeito prejudicial, contribuindo para o aumento de doenças",
            optionThree = "Um efeito prejudicial, porque reduzem fortemente as populações cinegéticas",
            correctAnswer = 1
        )
        questionsList.add(q350)

        val q351 = Question(
            id = 350,
            question = "Qual das espécies mencionadas não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Pato branco",
            optionTwo = "Piadeira",
            optionThree = "Negrinha",
            correctAnswer = 1
        )
        questionsList.add(q351)

        val q352 = Question(
            id = 351,
            question = "As aves de rapina alimentam-se preferencialmente de:",
            image = R.drawable.transparent,
            optionOne = "Animais mais robustos reduzindo substancialmente as populações",
            optionTwo = "Presas mais saudáveis e robustas",
            optionThree = "Presas debilitadas contribuindo assim para populações mais saudáveis",
            correctAnswer = 3
        )
        questionsList.add(q352)

        val q353 = Question(
            id = 352,
            question = "“As aves de rapina são importantes para a caça” é uma afirmação:",
            image = R.drawable.transparent,
            optionOne = "Falsa, porque as aves de rapina diminuem drasticamente as populações cinegéticas",
            optionTwo = "Falsa, porque as aves de rapina não interferem nas populações das espécies cinegéticas",
            optionThree = "Verdadeiras, porque capturam preferencialmente animais doentes e velhos contribuindo para a sanidade das populações",
            correctAnswer = 3
        )
        questionsList.add(q353)

        val q354 = Question(
            id = 353,
            question = "Qual das seguintes espécies é protegida:",
            image = R.drawable.transparent,
            optionOne = "Gamo",
            optionTwo = "Lince",
            optionThree = "Muflão",
            correctAnswer = 2
        )
        questionsList.add(q354)

        val q355 = Question(
            id = 354,
            question = "Qual das seguintes espécies não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Gamo",
            optionTwo = "Muflão",
            optionThree = "Lince",
            correctAnswer = 3
        )
        questionsList.add(q355)

        val q356 = Question(
            id = 355,
            question = "Qual destas espécies não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Gaio",
            optionTwo = "Lobo",
            optionThree = "Pega-rabuda",
            correctAnswer = 2
        )
        questionsList.add(q356)

        val q357 = Question(
            id = 356,
            question = "Durante a maior parte do ano, as abetardas:",
            image = R.drawable.transparent,
            optionOne = "Vivem em bandos do mesmo sexo",
            optionTwo = "Vivem em bandos de ambos os sexos",
            optionThree = "Vivem em casais",
            correctAnswer = 1
        )
        questionsList.add(q357)

        val q358 = Question(
            id = 357,
            question = "Qual das seguintes espécies não é cinegética?",
            image = R.drawable.transparent,
            optionOne = "Arrabio",
            optionTwo = "Milhafre",
            optionThree = "Pato-trombeteiro",
            correctAnswer = 2
        )
        questionsList.add(q358)

        val q359 = Question(
            id = 358,
            question = "Qual das seguintes espécies é protegida?",
            image = R.drawable.transparent,
            optionOne = "Águia-imperial",
            optionTwo = "Tarambola-dourada",
            optionThree = "Narceja-comum",
            correctAnswer = 1
        )
        questionsList.add(q359)

        val q360 = Question(
            id = 359,
            question = "Indique qual o grupo constituído unicamente por espécies cinegéticas:",
            image = R.drawable.transparent,
            optionOne = "Abetarda, arrabio, tarambola-prateada",
            optionTwo = "Perdiz-cinzenta, piadeira, narceja-grande",
            optionThree = "Narceja-galega, pega-rabuda, saca-rabos",
            correctAnswer = 3
        )
        questionsList.add(q360)

        val q361 = Question(
            id = 360,
            question = "Em que situação se podem caçar aves de rapina?",
            image = R.drawable.transparent,
            optionOne = "Quando causam prejuízos na agricultura",
            optionTwo = "Quando o Instituto da Conservação da Natureza e das Florestas autoriza",
            optionThree = "Nunca",
            correctAnswer = 3
        )
        questionsList.add(q361)

        val q362 = Question(
            id = 361,
            question = "Em que locais é proibido caçar, bem como numa faixa de proteção de 500 metros?",
            image = R.drawable.transparent,
            optionOne = "Nos povoados",
            optionTwo = "Nos terrenos adjacentes a estabelecimentos hospitalares",
            optionThree = "Nos terrenos ocupados com culturas frutícolas",
            correctAnswer = 2
        )
        questionsList.add(q362)

        val q363 = Question(
            id = 362,
            question = "Em que locais é proibido caçar, bem como numa faixa de proteção de 500 metros?",
            image = R.drawable.transparent,
            optionOne = "Nos terrenos adjacentes a instalações militares ou de forças de segurança",
            optionTwo = "Das linhas de caminho-de-ferro",
            optionThree = "Nos terrenos ocupados com culturas hortícolas",
            correctAnswer = 1
        )
        questionsList.add(q363)

        val q364 = Question(
            id = 363,
            question = "Nas estradas nacionais e linhas de caminho-de-ferro, é:",
            image = R.drawable.transparent,
            optionOne = "Proibido caçar, bem como numa faixa de proteção de 100 metros",
            optionTwo = "Proibido caçar, bem como numa faixa de proteção de 250 metros",
            optionThree = "Proibido caçar, mas só quando existe trânsito",
            correctAnswer = 1
        )
        questionsList.add(q364)

        val q365 = Question(
            id = 364,
            question = "É proibido caçar nos povoados e numa faixa de proteção de:",
            image = R.drawable.transparent,
            optionOne = "500 metros",
            optionTwo = "250 metros",
            optionThree = "750 metros",
            correctAnswer = 2
        )
        questionsList.add(q365)

        val q366 = Question(
            id = 365,
            question = "Em que locais é proibido caçar, bem como numa faixa de proteção de 500 metros?",
            image = R.drawable.transparent,
            optionOne = "Estradas nacionais, itinerários principais e autoestradas",
            optionTwo = "Praias de banho e terrenos adjacentes a estabelecimentos de ensino",
            optionThree = "Aeródromos, estradas regionais e estradas municipais",
            correctAnswer = 2
        )
        questionsList.add(q366)

        val q367 = Question(
            id = 366,
            question = "Em que locais é proibido caçar, bem como em quaisquer terrenos que os circundem numa faixa de proteção de 100 metros?",
            image = R.drawable.transparent,
            optionOne = "Nos apiários e pombais devidamente sinalizados",
            optionTwo = "Nos aparcamentos de gado devidamente sinalizados",
            optionThree = "Nos olivais e pomares com instalação de rega gota-a-gota",
            correctAnswer = 1
        )
        questionsList.add(q367)

        val q368 = Question(
            id = 367,
            question = "É proibido caçar numa faixa de proteção de 500 metros em terrenos adjacentes a:",
            image = R.drawable.transparent,
            optionOne = "Aeródromos, cemitérios, estradas regionais e estradas municipais",
            optionTwo = "Instalações turísticas, parques de campismo e desportivos",
            optionThree = "Áreas de refúgio de caça e aparcamentos de gado devidamente sinalizados",
            correctAnswer = 2
        )
        questionsList.add(q368)

        val q369 = Question(
            id = 368,
            question = "É sempre proibido caçar:",
            image = R.drawable.transparent,
            optionOne = "Nos aeródromos, cemitérios e estradas municipais",
            optionTwo = "Nos terrenos ocupados com plantações florestais com altura média superior a 1,50 metros",
            optionThree = "Nos olivais, pomares e vinhas",
            correctAnswer = 1
        )
        questionsList.add(q369)

        val q370 = Question(
            id = 369,
            question = "É proibido caçar:",
            image = R.drawable.transparent,
            optionOne = "A 300 metros das casas de habitação",
            optionTwo = "A 250 metros de uma estrada nacional",
            optionThree = "Nos aparcamentos de gado",
            correctAnswer = 3
        )
        questionsList.add(q370)

        val q371 = Question(
            id = 370,
            question = "Num aparcamento de gado devidamente sinalizado:",
            image = R.drawable.transparent,
            optionOne = "É proibido caçar",
            optionTwo = "É proibido caçar a menos de 250 metros dos animais",
            optionThree = "É proibido caçar a menos de 100 metros de gado bravo",
            correctAnswer = 1
        )
        questionsList.add(q371)

        val q372 = Question(
            id = 371,
            question = "Nos locais abaixo indicados é proibido caçar sem consentimento de quem de direito, mas há um deles que carece obrigatoriamente de sinalização. Qual é?",
            image = R.drawable.transparent,
            optionOne = "Quintais anexos a casas de habitação",
            optionTwo = "Jardins anexos a casas de habitação",
            optionThree = "Zonas de caça",
            correctAnswer = 3
        )
        questionsList.add(q372)

        val q373 = Question(
            id = 372,
            question = "Num olival, onde esteja este sinal, pode-se caçar?",
            image = R.drawable.q373,
            optionOne = "Não",
            optionTwo = "Sim",
            optionThree = "Sim, desde que não tenha azeitona",
            correctAnswer = 1
        )
        questionsList.add(q373)

        val q374 = Question(
            id = 373,
            question = "É proibido o exercício da caça numa estrada nacional, bem como numa faixa de proteção de:",
            image = R.drawable.transparent,
            optionOne = "100 metros",
            optionTwo = "250 metros",
            optionThree = "300 metros",
            correctAnswer = 1
        )
        questionsList.add(q374)

        val q375 = Question(
            id = 374,
            question = "Este sinal indica:",
            image = R.drawable.q375,
            optionOne = "Zona de caça turística",
            optionTwo = "Proibição de caçar",
            optionThree = "Aparcamento de gado",
            correctAnswer = 2
        )
        questionsList.add(q375)

        val q376 = Question(
            id = 375,
            question = "A partir de que distância de uma escola se pode caçar?",
            image = R.drawable.transparent,
            optionOne = "150 metros",
            optionTwo = "200 metros",
            optionThree = "500 metros",
            correctAnswer = 3
        )
        questionsList.add(q376)

        val q377 = Question(
            id = 376,
            question = "É proibido caçar nas áreas percorridas por incêndios bem como numa faixa de 250 metros em redor:",
            image = R.drawable.transparent,
            optionOne = "Só enquanto dura o incêndio",
            optionTwo = "Enquanto dura o incêndio e durante os 30 dias seguintes",
            optionThree = "Enquanto dura o incêndio e durante os 10 dias seguintes",
            correctAnswer = 2
        )
        questionsList.add(q377)

        val q378 = Question(
            id = 377,
            question = "Em terrenos cinegéticos não ordenados, na caça de salto uma linha de caçadores não pode incluir mais de:",
            image = R.drawable.transparent,
            optionOne = "2 caçadores",
            optionTwo = "5 caçadores",
            optionThree = "10 Caçadores",
            correctAnswer = 2
        )
        questionsList.add(q378)

        val q379 = Question(
            id = 378,
            question = "É proibido caçar nas praias de banho bem como numa faixa de proteção de:",
            image = R.drawable.transparent,
            optionOne = "500 metros",
            optionTwo = "150 metros",
            optionThree = "100 metros",
            correctAnswer = 1
        )
        questionsList.add(q379)

        val q380 = Question(
            id = 379,
            question = "A proibição de caçar sem consentimento de quem de direito, só é eficaz e depende de sinalização em que situação?",
            image = R.drawable.transparent,
            optionOne = "Nos terrenos circundados em toda sua extensão por um muro de 1,5 metros de altura",
            optionTwo = "Nos quintais anexos a casas de habitação",
            optionThree = "Nas zonas de caça",
            correctAnswer = 3
        )
        questionsList.add(q380)

        val q381 = Question(
            id = 380,
            question = "Qual das afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar a mais de 100 metros das linhas de caminho de ferro",
            optionTwo = "É permitido caçar a mais de 100 metros das praias de banho",
            optionThree = "É permitido caçar a mais de 100 metros dos aeroportos",
            correctAnswer = 1
        )
        questionsList.add(q381)

        val q382 = Question(
            id = 381,
            question = "É proibido o exercício da caça numa linha de caminho-de-ferro, bem como numa faixa de proteção de:",
            image = R.drawable.transparent,
            optionOne = "100 metros",
            optionTwo = "150 metros",
            optionThree = "200 metros",
            correctAnswer = 1
        )
        questionsList.add(q382)

        val q383 = Question(
            id = 382,
            question = "Numa faixa de terreno de 100 metros ao longo das linhas de caminho-de-ferro, o caçador:",
            image = R.drawable.transparent,
            optionOne = "Nunca pode caçar",
            optionTwo = "Pode caçar com consentimento de quem de direito",
            optionThree = "Pode caçar sem arma de fogo",
            correctAnswer = 1
        )
        questionsList.add(q383)

        val q384 = Question(
            id = 383,
            question = "Qual das afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar a 250 metros das linhas de caminho-de-ferro",
            optionTwo = "É permitido caçar a 250 metros das praias de banho",
            optionThree = "É permitido caçar a 250 metros dos aeroportos",
            correctAnswer = 1
        )
        questionsList.add(q384)

        val q385 = Question(
            id = 384,
            question = "Qual das seguintes frases está correta?",
            image = R.drawable.transparent,
            optionOne = "É crime caçar com uma taxa de álcool no sangue inferior a 1,2 g/l",
            optionTwo = "É crime caçar javalis em terrenos cobertos de neve",
            optionThree = "É crime caçar em zonas de caça às quais não se tenha legalmente acesso",
            correctAnswer = 3
        )
        questionsList.add(q385)

        val q386 = Question(
            id = 385,
            question = "Constitui crime de caça:",
            image = R.drawable.transparent,
            optionOne = "Caçar a 50 metros das estradas municipais alcatroadas",
            optionTwo = "Utilizar auxiliares fora das condições estabelecidas",
            optionThree = "Utilizar chamarizes na caça aos patos",
            correctAnswer = 2
        )
        questionsList.add(q386)

        val q387 = Question(
            id = 386,
            question = "Indique qual das frases está correta:",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar as espécies que constem do calendário venatório publicado anualmente",
            optionTwo = "É permitido caçar todas as espécies classificadas como cinegéticas",
            optionThree = "É permitido caçar qualquer espécie que cause prejuízos na agricultura",
            correctAnswer = 1
        )
        questionsList.add(q387)

        val q388 = Question(
            id = 387,
            question = "A utilização de cartuchos carregados com zagalotes:",
            image = R.drawable.transparent,
            optionOne = "É permitida aos associados das zonas de caça associativas nas batidas às raposas",
            optionTwo = "É permitida aos caçadores das zonas de caça municipais nas montarias aos javalis",
            optionThree = "É proibida na caça",
            correctAnswer = 3
        )
        questionsList.add(q388)

        val q389 = Question(
            id = 388,
            question = "Os cartuchos carregados com chumbos de diâmetro superior a 4,5 mm, vulgarmente designados por zagalotes :",
            image = R.drawable.transparent,
            optionOne = "Podem ser utilizados na caça à raposa",
            optionTwo = "Não podem ser utilizados na caça",
            optionThree = "Podem ser utilizados na caça ao veado pelo processo de aproximação",
            correctAnswer = 2
        )
        questionsList.add(q389)

        val q390 = Question(
            id = 389,
            question = "Na caça às espécies de caça menor sedentária:",
            image = R.drawable.transparent,
            optionOne = "É proibida a utilização e a detenção de cartuchos carregados com bala",
            optionTwo = "É proibida a utilização e a detenção de cartuchos carregados com chumbos",
            optionThree = "É proibida a utilização de cães de caça",
            correctAnswer = 1
        )
        questionsList.add(q390)

        val q391 = Question(
            id = 390,
            question = "A utilização de armas semiautomáticas que comportem mais de três munições:",
            image = R.drawable.transparent,
            optionOne = "É permitida na caça às espécies de caça maior",
            optionTwo = "É permitida na caça aos tordos",
            optionThree = "É proibida",
            correctAnswer = 3
        )
        questionsList.add(q391)

        val q392 = Question(
            id = 391,
            question = "Na caça às espécies de caça maior:",
            image = R.drawable.transparent,
            optionOne = "É proibida a utilização de espingardas caçadeiras",
            optionTwo = "É proibida a utilização e a detenção de cartuchos carregados com chumbos",
            optionThree = "É proibida a utilização e a detenção de cartuchos carregados com bala",
            correctAnswer = 2
        )
        questionsList.add(q392)

        val q393 = Question(
            id = 392,
            question = "Nos olivais é proibido caçar:",
            image = R.drawable.transparent,
            optionOne = "Sempre",
            optionTwo = "Nunca",
            optionThree = "Se estiverem sinalizados com o sinal de proibição de caçar",
            correctAnswer = 3
        )
        questionsList.add(q393)

        val q394 = Question(
            id = 393,
            question = "Numa área delimitada por este sinal:",
            image = R.drawable.q394,
            optionOne = "Não se pode caçar",
            optionTwo = "Pode-se caçar mediante consentimento de quem de direito",
            optionThree = "Pode-se caçar mediante consentimento do presidente da junta de freguesia",
            correctAnswer = 1
        )
        questionsList.add(q394)

        val q395 = Question(
            id = 394,
            question = "Qual dos seguintes atos não constitui crime de caça?",
            image = R.drawable.transparent,
            optionOne = "Caçar espécies não cinegéticas",
            optionTwo = "Caçar com uma taxa de álcool no sangue inferior a 1,2 g/l",
            optionThree = "Caçar em áreas de não caça",
            correctAnswer = 2
        )
        questionsList.add(q395)

        val q396 = Question(
            id = 395,
            question = "A partir de que distância de uma instalação militar se pode caçar?",
            image = R.drawable.transparent,
            optionOne = "200 metros",
            optionTwo = "250 metros",
            optionThree = "500 metros",
            correctAnswer = 3
        )
        questionsList.add(q396)

        val q397 = Question(
            id = 396,
            question = "Num terreno circundado com este sinal, não é permitido:",
            image = R.drawable.q397,
            optionOne = "Treinar cães de caça",
            optionTwo = "Praticar atividades de caráter cinegético",
            optionThree = "Caçar sem consentimento de quem de direito",
            correctAnswer = 3
        )
        questionsList.add(q397)

        val q398 = Question(
            id = 397,
            question = "Indique a frase correta:",
            image = R.drawable.transparent,
            optionOne = "É permitido caçar num pinhal em que as espécies florestais tenham uma altura média superior a 80cm",
            optionTwo = "É permitido caçar num refúgio de caça desde que seja sócio de um clube de caçadores",
            optionThree = "É permitido caçar a menos de 100 metros de uma estrada nacional",
            correctAnswer = 1
        )
        questionsList.add(q398)

        val q399 = Question(
            id = 398,
            question = "Num eucaliptal com altura média de 1 metro:",
            image = R.drawable.transparent,
            optionOne = "É sempre proibido caçar",
            optionTwo = "É proibido caçar, desde que o diâmetro do tronco seja inferior a 5 cm",
            optionThree = "É permitido caçar",
            correctAnswer = 3
        )
        questionsList.add(q399)

        val q400 = Question(
            id = 399,
            question = "Qual dos seguintes atos constitui crime de caça?",
            image = R.drawable.transparent,
            optionOne = "Caçar sem licença de caça",
            optionTwo = "Caçar em áreas de direito à não caça",
            optionThree = "Caçar sem trazer consigo a carta de caçador",
            correctAnswer = 2
        )
        questionsList.add(q400)

        val q401 = Question(
            id = 400,
            question = "É proibido caçar nos olivais?",
            image = R.drawable.transparent,
            optionOne = "Sim, é sempre proibido",
            optionTwo = "Não",
            optionThree = "Só quando sinalizados com o sinal de proibição de caçar",
            correctAnswer = 3
        )
        questionsList.add(q401)

        val q402 = Question(
            id = 401,
            question = "Num quintal de uma casa de habitação, bem como numa faixa envolvente de 250 metros, é:",
            image = R.drawable.transparent,
            optionOne = "Sempre proibido caçar",
            optionTwo = "Sempre permitido caçar",
            optionThree = "Proibido caçar sem consentimento de quem de direito",
            correctAnswer = 3
        )
        questionsList.add(q402)

        val q403 = Question(
            id = 402,
            question = "Qual das seguintes situações não constitui crime de caça?",
            image = R.drawable.transparent,
            optionOne = "Caçar com uma taxa de álcool no sangue superior a 1,2g/l",
            optionTwo = "Caçar com uma taxa de álcool no sangue inferior a 1,2g/l",
            optionThree = "Caçar com uma taxa de álcool no sangue igual a 1,2g/l",
            correctAnswer = 2
        )
        questionsList.add(q403)

        val q404 = Question(
            id = 403,
            question = "É proibido o exercício da caça numa estrada nacional, bem como numa faixa de proteção de:",
            image = R.drawable.transparent,
            optionOne = "100 metros",
            optionTwo = "150 metros",
            optionThree = "200 metros",
            correctAnswer = 1
        )
        questionsList.add(q404)

        val q405 = Question(
            id = 404,
            question = "Qual dos seguintes atos não constitui crime de caça?",
            image = R.drawable.transparent,
            optionOne = "Deter, transportar ou usar furão sem autorização",
            optionTwo = "Utilizar auxiliares fora das condições estabelecidas",
            optionThree = "Caçar com uma taxa de álcool no sangue inferior a 1,2g/l",
            correctAnswer = 3
        )
        questionsList.add(q405)

        val q406 = Question(
            id = 405,
            question = "Caçar uma espécie não cinegética, é:",
            image = R.drawable.transparent,
            optionOne = "Contra ordenação grave",
            optionTwo = "Crime de caça",
            optionThree = "Conduta negligente",
            correctAnswer = 2
        )
        questionsList.add(q406)

        val q407 = Question(
            id = 406,
            question = "Indique em quais dos terrenos a proibição de caçar só se torna eficaz desde que sinalizados:",
            image = R.drawable.transparent,
            optionOne = "Áreas de refúgio de caça",
            optionTwo = "Queimadas e terrenos percorridos por incêndios",
            optionThree = "Instalações turísticas e parques de campismo",
            correctAnswer = 1
        )
        questionsList.add(q407)

        val q408 = Question(
            id = 407,
            question = "A 200 metros de uma casa de habitação pode praticar-se o ato venatório?",
            image = R.drawable.transparent,
            optionOne = "Sim, mas só pelo processo de espera",
            optionTwo = "Sim, sem quaisquer restrições",
            optionThree = "Sim, mas só com autorização de quem de direito",
            correctAnswer = 3
        )
        questionsList.add(q408)

        val q409 = Question(
            id = 408,
            question = "Constitui crime de caça:",
            image = R.drawable.transparent,
            optionOne = "Caçar sem ser portador de bilhete de identidade",
            optionTwo = "Caçar sem estar habilitado com carta de caçador",
            optionThree = "Caçar a 200 metros de um pombal devidamente sinalizado",
            correctAnswer = 2
        )
        questionsList.add(q409)

        val q410 = Question(
            id = 409,
            question = "Constitui crime de caça:",
            image = R.drawable.transparent,
            optionOne = "Caçar a 50 metros das estradas municipais alcatroadas",
            optionTwo = "Utilizar auxiliares fora das condições estabelecidas",
            optionThree = "Utilizar chamarizes na caça aos patos",
            correctAnswer = 2
        )
        questionsList.add(q410)

        val q411 = Question(
            id = 410,
            question = "Constitui crime de caça:",
            image = R.drawable.transparent,
            optionOne = "Abandonar os animais que auxiliam e acompanham o caçador no exercício da caça",
            optionTwo = "Caçar patos à espera, até 100 metros dos planos água, depois das 16 horas e até ao pôr-dosol",
            optionThree = "Caçar com uma taxa de álcool no sangue igual a 1,0 g/l",
            correctAnswer = 1
        )
        questionsList.add(q411)

        val q412 = Question(
            id = 411,
            question = "A criação em cativeiro de espécies cinegéticas e subespécies não identificadas em portaria é:",
            image = R.drawable.transparent,
            optionOne = "Proibida",
            optionTwo = "Permitida desde que a produção seja para consumo alimentar",
            optionThree = "Permitida desde que a produção se destine a largadas em campos de treino de caça",
            correctAnswer = 1
        )
        questionsList.add(q412)

        val q413 = Question(
            id = 412,
            question = "Como é que um caçador pode ter acesso a uma zona de caça municipal?",
            image = R.drawable.transparent,
            optionOne = "Só se fizer a inscrição prévia e for contemplado em sorteio público",
            optionTwo = "Só se for associado da zona de caça municipal",
            optionThree = "Só se for proprietário de terrenos integrados na zona de caça municipal",
            correctAnswer = 1
        )
        questionsList.add(q413)

        val q414 = Question(
            id = 413,
            question = "Têm acesso às zonas de caça turísticas:",
            image = R.drawable.transparent,
            optionOne = "Só os proprietários dos terrenos e seus convidados",
            optionTwo = "Só os caçadores estrangeiros, os sócios e seus convidados",
            optionThree = "Todos os caçadores que cumpram as normas privativas de funcionamento das mesmas",
            correctAnswer = 3
        )
        questionsList.add(q414)

        val q415 = Question(
            id = 414,
            question = "Têm acesso às zonas de caça associativas:",
            image = R.drawable.transparent,
            optionOne = "Só os proprietários dos terrenos",
            optionTwo = "Só os caçadores estrangeiros",
            optionThree = "Só os caçadores associados e os convidados",
            correctAnswer = 3
        )
        questionsList.add(q415)

        val q416 = Question(
            id = 415,
            question = "A caça à lebre pelo processo de batida pode ser permitida apenas:",
            image = R.drawable.transparent,
            optionOne = "Nos meses de outubro a janeiro",
            optionTwo = "Nos meses de janeiro e fevereiro",
            optionThree = "Em zonas de caça",
            correctAnswer = 3
        )
        questionsList.add(q416)

        val q417 = Question(
            id = 416,
            question = "A caça à lebre a corricão nos meses de janeiro e fevereiro:",
            image = R.drawable.transparent,
            optionOne = "É proibida",
            optionTwo = "É permitida nas condições definidas em edital do ICNF",
            optionThree = "É permitida nas zonas de caça",
            correctAnswer = 3
        )
        questionsList.add(q417)

        val q418 = Question(
            id = 417,
            question = "Em terrenos cinegéticos ordenados quais os processos de caça autorizados para o coelho?",
            image = R.drawable.transparent,
            optionOne = "De salto, à espera, de batida, a corricão, de cetraria e com furão",
            optionTwo = "De salto, de batida, de aproximação, de cetraria e com furão",
            optionThree = "De salto, à espera, de batida, a corricão, de aproximação e com furão",
            correctAnswer = 1
        )
        questionsList.add(q418)

        val q419 = Question(
            id = 418,
            question = "O processo de caça “de aproximação” é permitido na caça:",
            image = R.drawable.transparent,
            optionOne = "Só às espécies de caça menor sedentárias",
            optionTwo = "Só às espécies de caça menor aquáticas",
            optionThree = "Só às espécies de caça maior",
            correctAnswer = 3
        )
        questionsList.add(q419)

        val q420 = Question(
            id = 419,
            question = "A caça às narcejas pelo processo de cetraria:",
            image = R.drawable.transparent,
            optionOne = "É permitida nos meses de outubro a fevereiro",
            optionTwo = "É permitida nos meses de janeiro e fevereiro, mas só nas zonas de caça",
            optionThree = "É proibida",
            correctAnswer = 3
        )
        questionsList.add(q420)

        val q421 = Question(
            id = 420,
            question = "Qual dos processos de caça é proibido na caça às espécies de caça menor?",
            image = R.drawable.transparent,
            optionOne = "De salto",
            optionTwo = "De aproximação",
            optionThree = "De batida",
            correctAnswer = 2
        )
        questionsList.add(q421)

        val q422 = Question(
            id = 421,
            question = "Qual dos seguintes processos de caça é proibido na caça ao javali?",
            image = R.drawable.transparent,
            optionOne = "À espera",
            optionTwo = "De aproximação",
            optionThree = "A corricão",
            correctAnswer = 3
        )
        questionsList.add(q422)

        val q423 = Question(
            id = 422,
            question = "Qual o limite o máximo do período venatório em que pode ser autorizada a caça à lebre?",
            image = R.drawable.transparent,
            optionOne = "Setembro a fevereiro",
            optionTwo = "Setembro a dezembro",
            optionThree = "Outubro a dezembro",
            correctAnswer = 1
        )
        questionsList.add(q423)

        val q424 = Question(
            id = 423,
            question = "Em terrenos cinegéticos ordenados, no mês de agosto, pode ser autorizada a caça à rola por qual dos seguintes processos?",
            image = R.drawable.transparent,
            optionOne = "De salto",
            optionTwo = "À espera",
            optionThree = "Cetraria",
            correctAnswer = 2
        )
        questionsList.add(q424)

        val q425 = Question(
            id = 424,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça ao estorninho-malhado?",
            image = R.drawable.transparent,
            optionOne = "De outubro a fevereiro",
            optionTwo = "De dezembro a fevereiro",
            optionThree = "De outubro a março",
            correctAnswer = 1
        )
        questionsList.add(q425)

        val q426 = Question(
            id = 425,
            question = "Em janeiro e fevereiro pode ser autorizada a caça à lebre em zonas de caça por qual dos seguintes processos:",
            image = R.drawable.transparent,
            optionOne = "De batida",
            optionTwo = "A corricão",
            optionThree = "À espera",
            correctAnswer = 2
        )
        questionsList.add(q426)

        val q427 = Question(
            id = 426,
            question = "As montarias aos javalis podem ser realizadas:",
            image = R.drawable.transparent,
            optionOne = "Só em terrenos cinegéticos ordenados",
            optionTwo = "Em terrenos cinegéticos não ordenados todo o ano",
            optionThree = "Em terrenos cinegéticos não ordenados, de outubro a fevereiro nos locais e condições definidos em edital do Instituto de Conservação da Natureza e das Florestas",
            correctAnswer = 3
        )
        questionsList.add(q427)

        val q428 = Question(
            id = 427,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça ao pombo-bravo?",
            image = R.drawable.transparent,
            optionOne = "Agosto a janeiro",
            optionTwo = "Setembro a fevereiro",
            optionThree = "Agosto a fevereiro",
            correctAnswer = 3
        )
        questionsList.add(q428)

        val q429 = Question(
            id = 428,
            question = "Em zonas de caça pode ser autorizada a caça de batida:",
            image = R.drawable.transparent,
            optionOne = "À perdiz",
            optionTwo = "À codorniz",
            optionThree = "À tarambola-dourada",
            correctAnswer = 1
        )
        questionsList.add(q429)

        val q430 = Question(
            id = 429,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça à codorniz?",
            image = R.drawable.transparent,
            optionOne = "De agosto a outubro",
            optionTwo = "De agosto a dezembro",
            optionThree = "De setembro a dezembro",
            correctAnswer = 3
        )
        questionsList.add(q430)

        val q431 = Question(
            id = 430,
            question = "Dos processos abaixo indicados qual não pode ser usado na caça à perdiz?",
            image = R.drawable.transparent,
            optionOne = "De salto",
            optionTwo = "À espera",
            optionThree = "Cetraria",
            correctAnswer = 2
        )
        questionsList.add(q431)

        val q432 = Question(
            id = 431,
            question = "Quais os processos de caça autorizados na caça às narcejas?",
            image = R.drawable.transparent,
            optionOne = "De salto e de cetraria",
            optionTwo = "De salto e à espera",
            optionThree = "De salto e de batida",
            correctAnswer = 2
        )
        questionsList.add(q432)

        val q433 = Question(
            id = 432,
            question = "A caça às rolas pode ser exercida pelo processo:",
            image = R.drawable.transparent,
            optionOne = "De salto",
            optionTwo = "De espera",
            optionThree = "De cetraria",
            correctAnswer = 2
        )
        questionsList.add(q433)

        val q434 = Question(
            id = 433,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça ao coelho?",
            image = R.drawable.transparent,
            optionOne = "Outubro a dezembro",
            optionTwo = "Setembro a dezembro",
            optionThree = "Outubro a fevereiro",
            correctAnswer = 2
        )
        questionsList.add(q434)

        val q435 = Question(
            id = 434,
            question = "Nos meses de janeiro e fevereiro a caça à lebre pode ser exercida a corricão:",
            image = R.drawable.transparent,
            optionOne = "Só em zonas de caça",
            optionTwo = "Nos locais indicados em edital do Instituto de Conservação da Natureza e das Florestas",
            optionThree = "Em todos os locais",
            correctAnswer = 1
        )
        questionsList.add(q435)

        val q436 = Question(
            id = 435,
            question = "Nos terrenos cinegéticos não ordenados, qual é a espécie que em janeiro e fevereiro se pode caçar aos sábados pelo processo de batida, desde que nos locais e condições definidas em edital do Instituto de Conservação da Natureza e das Florestas:",
            image = R.drawable.transparent,
            optionOne = "Lebre",
            optionTwo = "Coelho",
            optionThree = "Saca-rabos",
            correctAnswer = 3
        )
        questionsList.add(q436)

        val q437 = Question(
            id = 436,
            question = "Um grupo de caçadores que, em dezembro, caça à raposa de batida em terrenos não ordenados:",
            image = R.drawable.transparent,
            optionOne = "Está a proceder corretamente",
            optionTwo = "Não está a proceder corretamente porque só se pode caçar de batida à raposa, em terrenos não ordenados, nos meses de janeiro e fevereiro",
            optionThree = "Não está a proceder corretamente porque não se pode caçar de batida em terrenos não ordenados",
            correctAnswer = 2
        )
        questionsList.add(q437)

        val q438 = Question(
            id = 437,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça aos tordos?",
            image = R.drawable.transparent,
            optionOne = "Outubro a dezembro",
            optionTwo = "Setembro a dezembro",
            optionThree = "Outubro a fevereiro",
            correctAnswer = 3
        )
        questionsList.add(q438)

        val q439 = Question(
            id = 438,
            question = "Em janeiro, em terrenos cinegéticos não ordenados, pode ser autorizada a caça às narcejas de salto?",
            image = R.drawable.transparent,
            optionOne = "Não, porque em janeiro não se pode caçar narcejas",
            optionTwo = "Não, porque o processo de salto é proibido",
            optionThree = "Sim, nos locais e condições definidas por edital do Instituto de Conservação da Natureza e das Florestas",
            correctAnswer = 3
        )
        questionsList.add(q439)

        val q440 = Question(
            id = 439,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça de batida ao javali?",
            image = R.drawable.transparent,
            optionOne = "Outubro a dezembro",
            optionTwo = "Outubro a janeiro",
            optionThree = "Outubro a fevereiro",
            correctAnswer = 3
        )
        questionsList.add(q440)

        val q441 = Question(
            id = 440,
            question = "Um caçador, no mês de agosto, abateu 10 codornizes pelo processo de salto. Que infração cometeu?",
            image = R.drawable.transparent,
            optionOne = "Nenhuma",
            optionTwo = "Utilizou um processo não autorizado",
            optionThree = "Caçou fora do período venatório da espécie",
            correctAnswer = 3
        )
        questionsList.add(q441)

        val q442 = Question(
            id = 441,
            question = "Um caçador, no mês de agosto, numa zona de caça, abateu 1 pato pelo processo de salto. Que infração cometeu?",
            image = R.drawable.transparent,
            optionOne = "Nenhuma",
            optionTwo = "Utilizou um processo não autorizado",
            optionThree = "Caçou fora do período venatório da espécie",
            correctAnswer = 1
        )
        questionsList.add(q442)

        val q443 = Question(
            id = 442,
            question = "No mês de agosto, em terrenos não ordenados, pode ser autorizada a caça à espera aos patos?",
            image = R.drawable.transparent,
            optionOne = "Sim, nos locais e condições definidos em edital do Instituto de Conservação da Natureza e das Florestas",
            optionTwo = "Não, porque em Agosto não pode ser autorizada a caça aos patos",
            optionThree = "Não, porque não se podem caçar patos de espera",
            correctAnswer = 1
        )
        questionsList.add(q443)

        val q444 = Question(
            id = 443,
            question = "Um caçador, no mês de junho, numa zona de caça, caçou 1 javali pelo processo de aproximação. Que infração cometeu?",
            image = R.drawable.transparent,
            optionOne = "Utilizou um processo não autorizado",
            optionTwo = "Caçou fora do período venatório da espécie",
            optionThree = "Nenhuma",
            correctAnswer = 3
        )
        questionsList.add(q444)

        val q445 = Question(
            id = 444,
            question = "Pode-se caçar aos coelhos pelo processo de batida?",
            image = R.drawable.transparent,
            optionOne = "Sim, mas só nas condições e nos locais definidos por edital do Instituto de Conservação da Natureza e das Florestas",
            optionTwo = "Sim, mas só nos meses de agosto e novembro",
            optionThree = "Sim, mas só em zonas de caça, desde que previsto no Plano de Ordenamento e Exploração Cinegética (POEC) ou Plano de Gestão (PG) devidamente aprovado",
            correctAnswer = 3
        )
        questionsList.add(q445)

        val q446 = Question(
            id = 445,
            question = "Indique qual das espécies referidas é proibido caçar a menos de 100 metros de pontos de água?",
            image = R.drawable.transparent,
            optionOne = "Rola",
            optionTwo = "Narcejas",
            optionThree = "Codorniz",
            correctAnswer = 1
        )
        questionsList.add(q446)

        val q447 = Question(
            id = 446,
            question = "É permitido caçar javalis pelo processo de aproximação?",
            image = R.drawable.transparent,
            optionOne = "Sim, mas só em terrenos cinegéticos ordenados",
            optionTwo = "Sim, mas só em terrenos cinegéticos não ordenados",
            optionThree = "Não, porque é um processo proibido para o javali",
            correctAnswer = 1
        )
        questionsList.add(q447)

        val q448 = Question(
            id = 447,
            question = "A raposa pode ser caçada de batida em terrenos cinegéticos não ordenados. Indique em qual dos seguintes períodos o processo de caça referido pode ser autorizado para esta espécie:",
            image = R.drawable.transparent,
            optionOne = "Outubro a fevereiro",
            optionTwo = "Janeiro e fevereiro, nas condições e nos locais definidos em edital do Instituto de Conservação da Natureza e das Florestas",
            optionThree = "Todo o ano",
            correctAnswer = 2
        )
        questionsList.add(q448)

        val q449 = Question(
            id = 448,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça de salto ao javali em terrenos ordenados:",
            image = R.drawable.transparent,
            optionOne = "Outubro a dezembro",
            optionTwo = "Outubro a janeiro",
            optionThree = "Outubro a fevereiro",
            correctAnswer = 3
        )
        questionsList.add(q449)

        val q450 = Question(
            id = 449,
            question = "Qual o intervalo máximo do período venatório ao pombo-da-rocha?",
            image = R.drawable.transparent,
            optionOne = "Outubro a dezembro",
            optionTwo = "Agosto a fevereiro",
            optionThree = "Agosto a dezembro",
            correctAnswer = 3
        )
        questionsList.add(q450)

        val q451 = Question(
            id = 450,
            question = "Qual o intervalo máximo do período venatório ao pato-real?",
            image = R.drawable.transparent,
            optionOne = "Outubro a fevereiro",
            optionTwo = "Setembro a fevereiro",
            optionThree = "Agosto a janeiro",
            correctAnswer = 3
        )
        questionsList.add(q451)

        val q452 = Question(
            id = 451,
            question = "O pombo-da-rocha pode ser caçado:",
            image = R.drawable.transparent,
            optionOne = "Em todo o País",
            optionTwo = "Só nos municípios definidos em portaria",
            optionThree = "Só em zonas de caça",
            correctAnswer = 2
        )
        questionsList.add(q452)

        val q453 = Question(
            id = 452,
            question = "Na caça à codorniz os processos de caça autorizados são:",
            image = R.drawable.transparent,
            optionOne = "De salto e de cetraria",
            optionTwo = "De salto e à espera",
            optionThree = "De salto e de aproximação",
            correctAnswer = 1
        )
        questionsList.add(q453)

        val q454 = Question(
            id = 453,
            question = "Nos meses de janeiro e fevereiro a caça à lebre pode ser exercida a corricão:",
            image = R.drawable.transparent,
            optionOne = "Só em zonas de caça",
            optionTwo = "Nos locais indicados em edital do Instituto de Conservação da Natureza e das Florestas",
            optionThree = "Em todos os locais",
            correctAnswer = 1
        )
        questionsList.add(q454)

        val q455 = Question(
            id = 454,
            question = "Em terrenos não ordenados, quais os processos de caça autorizados na caça à perdizvermelha?",
            image = R.drawable.transparent,
            optionOne = "De salto e de batida",
            optionTwo = "De salto e de cetraria",
            optionThree = "De salto e à espera",
            correctAnswer = 2
        )
        questionsList.add(q455)

        val q456 = Question(
            id = 455,
            question = "Qual dos processos de caça à perdiz-vermelha é autorizado só em terrenos ordenados?",
            image = R.drawable.transparent,
            optionOne = "De cetraria",
            optionTwo = "De batida",
            optionThree = "À espera",
            correctAnswer = 2
        )
        questionsList.add(q456)

        val q457 = Question(
            id = 456,
            question = "Qual a afirmação correta relativamente à codorniz:",
            image = R.drawable.transparent,
            optionOne = "O limite máximo do período venatório é de agosto a novembro",
            optionTwo = "Em terrenos ordenados, em setembro, pode caçar-se apenas de salto",
            optionThree = "O limite máximo do período venatório é de setembro a dezembro",
            correctAnswer = 3
        )
        questionsList.add(q457)

        val q458 = Question(
            id = 457,
            question = "Em zonas de caça, a caça à galinhola pelo processo de espera:",
            image = R.drawable.transparent,
            optionOne = "É permitida, desde que conste do plano de ordenamento e exploração cinegética",
            optionTwo = "É permitida só durante os meses de janeiro e fevereiro",
            optionThree = "Não é permitida",
            correctAnswer = 3
        )
        questionsList.add(q458)

        val q459 = Question(
            id = 458,
            question = "Em terrenos cinegéticos ordenados a caça a espécies de caça maior é permitida:",
            image = R.drawable.transparent,
            optionOne = "Só de agosto a dezembro",
            optionTwo = "Só de agosto a fevereiro",
            optionThree = "Todo o ano",
            correctAnswer = 3
        )
        questionsList.add(q459)

        val q460 = Question(
            id = 459,
            question = "Em terrenos cinegéticos não ordenados, qual o limite máximo do período venatório em que pode ser autorizada a caça à raposa, pelo processo de salto?",
            image = R.drawable.transparent,
            optionOne = "De agosto a outubro",
            optionTwo = "De outubro a dezembro",
            optionThree = "De outubro a janeiro",
            correctAnswer = 2
        )
        questionsList.add(q460)

        val q461 = Question(
            id = 460,
            question = "Em terrenos cinegéticos ordenados a caça à galinhola pode ser permitida:",
            image = R.drawable.transparent,
            optionOne = "De salto, de outubro a fevereiro",
            optionTwo = "À espera, de novembro a dezembro",
            optionThree = "De salto e à espera, de outubro a fevereiro",
            correctAnswer = 1
        )
        questionsList.add(q461)

        val q462 = Question(
            id = 461,
            question = "Qual o limite máximo do período venatório em que pode ser autorizada a caça à perdiz-vermelha?",
            image = R.drawable.transparent,
            optionOne = "De agosto a fevereiro",
            optionTwo = "De setembro a dezembro",
            optionThree = "De outubro a janeiro",
            correctAnswer = 3
        )
        questionsList.add(q462)

        val q463 = Question(
            id = 462,
            question = "O Arqueiro ou Besteiro, ao disparar a um animal, deve encontrar-se a uma distância:",
            image = R.drawable.transparent,
            optionOne = "Inferior a 30 metros",
            optionTwo = "Superior a 30 metros",
            optionThree = "Superior a 40 metros",
            correctAnswer = 1
        )
        questionsList.add(q463)

        val q464 = Question(
            id = 463,
            question = "O Arqueiro ou Besteiro deve disparar sobre o animal, apontando:",
            image = R.drawable.transparent,
            optionOne = "À espinal medula",
            optionTwo = "Ao cérebro",
            optionThree = "À cavidade torácica",
            correctAnswer = 3
        )
        questionsList.add(q464)

        val q465 = Question(
            id = 464,
            question = "Fora do exercício da caça, as pontas das flechas ou virotões para caça maior devem:",
            image = R.drawable.transparent,
            optionOne = "Ser acondicionadas na aljava",
            optionTwo = "Embrulhadas em papel",
            optionThree = "Estar sempre visíveis",
            correctAnswer = 1
        )
        questionsList.add(q465)

        val q466 = Question(
            id = 465,
            question = "O caçador no ato venatório, ao utilizar arco ou besta, deve:",
            image = R.drawable.transparent,
            optionOne = "Armar o arco ou besta, próximo do local do disparo",
            optionTwo = "Ter o arco ou besta pronto a disparar",
            optionThree = "Transportar sempre duas flechas ou virotões na mão",
            correctAnswer = 1
        )
        questionsList.add(q466)

        val q467 = Question(
            id = 466,
            question = "O caçador só poderá utilizar besta, na caça maior, se esta possuir:",
            image = R.drawable.transparent,
            optionOne = "Patilha de segurança",
            optionTwo = "Potência inferior a 125 libras",
            optionThree = "Potência inferior a 100 libras",
            correctAnswer = 1
        )
        questionsList.add(q467)

        val q468 = Question(
            id = 467,
            question = "Na caça com arco ou besta qual o tipo de ponta permitido na caça maior?",
            image = R.drawable.transparent,
            optionOne = "Com barbela",
            optionTwo = "Com lâminas",
            optionThree = "Ogival",
            correctAnswer = 2
        )
        questionsList.add(q468)

        val q469 = Question(
            id = 468,
            question = "Fora do exercício da caça o transporte de arco ou besta deve efetuar-se em estojo próprio, com exceção dos casos de deslocações entre locais de espera, desde que a distância entre eles não exceda:",
            image = R.drawable.transparent,
            optionOne = "100 metros",
            optionTwo = "150 metros",
            optionThree = "200 metros",
            correctAnswer = 1
        )
        questionsList.add(q469)

        val q470 = Question(
            id = 469,
            question = "O caçador ao preparar o disparo com arco ou besta verifica que a presa pressentiu a sua presença e afasta-se pelo que deve:",
            image = R.drawable.transparent,
            optionOne = "Disparar correndo a mão",
            optionTwo = "Esperar que o animal se imobilize",
            optionThree = "Disparar calculando o ponto de cruzamento do animal com o projétil",
            correctAnswer = 2
        )
        questionsList.add(q470)

        val q471 = Question(
            id = 470,
            question = "No exercício da caça com arco ou besta qual a largura mínima de corte das pontas das flechas ou virotões, a utilizar na caça maior?",
            image = R.drawable.transparent,
            optionOne = "20 mm",
            optionTwo = "22 mm",
            optionThree = "25 mm",
            correctAnswer = 3
        )
        questionsList.add(q471)

        val q472 = Question(
            id = 471,
            question = "No exercício da caça com arco ou besta, ao ultrapassar um obstáculo, o caçador deve:",
            image = R.drawable.transparent,
            optionOne = "Atirar a flecha ou virotão para o outro lado do obstáculo",
            optionTwo = "Colocar as flechas ou virotões na aljava",
            optionThree = "Saltar com a flecha ou virotão montado na arma mas sem levar o arco em tensão",
            correctAnswer = 2
        )
        questionsList.add(q472)

        val q473 = Question(
            id = 472,
            question = "Na caça com arco ou besta, as pontas das flechas ou virotões a utilizar na caça maior devem ter, no mínimo:",
            image = R.drawable.transparent,
            optionOne = "Duas farpas",
            optionTwo = "Duas lâminas",
            optionThree = "Duas lâminas com barbela",
            correctAnswer = 2
        )
        questionsList.add(q473)

        val q474 = Question(
            id = 473,
            question = "Na caça com arco ou besta a partir de uma plataforma elevada deve visar-se:",
            image = R.drawable.transparent,
            optionOne = "A coluna vertebral, por causar morte instantânea",
            optionTwo = "O tórax, por ser o local onde se encontram órgãos vitais",
            optionThree = "O rim, por ser uma zona pouca protegida",
            correctAnswer = 2
        )
        questionsList.add(q474)

        val q475 = Question(
            id = 474,
            question = "Nos campos de treino de caça é permitido:",
            image = R.drawable.transparent,
            optionOne = "Treinar aves de presa",
            optionTwo = "Realizar batidas ao javali",
            optionThree = "Treinar cães de caça utilizando espécies não cinegéticas",
            correctAnswer = 1
        )
        questionsList.add(q475)

        val q476 = Question(
            id = 475,
            question = "Nos campos de treino de caça qual das seguintes atividades pode ser praticada?",
            image = R.drawable.transparent,
            optionOne = "Exercício de tiro com arma de fogo em perdizes criadas em cativeiro",
            optionTwo = "Montarias aos javalis",
            optionThree = "Caçar espécies cinegéticas da fauna selvagem para treinar aves de presa",
            correctAnswer = 1
        )
        questionsList.add(q476)

        val q477 = Question(
            id = 476,
            question = "Diga qual das afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "Nos campos de treino os utilizadores devem assegurar a recolha de cartuchos vazios resultantes do exercício do tiro",
            optionTwo = "Nos campos de treino os utilizadores não podem utilizar armas de caça",
            optionThree = "Nos campos de treino os utilizadores devem possuir licença de caça",
            correctAnswer = 1
        )
        questionsList.add(q477)

        val q478 = Question(
            id = 477,
            question = "Nos campos de treino de caça pode ser autorizada a prática de uma das seguintes atividades:",
            image = R.drawable.transparent,
            optionOne = "Treino de furões com coelhos mansos",
            optionTwo = "Exercício de tiro com besta",
            optionThree = "Treinar cães de caça utilizando espécies cinegéticas silvestres",
            correctAnswer = 2
        )
        questionsList.add(q478)

        val q479 = Question(
            id = 478,
            question = "Nos campos de treino de caça, entre outras atividades de carácter venatório, pode ser autorizado:",
            image = R.drawable.transparent,
            optionOne = "O treino de aves de presa",
            optionTwo = "A realização de montarias",
            optionThree = "A realização de batidas às raposas",
            correctAnswer = 1
        )
        questionsList.add(q479)

        val q480 = Question(
            id = 479,
            question = "Qual é o cão de caça vulgarmente designado como coelheiro?",
            image = R.drawable.transparent,
            optionOne = "O podengo pequeno",
            optionTwo = "O podengo médio",
            optionThree = "O podengo grande",
            correctAnswer = 2
        )
        questionsList.add(q480)

        val q481 = Question(
            id = 480,
            question = "Qual das seguintes raças de cães é indicada para a caça ao javali?",
            image = R.drawable.transparent,
            optionOne = "O podengo médio",
            optionTwo = "O podengo grande",
            optionThree = "O Fox-hound",
            correctAnswer = 2
        )
        questionsList.add(q481)

        val q482 = Question(
            id = 481,
            question = "O podengo pequeno e o podengo médio são cães especialmente adaptados à caça de:",
            image = R.drawable.transparent,
            optionOne = "Perdiz e codorniz",
            optionTwo = "Coelho-bravo",
            optionThree = "Patos e galeirão",
            correctAnswer = 2
        )
        questionsList.add(q482)

        val q483 = Question(
            id = 482,
            question = "Indique qual das afirmações está correta:",
            image = R.drawable.transparent,
            optionOne = "O perdigueiro português é a única raça de cães adaptada à caça à perdiz",
            optionTwo = "O podengo pequeno é vulgarmente designado por cão coelheiro",
            optionThree = "O beagle é utilizado na caça ao coelho",
            correctAnswer = 3
        )
        questionsList.add(q483)

        val q484 = Question(
            id = 483,
            question = "Os baixotes são considerados:",
            image = R.drawable.transparent,
            optionOne = "Cães de equipagem",
            optionTwo = "Cães de pista de sangue de caça maior",
            optionThree = "Cães de parar",
            correctAnswer = 2
        )
        questionsList.add(q484)

        val q485 = Question(
            id = 484,
            question = "Os podengos são cães de raça portuguesa adaptados à caça de espécies cinegéticas:",
            image = R.drawable.transparent,
            optionOne = "De pelo",
            optionTwo = "De pena",
            optionThree = "De pelo e de pena",
            correctAnswer = 1
        )
        questionsList.add(q485)

        val q486 = Question(
            id = 485,
            question = "Qual das afirmações é correta?",
            image = R.drawable.transparent,
            optionOne = "O pointer é um cão de porte médio e de pelo liso cor de fogo",
            optionTwo = "O coelheiro é um cão de pequeno porte, de pelo liso ou cerdoso",
            optionThree = "O braco alemão é um cão de boa corpulência, de pelo liso ou cerdoso",
            correctAnswer = 3
        )
        questionsList.add(q486)

        val q487 = Question(
            id = 486,
            question = "O fox-terrier é especialmente indicado para caçar?",
            image = R.drawable.transparent,
            optionOne = "Perdiz",
            optionTwo = "Raposa",
            optionThree = "Javali",
            correctAnswer = 2
        )
        questionsList.add(q487)

        val q488 = Question(
            id = 487,
            question = "Qual das seguintes frases está correta?",
            image = R.drawable.transparent,
            optionOne = "O pointer está bem adaptado a caçar em terrenos muito dobrados",
            optionTwo = "O setter irlandês cobra bem na água e em terra",
            optionThree = "O podengo é um cão adaptado à caça de pena",
            correctAnswer = 2
        )
        questionsList.add(q488)

        val q489 = Question(
            id = 488,
            question = "Os Fox-hound são considerados:",
            image = R.drawable.transparent,
            optionOne = "Cães de equipagem",
            optionTwo = "Cães de parar",
            optionThree = "Cães que cobram bem",
            correctAnswer = 1
        )
        questionsList.add(q489)

        val q490 = Question(
            id = 489,
            question = "Qual das afirmações é correta?",
            image = R.drawable.transparent,
            optionOne = "O perdigueiro português, além de “parar”, também cobra bem",
            optionTwo = "Os galgos não são considerados cães de caça em Portugal",
            optionThree = "O pointer é um cão de tamanho médio e com pelo comprido",
            correctAnswer = 1
        )
        questionsList.add(q490)

        val q491 = Question(
            id = 490,
            question = "O perdigueiro é um cão de raça portuguesa adaptado à caça de espécies cinegéticas de:",
            image = R.drawable.transparent,
            optionOne = "Pelo",
            optionTwo = "Pena",
            optionThree = "Pelo e pena",
            correctAnswer = 2
        )
        questionsList.add(q491)

        val q492 = Question(
            id = 491,
            question = "Os baixotes são cães principalmente adequados para:",
            image = R.drawable.transparent,
            optionOne = "Seguir pistas de sangue de caça maior",
            optionTwo = "Perseguir lebres",
            optionThree = "Perseguir perdizes",
            correctAnswer = 1
        )
        questionsList.add(q492)

        val q493 = Question(
            id = 492,
            question = "Qual destas raças de cães é a mais indicada para a caça de pena?",
            image = R.drawable.transparent,
            optionOne = "Podengo médio",
            optionTwo = "Podengo pequeno",
            optionThree = "Perdigueiro português",
            correctAnswer = 3
        )
        questionsList.add(q493)

        val q494 = Question(
            id = 493,
            question = "Qual das seguintes raças de cães é indicada para a caça ao javali?",
            image = R.drawable.transparent,
            optionOne = "Podengo grande",
            optionTwo = "Fox-houd",
            optionThree = "Beagle",
            correctAnswer = 1
        )
        questionsList.add(q494)

        val q495 = Question(
            id = 494,
            question = "Qual das seguintes raças de cães é a mais indicada para a caça de pelo?",
            image = R.drawable.transparent,
            optionOne = "Braco alemão",
            optionTwo = "Podengo médio",
            optionThree = "Pointer",
            correctAnswer = 2
        )
        questionsList.add(q495)

        val q496 = Question(
            id = 495,
            question = "Qual das afirmações está correta:",
            image = R.drawable.transparent,
            optionOne = "O perdigueiro português é a única raça adaptada para a caça à perdiz",
            optionTwo = "O epagneul breton cobra bem em terra e na água",
            optionThree = "O terrier destina-se a seguir pistas de sangue de caça maior",
            correctAnswer = 2
        )
        questionsList.add(q496)

        val q497 = Question(
            id = 496,
            question = "O podengo médio é um cão mais adaptado para caçar:",
            image = R.drawable.transparent,
            optionOne = "Ao coelho",
            optionTwo = "Ao javali",
            optionThree = "À perdiz-vermelha",
            correctAnswer = 1
        )
        questionsList.add(q497)

        val q498 = Question(
            id = 497,
            question = "Indique qual destas raças de cães é a mais indicada para a caça de pena:",
            image = R.drawable.transparent,
            optionOne = "Beagle",
            optionTwo = "Setter inglês",
            optionThree = "Fox-terrier",
            correctAnswer = 2
        )
        questionsList.add(q498)

        val q499 = Question(
            id = 498,
            question = "O esmerilhão é um pequeno falcão ideal para caçar:",
            image = R.drawable.transparent,
            optionOne = "Codornizes",
            optionTwo = "coelhos",
            optionThree = "Patos",
            correctAnswer = 1
        )
        questionsList.add(q499)

        val q500 = Question(
            id = 499,
            question = "Qual das seguintes afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "A alimentação das aves de presa pode ser constituída essencialmente por rações",
            optionTwo = "A alimentação das aves de presa deve ser idêntica à que consumiriam no estado selvagem",
            optionThree = "Os alimentos dados às aves de presa não podem ter penas ou pêlos",
            correctAnswer = 2
        )
        questionsList.add(q500)

        val q501 = Question(
            id = 500,
            question = "O Açor é uma ave de presa de “baixo-voo”, utilizadas na caça :",
            image = R.drawable.transparent,
            optionOne = "De pêlo",
            optionTwo = "De pena",
            optionThree = "Tanto de pena como de pelo",
            correctAnswer = 3
        )
        questionsList.add(q501)

        val q502 = Question(
            id = 501,
            question = "Indique a frase correta:",
            image = R.drawable.transparent,
            optionOne = "O Açor é a ave clássica da caça em alto-voo",
            optionTwo = "O Açor é a ave clássica da caça em baixo-voo",
            optionThree = "O Gavião é a ave clássica da caça em alto-voo",
            correctAnswer = 2
        )
        questionsList.add(q502)

        val q503 = Question(
            id = 502,
            question = "As aves de presa de sexo masculino são designadas em cetraria por “terçó”. O “terçó” é:",
            image = R.drawable.transparent,
            optionOne = "Mais corpulento do que a fêmea",
            optionTwo = "Do mesmo tamanho que a fêmea",
            optionThree = "Mais ágil do que a fêmea",
            correctAnswer = 3
        )
        questionsList.add(q503)

        val q504 = Question(
            id = 503,
            question = "A condição física de uma ave de presa é avaliada:",
            image = R.drawable.transparent,
            optionOne = "Pelo peso",
            optionTwo = "Pelo tamanho",
            optionThree = "Pelas penas",
            correctAnswer = 1
        )
        questionsList.add(q504)

        val q505 = Question(
            id = 504,
            question = "O que é o processo de cetraria?",
            image = R.drawable.transparent,
            optionOne = "Aquele em que o caçador, utiliza aves de presa para capturar espécies cinegéticas, apenas com o auxílio de cães de caça e com ou sem pau",
            optionTwo = "Aquele em que o caçador, utiliza arco ou besta para capturar espécies cinegéticas",
            optionThree = "Aquele em que o caçador, utiliza armadilhas para capturar espécies cinegéticas",
            correctAnswer = 1
        )
        questionsList.add(q505)

        val q506 = Question(
            id = 505,
            question = "Na iniciação das aves de presa, o amansamento deve preferencialmente ser realizado:",
            image = R.drawable.transparent,
            optionOne = "De dia",
            optionTwo = "De noite",
            optionThree = "Indiferentemente de noite ou de dia",
            correctAnswer = 2
        )
        questionsList.add(q506)

        return questionsList
    }

}