package com.bolachas.examesdelupa

object Constants {

    //const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val q1 = Question(
            id = 0,
            question = "Como se define \"arma de fogo\"?",
            image = R.drawable.transparent,
            optionOne = "É uma arma accionada por ar ou outro gás comprimido, com cano de alma lisa ou estriada, destinada a lançar projétil metálico",
            optionTwo = "É um dispositivo portátil destinado a emitir gases por um cano",
            optionThree = "É todo o engenho ou mecanismo portátil destinada a provocar a deflagração de uma carga propulsora geradora de uma massa de gases cuja expansão impele um ou mais projéteis",
            correctAnswer = 3
        )
        questionsList.add(q1)

        val q2 = Question(
            id = 1,
            question = "A arma de fogo que, mediante uma única ação sobre o gatilho, faz uma série continua de vários disparos, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Arma de ação simples",
            optionTwo = "Arma automática",
            optionThree = "Arma de repetição",
            correctAnswer = 2
        )
        questionsList.add(q2)

        val q3 = Question(
            id = 2,
            question = "Como se designa uma arma de fogo que é disparada efectuando apenas a operação de acionar o gatilho?",
            image = R.drawable.transparent,
            optionOne = "Arma de alarme",
            optionTwo = "Arma automática",
            optionThree = "Arma de ação dupla",
            correctAnswer = 3
        )
        questionsList.add(q3)

        val q4 = Question(
            id = 3,
            question = "São integradas na classe D as armas de fogo longas semiautomáticas ou de repetição, de cano de alma lisa, cujo comprimento:",
            image = R.drawable.transparent,
            optionOne = "Não exceda 60 cm",
            optionTwo = "Seja superior a 60 cm",
            optionThree = "Não exceda o comprimento da coronha",
            correctAnswer = 2
        )
        questionsList.add(q4)

        val q5 = Question(
            id = 4,
            question = "Após notificado da decisão de não renovação da licença, o interessado deve fazer a entrega voluntária da arma e dos documentos. Caso não o faça, incorre no crime de:",
            image = R.drawable.transparent,
            optionOne = "Posse de arma ilegal",
            optionTwo = "Descaminho",
            optionThree = "Desobediência qualificada",
            correctAnswer = 3
        )
        questionsList.add(q5)

        val q6 = Question(
            id = 5,
            question = "Diga qual das afirmações está totalmente correta:",
            image = R.drawable.transparent,
            optionOne = "As munições provenientes de recarga podem ser vendidas ou cedidas",
            optionTwo = "As munições provenientes de recarga só podem ser cedidas",
            optionThree = "As respostas a) e b) estão incorretas",
            correctAnswer = 3
        )
        questionsList.add(q6)

        val q7 = Question(
            id = 6,
            question = "Quando a licença de uso e porte de arma tiver cessado, por vontade expressa do seu titular, ou caducado e este não opte pela transmissão da arma abrangida, que tipo de licença pode ser concedida?",
            image = R.drawable.transparent,
            optionOne = "Licença B",
            optionTwo = "Licença especial",
            optionThree = "Licença de detenção de arma no domicílio",
            correctAnswer = 3
        )
        questionsList.add(q7)

        val q8 = Question(
            id = 7,
            question = "Entende-se que um portador de arma está sob o efeito de álcool, sempre que apresente uma taxa de álcool igual ou superior a:",
            image = R.drawable.transparent,
            optionOne = "0,30 g/l ",
            optionTwo = "0,50 g/l ",
            optionThree = "0,80 g/l",
            correctAnswer = 2
        )
        questionsList.add(q8)

        val q9 = Question(
            id = 8,
            question = "Qual das seguintes afirmações está correta?",
            image = R.drawable.transparent,
            optionOne = "A detenção de uma arma não registada ou manifestada, quando obrigatório, constitui detenção fora das condições legais, sendo o autor do fato punido com uma contraordenação",
            optionTwo = "A detenção de arma não registada ou manifestada, quando obrigatório, constitui detenção fora das condições legais, sendo o autor do fato punido com pena de prisão",
            optionThree = "A detenção de arma não registada ou manifestada, quando obrigatório, constitui detenção fora das condições legais, sendo o autor do fato punido com uma contraordenação muito grave",
            correctAnswer = 2
        )
        questionsList.add(q9)

        val q10 = Question(
            id = 9,
            question = "Se a vítima estiver inconsciente deve proceder a um exame primário. Indique quatro passos a dar no exame à vítima?",
            image = R.drawable.transparent,
            optionOne = "Via aérea, respiração, circulação, exposição",
            optionTwo = "Exposição, via aérea, pulsação, disfunção ",
            optionThree = "Todas as anteriores",
            correctAnswer = 3
        )
        questionsList.add(q10)

        val q11 = Question(
            id = 10,
            question = "Uma arma de fogo que tenha uma munição introduzida na câmara e a arma de carregar pela boca em que seja introduzida carga propulsora, fulminante e projéctil na câmara ou câmaras, diz-se que está:",
            image = R.drawable.transparent,
            optionOne = "Municiada ",
            optionTwo = "Carregada",
            optionThree = "Pronta",
            correctAnswer = 2
        )
        questionsList.add(q11)

        val q12 = Question(
            id = 11,
            question = "Como deve ser efectuada a entrega de uma arma de fogo?",
            image = R.drawable.transparent,
            optionOne = "Aberta, com o carregador colocado no seu alojamento e com o mecanismo de segurança acionado",
            optionTwo = "Desmontada, com cadeado de gatilho ou outro mecanismo que impeça o funcionamento do gatilho",
            optionThree = "Aberta ou com a culatra fixa na posição mais recuada de forma que fique visível a câmara de explosão e com o mecanismo de segurança acionado",
            correctAnswer = 3
        )
        questionsList.add(q12)

        val q13 = Question(
            id = 12,
            question = "Ao colocar o cadeado de gatilho, se este não ficar bem colocado o que pode acontecer?",
            image = R.drawable.transparent,
            optionOne = "Abrir-se e saltar fora deixando o gatilho desprotegido",
            optionTwo = "O seu eixo acionar o gatilho, quando pressionado por um obstáculo",
            optionThree = "Ficar travado pelos liguetes",
            correctAnswer = 2
        )
        questionsList.add(q13)

        val q14 = Question(
            id = 13,
            question = "A extração nas armas de canos justapostos pode ser efetuada:",
            image = R.drawable.transparent,
            optionOne = "Automaticamente ou manualmente ",
            optionTwo = "Só automaticamente",
            optionThree = "Só manualmente",
            correctAnswer = 1
        )
        questionsList.add(q14)

        val q15 = Question(
            id = 14,
            question = "As armas da classe D (caçadeiras) podem ser:",
            image = R.drawable.transparent,
            optionOne = "Espingarda de um cano de repetição, espingarda semiautomática, espingarda de canos laterais ou justapostos e espingarda de canos sobrepostos",
            optionTwo = "Espingarda de canos laterais ou justapostos e espingarda de canos sobrepostos",
            optionThree = "Espingarda de cano de repetição, espingarda automática, espingarda de canos laterais e justapostos",
            correctAnswer = 1
        )
        questionsList.add(q15)

        val q16 = Question(
            id = 15,
            question = "Quando se efectuam manobras de segurança numa arma de fogo? ",
            image = R.drawable.transparent,
            optionOne = "Quando exista a certeza relativa ao municiamento da arma",
            optionTwo = "Quando se proceda a entrega e recepção da arma ",
            optionThree = "Quando se efetuar um disparo",
            correctAnswer = 2
        )
        questionsList.add(q16)

        val q17 = Question(
            id = 16,
            question = "O que se entende por transporte de arma?",
            image = R.drawable.transparent,
            optionOne = "O ato de transferência de uma arma descarregada e desmuniciada de um local para outro, de forma a não ser susceptível de uso imediato",
            optionTwo = "O ato de transferência de uma arma carregada e municiada de um local para outro de forma a não ser susceptível de uso imediato",
            optionThree = "O ato de transferência de uma arma carregada e municiada de um local para outro, de forma a ser susceptível de uso imediato",
            correctAnswer = 1
        )
        questionsList.add(q17)

        val q18 = Question(
            id = 17,
            question = "Os portadores de armas estão obrigados a:",
            image = R.drawable.transparent,
            optionOne = "Apresentar as armas bem como a respetiva documentação, sempre que solicitada pelas autoridades competentes e não exibir ou empunhar armas injustificadamente",
            optionTwo = "Declarar, de imediato e por qualquer meio, às autoridades policiais o extravio, furto ou roubo ou destruição do livrete de manifesto ou da licença de uso e porte de arma e comunicar às autoridades policiais qualquer tipo de acidente ocorrido ",
            optionThree = "Todas as respostas estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q18)

        val q19 = Question(
            id = 18,
            question = "Consoante a arma e o local onde esta é manuseada, devem ser observadas algumas regras básicas de segurança. Assim, sempre que pegar numa arma de fogo, diga o que deve fazer?",
            image = R.drawable.transparent,
            optionOne = "Abrir a arma e fechar",
            optionTwo = "Abrir a arma e verificar se está carregada",
            optionThree = "Verificar se tem cadeado de gatilho",
            correctAnswer = 2
        )
        questionsList.add(q19)

        val q20 = Question(
            id = 19,
            question = "Em que circunstância é proibida a detenção, uso ou porte de armas?",
            image = R.drawable.transparent,
            optionOne = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas",
            optionTwo = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas, desde que a taxa seja igual ou superior a 1.20 g/l",
            optionThree = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas, apenas em ato venatório",
            correctAnswer = 1
        )
        questionsList.add(q20)

        val q21 = Question(
            id = 20,
            question = "A arma de fogo que é disparada efetuando apenas a operação de accionar o gatilho, designa-se: ",
            image = R.drawable.transparent,
            optionOne = "Arma de ação dupla",
            optionTwo = "Arma de ação simples",
            optionThree = "Arma de repetição",
            correctAnswer = 1
        )
        questionsList.add(q21)

        val q22 = Question(
            id = 21,
            question = "O que é uma arma de fogo longa?",
            image = R.drawable.transparent,
            optionOne = "A arma de fogo cuja comprimento total não excede 60 cm",
            optionTwo = "A arma de fogo cujo cujo cano não exceda 60 cm",
            optionThree = "Qualquer arma de fogo com exclusão das armas de fogo curtas",
            correctAnswer = 3
        )
        questionsList.add(q22)

        val q23 = Question(
            id = 22,
            question = "São armas da classe D:",
            image = R.drawable.transparent,
            optionOne = "As armas de fogo longas semiautomáticas ou de repetição, de cano de alma lisa com comprimento superior a 60 cm",
            optionTwo = "As replicas de armas de fogo, quando usadas para tiro desportivo",
            optionThree = "As armas de fogo longas semiautomáticas ou de repetição, de cano de alma lisa, em que este não exceda 60 cm",
            correctAnswer = 1
        )
        questionsList.add(q23)

        val q24 = Question(
            id = 23,
            question = "As licenças C podem ser concedidas a maiores de 18 anos que demonstrem delas carecer para a prática de atos venatórios, e devem estar habilitados com:",
            image = R.drawable.transparent,
            optionOne = "Autorização de aquisição da arma referente ao tipo de licença pretendida",
            optionTwo = "Seguro de responsabilidade civil obrigatório ",
            optionThree = "Carta de caçador",
            correctAnswer = 3
        )
        questionsList.add(q24)

        val q25 = Question(
            id = 24,
            question = "A licença C permite ao seu titular o uso e porte de armas de que classes? ",
            image = R.drawable.transparent,
            optionOne = "Apenas armas da classe C",
            optionTwo = "Armas das classes C, D e F",
            optionThree = "As respostas a) e b) estão incorretas",
            correctAnswer = 3
        )
        questionsList.add(q25)

        val q26 = Question(
            id = 25,
            question = "Os titulares da licença B1, C e D devem submeter-se a um curso de atualização técnica e cívica para o uso e porte de armas de fogo. Este curso deve ocorrer:",
            image = R.drawable.transparent,
            optionOne = "De cinco em cinco anos para armas das classes C e D",
            optionTwo = "Em cada cinco anos para armas B1 e 10 anos para armas C e D",
            optionThree = "De 10 em 10 anos para armas da classe B1",
            correctAnswer = 2
        )
        questionsList.add(q26)

        val q27 = Question(
            id = 26,
            question = "A frequência com aproveitamento, dos cursos de formação para o uso e porte de arma, confere ao formando:",
            image = R.drawable.transparent,
            optionOne = "Um certificado com especificação da classe de armas a que se destina ",
            optionTwo = "A licença de uso e porte de arma",
            optionThree = "A carta de caçador",
            correctAnswer = 1
        )
        questionsList.add(q27)

        val q28 = Question(
            id = 27,
            question = "No caso em que se verifique a caducidade das licenças, para promover a sua renovação ou proceder a transmissão das respetivas armas, o titular tem o prazo de:",
            image = R.drawable.transparent,
            optionOne = "60 dias",
            optionTwo = "120 dias ",
            optionThree = "180 dias",
            correctAnswer = 3
        )
        questionsList.add(q28)

        val q29 = Question(
            id = 28,
            question = "A recarga de munições é permitida aos titulares de licença C e D, não podendo ultrapassar as cargas propulsoras indicadas pelos fabricantes. Das afirmações seguintes diga qual é a que está correta?",
            image = R.drawable.transparent,
            optionOne = "As munições provenientes de recarga podem ser cedidas mas só podem ser utilizadas na prática de atos venatórios, treinos ou provas desportivas",
            optionTwo = "As munições provenientes de recarga não podem ser vendidas mas podem ser cedidas para utilização na prática de atos venatórios, treinos ou provas desportivas",
            optionThree = "As munições provenientes de recarga não podem ser vendidas ou cedidas e só podem ser utilizadas na prática de atos venatórios, treinos ou provas desportivas",
            correctAnswer = 3
        )
        questionsList.add(q29)

        val q30 = Question(
            id = 29,
            question = "Num ferimento por bala, indique qual o 1° socorro?",
            image = R.drawable.transparent,
            optionOne = "Em primeiro lugar colocá-lo no chão e realizar compressão abdominal ",
            optionTwo = "Efetuar compressão manual direta sobre a ferida e um garrote",
            optionThree = "Aplicar penso sobre a ferida, efetuar compressão manual direta ",
            correctAnswer = 3
        )
        questionsList.add(q30)

        val q31 = Question(
            id = 30,
            question = "Como deve ser efectuado o transporte das armas das classes C e D",
            image = R.drawable.transparent,
            optionOne = "Sempre com as armas descarregadas, com cadeado de gatilho ou mecanismo que de qualquer forma impossibilite o seu uso, ou desmontadas para que não sejam facilmente utilizáveis, ou sem peça que impeça o disparo, em estojo ou bolsa próprios para o modelo",
            optionTwo = "Sempre com as armas desmontadas e colocados no estojo ou bolsa, com cadeado de gatilho ou mecanismo que de qualquer forma impeça o seu uso",
            optionThree = "Sempre com as armas descarregadas, desmontadas e colocadas num estojo ou bolsa ",
            correctAnswer = 1
        )
        questionsList.add(q31)

        val q32 = Question(
            id = 31,
            question = "Em que circunstâncias é proibida a detenção, o uso ou porte de arma",
            image = R.drawable.transparent,
            optionOne = "Sob influência do álcool se a taxa for igual ou superior a 1,20 g/l ou de substâncias estupefacientes",
            optionTwo = "Sob influência do álcool se a taxa for igual ou superior a 0,80 g/l ou de substâncias psicotrópicas ",
            optionThree = "Sob influência de álcool ou de substâncias estupefacientes e psicotrópicas",
            correctAnswer = 3
        )
        questionsList.add(q32)

        val q33 = Question(
            id = 32,
            question = "Consoante a arma e o local onde esta é manuseada, devem ser observadas algumas regras de conduta. Das afirmações seguintes diga qual está correta",
            image = R.drawable.transparent,
            optionOne = "Abrir sempre a arma quando lhe pegar e verificar se está carregada",
            optionTwo = "Verificar sempre se a arma tem cadeado de gatilho e se está em segurança ",
            optionThree = "Verificar se a arma é adequada ao tipo de licença que possui",
            correctAnswer = 1
        )
        questionsList.add(q33)

        val q34 = Question(
            id = 33,
            question = "Quando devem ser executadas manobras de segurança ",
            image = R.drawable.transparent,
            optionOne = "Logo após a compra da arma",
            optionTwo = "Quando não exista a certeza relativa ao municiamento da arma ",
            optionThree = "Quando exista a certeza relativamente ao municiamento da arma",
            correctAnswer = 2
        )
        questionsList.add(q34)

        val q35 = Question(
            id = 34,
            question = "Antes de começar a caçar deve ter especial atenção a algumas regras de segurança. Das afirmações seguintes, diga qual delas está correta",
            image = R.drawable.transparent,
            optionOne = "Carregar a arma e colocá-la em posição de segurança, com os canos virados para um posição segura",
            optionTwo = "Municiar a arma e colocá-la em posição de segurança, com os canos virados para um posição segura",
            optionThree = "Conferir se montou a arma em condições, e se fecha corretamente",
            correctAnswer = 3
        )
        questionsList.add(q35)

        val q36 = Question(
            id = 35,
            question = "Como deve ser feito o recebimento e entrega de armas?",
            image = R.drawable.transparent,
            optionOne = "A arma deve estar perfeitamente limpa e lubrificada",
            optionTwo = "Descarregada, fechada com cadeado de gatilho ou outro mecanismo que impeça o seu uso e com mecanismo de segurança acionado",
            optionThree = "Aberta ou com a culatra fixa na posição mais recuada, de forma que fique visível a câmara de explosão e com o mecanismo de segurança acionado",
            correctAnswer = 3
        )
        questionsList.add(q36)

        val q37 = Question(
            id = 36,
            question = "Em ações de caça devem ser observadas determinadas regras de segurança de forma a evitar a ocorrência de acidentes. Assim, diga quando é que deve ser carregada a arma?",
            image = R.drawable.transparent,
            optionOne = "Assim que chegar ao local onde vai exercer a atividade venatória ",
            optionTwo = "Só quando estiver afastado dos companheiros",
            optionThree = "Só quando tiver executado as manobras de segurança",
            correctAnswer = 2
        )
        questionsList.add(q37)

        val q38 = Question(
            id = 37,
            question = "Quando se encontrar em ato venatório ao aperceber-se da aproximação de alguém da sua posição o que deve fazer?",
            image = R.drawable.transparent,
            optionOne = "Colocar a arma na posição de segurança ativa ",
            optionTwo = "Abrir e descarregar a arma",
            optionThree = "Abrir a arma mantendo-a em posição de segurança",
            correctAnswer = 2
        )
        questionsList.add(q38)

        val q39 = Question(
            id = 38,
            question = "No exercício do ato venatório e no momento do disparo que regras de segurança deve cumprir?",
            image = R.drawable.transparent,
            optionOne = "Nunca disparar em direção de uma pessoa mesmo que pareça que se encontra fora do alcance",
            optionTwo = "Quando se caça em locais onde exista agua em abundância nunca efetuar disparos rasantes ",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q39)

        val q40 = Question(
            id = 39,
            question = "Uma \"arma de fogo\" define-se como sendo:",
            image = R.drawable.transparent,
            optionOne = "É uma arma accionada por ar ou outro gás comprimido, com cano de alma lisa ou estriada, destinada a lançar projéctil metálico",
            optionTwo = "É um dispositivo portátil a emitir gases por um cano",
            optionThree = "É todo o engenho ou mecanismo portátil destinado a provocar a deflagração de uma carga propulsora geradora de uma massa de gases cuja expansão impele um ou mais projécteis",
            correctAnswer = 3
        )
        questionsList.add(q40)

        val q41 = Question(
            id = 40,
            question = "Uma arma de fogo cujo cano não exceda os 30 cm ou cujo comprimento total não exceda os 60 cm, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Arma de fogo longa ",
            optionTwo = "Arma de fogo curta",
            optionThree = "Arma de fogo estriada",
            correctAnswer = 2
        )
        questionsList.add(q41)

        val q42 = Question(
            id = 41,
            question = "As armas, com a força do disparo, costumam efetuar um movimento de recuo. Como se denomina este?",
            image = R.drawable.transparent,
            optionOne = "Recuo ",
            optionTwo = "Coice",
            optionThree = "Tração",
            correctAnswer = 2
        )
        questionsList.add(q42)

        val q43 = Question(
            id = 42,
            question = "A munição com bala de caça é composta por:",
            image = R.drawable.transparent,
            optionOne = "Um único projétil",
            optionTwo = "Mais do que um projétil",
            optionThree = "Uma substância pirotécnica",
            correctAnswer = 1
        )
        questionsList.add(q43)

        val q44 = Question(
            id = 43,
            question = "Quem, pelo menos por negligencia, detiver, transportar, usar ou portar arma, com uma taxa de álcool no sangue igual ou superior a 1,2 é punido com:",
            image = R.drawable.transparent,
            optionOne = "Pena de prisão superior a um ano",
            optionTwo = "Pena de prisão até um ano",
            optionThree = "Pena de prisão até um ano ou com pena de multa até 360 dias",
            correctAnswer = 3
        )
        questionsList.add(q44)

        val q45 = Question(
            id = 44,
            question = "O cartão europeu de arma de fogo é concedido pelo diretor nacional da PSP e habilita o seu titular:",
            image = R.drawable.transparent,
            optionOne = "A deter uma arma de fogo em qualquer estado da unido europeia, desde que autorizado pelo estado de origem",
            optionTwo = "A deter uma ou mais armas de fogo em qualquer estado desde que autorizado pelo estado de origem",
            optionThree = "A deter uma ou mais armas de fogo em qualquer estado desde que autorizado pelo estado de destino",
            correctAnswer = 3
        )
        questionsList.add(q45)

        val q46 = Question(
            id = 45,
            question = "Além da declaração de compra e venda ou doação, que documento é ainda necessário para aquisição de uma arma de fogo da classe C?",
            image = R.drawable.transparent,
            optionOne = "Carta de condução",
            optionTwo = "Autorização de revenda concedida pelo diretor nacional da PSP ",
            optionThree = "Prévia autorização, concedida pelo diretor nacional da PSP",
            correctAnswer = 3
        )
        questionsList.add(q46)

        val q47 = Question(
            id = 46,
            question = "Os titulares das licenças C e D ou os que delas estejam isentos, quantas armas podem importar em cada ano?",
            image = R.drawable.transparent,
            optionOne = "2",
            optionTwo = "3",
            optionThree = "As respostas a) e b) estão incorretas",
            correctAnswer = 3
        )
        questionsList.add(q47)

        val q48 = Question(
            id = 47,
            question = "Os titulares de licença C e D devem submeter-se a um curso de actualização técnica e cívica para o uso e porte de armas de fogo. Este curso deve ocorrer:",
            image = R.drawable.transparent,
            optionOne = "Em cada 3 anos ",
            optionTwo = "Em cada 10 anos ",
            optionThree = "De 5 em 5 anos",
            correctAnswer = 2
        )
        questionsList.add(q48)

        val q49 = Question(
            id = 48,
            question = "As licenças de detenção de armas no domicilio são validas por um período de: ",
            image = R.drawable.transparent,
            optionOne = "5 anos",
            optionTwo = "10 anos ",
            optionThree = "20 anos",
            correctAnswer = 2
        )
        questionsList.add(q49)

        val q50 = Question(
            id = 49,
            question = "As armas de fogo longas e curtas devem ser transportadas:",
            image = R.drawable.transparent,
            optionOne = "Com cadeado de gatilho e com as munições na câmara",
            optionTwo = "Com cadeado de gatilho e com as munições junto da arma",
            optionThree = "Com cadeado de gatilho ou outro mecanismo que impossibilite o seu uso indevido e separada das respetivas munições",
            correctAnswer = 3
        )
        questionsList.add(q50)

        val q51 = Question(
            id = 50,
            question = "O que deve fazer o portador de uma arma longa sempre que tenha que ultrapassar um obstáculo?",
            image = R.drawable.transparent,
            optionOne = "Entregar a arma ao companheiro de caça que estiver mais próximo",
            optionTwo = "Colocar a arma ao ombro com a patilha de segurança na posição de \"segurança\"",
            optionThree = "Abrir e descarregar a arma",
            correctAnswer = 3
        )
        questionsList.add(q51)

        val q52 = Question(
            id = 51,
            question = "Se a arma tiver muita utilização o que deve fazer antes de a utilizar? ",
            image = R.drawable.transparent,
            optionOne = "Submetê-la a uma limpeza",
            optionTwo = "Submetê-las a uma verificação técnica junto de um armeiro ",
            optionThree = "Verificar se o aparelho de pontaria e de disparar funcionam",
            correctAnswer = 2
        )
        questionsList.add(q52)

        val q53 = Question(
            id = 52,
            question = "Na residência deve ter especial atenção para:",
            image = R.drawable.transparent,
            optionOne = "Não misturar em caixas, sacos ou cartucheiras, munições de calibres e comprimentos de câmaras diferentes",
            optionTwo = "Juntar em caixas, sacos ou cartucheiras, munições de calibres e comprimentos de câmaras diferentes",
            optionThree = "Juntar armas e munições na mesma caixa",
            correctAnswer = 1
        )
        questionsList.add(q53)

        val q54 = Question(
            id = 53,
            question = "Em ações de caça é obrigatório observar determinadas regras de segurança, por forma a evitar acidentes. No caso de se tratar de uma arma de canos basculantes, como deve proceder após carregar a arma?",
            image = R.drawable.transparent,
            optionOne = "Fechar a arma de forma a manter os canos virados para baixo, evitando sempre que estes fiquem na horizontal porque por defeito mecânico a arma pode disparar",
            optionTwo = "Fechar a arma de forma a manter os canos virados para cima ou para baixo, evitando sempre que estes fiquem na horizontal porque por defeito mecânico a arma pode disparar",
            optionThree = "Fechar a arma de forma a manter os canos virados para a frente, evitando sempre que estes fiquem na horizontal porque por defeito mecânico a arma pode disparar",
            correctAnswer = 1
        )
        questionsList.add(q54)

        val q55 = Question(
            id = 54,
            question = "Os portadores de armas de fogo estão obrigados a observar algumas obrigações comuns, previstas na lei 5/2006. Diga qual das respostas está totalmente correta?",
            image = R.drawable.transparent,
            optionOne = "Não disparar fora dos locais apropriados e não emprestar ou ceder as armas, a qualquer titulo, fora das circunstâncias previstas na lei",
            optionTwo = "Declarar imediatamente furtos, roubos, extravios ou destruição de armas e do livrete de manifesto ou licença de uso e porte de arma",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q55)

        val q56 = Question(
            id = 55,
            question = "Quando se efetuam manobras de segurança numa arma de fogo?",
            image = R.drawable.transparent,
            optionOne = "Quando exista a certeza relativa ao municiamento da arma ",
            optionTwo = "Quando se proceda a entrega e recepção da arma",
            optionThree = "Quando se efetuar um disparo",
            correctAnswer = 2
        )
        questionsList.add(q56)

        val q57 = Question(
            id = 56,
            question = "Em que circunstância é proibida a detenção, uso ou porte de arma:",
            image = R.drawable.transparent,
            optionOne = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas",
            optionTwo = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas, desde que a taxa seja igual ou superior a 1.20 g/l",
            optionThree = "Sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas, apenas em ato venatório",
            correctAnswer = 1
        )
        questionsList.add(q57)

        val q58 = Question(
            id = 57,
            question = "Como se define uma \"arma de fogo\"?",
            image = R.drawable.transparent,
            optionOne = "É uma arma accionada por ar ao outro gás comprimido, com cano de alma lisa ou estriada, destinada a lançar projéctil metálico",
            optionTwo = "É um dispositivo portátil a emitir gases por um cano",
            optionThree = "É todo o engenho ou mecanismo portátil destinado a provocar a deflagração de uma carga propulsora geradora de uma massa de gases cuja expansão impele um ou mais projécteis",
            correctAnswer = 3
        )
        questionsList.add(q58)

        val q59 = Question(
            id = 58,
            question = "A compra e venda de munições para as armas da classe D, é efetuada mediante prova da identidade do comprador, exibição do livrete de manifesto da respetiva arma e fatura discriminada das munições vendidas e esta é:",
            image = R.drawable.transparent,
            optionOne = "Onerosa ",
            optionTwo = "Livre",
            optionThree = "A 30 dias",
            correctAnswer = 2
        )
        questionsList.add(q59)

        val q60 = Question(
            id = 59,
            question = "Como se designa uma arma de fogo longa com cano de alma estriada?",
            image = R.drawable.transparent,
            optionOne = "Arma automática",
            optionTwo = "Espingarda",
            optionThree = "Carabina",
            correctAnswer = 3
        )
        questionsList.add(q60)

        val q61 = Question(
            id = 60,
            question = "As munições provenientes de recarga não podem ser vendidas ou cedidas e só podem ser utilizadas: ",
            image = R.drawable.transparent,
            optionOne = "Na caça grossa",
            optionTwo = "Na prática de atos venatórios, treinos e provas desportivas",
            optionThree = "Treinos e provas desportivas",
            correctAnswer = 2
        )
        questionsList.add(q61)

        val q62 = Question(
            id = 61,
            question = "Como se designa o compartimento inamovível de uma arma de fogo onde estão alojadas as munições? ",
            image = R.drawable.transparent,
            optionOne = "Carregador",
            optionTwo = "Deposito ",
            optionThree = "Cartucheira",
            correctAnswer = 2
        )
        questionsList.add(q62)

        val q63 = Question(
            id = 62,
            question = "Qual a definição de \"chumbos de caça\"",
            image = R.drawable.transparent,
            optionOne = "São os projéteis com diâmetro superior a 5 milímetros com que carregam os cartuchos de caça ",
            optionTwo = "São os invólucros com calibre até 4.5mm com que se carregam os cartuchos de caça",
            optionThree = "São os projéteis com diâmetro até 4.5mm com que carregam os cartuchos de caça",
            correctAnswer = 3
        )
        questionsList.add(q63)

        val q64 = Question(
            id = 63,
            question = "No caso da arma ter sido depositada à guarda da PSP esta pode ser declarada perdida a favor do estado, sempre que não haja sido reclamada no prazo de:",
            image = R.drawable.transparent,
            optionOne = "8 anos ",
            optionTwo = "10 anos ",
            optionThree = "12 anos",
            correctAnswer = 2
        )
        questionsList.add(q64)

        val q65 = Question(
            id = 64,
            question = "Sempre que seja obrigado nos termos da lei, a efetuar um contrato de seguro de responsabilidade civil, deve:",
            image = R.drawable.transparent,
            optionOne = "Mantê-lo valido e eficaz ",
            optionTwo = "Mantê-lo valido e inerte ",
            optionThree = "Mantê-lo guardado e inerte",
            correctAnswer = 1
        )
        questionsList.add(q65)

        val q66 = Question(
            id = 65,
            question = "A licença C, permite ao seu titular:",
            image = R.drawable.transparent,
            optionOne = "O uso e porte de armas da classe C",
            optionTwo = "O uso e porte de armas das classes C e D",
            optionThree = "O uso e porte de armas das classes C, D e E",
            correctAnswer = 3
        )
        questionsList.add(q66)

        val q67 = Question(
            id = 66,
            question = "Se se suspeitar da existência de substâncias estupefacientes ou outras, é feito exame mediante análise ao sangue ou outros exames médicos, devendo o portador da arma ser conduzido pelo agente da autoridade dotado de meios que permitam a sua realização, no:",
            image = R.drawable.transparent,
            optionOne = "Centro de saúde",
            optionTwo = "Hospital",
            optionThree = "Estabelecimento de saúde mais próximo",
            correctAnswer = 3
        )
        questionsList.add(q67)

        val q68 = Question(
            id = 67,
            question = "Os portadores de armas são sempre responsáveis pela segurança das mesmas. Diga onde:",
            image = R.drawable.transparent,
            optionOne = "No domicilio",
            optionTwo = "Fora do domicilio",
            optionThree = "No domicilio ou fora dele",
            correctAnswer = 3
        )
        questionsList.add(q68)

        val q69 = Question(
            id = 68,
            question = "Sempre que pegar numa arma de fogo, diga o que deve fazer? ",
            image = R.drawable.transparent,
            optionOne = "Abrir a arma e fechar",
            optionTwo = "Abrir a arma e verificar se está carregada ",
            optionThree = "Verificar se tem cadeado de gatilho",
            correctAnswer = 2
        )
        questionsList.add(q69)

        val q70 = Question(
            id = 69,
            question = "Sempre que esteja sob influência de álcool ou de substâncias estupefacientes ou psicotrópicas é proibido a:",
            image = R.drawable.transparent,
            optionOne = "Detenção e cedência da arma ",
            optionTwo = "A detenção e porte de arma ",
            optionThree = "O porte e cedência da arma",
            correctAnswer = 2
        )
        questionsList.add(q70)

        val q71 = Question(
            id = 70,
            question = "No porte de arma como deve manter sempre o cano ou canos? ",
            image = R.drawable.transparent,
            optionOne = "Dirigidos para direção segura",
            optionTwo = "Oleados",
            optionThree = "Guardados e oleados",
            correctAnswer = 1
        )
        questionsList.add(q71)

        val q72 = Question(
            id = 71,
            question = "As munições no interior do automóvel nunca devem:",
            image = R.drawable.transparent,
            optionOne = "Ser expostas ao sol",
            optionTwo = "Ser colocadas em sacos separadas das armas ",
            optionThree = "Ser transportadas do veiculo",
            correctAnswer = 1
        )
        questionsList.add(q72)

        val q73 = Question(
            id = 72,
            question = "Quando pegar numa arma de fogo das classes C e D, o que deve verificar: ",
            image = R.drawable.transparent,
            optionOne = "O estado de limpeza e o ponto de mira",
            optionTwo = "O funcionamento mecânico e o aparelho de pontaria",
            optionThree = "O estado de limpeza e o funcionamento mecânico ",
            correctAnswer = 3
        )
        questionsList.add(q73)

        val q74 = Question(
            id = 73,
            question = "Em ato venatório quando é que deve carregar a arma?",
            image = R.drawable.transparent,
            optionOne = "Após montar a arma",
            optionTwo = "Quando verificar que os alvos se aproximam ",
            optionThree = "Quando estiver afastado dos companheiros ",
            correctAnswer = 3
        )
        questionsList.add(q74)

        val q75 = Question(
            id = 74,
            question = "Quando pegar numa arma o que deve admitir",
            image = R.drawable.transparent,
            optionOne = "Que está carregada ",
            optionTwo = "Que está suja",
            optionThree = "Que não tem munições",
            correctAnswer = 1
        )
        questionsList.add(q75)

        val q76 = Question(
            id = 75,
            question = "Indique as partes essenciais de uma arma de fogo semi-automática (caçadeira)",
            image = R.drawable.transparent,
            optionOne = "Culatra, coronha com caixa dos mecanismos de disparar e ejector, porta cartuchos, cano e fuste",
            optionTwo = "Culatra,cano, estojo de limpeza, bandoleira, aparelho de pontaria",
            optionThree = "Coronha, ejetor, bandoleira, tambor, aparelho de pontaria ",
            correctAnswer = 1
        )
        questionsList.add(q76)

        val q77 = Question(
            id = 76,
            question = "O que nunca deve fazer no momento do tiro?",
            image = R.drawable.transparent,
            optionOne = "Disparar em direção a uma pessoa mesmo que lhe pareça que se encontra fora do alcance, ou para mato ou campo de cereal alto por não sabermos o que estará para lá deles",
            optionTwo = "Apontar e disparar ao alvo observando as normas de segurança, sem disparar na direção das pessoas",
            optionThree = "Observando as normas de segurança, evitar disparar para mato ou campo de cereal alto por não sabermos o que estará para lá deles",
            correctAnswer = 1
        )
        questionsList.add(q77)

        val q78 = Question(
            id = 77,
            question = "São integradas na classe C as armas de fogo longas semiautomáticas ou de repetição, de cano de alma lisa, cujo comprimento:",
            image = R.drawable.transparent,
            optionOne = "Não exceda 60 cm",
            optionTwo = "Seja superior a 60 cm",
            optionThree = "Não exceda o comprimento da coronha",
            correctAnswer = 1
        )
        questionsList.add(q78)

        val q79 = Question(
            id = 78,
            question = "Uma arma de fogo longa semiautomática, de repetição ou de tiro a tiro, com dois ou mais canos integra-se na classe C, desde que",
            image = R.drawable.transparent,
            optionOne = "Todos os canos sejam de alma estriada ",
            optionTwo = "Um deles seja de alma estriada",
            optionThree = "Todos os canos sejam de alma lisa",
            correctAnswer = 2
        )
        questionsList.add(q79)

        val q80 = Question(
            id = 79,
            question = "Para efeitos do disposto na legislação especifica da caça, quais das seguintes armas são permitidas?",
            image = R.drawable.transparent,
            optionOne = "Todas as armas da classe C",
            optionTwo = "Todas as armas da classe D",
            optionThree = "Todas as armas da classe B",
            correctAnswer = 2
        )
        questionsList.add(q80)

        val q81 = Question(
            id = 80,
            question = "As armas de ar comprimido desportivas de aquisição condicionada pertencem a que classe? ",
            image = R.drawable.transparent,
            optionOne = "A",
            optionTwo = "G ",
            optionThree = "C",
            correctAnswer = 3
        )
        questionsList.add(q81)

        val q82 = Question(
            id = 81,
            question = "Diga qual das seguintes afirmações está totalmente correta:",
            image = R.drawable.transparent,
            optionOne = "Ao titular da licença C só é permitida a detenção até duas armas de fogo desta classe, excepto se possuir cofre, casa forte ou fortificada para guarda das mesmas ,devidamente verificada pela PSP",
            optionTwo = "Ao titular da licença C só é permitida a detenção até cinco armas de fogo desta classe, excepto se possuir cofre, casa forte ou fortificada para guarda das mesmas ,devidamente verificada pela PSP ",
            optionThree = "Ao titular da licença C é permitida a detenção até dez armas de fogo desta classe",
            correctAnswer = 1
        )
        questionsList.add(q82)

        val q83 = Question(
            id = 82,
            question = "Diga qual das afirmações está totalmente correta:",
            image = R.drawable.transparent,
            optionOne = "A compra e venda de munições para as armas das classes C e D é livre",
            optionTwo = "A detenção de munições para as armas das classes C e D só pode ser feita até ao limite de 10000 para c e 50000 para d, por ano",
            optionThree = "A compra e venda de munições para as armas das classes C e D está sujeita a prévia autorização, a conceder pelo diretor nacional da PSP",
            correctAnswer = 1
        )
        questionsList.add(q83)

        val q84 = Question(
            id = 83,
            question = "Indique que documento deve acompanhar o requerimento de pedido de concessão de licença de uso e porte de arma das classes C e D",
            image = R.drawable.transparent,
            optionOne = "Certidão de aprovação para uso e porte de armas de fogo da classe C ou D",
            optionTwo = "Certificação de aprovação para uso e porte de armas de fogo da classe C ou D",
            optionThree = "Certificado de aprovação para uso e porte de armas de fogo da classe C ou D",
            correctAnswer = 3
        )
        questionsList.add(q84)

        val q85 = Question(
            id = 84,
            question = "A inscrição e a frequência nos cursos de formação para portadores de arma de fogo, é feita mediante avaliação do cumprimento dos requisitos legais para a concessão da licença e depende de prévia autorização da:",
            image = R.drawable.transparent,
            optionOne = "Guarda nacional republicana",
            optionTwo = "Secretaria da administração interna ",
            optionThree = "Polícia de segurança publica",
            correctAnswer = 3
        )
        questionsList.add(q85)

        val q86 = Question(
            id = 85,
            question = "A arma que não possui carregador ou deposito, onde o atirador introduz manualmente as munições, efetua que tipo de tiro",
            image = R.drawable.transparent,
            optionOne = "Tiro a tiro, tiro de repetição",
            optionTwo = "Tiro a tiro ou tiro semiautomatico ",
            optionThree = "Tiro simples ou tiro a tiro",
            correctAnswer = 3
        )
        questionsList.add(q86)

        val q87 = Question(
            id = 86,
            question = "No final da caça quando terminar o ato venatório o que deve fazer: ",
            image = R.drawable.transparent,
            optionOne = "Abrir descarregar e limpar a arma",
            optionTwo = "Abrir a arma carregada",
            optionThree = "Manter a arma fechada e descarregada ",
            correctAnswer = 1
        )
        questionsList.add(q87)

        val q88 = Question(
            id = 87,
            question = "Quando efetua o correr da mão pela peça de caça que avista, o que deve verificar?",
            image = R.drawable.transparent,
            optionOne = "Se a espingarda está carregada",
            optionTwo = "Se está alguém para lá da linha de tiro",
            optionThree = "Se a peça tem o tamanho indicado por lei",
            correctAnswer = 2
        )
        questionsList.add(q88)

        val q89 = Question(
            id = 88,
            question = "Numa montaria o que nunca deve fazer? ",
            image = R.drawable.transparent,
            optionOne = "Mudar ou sair do posto, segurar a arma apontada para os postos contíguos, atirar para os cumes ou matos a mexer",
            optionTwo = "Mudar de posto, não apontar a arma para os postos contíguos, não atirar a mato a mexer",
            optionThree = "Entrar no posto, segurar a arma apontada para os postos contíguos, no atirar aos cumes ",
            correctAnswer = 1
        )
        questionsList.add(q89)

        val q90 = Question(
            id = 89,
            question = "O ato de trazer consigo uma arma municiada ou carregada ou em condições de ser para uso imediato, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Porte de arma",
            optionTwo = "Detenção de arma ",
            optionThree = "Guarda de arma",
            correctAnswer = 1
        )
        questionsList.add(q90)

        val q91 = Question(
            id = 90,
            question = "Como se chama à redução do cano sensivelmente nos últimos cinco centímetros, junto da boca do cano ",
            image = R.drawable.transparent,
            optionOne = "Estrangulamento",
            optionTwo = "Extremidade",
            optionThree = "Explosão",
            correctAnswer = 1
        )
        questionsList.add(q91)

        val q92 = Question(
            id = 91,
            question = "A extração nas armas de justapostos pode ser efetuada:",
            image = R.drawable.transparent,
            optionOne = "Automaticamente ou manualmente ",
            optionTwo = "Só automaticamente",
            optionThree = "Só manualmente",
            correctAnswer = 1
        )
        questionsList.add(q92)

        val q93 = Question(
            id = 92,
            question = "Nunca confie na sua memória, considerando sempre que a arma está carregada até confirmar o contrário. Sendo assim, os procedimentos de segurança com arma de fogo devem ser executados sempre que:",
            image = R.drawable.transparent,
            optionOne = "Recebe ou entrega a arma a outro elemento",
            optionTwo = "A sua arma sofra algum tipo de avaria ou falha ou encontre uma arma abandonada",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q93)

        val q94 = Question(
            id = 93,
            question = "A lei de 5/2006 de 23 de fevereiro, alterada e republicada pelas 17/2009 e 12/2011, aprova o regime jurídico das armas e suas munições, que não se aplica :",
            image = R.drawable.transparent,
            optionOne = "As atividades relativas a armas e munições destinadas às forças armadas e às forças de serviços de segurança",
            optionTwo = "As armas de fogo cuja data de fabrico seja posterior a 31 de dezembro de 1890",
            optionThree = "Aos componentes das armas e suas munições ",
            correctAnswer = 1
        )
        questionsList.add(q94)

        val q95 = Question(
            id = 94,
            question = "\"Alma estriada\" de uma arma de fogo, é:",
            image = R.drawable.transparent,
            optionOne = "A superfície interior do cano com sulcos helicoidais ou outra configuração em espiral, que permite conferir rotação ao projéctil, dotando-o de estabilidade giroscópica",
            optionTwo = "A superfície interior do cano com sulcos circulares ou outra configuração, que permita conferir rotação ao projéctil",
            optionThree = "A superfície interior do cano não dotada de qualquer dispositivo destinado a imprimir movimento de rotação ao projéctil",
            correctAnswer = 1
        )
        questionsList.add(q95)

        val q96 = Question(
            id = 95,
            question = "A munição para arma de fogo longa de cano de alma lisa, própria para a atividade venatória ou desportiva, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Fulminante ou escorva ",
            optionTwo = "Cartucho de caça",
            optionThree = "Invólucro",
            correctAnswer = 2
        )
        questionsList.add(q96)

        val q97 = Question(
            id = 96,
            question = "São integradas na classe C as armas de fogo longas semiautomáticas ou de repetição, de cano de alma lisa, cujo comprimento",
            image = R.drawable.transparent,
            optionOne = "Não exceda 60 cm",
            optionTwo = "Seja superior a 60 cm",
            optionThree = "Não exceda o comprimento da coronha",
            correctAnswer = 1
        )
        questionsList.add(q97)

        val q98 = Question(
            id = 97,
            question = "Desde que destinadas ao exercício da prática venatória, nas condições definidas na legislação regulamentar da lei n°5/2006, as armas de fogo das classes C e D, podem ser objeto de cedência a titulo de empréstimo?",
            image = R.drawable.transparent,
            optionOne = "Nunca ",
            optionTwo = "Podem",
            optionThree = "Podem mas sem munições",
            correctAnswer = 2
        )
        questionsList.add(q98)

        val q99 = Question(
            id = 98,
            question = "Sempre que haja suspeita da existência de substâncias estupefacientes ou outras, o exame é feito mediante análise ao sangue ou outros exames médicos, devendo o sujeito ser conduzido pelo agente da autoridade a que instituição?",
            image = R.drawable.transparent,
            optionOne = "Centro de saúde",
            optionTwo = "Hospital",
            optionThree = "Estabelecimento de saúde mais próximo",
            correctAnswer = 3
        )
        questionsList.add(q99)

        val q100 = Question(
            id = 99,
            question = "O regime jurídico das armas e suas munições aprovado pela lei 5/2006, prevê tipos de responsabilidade punitiva para os atos ilícitos. Indique quais?",
            image = R.drawable.transparent,
            optionOne = "Responsabilidade civil ejudicial",
            optionTwo = "Responsabilidade criminal e contra- ordenacional",
            optionThree = "Responsabilidade administrativa e civil",
            correctAnswer = 2
        )
        questionsList.add(q100)

        val q101 = Question(
            id = 100,
            question = "A ciência que estuda as leis que regem o movimento de todo o corpo lançado no espaço, denomina-se por:",
            image = R.drawable.transparent,
            optionOne = "Trajetória",
            optionTwo = "Alcance ",
            optionThree = "Balística",
            correctAnswer = 3
        )
        questionsList.add(q101)

        val q102 = Question(
            id = 101,
            question = "Quando for notificado da decisão de não concessão de renovação de licença de uso e porte de arma, o interessado pode, desde que remeta à PSP o respetivo comprovativo, fazer o seguinte:",
            image = R.drawable.transparent,
            optionOne = "Optar pela transmissão da arma ",
            optionTwo = "Optar pela guarda da arma",
            optionThree = "Ambas as anteriores estão corretas",
            correctAnswer = 1
        )
        questionsList.add(q102)

        val q103 = Question(
            id = 102,
            question = "S.I.E.M., o que significa?",
            image = R.drawable.transparent,
            optionOne = "Secretariado do Instituto de Emergência Médica",
            optionTwo = "Sistema Integrado de Emergência Médica",
            optionThree = "Reconhecer e identificar o problema, pedir ajuda e iniciar o suporte básico de vida ",
            correctAnswer = 2
        )
        questionsList.add(q103)

        val q104 = Question(
            id = 103,
            question = "Sempre que pegar numa arma de fogo, diga o que deve fazer?",
            image = R.drawable.transparent,
            optionOne = "Abrir a arma e fechar",
            optionTwo = "Abrir a arma e verificar se está carregada",
            optionThree = "Verificar se tem cadeado de gatilho",
            correctAnswer = 2
        )
        questionsList.add(q104)

        val q105 = Question(
            id = 104,
            question = "O que deve fazer antes de carregar uma arma?",
            image = R.drawable.transparent,
            optionOne = "Verificar se a arma está carregada",
            optionTwo = "Ver se o mecanismo de disparo funciona",
            optionThree = "Verificar se o cano ou canos estado desobstruídos",
            correctAnswer = 3
        )
        questionsList.add(q105)

        val q106 = Question(
            id = 105,
            question = "Nos veículos automóveis como devem ser transportadas as armas?",
            image = R.drawable.transparent,
            optionOne = "Separadas das respetivas munições, com mecanismo de segurança acionado",
            optionTwo = "Sem munições na câmara, com cadeado de gatilho e mecanismo que impossibilite o uso indevido e em bolsa ou estojo próprio",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q106)

        val q107 = Question(
            id = 106,
            question = "Durante as sessões de tiro é proibido aos atiradores:",
            image = R.drawable.transparent,
            optionOne = "Beber, ingerir alimentos, fumar",
            optionTwo = "Criar perigo de acidentes ou adoptar comportamento susceptível de perturbar a concentração pessoal ou de terceiros",
            optionThree = "Ambas as respostas estão certas",
            correctAnswer = 3
        )
        questionsList.add(q107)

        val q108 = Question(
            id = 107,
            question = "Depois de retirar a arma do estojo e quando se preparar para iniciar o ato venatório, o que deve conferir antes de iniciar essa prática?",
            image = R.drawable.transparent,
            optionOne = "Se a arma está fechada e carregada corretamente",
            optionTwo = "Se montou a arma em condições quando a carregou",
            optionThree = "Se montou a arma em condições e se fecha corretamente",
            correctAnswer = 3
        )
        questionsList.add(q108)

        val q109 = Question(
            id = 108,
            question = "Quando é que só deve carregar a arma se estiver afastado dos companheiros?",
            image = R.drawable.transparent,
            optionOne = "Em ação de caça",
            optionTwo = "Na carreira de tiro",
            optionThree = "No campo de tiro",
            correctAnswer = 1
        )
        questionsList.add(q109)

        val q110 = Question(
            id = 109,
            question = "Em termos de segurança as armas de canos justapostos possuem:",
            image = R.drawable.transparent,
            optionOne = "Uma patilha lateral que roda consoante o cano a utilizar",
            optionTwo = "Uma patilha na parte superior da coronha",
            optionThree = "Uma patilha lateral que se empurra para a direita",
            correctAnswer = 2
        )
        questionsList.add(q110)

        val q111 = Question(
            id = 110,
            question = "Nunca se deve confiar na sua memória ,considerando-se sempre que a arma está carregada, até confirmar o contrário. Sendo assim, os procedimentos de segurança com arma de fogo devem ser executados sempre que",
            image = R.drawable.transparent,
            optionOne = "Recebe ou entrega a arma a outro elemento",
            optionTwo = "Se encontra uma arma abandonada ou a arma sofra algum tipo de avaria ou falha ",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q111)

        val q112 = Question(
            id = 111,
            question = "Quando uma arma de canos justapostos se encontra aberta e sem cartuchos nas câmaras, está:",
            image = R.drawable.transparent,
            optionOne = "Aberta",
            optionTwo = "Descarregada ",
            optionThree = "Livre",
            correctAnswer = 2
        )
        questionsList.add(q112)

        val q113 = Question(
            id = 112,
            question = "Indique as partes essenciais de uma arma de fogo (carabina):",
            image = R.drawable.transparent,
            optionOne = "Carcaça e cano, tambor, mecanismo de disparar e aparelho de pontaria",
            optionTwo = "Carcaça e cano, estojo de limpeza e mecanismo de disparar ",
            optionThree = "Cano, culatra, caixa da culatra ou corrediça e carcaça",
            correctAnswer = 1
        )
        questionsList.add(q113)

        val q114 = Question(
            id = 113,
            question = "Todo o engenho ou mecanismo portátil destinado a provocar a deflagração de uma carga propulsora, geradora de uma massa de gases cuja expansão impele um ou mais projéteis, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Arma automática",
            optionTwo = "Arma de fogo",
            optionThree = "Arma de repetição",
            correctAnswer = 2
        )
        questionsList.add(q114)

        val q115 = Question(
            id = 114,
            question = "Indique a que classe de armas pertencem os engenhos ou instrumentos construídos exclusivamente com o fim de serem utilizados como arma de agressão:",
            image = R.drawable.transparent,
            optionOne = "B",
            optionTwo = "B1 e C",
            optionThree = "A",
            correctAnswer = 3
        )
        questionsList.add(q115)

        val q116 = Question(
            id = 115,
            question = "No requerimento do pedido de concessão de licença o que deve constar:",
            image = R.drawable.transparent,
            optionOne = "Nome completo, número do bilhete de identidade, data de emissão, profissão, naturalidade e nacionalidade",
            optionTwo = "Nome completo, número do bilhete de identidade, data de emissão, profissão, naturalidade, nacionalidade e domicílio",
            optionThree = "Nome completo do requerente, número do bilhete de identidade, data e local de emissão, data de nascimento, profissão, estado civil, naturalidade, nacionalidade e domicilio",
            correctAnswer = 3
        )
        questionsList.add(q116)

        val q117 = Question(
            id = 116,
            question = "O sistema de ignição de uma munição em que o percutor atua sobre a escorva ou fulminante aplicado no centro da base do invólucro, tem a denominação de:",
            image = R.drawable.transparent,
            optionOne = "Percussão central ",
            optionTwo = "Percussão lateral ",
            optionThree = "Percussão anelar",
            correctAnswer = 1
        )
        questionsList.add(q117)

        val q118 = Question(
            id = 117,
            question = "A carga do composto químico usada para carregar munições ou carga de pólvora preta ou substância similar usada para carregar as armas de carregamento pela boca, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Carga propulsora ou escoria",
            optionTwo = "Carga propulsora ou fulminante",
            optionThree = "Carga propulsora ou carga de pólvora",
            correctAnswer = 3
        )
        questionsList.add(q118)

        val q119 = Question(
            id = 118,
            question = "As replicas de armas de fogo, quando utilizadas para tiro desportivo, são armas da classe:",
            image = R.drawable.transparent,
            optionOne = "C",
            optionTwo = "F",
            optionThree = "A",
            correctAnswer = 1
        )
        questionsList.add(q119)

        val q120 = Question(
            id = 119,
            question = "O titular de uma licença de uso e porte de arma, é obrigado a ter seguro de responsabilidade civil. Quantos seguros é necessário possuir o titular de três licenças de armas:",
            image = R.drawable.transparent,
            optionOne = "Um seguro ",
            optionTwo = "Tres seguros ",
            optionThree = "Dois seguros",
            correctAnswer = 1
        )
        questionsList.add(q120)

        val q121 = Question(
            id = 120,
            question = "Os titulares de licenças, independentemente da sua culpa, por danos causados a terceiros em consequência da utilização de armas de fogo que detenham ou da sua actividade, são responsáveis:",
            image = R.drawable.transparent,
            optionOne = "Criminalmente",
            optionTwo = "Contra-ordenacionalmente ",
            optionThree = "Civilmente",
            correctAnswer = 3
        )
        questionsList.add(q121)

        val q122 = Question(
            id = 121,
            question = "No livrete de manifesto consta o número e data de emissão, classe da arma, marca, calibre, número de fabrico, número de canos e ainda:",
            image = R.drawable.transparent,
            optionOne = "Identificação do fabricante",
            optionTwo = "Identificação do importador ",
            optionThree = "Identificação do proprietario",
            correctAnswer = 3
        )
        questionsList.add(q122)

        val q123 = Question(
            id = 122,
            question = "A solicitação de autorização de transferência de armas de portugal para os estados membros é efetuada através de requerimento dirigido ao:",
            image = R.drawable.transparent,
            optionOne = "Diretor nacional da PSP",
            optionTwo = "Diretor nacional da policia judiciária",
            optionThree = "Diretor da secretaria geral do MAI",
            correctAnswer = 1
        )
        questionsList.add(q123)

        val q124 = Question(
            id = 123,
            question = "O que nunca se deve fazer com uma arma mesmo que esteja descarregada:",
            image = R.drawable.transparent,
            optionOne = "Adoptar comportamentos que possam colocar em causa a segurança de terceiros",
            optionTwo = "Apontá-la a pessoas",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q124)

        val q125 = Question(
            id = 124,
            question = "Nas armas longas sempre que lhe surja um obstáculo que tenha que ultrapassar o que deve fazer? ",
            image = R.drawable.transparent,
            optionOne = "Entrega-la ao companheiro",
            optionTwo = "Abri-la",
            optionThree = "Abri-la e descarregá-la",
            correctAnswer = 3
        )
        questionsList.add(q125)

        val q126 = Question(
            id = 125,
            question = "Na sua residência deve ter sempre atenção:",
            image = R.drawable.transparent,
            optionOne = "Não misturar as caixas, sacos ou cartucheiras, munições de calibres e comprimentos de câmaras diferentes",
            optionTwo = "Juntar em caixas, sacos ou cartucheiras, munições de calibres e comprimentos de câmaras diferentes",
            optionThree = "Juntar armas e munições na mesma caixa",
            correctAnswer = 1
        )
        questionsList.add(q126)

        val q127 = Question(
            id = 126,
            question = "Na sua residência quando preparar a arma para atos venatórios, desportivos ou outros, deve:",
            image = R.drawable.transparent,
            optionOne = "Retirar a massa de proteção",
            optionTwo = "Retirar o excesso de óleo que possa estar no interior dos canos ",
            optionThree = "Ambas as respostas estão certas",
            correctAnswer = 3
        )
        questionsList.add(q127)

        val q128 = Question(
            id = 127,
            question = "Antes de começar a caçar deve verificar se:",
            image = R.drawable.transparent,
            optionOne = "Se os canos têm número e as câmaras estão carregadas, se montou a arma em condições e se fecha corretamente",
            optionTwo = "Se o cano têm número e a arma foi montada condições e abre corretamente",
            optionThree = "Os canos estão desobstruídos e a arma foi montada em condições e fecha corretamente ",
            correctAnswer = 3
        )
        questionsList.add(q128)

        val q129 = Question(
            id = 128,
            question = "Quando é que devemos colocar o dedo no gatilho?",
            image = R.drawable.transparent,
            optionOne = "Sempre que ande em ato venatório",
            optionTwo = "Quando estamos no posto de tiro ou em ato venatório ",
            optionThree = "No momento do disparo",
            correctAnswer = 3
        )
        questionsList.add(q129)

        val q130 = Question(
            id = 129,
            question = "No final da caça quando terminar o ato venatório deve:",
            image = R.drawable.transparent,
            optionOne = "Abrir descarregar e limpar a arma",
            optionTwo = "Abrir a arma carregada",
            optionThree = "Manter a arma fechada e descarregada",
            correctAnswer = 1
        )
        questionsList.add(q130)

        val q131 = Question(
            id = 130,
            question = "Indique quais as partes essenciais de uma arma de fogo de canos laterais ou sobrepostos: ",
            image = R.drawable.transparent,
            optionOne = "Coronha, guarda mato, estojo de limpeza e canos",
            optionTwo = "Coronha, caixa de mecanismos, canos e fuste ",
            optionThree = "Caixa de mecanismos, canos e estojo de limpeza",
            correctAnswer = 2
        )
        questionsList.add(q131)

        val q132 = Question(
            id = 131,
            question = "Que tipo de tiro é efetuado quando após a introdução da primeira munição na câmara, os restantes disparos acontecem por ação do atirador no gatilho:",
            image = R.drawable.transparent,
            optionOne = "Simples",
            optionTwo = "Semiautomatico",
            optionThree = "Tiro atiro",
            correctAnswer = 2
        )
        questionsList.add(q132)

        val q133 = Question(
            id = 132,
            question = "A superficie interior do cano entre a câmara e a boca, designa-se:",
            image = R.drawable.transparent,
            optionOne = "Alma lisa",
            optionTwo = "Alma estriada",
            optionThree = "Alma do cano",
            correctAnswer = 3
        )
        questionsList.add(q133)

        val q134 = Question(
            id = 133,
            question = "O que se designa \"calibre do cano\"?",
            image = R.drawable.transparent,
            optionOne = "O diâmetro exterior do cano expresso em milímetros ou polegadas ",
            optionTwo = "O diâmetro interior do cano expresso em centímetros",
            optionThree = "O diâmetro interior do cano expresso em milímetros ou polegadas ",
            correctAnswer = 3
        )
        questionsList.add(q134)

        val q135 = Question(
            id = 134,
            question = "A munição com bala de caça é composta por:",
            image = R.drawable.transparent,
            optionOne = "Um único projétil",
            optionTwo = "Mais do que um projétil",
            optionThree = "Uma substância pirotécnica",
            correctAnswer = 1
        )
        questionsList.add(q135)

        val q136 = Question(
            id = 135,
            question = "A lei n°5/2006 de 23 de fevereiro, alterada e republicada pelas leis 17/2009, de 06 de maio e 12/2011 de 27 de abril, que aprova o regime jurídico das armas e suas munições, não se aplica:",
            image = R.drawable.transparent,
            optionOne = "As actividades relativas a armas e munições destinadas às forças armadas e às forças de serviço de segurança",
            optionTwo = "As armas de fogo cuja data de fabrico seja posterior a 31 de dezembro de 1890",
            optionThree = "Aos componentes das armas e suas munições",
            correctAnswer = 1
        )
        questionsList.add(q136)

        val q137 = Question(
            id = 136,
            question = "A cedência a titulo de empréstimo é feita em triplicado, ficando o duplicado na posse de:",
            image = R.drawable.transparent,
            optionOne = "PSP",
            optionTwo = "Proprietários",
            optionThree = "Comprador",
            correctAnswer = 2
        )
        questionsList.add(q137)

        val q138 = Question(
            id = 137,
            question = "O manifesto das armas das classes B, B1, C e D, que resulta da sua importação, transferência, fabrico, apresentação voluntária ou aquisição, é:",
            image = R.drawable.transparent,
            optionOne = "Requisitado",
            optionTwo = "Solicitado",
            optionThree = "Obrigatório",
            correctAnswer = 3
        )
        questionsList.add(q138)

        val q139 = Question(
            id = 138,
            question = "Diga quem tem competência para a aplicação das coimas previstas no regime jurídico das armas e sua munições:",
            image = R.drawable.transparent,
            optionOne = "O ministro da administração interna",
            optionTwo = "O ministro das finanças",
            optionThree = "Ao diretor nacional da PSP",
            correctAnswer = 3
        )
        questionsList.add(q139)

        val q140 = Question(
            id = 139,
            question = "O proprietário das armas, deve tomar todas as precauções necessárias para prevenir:",
            image = R.drawable.transparent,
            optionOne = "O seu extravio",
            optionTwo = "Ocorrência de acidentes e o furto ou roubo",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q140)

        val q141 = Question(
            id = 140,
            question = "A arma de fogo curta ou longa deve ser transportada de forma separada das respetivas munições:",
            image = R.drawable.transparent,
            optionOne = "Em bolsa ou estojo adequados para o modelo em questão, com adequadas condições de segurança, separada das respetivas munições, com cadeado de gatilho ou mecanismo que impossibilite o seu uso, ou desmontadas de forma a que não sejam facilmente utilizáveis",
            optionTwo = "Com cadeado de gatilho em bolsa ou estojo adequados para o modelo em questão",
            optionThree = "Com mecanismo que impossibilite o seu uso em bolsa ou estojo adequados para o modelo em questão",
            correctAnswer = 1
        )
        questionsList.add(q141)

        val q142 = Question(
            id = 141,
            question = "A recolha de sangue para efeitos de contra prova de exame de pesquisa se álcool, ou para a realização dos exames de despistagem de substâncias estupefacientes ou outras, é realizada em estabelecimento de saúde oficial e no prazo máximo de:",
            image = R.drawable.transparent,
            optionOne = "30 minutos",
            optionTwo = "1 hora",
            optionThree = "2 horas",
            correctAnswer = 3
        )
        questionsList.add(q142)

        val q143 = Question(
            id = 142,
            question = "Numa arma carregada deve sempre desconfiar do seu mecanismo de segurança, porquê?",
            image = R.drawable.transparent,
            optionOne = "Uma pancada, uma queda ou um defeito mecânico podem não impedir o disparo",
            optionTwo = "Uma pancada, uma queda podem impedir o disparo da arma",
            optionThree = "Porque este pode atuar sobre o aparelho de pontaria através de um defeito mecânico ",
            correctAnswer = 1
        )
        questionsList.add(q143)

        val q144 = Question(
            id = 143,
            question = "Durante o ato venatório deve ter atenção aos ricochetes, por isso deve evitar?",
            image = R.drawable.transparent,
            optionOne = "Disparar sobre terrenos que estejam protegidos por matos rasteiros",
            optionTwo = "Disparar sobre superfícies planas ou duras, quando praticar caça em terrenos pedregosos ou gelados",
            optionThree = "Disparar para terrenos que se encontrem numa encosta, limpos e sem matos ",
            correctAnswer = 2
        )
        questionsList.add(q144)

        val q145 = Question(
            id = 144,
            question = "Indique as partes essenciais de uma arma de fogo semi-automática:",
            image = R.drawable.transparent,
            optionOne = "Culatra, estojo de limpeza, coronha com caixa dos mecanismos de disparar e ejector e porta cartuchos",
            optionTwo = "Culatra, coronha com caixa dos mecanismos de disparar e ejector, porta cartuchos e estojo de limpeza",
            optionThree = "Culatra, coronha com caixa dos mecanismos de disparar e ejector e porta cartuchos, cano, fuste ou guarda mão, e tampa do carregador",
            correctAnswer = 3
        )
        questionsList.add(q145)

        val q146 = Question(
            id = 145,
            question = "Indique as partes essenciais de uma arma de fogo (carabina)",
            image = R.drawable.transparent,
            optionOne = "Carcaça e cano, carregador, mecanismo de disparar e aparelho de pontaria ",
            optionTwo = "Carcaça e cano, estojo de limpeza e mecanismo de disparar",
            optionThree = "Tambor, mecanismo de disparar, aparelho de pontaria e estojo de limpeza",
            correctAnswer = 1
        )
        questionsList.add(q146)

        val q147 = Question(
            id = 146,
            question = "Na residência deve ter sempre atenção:",
            image = R.drawable.transparent,
            optionOne = "Não misturar em caixas sacos ou cartucheiras, munições de calibres e comprimentos de câmara diferentes",
            optionTwo = "Juntar em caixas sacos ou cartucheiras, munições de calibres e comprimentos de câmara diferentes ",
            optionThree = "Juntar armas e munições na mesma caixa",
            correctAnswer = 1
        )
        questionsList.add(q147)

        val q148 = Question(
            id = 147,
            question = "As regras de segurança no manuseamento das armas de fogo devem: ",
            image = R.drawable.transparent,
            optionOne = "Ser aplicadas quando está muita gente junta",
            optionTwo = "Ser aplicadas no início e fim do dia de caça",
            optionThree = "Ser aplicadas sempre e de forma instintiva o que obriga a um bom apreendimento das mesmas",
            correctAnswer = 3
        )
        questionsList.add(q148)

        val q149 = Question(
            id = 148,
            question = "Muitos acidentes com armas de fogo acontecem por excesso de confiança. Por isso devemos:",
            image = R.drawable.transparent,
            optionOne = "Devemos ter uma atitude compreensiva para com os portadores de armas",
            optionTwo = "Devemos ter uma atitude crítica e permanentemente observadora da nossa actuação com armas de fogo",
            optionThree = "Devemos travar sempre as armas carregadas fora do exercício da caça",
            correctAnswer = 2
        )
        questionsList.add(q149)

        val q150 = Question(
            id = 149,
            question = "Qual das seguintes regras de segurança é uma regra básica?",
            image = R.drawable.transparent,
            optionOne = "Nunca deixe as armas ao alcance das crianças",
            optionTwo = "Só carregue a arma quando já estiver afastado dos companheiros",
            optionThree = "Abrir sempre as armas nas quais pegar e verificar se estão carregadas",
            correctAnswer = 3
        )
        questionsList.add(q150)

        val q151 = Question(
            id = 150,
            question = "Quando, acompanhado da sua arma de caça, se encontrar junto a outras pessoas deve:",
            image = R.drawable.transparent,
            optionOne = "Mantê-la travada e com os canos virados para o ar",
            optionTwo = "Pode estar fechada desde que os canos não apontem para ninguém ",
            optionThree = "Mantê-la descarregada e aberta",
            correctAnswer = 3
        )
        questionsList.add(q151)

        val q152 = Question(
            id = 151,
            question = "Depois de ter verificado que a arma está descarregada:",
            image = R.drawable.transparent,
            optionOne = "Tem que verificar outra vez para poder manusea-la a vontade e fazer agilidades com ela",
            optionTwo = "Nunca em situação alguma deve aponta-la para uma pessoa e muito menos simular o tiro",
            optionThree = "Pode apontar para outra pessoa desde que não coloque o dedo no gatilho e a arma esteja travada",
            correctAnswer = 2
        )
        questionsList.add(q152)

        val q153 = Question(
            id = 152,
            question = "Numa montaria se os cães assinalarem um javali em fuga na nossa direção: ",
            image = R.drawable.transparent,
            optionOne = "Podemos atirar para o mato que mexe porque só um javali abana os arbustos assim",
            optionTwo = "Podemos atirar porque os latidos dos cães não enganam",
            optionThree = "Só é permitido atirar se virmos e identificarmos correctamente o alvo como sendo o javali ",
            correctAnswer = 3
        )
        questionsList.add(q153)

        val q154 = Question(
            id = 153,
            question = "Ao ultrapassar um obstáculo deve:",
            image = R.drawable.transparent,
            optionOne = "Travar a arma e ter cuidado com ela",
            optionTwo = "Ver se pode ultrapassá-lo sem cuidados de maior. Caso contrário deve travar a arma",
            optionThree = "Abrir e descarregar a arma",
            correctAnswer = 3
        )
        questionsList.add(q154)

        val q155 = Question(
            id = 154,
            question = "Uma das regras especificas de segurança, para armas longas, em casa é:",
            image = R.drawable.transparent,
            optionOne = "Manter as armas guardadas em cofre ou armário próprio e fechadas a chave e desmontadas",
            optionTwo = "Manter as munições fechadas a chave juntamente com armas em local inacessível aos menores ",
            optionThree = "Manter a arma ostensivamente aberta e descarregada",
            correctAnswer = 1
        )
        questionsList.add(q155)

        val q156 = Question(
            id = 155,
            question = "Qual o motivo porque não deve misturar munições de calibres e comprimentos de câmara diferente?",
            image = R.drawable.transparent,
            optionOne = "Porque se por lapso trocar as munições, os calibres mais pequenos não matam bem a caça",
            optionTwo = "Porque por lapso as mais pequenas podem entrar na câmara das maiores e ficar presas nos canos e originar acidentes",
            optionThree = "Porque pode falhar um javali porque algumas munições têm uma trajectória mais tensa que outras",
            correctAnswer = 2
        )
        questionsList.add(q156)

        val q157 = Question(
            id = 156,
            question = "Nos automóveis deve observar as seguintes regras de segurança ",
            image = R.drawable.transparent,
            optionOne = "Transportar arma desmontada dentro de estojo próprio e separada das munições",
            optionTwo = "Não deve fumar quando se faz acompanhar de munições de caça grossa",
            optionThree = "Quando for almoçar deve levar consigo as munições e deixar as armas fechados no carro ",
            correctAnswer = 1
        )
        questionsList.add(q157)

        val q158 = Question(
            id = 157,
            question = "Uma das regras de segurança antes de começar a caçar e:",
            image = R.drawable.transparent,
            optionOne = "Verificar se os canos estão desobstruídos",
            optionTwo = "Ao tirar a arma do saco nunca a deixe no chão, mas sim encostada ao carro ou arvore próxima ",
            optionThree = "Nunca atirar na direção de uma pessoa mesmo que esta pareça fora do alcance da arma",
            correctAnswer = 1
        )
        questionsList.add(q158)

        val q159 = Question(
            id = 158,
            question = "Em ação de caça deve:",
            image = R.drawable.transparent,
            optionOne = "Só carregar a arma quando já estiver afastado dos companheiros e ao fazê-lo deve manter os canos em direção segura, porque as armas sobretudo as mais velhas por vezes disparam-se sozinhas ao carregar",
            optionTwo = "Ao chegar junto dos colegas para trocar impressões sobre como continuar a caçada deve travar a arma",
            optionThree = "Depois de carregar deve destravar a arma para que não se engane quando surgir uma peça de caça ",
            correctAnswer = 1
        )
        questionsList.add(q159)

        val q160 = Question(
            id = 159,
            question = "Durante a caçada o dedo que prime o gatilho deve andar:",
            image = R.drawable.transparent,
            optionOne = "Encostado ao gatilho cuidadosamente sem fazer qualquer pressão",
            optionTwo = "Dentro do guarda mato sem encostar ao gatilho",
            optionThree = "Fora do guarda mato encostado a este sem tocar no gatilho",
            correctAnswer = 3
        )
        questionsList.add(q160)

        val q161 = Question(
            id = 160,
            question = "Numa batida ou montaria um caçador que avisa da sua posição aos postos contíguos:",
            image = R.drawable.transparent,
            optionOne = "Agiu de forma correcta cumprindo as regras de segurança",
            optionTwo = "É um caçador fala-barato que espanta a caça",
            optionThree = "Não ha necessidade de avisar os outros se estiver bem protegido",
            correctAnswer = 1
        )
        questionsList.add(q161)

        val q162 = Question(
            id = 161,
            question = "No momento do tiro um caçador nunca deve:",
            image = R.drawable.transparent,
            optionOne = "Deixar-se cegar pela caça. Deve vigiar sempre o que pode estar para além do tiro.",
            optionTwo = "Deixar de atirar só porque a caça vai na direção de outro caçador que está fora do alcance.",
            optionThree = "Perder a oportunidade de fazer os tiros, de preferência sobre superfície planas e duras ou sobre agua.",
            correctAnswer = 1
        )
        questionsList.add(q162)

        val q163 = Question(
            id = 162,
            question = "Depois de atirar e antes de recarregar novamente deve:",
            image = R.drawable.transparent,
            optionOne = "Olhar o interior dos canos e verificar se não ficaram obstruídos por algum componente do cartucho ",
            optionTwo = "Retirar os cartuchos vazios do interior das almas",
            optionThree = "Abrir e fechar a arma várias vezes para ver se accionou os martelos de forma correcta",
            correctAnswer = 1
        )
        questionsList.add(q163)

        val q164 = Question(
            id = 163,
            question = "Diga qual a frase incorrecta",
            image = R.drawable.transparent,
            optionOne = "Nunca atire sobre aquilo que mexe. Atire só sobre peças identificadas e visíveis ",
            optionTwo = "Numa montaria ou batida nunca saia do seu posto nem mude de posição",
            optionThree = "Na caça de batida e montaria quando os batedores se aproximam podemos atirar para dentro da mancha sem preocupações",
            correctAnswer = 3
        )
        questionsList.add(q164)

        val q165 = Question(
            id = 164,
            question = "Depois de terminar o acto de caça deve:",
            image = R.drawable.transparent,
            optionOne = "Descarregar imediatamente a arma e mantê-la aberta até ser desmontada e guardada em estojo próprio ",
            optionTwo = "Travar imediatamente a arma e encostá-la ao carro para não se esquecer dela no campo",
            optionThree = "Não tem que ter preocupações especiais porque a caçada já terminou",
            correctAnswer = 1
        )
        questionsList.add(q165)

        val q166 = Question(
            id = 165,
            question = "Qual o significado da frase popular que diz “o diabo disparou com uma tranca”",
            image = R.drawable.transparent,
            optionOne = "Significa que uma arma que se pensava estar vazia e que só servia de tranca por não estar carregada afinal estava carregada e disparou um tiro",
            optionTwo = "Significa que o diabo fez um milagre",
            optionThree = "Significa que o diabo disfarçou a arma numa tranca",
            correctAnswer = 1
        )
        questionsList.add(q166)

        val q167 = Question(
            id = 166,
            question = "É obrigação, de todos os caçadores, tomar todas precauções no sentido de se evitarem os acidentes. para tal ser alcançado é necessário",
            image = R.drawable.transparent,
            optionOne = "Ter boa pontuação no exame da carta de condução",
            optionTwo = "Conhecer e aplicar bem todas as regras de segurança e ser exigente consigo e com os outros no seu cumprimento",
            optionThree = "Ter armas novas do último modelo que são mais seguras",
            correctAnswer = 2
        )
        questionsList.add(q167)

        val q168 = Question(
            id = 167,
            question = "O desvio lateral da coronha chama-se:",
            image = R.drawable.transparent,
            optionOne = "Cast-off se o desvio for para a esquerda e cast-in se o desvio for para a direita",
            optionTwo = "Cast-off se o desvio for para a direita e cast-in se o desvio for para a esquerda ",
            optionThree = "Cast-off se a coronha for descaída para a esquerda",
            correctAnswer = 2
        )
        questionsList.add(q168)

        val q169 = Question(
            id = 168,
            question = "Diga quais os componentes de recarga",
            image = R.drawable.transparent,
            optionOne = "Invólucro e copela, fulminante, carga propulsora, bucha e armador",
            optionTwo = "Invólucro e copela, fulminante, carga de pólvora, bucha, carga de chumbos e cão",
            optionThree = "Invólucro, fulminante, carga propulsora, bucha, projecteis e cartuchos ",
            correctAnswer = 3
        )
        questionsList.add(q169)

        val q170 = Question(
            id = 169,
            question = "Qual a função do fulminante?",
            image = R.drawable.transparent,
            optionOne = "Provocar a inflamação da pólvora",
            optionTwo = "Fazer com que a chumbada não se derreta ",
            optionThree = "Evitar que a pólvora caia da copela",
            correctAnswer = 1
        )
        questionsList.add(q170)

        val q171 = Question(
            id = 170,
            question = "O que entende por cartucho de zagalotes",
            image = R.drawable.transparent,
            optionOne = "É o cartucho carregado com multiprojécteis em que cada projéctil tem um diâmetro superior a 4.5 mm",
            optionTwo = "É o cartucho que se utiliza na caça maior",
            optionThree = "É um cartucho que só se utiliza na caça as raposas",
            correctAnswer = 1
        )
        questionsList.add(q171)

        val q172 = Question(
            id = 171,
            question = "Porque nunca devemos juntar cartuchos de calibre 12 com calibre 20?",
            image = R.drawable.transparent,
            optionOne = "Porque um cartucho de calibre 20 introduzido por engano numa arma de calibre 12 ficara preso no final da câmara, permitindo que caiba um cartucho calibre 12 por cima. Ao disparar a arma rebentará e pode provocar sérios danos ao caçador",
            optionTwo = "Porque o atirador falhara com certeza a peça de caça porque o cartucho calibre 20 é mais fraco",
            optionThree = "Porque pode encravar a arma que poderá não voltar a abrir ",
            correctAnswer = 1
        )
        questionsList.add(q172)

        val q173 = Question(
            id = 172,
            question = "“correr a mao” é:",
            image = R.drawable.transparent,
            optionOne = "É o movimento que o atirador executa no tiro a peça de caça e que consiste no ligeiro adiantamento da arma em relação à peça de caça a abater",
            optionTwo = "Avançar a mão o mais possível para a frente do fuste",
            optionThree = "O acto de deslizar a mão na coronha quando se muda do primeiro gatilho para o segundo ",
            correctAnswer = 1
        )
        questionsList.add(q173)

        val q174 = Question(
            id = 173,
            question = "O que é o peso do gatilho?",
            image = R.drawable.transparent,
            optionOne = "São os gatilhos maciços mais pesados que os ocos",
            optionTwo = "É a força, medida em kg, que se aplica sobre a cauda do gatilho, para fazer disparar a arma",
            optionThree = "É a força medida em kg, que se aplica no ombro do atirador quando puxa o gatilho",
            correctAnswer = 2
        )
        questionsList.add(q174)

        val q175 = Question(
            id = 174,
            question = "Numa espingarda de dois gatilhos o peso do segundo gatilho é maior que o do primeiro. Diga qual o peso mínimo de cada um deles",
            image = R.drawable.transparent,
            optionOne = "1.9k no primeiro e 1.7k no segundo",
            optionTwo = "1.6 k no segundo e 1.9k no primeiro",
            optionThree = "1.7k no primeiro e 1.9k no segundo",
            correctAnswer = 3
        )
        questionsList.add(q175)

        val q176 = Question(
            id = 175,
            question = "Diga quais os componentes do cartucho",
            image = R.drawable.transparent,
            optionOne = "Invólucro e copela, fulminante, carga, bucha e armador",
            optionTwo = "Invólucro e copela, fulminante, carga, bucha, carga de chumbos e cão",
            optionThree = "Fulminante, copela de metal, invólucro de plastico, carga, bucha, granalha de chumbo ou zagalotes de borracha e bucha de fecho",
            correctAnswer = 3
        )
        questionsList.add(q176)

        val q177 = Question(
            id = 176,
            question = "Diga qual a frase correcta",
            image = R.drawable.transparent,
            optionOne = "O recuo ou coice da arma é mais sentido numa arma pesada",
            optionTwo = "A força do recuo tem a ver com o comprimento da coronha, peso da arma e diâmetro das almas",
            optionThree = "Uma arma leve não dá tanto recuo",
            correctAnswer = 2
        )
        questionsList.add(q177)

        val q178 = Question(
            id = 177,
            question = "Quais os tipos de alcance que existem",
            image = R.drawable.transparent,
            optionOne = "Alcance útil normal e alcance maximo",
            optionTwo = "Alcance útil, alcance maximo normal e alcance maximo acidental",
            optionThree = "Alcance útil normal, alcance normal e alcance maximo",
            correctAnswer = 2
        )
        questionsList.add(q178)

        val q179 = Question(
            id = 178,
            question = "Qual a distância do alcance útil numa espingarda de canos lisos?",
            image = R.drawable.transparent,
            optionOne = "É a distância até à qual a energia e densidade dos projécteis permitem matar seguramente a peça de caça. A distância varia entre os 30 e 40 metros",
            optionTwo = "É a distância até à qual a energia e densidade dos projécteis permitem matar seguramente a peça de caça. A distância varia entre os 50 e 60m",
            optionThree = "É a distância até à qual a espingarda pode abater uma peça de caça qualquer. ",
            correctAnswer = 1
        )
        questionsList.add(q179)

        val q180 = Question(
            id = 179,
            question = "Se ao apontar verificar que existe alguém na direção do tiro:",
            image = R.drawable.transparent,
            optionOne = "Pode atirar se estiver longe",
            optionTwo = "Pode atirar se estiver a mais de 250 metros",
            optionThree = "Não deve atirar porque os projéteis múltiplos poderão formar um cacho e atingir distâncias enormes e imprevistas e as balas podem atingir até 5000m de distância ",
            correctAnswer = 3
        )
        questionsList.add(q180)

        val q181 = Question(
            id = 180,
            question = "Quais as causas prováveis do embalamento",
            image = R.drawable.transparent,
            optionOne = "Bucha defeituosa ou mal colocada, liga demasiado rica em chumbo ou cano demasiado corroído ",
            optionTwo = "Demasiada pólvora no cartucho",
            optionThree = "Fulminante muito forte",
            correctAnswer = 1
        )
        questionsList.add(q181)

        val q182 = Question(
            id = 181,
            question = "Como se distingue uma carabina de uma caçadeira",
            image = R.drawable.transparent,
            optionOne = "A carabina tem a alma lisa e acessórios de pontaria mais aperfeiçoados",
            optionTwo = "A carabina tem a alma estriada e acessórios de pontaria mais aperfeiçoados ",
            optionThree = "A carabina pode levar mais munições",
            correctAnswer = 2
        )
        questionsList.add(q182)

        val q183 = Question(
            id = 182,
            question = "O que são as estrias numa carabina",
            image = R.drawable.transparent,
            optionOne = "São pequenos sulcos abertos no interior dos canos, formando uma espiral ao longo destes",
            optionTwo = "São sulcos profundos nos canos das carabinas, sulcos esses em forma de rosca",
            optionThree = "São as afinações dos aparelhos de pontaria ",
            correctAnswer = 1
        )
        questionsList.add(q183)

        val q184 = Question(
            id = 183,
            question = "Para que servem as estrias",
            image = R.drawable.transparent,
            optionOne = "Para imprimir um movimento de rotação ao projéctil ",
            optionTwo = "Para dar mais velocidade ao projéctil",
            optionThree = "Para proteger os canos da press&o do tiro",
            correctAnswer = 1
        )
        questionsList.add(q184)

        val q185 = Question(
            id = 184,
            question = "Quais são os acessórios de pontaria da carabina ",
            image = R.drawable.transparent,
            optionOne = "A alga e o fuste e o ponto de mira",
            optionTwo = "A alga, e a calha e o diopter",
            optionThree = "Ponto de mira, a alga, o diopter, o óculo de pontaria ou mira telescopica ",
            correctAnswer = 3
        )
        questionsList.add(q185)

        val q186 = Question(
            id = 185,
            question = "Ao atirar com uma carabina, deve:",
            image = R.drawable.transparent,
            optionOne = "Certificar-se que a carabina está destravada",
            optionTwo = "Certificar-se de que a bala tem onde embater sem fazer ricochete se estiver a caçar em terrenos pedregosos ou gelados",
            optionThree = "Fazer apenas tiros rasantes ou para o ar, por causa dos ricochetes",
            correctAnswer = 2
        )
        questionsList.add(q186)

        val q187 = Question(
            id = 186,
            question = "Quais as vantagens que uma carabina tem sobre uma espingarda caçadeira ",
            image = R.drawable.transparent,
            optionOne = "Maior precisão e maior alcance",
            optionTwo = "Maior energia e maior precisão",
            optionThree = "As respostas a) e b) estão correctas ",
            correctAnswer = 3
        )
        questionsList.add(q187)

        val q188 = Question(
            id = 187,
            question = "Diga qual a frase correcta:",
            image = R.drawable.transparent,
            optionOne = "A bala de carabina de um calibre médio pode desenvolver o dobro da energia de uma bala de caçadeira ",
            optionTwo = "As estrias nos canos das carabinas dão maior alcance às balas",
            optionThree = "O menor peso da bala de carabina em relação a da espingarda confere-lhe maior precisão",
            correctAnswer = 1
        )
        questionsList.add(q188)

        val q189 = Question(
            id = 188,
            question = "Quais os componentes de um cartucho metálico de carabina de caça maior",
            image = R.drawable.transparent,
            optionOne = "Invólucro, fulminante, carga de pólvora e bala",
            optionTwo = "Invólucro, fulminante, bucha, carga de pólvora e bala",
            optionThree = "Invólucro, bucha, carga de pólvora e bala ",
            correctAnswer = 1
        )
        questionsList.add(q189)

        val q190 = Question(
            id = 189,
            question = "A bala é feita de:",
            image = R.drawable.transparent,
            optionOne = "Aço e revestida a chumbo",
            optionTwo = "Chumbo e revestida de cobre e níquel",
            optionThree = "Aço menos denso na base e chumbo na ponta",
            correctAnswer = 2
        )
        questionsList.add(q190)

        val q191 = Question(
            id = 190,
            question = "Como são expressos os calibres das carabinas?",
            image = R.drawable.transparent,
            optionOne = "Nos países que usam o sistema métrico, são identificados pelo diâmetro do projéctil e comprimento do invólucro em milímetros",
            optionTwo = "Na Grã-Bretanha, EUA e países de influência britânica os calibres são designados pelo diâmetro do projéctil em centésimos ou milésimos de polegada",
            optionThree = "As respostas a) e b) estão correctas",
            correctAnswer = 3
        )
        questionsList.add(q191)

        val q192 = Question(
            id = 191,
            question = "Na designação de um calibre como sendo 7x57r, queremos dizer que:",
            image = R.drawable.transparent,
            optionOne = "O projéctil tem o diâmetro aproximado de 7 mm e o invólucro mede 57mm e tem rebordo ",
            optionTwo = "O projéctil tem o diâmetro aproximado de 57 mm e o invólucro mede 7mm",
            optionThree = "O projéctil tem o diâmetro de 7% de uma polegada",
            correctAnswer = 1
        )
        questionsList.add(q192)

        val q193 = Question(
            id = 192,
            question = "Na designação dos calibres podem estar incluidas referencias a:",
            image = R.drawable.transparent,
            optionOne = "Fabricante, ano de lançamento, peso da pólvora e quantidade de pólvora ",
            optionTwo = "Fabricante e ano de lançamento",
            optionThree = "Fabricante",
            correctAnswer = 1
        )
        questionsList.add(q193)

        val q194 = Question(
            id = 193,
            question = "Quais os calibres mais versáteis em portugal ",
            image = R.drawable.transparent,
            optionOne = "30-30",
            optionTwo = "270 winchester, 7x64 e 30.06 ",
            optionThree = "Calibre 44 e308",
            correctAnswer = 2
        )
        questionsList.add(q194)

        val q195 = Question(
            id = 194,
            question = "Quais as munições magnum mais utilizadas em portugal ",
            image = R.drawable.transparent,
            optionOne = "308 magnum e 45 magnum",
            optionTwo = "7mm reminton magnum e 300 winchester magnum ",
            optionThree = ".22 magnum",
            correctAnswer = 2
        )
        questionsList.add(q195)

        val q196 = Question(
            id = 195,
            question = "Quais os tipos de carabinas de caça mais correntes: ",
            image = R.drawable.transparent,
            optionOne = "De repetição, semiautomáticas, monotiro e .22",
            optionTwo = "De repetição, semiautomáticas, monotiro, express de 2 canos e mistas de 2 ou 3 canos ",
            optionThree = "De repetição, semiautomáticas, monotiro, e express de 2 canos",
            correctAnswer = 2
        )
        questionsList.add(q196)

        val q197 = Question(
            id = 196,
            question = "Quais as espécies de caça que se podem abater com uma carabina de calibre .22 de percussão anelar",
            image = R.drawable.transparent,
            optionOne = "Raposas e sacarrabos",
            optionTwo = "Abetardas e coelhos",
            optionThree = "As carabinas .22 de percussão anelar não são consideradas armas de caça em portugal",
            correctAnswer = 3
        )
        questionsList.add(q197)

        val q198 = Question(
            id = 197,
            question = "As carabinas vulgarmente chamadas de pressão de ar, são armas: ",
            image = R.drawable.transparent,
            optionOne = "São apenas armas de recreio",
            optionTwo = "São armas de caça normais",
            optionThree = "Só podem ser utilizadas para caçar pássaros pequenos",
            correctAnswer = 1
        )
        questionsList.add(q198)

        val q199 = Question(
            id = 198,
            question = "Quantas balas pode conter o carregador de uma carabina de caça de repetição",
            image = R.drawable.transparent,
            optionOne = "2 balas",
            optionTwo = "3 balas",
            optionThree = "Todas as que o fabricante recomenda para o aquele tipo de carregador",
            correctAnswer = 3
        )
        questionsList.add(q199)

        val q200 = Question(
            id = 199,
            question = "Um aerosol de defesa e uma arma elétrica são ambas armas da classe:",
            image = R.drawable.transparent,
            optionOne = "Classe A",
            optionTwo = "Classe B",
            optionThree = "Classe E",
            correctAnswer = 3
        )
        questionsList.add(q200)

        val q201 = Question(
            id = 200,
            question = "Uma arma com canos de 65 cm de comprimento de alma lisa e da classe: ",
            image = R.drawable.transparent,
            optionOne = "C",
            optionTwo = "E",
            optionThree = "D",
            correctAnswer = 3
        )
        questionsList.add(q201)

        val q202 = Question(
            id = 201,
            question = "As armas automáticas são armas da classe: ",
            image = R.drawable.transparent,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            correctAnswer = 1
        )
        questionsList.add(q202)

        val q203 = Question(
            id = 202,
            question = "Uma arma de ar comprimido de aquisição condicionada e da classe:",
            image = R.drawable.transparent,
            optionOne = "Classe B",
            optionTwo = "Classe C",
            optionThree = "Classe D",
            correctAnswer = 2
        )
        questionsList.add(q203)

        val q204 = Question(
            id = 203,
            question = "Qual a validade das licencas de uso e porte de arma da classe C e D:",
            image = R.drawable.transparent,
            optionOne = "2 anos",
            optionTwo = "3 anos",
            optionThree = "5 anos",
            correctAnswer = 3
        )
        questionsList.add(q204)

        val q205 = Question(
            id = 204,
            question = "Indique a resposta certa sobre a arma de ação simples:",
            image = R.drawable.transparent,
            optionOne = "É uma arma de fogo que pode ser disparada efectuando apenas a operação de accionar o gatilho",
            optionTwo = "É uma arma de fogo que é disparada mediante duas operações constituídas pelo armar manual de mecanismo de disparo e pelo acionar o gatilho",
            optionThree = "É uma arma accionada por ar ou outro gás comprimido destinada a lançar projécteis ",
            correctAnswer = 2
        )
        questionsList.add(q205)

        val q206 = Question(
            id = 205,
            question = "Indique a resposta certa sobre o cano de uma arma de fogo",
            image = R.drawable.transparent,
            optionOne = "É a parte de uma arma constituída por um tubo destinada a guiar o projéctil no momento do disparo ",
            optionTwo = "É a superfície interior do cano não dotada de qualquer dispositivo destinado a imprimir movimento de rotação ao projéctil",
            optionThree = "É a superficie interior do cano entre a câmara e a boca",
            correctAnswer = 1
        )
        questionsList.add(q206)

        val q207 = Question(
            id = 206,
            question = "Como é que se designa um cartucho",
            image = R.drawable.transparent,
            optionOne = "É um recipiente metálico, plástico ou de vários materiais, que se destina a conter o fulminante, a carga propulsora, a bucha e a carga de múltiplos projecteis ou o projéctil único, para a utilização em armas de fogo com a alma lisa",
            optionTwo = "É um recipiente metálico, plástico ou de vários materiais, que se destina a conter o fulminante, a carga propulsora, a bucha e a carga de múltiplos projecteis ou o projéctil único, para a utilização em armas de fogo com a alma lisa ou estriada",
            optionThree = "É um recipiente metálico, plástico ou de vários materiais, que se destina a conter o fulminante, a carga propulsora, a bucha e a carga de múltiplos projecteis ou o projéctil único, para a utilização em armas de fogo com cano estriado",
            correctAnswer = 1
        )
        questionsList.add(q207)

        val q208 = Question(
            id = 207,
            question = "A obtenção de licença de uso de porte de arma classe D, pode ser autorizado a:",
            image = R.drawable.transparent,
            optionOne = "Só a titulares que tenham idade mínima de 18 anos",
            optionTwo = "Só a titulares que tenham idade mínima de 20 anos",
            optionThree = "Só a titulares que tenham idade mínima de 16 anos",
            correctAnswer = 3
        )
        questionsList.add(q208)

        val q209 = Question(
            id = 208,
            question = "Os titulares de licenças da classe C e D podem adquirir munições. Qual a afirmação correta ",
            image = R.drawable.transparent,
            optionOne = "Só podem adquirir munições ou de classe C ou de classe D",
            optionTwo = "Podem adquirir munições para classe C e classe D, ilimitadas",
            optionThree = "Podem adquirir de classe D até 5000 munições e classe C até 1000 munições ",
            correctAnswer = 3
        )
        questionsList.add(q209)

        val q210 = Question(
            id = 209,
            question = "Os cursos de formação para o uso e porte de arma são ministrados:",
            image = R.drawable.transparent,
            optionOne = "São ministrados pela PSP e GNR",
            optionTwo = "São ministrados pela PSP",
            optionThree = "São ministrados pela GNR e ICNF",
            correctAnswer = 2
        )
        questionsList.add(q210)

        val q211 = Question(
            id = 210,
            question = "Indique os documentos que devem ser exigidos na compra de munições das classes C e D",
            image = R.drawable.transparent,
            optionOne = "Carta de caçador e registo criminal",
            optionTwo = "Registo criminal e atestado médico",
            optionThree = "Documento de identificação, livrete da arma e licença de uso e porte de arma",
            correctAnswer = 3
        )
        questionsList.add(q211)

        val q212 = Question(
            id = 211,
            question = "Como se designa uma arma semi-automática",
            image = R.drawable.transparent,
            optionOne = "Arma de fogo com dispositivo fixo ou com carregador amovível que após cada disparo, é recarregado pela ação do caçador sobre um mecanismo que transporta e introduz na câmara nova munição, retirada do dispositivo ou carregador",
            optionTwo = "Arma de fogo de dispositivo fixo ou com carregador amovível que após cada disparo, se carrega automaticamente e não pode mediante uma única ação sobre o gatilho, fazer mais que um disparo",
            optionThree = "Arma de fogo sem dispositivo ou carregador, de um ou mais canos, que é carregado mediante a introdução manual de uma munição em cada câmara ou câmaras ou em compartimento situado a entrada destas",
            correctAnswer = 2
        )
        questionsList.add(q212)

        val q213 = Question(
            id = 212,
            question = "O seguro de responsabilidade civil de uso e porte de armas é obrigatório",
            image = R.drawable.transparent,
            optionOne = "É obrigatório um seguro por cada arma que possui de classe C e D",
            optionTwo = "O seguro é obrigatório e deve abranger todas as armas",
            optionThree = "O seguro só é obrigatório para a classe C",
            correctAnswer = 2
        )
        questionsList.add(q213)

        val q214 = Question(
            id = 213,
            question = "O que é a caixa da culatra",
            image = R.drawable.transparent,
            optionOne = "É um bloco de aço forjado onde se articulam os canos e onde está contido o mecanismo de fecho e disparo",
            optionTwo = "É um bloco de aço forjado onde está contido o mecanismo de fecho ",
            optionThree = "É a parte da arma onde está contida e se movimenta a culatra",
            correctAnswer = 3
        )
        questionsList.add(q214)

        val q215 = Question(
            id = 214,
            question = "Sempre que pega numa arma o que deve fazer ",
            image = R.drawable.transparent,
            optionOne = "Pôr a arma em segurança",
            optionTwo = "Virar os canos para um local seguro, abrir a arma e verificar se está carregada ",
            optionThree = "A arma continua fechada e canos virados para o chão",
            correctAnswer = 2
        )
        questionsList.add(q215)

        val q216 = Question(
            id = 215,
            question = "Quando é que devemos ter a arma descarregada e aberta ",
            image = R.drawable.transparent,
            optionOne = "Quando andamos à caça",
            optionTwo = "Até ao momento que o cão nos mostre a peça de caça",
            optionThree = "Quando atravessamos um ribeiro",
            correctAnswer = 3
        )
        questionsList.add(q216)

        val q217 = Question(
            id = 216,
            question = "Durante uma sessão de tiro, como deve ser a ordem do responsável?",
            image = R.drawable.transparent,
            optionOne = "Municiar, carregar, fogo",
            optionTwo = "Carregar, fogo",
            optionThree = "Municiar, introduzir carregador, carregar, em posição e fogo",
            correctAnswer = 3
        )
        questionsList.add(q217)

        val q218 = Question(
            id = 217,
            question = "Depois de retirar a arma do estojo, como deve actuar?",
            image = R.drawable.transparent,
            optionOne = "Deve ser colocada de modo a que seja impossível tombar ou escorregar, verificar se os canos estão obstruídos e mantê-la em segurança",
            optionTwo = "Manter a arma sempre aberta e descarregada, verificar se os canos estão obstruídos, não misturar cartuchos de chumbo e de bala, verificar se a arma está montada correctamente e colocar a arma de forma a que não tombe",
            optionThree = "Manter a arma sempre em segurança, não misturar cartuchos de chumbo e de bala, verificar se os canos estão obstruídos e colocar a arma encostada a uma árvore",
            correctAnswer = 2
        )
        questionsList.add(q218)

        val q219 = Question(
            id = 218,
            question = "Ao utilizar a arma para actos venatórios ou outros o que deve fazer antes",
            image = R.drawable.transparent,
            optionOne = "Retirar a massa de proteção, na parte de fora do cano",
            optionTwo = "Retirar a massa de proteção e o excesso de óleo no interior do cano",
            optionThree = "Retirar o excesso de óleo, porque escorrega ",
            correctAnswer = 2
        )
        questionsList.add(q219)

        val q220 = Question(
            id = 219,
            question = "Relativamente ao tiro qual a frase correcta",
            image = R.drawable.transparent,
            optionOne = "Não é perigoso fazer um tiro rasante a uma cumeada na caça maior",
            optionTwo = "Não é perigoso atirar em direção a uma pessoa fora do alcance",
            optionThree = "Após os disparos dos tiros e antes de carregar de novo, verificar se os canos estão obstruídos",
            correctAnswer = 3
        )
        questionsList.add(q220)

        val q221 = Question(
            id = 220,
            question = "Em que altura devemos ter sempre a arma aberta e descarregada ",
            image = R.drawable.transparent,
            optionOne = "Sempre que atravessamos um caminho",
            optionTwo = "Na caça sempre que se aproxima alguém ",
            optionThree = "Sempre que andamos à caça",
            correctAnswer = 2
        )
        questionsList.add(q221)

        val q222 = Question(
            id = 221,
            question = "Nas munições indique a resposta correcta",
            image = R.drawable.transparent,
            optionOne = "As munições de carabina o peso da bala é maior quando comparado com a munição de espingarda caçadeira de bala",
            optionTwo = "As munições de carabina o peso da bala é mais leve quando comparado com a munição de espingarda caçadeira de bala",
            optionThree = "As munições de carabina o peso da bala é igual ao da munição de espingarda caçadeira de bala",
            correctAnswer = 2
        )
        questionsList.add(q222)

        val q223 = Question(
            id = 222,
            question = "Qual destes alcances, permite abater uma peça de caça ",
            image = R.drawable.transparent,
            optionOne = "Alcance acidental",
            optionTwo = "Alcance normal",
            optionThree = "Alcance útil",
            correctAnswer = 3
        )
        questionsList.add(q223)

        val q224 = Question(
            id = 223,
            question = "Nas carreiras e campos de tiro, quando se recolhem os invólucros",
            image = R.drawable.transparent,
            optionOne = "No final do tiro, após as armas serem colocadas em segurança",
            optionTwo = "No final de cada sessão, após as armas serem colocadas em segurança",
            optionThree = "Não é obrigatório a recolha dos invólucros",
            correctAnswer = 2
        )
        questionsList.add(q224)

        val q225 = Question(
            id = 224,
            question = "Quais as partes que constituem uma espingarda de canos sobrepostos? ",
            image = R.drawable.transparent,
            optionOne = "Cano, báscula ou culatra móvel e coronha",
            optionTwo = "Bascula, culatra e fuste",
            optionThree = "Canos, caixa de mecanismos, coronha e fuste ",
            correctAnswer = 3
        )
        questionsList.add(q225)

        val q226 = Question(
            id = 225,
            question = "Para que serve, numa arma, a coronha",
            image = R.drawable.transparent,
            optionOne = "Para fazer pontaria",
            optionTwo = "Para apoiar a arma no ombro",
            optionThree = "Para disparar a arma",
            correctAnswer = 2
        )
        questionsList.add(q226)

        val q227 = Question(
            id = 226,
            question = "Diga o que entende por arma de repetição semi-automática:",
            image = R.drawable.transparent,
            optionOne = "É a arma que, depois de carregado o primeiro cartucho manualmente na câmara, os outros são recarregados automaticamente por ação do tiro, sendo necessário puxar o gatilho entre cada tiro ",
            optionTwo = "É a arma que, uma vez carregado o deposito, dispara todos os cartuchos de forma automática ",
            optionThree = "É aquela em que temos que accionar um dispositivo, para municiar a câmara entre cada tiro",
            correctAnswer = 1
        )
        questionsList.add(q227)

        val q228 = Question(
            id = 227,
            question = "As armas de monogatilho selectivo podem:",
            image = R.drawable.transparent,
            optionOne = "Disparar primeiro com o gatilho de traz",
            optionTwo = "Disparar primeiro o cano seleccionado pelo caçador",
            optionThree = "Disparar os dois gatilhos em simultâneo",
            correctAnswer = 2
        )
        questionsList.add(q228)

        val q229 = Question(
            id = 228,
            question = "Quais as gravações obrigatórias que os canos devem ter?",
            image = R.drawable.transparent,
            optionOne = "Número da arma, calibre, comprimento das câmaras, diâmetro das almas, pressão de prova e marcas ou punções do banco de provas de origem",
            optionTwo = "Número da arma, calibre, comprimento dos canos, choques e nome do fabricante",
            optionThree = "Nenhuma gravação é de carácter obrigatório",
            correctAnswer = 1
        )
        questionsList.add(q229)

        val q230 = Question(
            id = 229,
            question = "O cano é composto por quatro zonas. Quais são?",
            image = R.drawable.transparent,
            optionOne = "Câmara, ponto de mira, boca e alma",
            optionTwo = "Alma, câmara, fuste, e choque",
            optionThree = "Câmara, alma, estrangulamento ou choque e boca",
            correctAnswer = 3
        )
        questionsList.add(q230)

        val q231 = Question(
            id = 230,
            question = "O que é a câmara de explosão de uma espingarda ",
            image = R.drawable.transparent,
            optionOne = "A câmara é o depósito de cartuchos de uma semiautomática",
            optionTwo = "A câmara é a superfície interior do cano",
            optionThree = "A câmara é o local onde se introduz e percute o cartucho",
            correctAnswer = 3
        )
        questionsList.add(q231)

        val q232 = Question(
            id = 231,
            question = "Qual das frases define correctamente o choque numa espingarda:",
            image = R.drawable.transparent,
            optionOne = "O choque ou estrangulamento é a redução do diâmetro da alma junto à boca do cano ",
            optionTwo = "O choque ou estrangulamento é a redução do diâmetro da câmara",
            optionThree = "O choque é o embate no ombro sentido pelo caçador quando dispara a arma",
            correctAnswer = 1
        )
        questionsList.add(q232)

        val q233 = Question(
            id = 232,
            question = "Qual o comprimento mais vulgar das câmaras de uma espingarda? ",
            image = R.drawable.transparent,
            optionOne = "60mm e 65mm",
            optionTwo = "76mm",
            optionThree = "65mm e 70mm",
            correctAnswer = 3
        )
        questionsList.add(q233)

        val q234 = Question(
            id = 233,
            question = "Numa arma de calibre 12 qual a que dispara cartuchos com mais potencia?",
            image = R.drawable.transparent,
            optionOne = "Aquela que tiver a câmara mais curta",
            optionTwo = "Aquela que tiver a câmara mais comprida",
            optionThree = "Aquela cujo cano for magnum",
            correctAnswer = 2
        )
        questionsList.add(q234)

        val q235 = Question(
            id = 234,
            question = "Um indivíduo cujo olho diretor seja o esquerdo, devera apontar:",
            image = R.drawable.transparent,
            optionOne = "Com a esquerda ",
            optionTwo = "Com a direita ",
            optionThree = "Tanto faz ",
            correctAnswer = 1
        )
        questionsList.add(q235)

        val q236 = Question(
            id = 235,
            question = "Qual a função do choque numa espingarda: ",
            image = R.drawable.transparent,
            optionOne = "Alargar a chumbada de forma rápida",
            optionTwo = "Juntar a chumbada afim de aumentar ligeiramente o alcance útil e reduzir o espaço entre projecteis ",
            optionThree = "Tornar a chumbada mais comprida no terreno",
            correctAnswer = 2
        )
        questionsList.add(q236)

        val q237 = Question(
            id = 236,
            question = "Numa arma com dois gatilhos, qual o que dispara o cano esquerdo",
            image = R.drawable.transparent,
            optionOne = "O gatilho de traz",
            optionTwo = "O gatilho da frente",
            optionThree = "Qualquer um deles",
            correctAnswer = 1
        )
        questionsList.add(q237)

        val q238 = Question(
            id = 237,
            question = "Qual a função das alavancas de armar?",
            image = R.drawable.transparent,
            optionOne = "Servem para armar os extractores",
            optionTwo = "Servem para fechar a arma",
            optionThree = "Servem para armar os cães ou martelos",
            correctAnswer = 3
        )
        questionsList.add(q238)

        val q239 = Question(
            id = 238,
            question = "Qual a função do guarda mato? ",
            image = R.drawable.transparent,
            optionOne = "Tornar a arma mais atraente",
            optionTwo = "Contribuir para a segurança do gatilho, protegendo-o ",
            optionThree = "Indicar mais facilmente onde se encontra o gatilho",
            correctAnswer = 2
        )
        questionsList.add(q239)

        val q240 = Question(
            id = 239,
            question = "Quais as peças que fazem parte do mecanismo de disparo",
            image = R.drawable.transparent,
            optionOne = "Cauda do gatilho, patilha do gatilho, armador, cão, mola real e percutor",
            optionTwo = "Cauda do gatilho, patilha do gatilho, armador, cão e travão",
            optionThree = "Cauda do gatilho, patilha do gatilho, armador, cão, travão e guarda mato",
            correctAnswer = 1
        )
        questionsList.add(q240)

        val q241 = Question(
            id = 240,
            question = "Quais os principais elementos de adaptação da coronha ao atirador?",
            image = R.drawable.transparent,
            optionOne = "Comprimento e queda",
            optionTwo = "Comprimento, queda, desvio lateral e almofada",
            optionThree = "Queda, largura e cast-off",
            correctAnswer = 2
        )
        questionsList.add(q241)

        val q242 = Question(
            id = 241,
            question = "Uma coronha com muita queda designa-se por",
            image = R.drawable.transparent,
            optionOne = "Coronha caída ",
            optionTwo = "Coronha direita ",
            optionThree = "Coronha inglesa",
            correctAnswer = 1
        )
        questionsList.add(q242)

        val q243 = Question(
            id = 242,
            question = "Por munição de arma de fogo, entende-se:",
            image = R.drawable.transparent,
            optionOne = "A parte da munição que se destina a ser lançada através do cano",
            optionTwo = "O cartucho ou invólucro ou outro dispositivo contendo todos os componentes em condições de ser imediatamente disparado numa arma de fogo",
            optionThree = "O cartucho ou invólucro contendo todos os componentes em condições de não ser imediatamente disparado numa arma de fogo",
            correctAnswer = 2
        )
        questionsList.add(q243)

        val q244 = Question(
            id = 243,
            question = "Os projécteis com diâmetro superior a 4,5mm, que fazem parte de um conjunto de múltiplos projécteis para serem disparados em armas de fogo com cano de alma lisa, denominam-se:",
            image = R.drawable.transparent,
            optionOne = "Chumbos de caça",
            optionTwo = "Zagalotes",
            optionThree = "Cartuchos de caça",
            correctAnswer = 2
        )
        questionsList.add(q244)

        val q245 = Question(
            id = 244,
            question = "Uma arma de fogo longa semiautomática, de repetição ou de tiro a tiro, com dois ou mais canos integra- se na classe C, desde que:",
            image = R.drawable.transparent,
            optionOne = "Todos os canos sejam de alma estriada",
            optionTwo = "Que pelo menos um deles seja de alma estriada",
            optionThree = "Todos os canos sejam de alma lisa",
            correctAnswer = 2
        )
        questionsList.add(q245)

        val q246 = Question(
            id = 245,
            question = "A aquisição, detenção, o uso e porte de armas da classe C podem ser autorizados a quem seja titular de:",
            image = R.drawable.transparent,
            optionOne = "Licença de uso e porte de arma da classe C e aos titulares da carta de condução",
            optionTwo = "Licença de uso e porte de arma da classe C e aos deputados a assembleia da república",
            optionThree = "Licença de uso e porte de armas da classe C, ou a quem a respectiva lei orgânica ou estatuto profissional preveja a dispensa ou atribuição da licença de uso e porte de arma",
            correctAnswer = 3
        )
        questionsList.add(q246)

        val q247 = Question(
            id = 246,
            question = "A verificação das condições de segurança no domicílio do requerente, pode levar a que a autorização de aquisição, tenha em consideração a existência de:",
            image = R.drawable.transparent,
            optionOne = "Idosos",
            optionTwo = "Crianças",
            optionThree = "Menores",
            correctAnswer = 3
        )
        questionsList.add(q247)

        val q248 = Question(
            id = 247,
            question = "Sempre que seja autorizada pelo director nacional da PSP, que a arma fique averbada em nome do cabeça-de-casal até às partilhas dos bens e herança, diga o que é obrigatório:",
            image = R.drawable.transparent,
            optionOne = "O seu depósito num armário de segurança não portátil",
            optionTwo = "O depósito da arma à guarda da PSP",
            optionThree = "O depósito da arma na força policial da área de residência",
            correctAnswer = 2
        )
        questionsList.add(q248)

        val q249 = Question(
            id = 248,
            question = "Para efeitos de fiscalização sobre exame de pesquisa de álcool, ou para a realização dos exames de despistagem de substâncias estupefacientes ou outras, pode utilizar-se os aparelhos e outros meios homologados ao abrigo do código da estrada e legislação complementar:",
            image = R.drawable.transparent,
            optionOne = "As vezes",
            optionTwo = "Sim, sempre que necessários",
            optionThree = "Nunca",
            correctAnswer = 2
        )
        questionsList.add(q249)

        val q250 = Question(
            id = 249,
            question = "O condenado que deixar de entregar a arma ou as armas, no prazo de 15 dias contados a partir de trânsito em julgado, para cumprimento da pena acessória de interdição temporária, incorre em: ",
            image = R.drawable.transparent,
            optionOne = "Pena de multa",
            optionTwo = "Crime de desobediência",
            optionThree = "Crime de desobediência qualificada",
            correctAnswer = 3
        )
        questionsList.add(q250)

        val q251 = Question(
            id = 250,
            question = "O proprietário das armas, deve tomar todas as precauções necessárias para prevenir: ",
            image = R.drawable.transparent,
            optionOne = "O seu extravio",
            optionTwo = "Ocorrência de acidentes e o furto ou roubo",
            optionThree = "As respostas a) e b) estão correctas",
            correctAnswer = 3
        )
        questionsList.add(q251)

        val q252 = Question(
            id = 251,
            question = "Uma espingarda de canos justapostos considera-se fechada quando:",
            image = R.drawable.transparent,
            optionOne = "Unir os canos ao fuste",
            optionTwo = "A coronha e o fuste estiverem unidos",
            optionThree = "Após a união das câmaras à báscula",
            correctAnswer = 3
        )
        questionsList.add(q252)

        val q253 = Question(
            id = 252,
            question = "Quando estiver perto de pessoas como deve ter as armas de classe C e D?",
            image = R.drawable.transparent,
            optionOne = "Mantê-las sempre abertas e sem munições",
            optionTwo = "Mantê-las dirigidas para o ar",
            optionThree = "Manter o dedo ao longo do guarda-mato",
            correctAnswer = 1
        )
        questionsList.add(q253)

        val q254 = Question(
            id = 253,
            question = "Ao colocar o cadeado de gatilho, se este não ficar bem colocado o que pode acontecer?",
            image = R.drawable.transparent,
            optionOne = "Abrir-se e saltar fora deixando o gatilho desprotegido",
            optionTwo = "O seu eixo accionar o gatilho, quando pressionado por um obstáculo",
            optionThree = "Ficar travado pelos linguetes",
            correctAnswer = 2
        )
        questionsList.add(q254)

        val q255 = Question(
            id = 254,
            question = "Se uma arma tiver massa de proteção ou excesso de óleo no interior do cano, no momento do disparo, o que pode acontecer:",
            image = R.drawable.transparent,
            optionOne = "Facilitar o deslizar da munição no seu interior",
            optionTwo = "Causar o aumento das pressões e ocasionar o rebentamento dos canos",
            optionThree = "A manutenção dos canos em perfeitas condições",
            correctAnswer = 2
        )
        questionsList.add(q255)

        val q256 = Question(
            id = 255,
            question = "Nos postos de tiro quando for dada a ordem para municiar as armas empunhadas, estas devem ficar sempre:",
            image = R.drawable.transparent,
            optionOne = "Apontadas para o chão",
            optionTwo = "Apontadas para o ar",
            optionThree = "Apontadas na direção dos alvos a atingir",
            correctAnswer = 3
        )
        questionsList.add(q256)

        val q257 = Question(
            id = 256,
            question = "Em acto venatório quando deve carregar a arma? ",
            image = R.drawable.transparent,
            optionOne = "Após montar a arma",
            optionTwo = "Quando verificar que os alvos se aproximam",
            optionThree = "Quando estiver afastado dos companheiros",
            correctAnswer = 3
        )
        questionsList.add(q257)

        val q258 = Question(
            id = 257,
            question = "Numa arma carregada deve sempre desconfiar do seu mecanismo de segurança, porque:",
            image = R.drawable.transparent,
            optionOne = "Uma pancada, uma queda ou um defeito mecânico podem não impedir o disparo",
            optionTwo = "Uma pancada, uma queda, pode impedir o disparo da arma",
            optionThree = "Este pode actuar sobre o aparelho de pontaria através de um defeito mecânico",
            correctAnswer = 1
        )
        questionsList.add(q258)

        val q259 = Question(
            id = 258,
            question = "Quando se encontrar em acto venatório ao aperceber-se que alguém se aproxima da sua posição o que deve fazer?",
            image = R.drawable.transparent,
            optionOne = "Fechar a arma e carregá-la",
            optionTwo = "Abrir e descarregar a arma",
            optionThree = "Abrir e carregar a arma",
            correctAnswer = 2
        )
        questionsList.add(q259)

        val q260 = Question(
            id = 259,
            question = "Indique as partes essenciais de uma arma de fogo semi-automática?",
            image = R.drawable.transparent,
            optionOne = "Culatra, estojo de limpeza, coronha com caixa de mecanismos de disparar e ejector e porta cartuchos",
            optionTwo = "Culatra, coronha com caixa dos mecanismos de disparar e ejector e porta cartuchos, cano, estojo de limpeza",
            optionThree = "Culatra, coronha com caixa dos mecanismos de disparar e ejector e porta cartuchos, cano, fuste ou guarda mão, tampa do carregador",
            correctAnswer = 3
        )
        questionsList.add(q260)

        val q261 = Question(
            id = 260,
            question = "\"Armas de fogo longa \" são todas as armas de fogo: ",
            image = R.drawable.transparent,
            optionOne = "Cujo cano mede mais de 1 metro",
            optionTwo = "Cujo comprimento total da arma excede 1 metro",
            optionThree = "Com exclusão das armas de fogo curtas",
            correctAnswer = 3
        )
        questionsList.add(q261)

        val q262 = Question(
            id = 261,
            question = "Como se define \"mecanismo de disparo\"?",
            image = R.drawable.transparent,
            optionOne = "É o sistema mecânico ou outro que, quando accionado através do gatilho, provoca o disparo",
            optionTwo = "É o sistema mecânico ou outro que se destina a bloquear a culatra móvel",
            optionThree = "É o sistema mecânico que acciona o carregador para introduzir a munição na câmara",
            correctAnswer = 1
        )
        questionsList.add(q262)

        val q263 = Question(
            id = 262,
            question = "\"Alma estriada\" de uma arma de fogo, é:",
            image = R.drawable.transparent,
            optionOne = "A superfície interior do cano com sulcos helicoidais ou outra configuração em espiral, que permite conferir rotação ao projéctil, dotando-o de estabilidade giroscópica",
            optionTwo = "A superfície interior do cano com sulcos circulares ou outra configuração, que permite conferir rotação ao projéctil",
            optionThree = "A superfície interior do cano não dotada de qualquer dispositivo destinado a imprimir movimento de rotação ao projéctil",
            correctAnswer = 1
        )
        questionsList.add(q263)

        val q264 = Question(
            id = 263,
            question = "O que se designa por culatra aberta?",
            image = R.drawable.transparent,
            optionOne = "A posição em que a culatra ou a corrediça de uma arma se encontra na sua posição mais avançada, ou de forma a obturar a câmara",
            optionTwo = "A posição em que a culatra ou a corrediça de uma arma se encontra na sua posição avançada, sem obturar a câmara",
            optionThree = "A posição em que a culatra ou a corrediça de uma arma se encontra retida na sua posição mais recuada, ou de forma que a câmara não esteja obturada",
            correctAnswer = 3
        )
        questionsList.add(q264)

        val q265 = Question(
            id = 264,
            question = "As armas de fogo longas semiautomáticas, de repetição ou de tiro a tiro, de cano de alma estriada, pertencem a que classe?",
            image = R.drawable.transparent,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            correctAnswer = 3
        )
        questionsList.add(q265)

        val q266 = Question(
            id = 265,
            question = "As armas de ar comprimido de calibre superior a 5,5 mm, pertencem a que classe?",
            image = R.drawable.transparent,
            optionOne = "A",
            optionTwo = "C",
            optionThree = "G",
            correctAnswer = 2
        )
        questionsList.add(q266)

        val q267 = Question(
            id = 266,
            question = "A quem é permitida a recarga de munições, não podendo ultrapassar as cargas propulsoras indicadas pelos fabricantes:",
            image = R.drawable.transparent,
            optionOne = "Aos titulares de licença C",
            optionTwo = "Aos titulares de licença D",
            optionThree = "Aos titulares de licença C e D",
            correctAnswer = 3
        )
        questionsList.add(q267)

        val q268 = Question(
            id = 267,
            question = "A pedido do cabeça-de-casal, pode a arma ser transmitida a quem reunir condições para a sua detenção. Assim, diga como é escolhido o adquirente para a arma:",
            image = R.drawable.transparent,
            optionOne = "Através da escolha do requerente, ou da venda em leilão pela PSP",
            optionTwo = "Através da escolha do interessado, após efectuar o pagamento dos emolumentos",
            optionThree = "Através da escolha do interessado, antes de efectuar o pagamento dos emolumentos",
            correctAnswer = 1
        )
        questionsList.add(q268)

        val q269 = Question(
            id = 268,
            question = "Quem for condenado pela prática de crime previsto na lei 17/2009, ou pela prática, a titulo doloso ou negligente, de crime em cuja preparação ou execução tenha sido relevante a utilização ou disponibilidade sobre a arma, pode incorrer na seguinte pena acessória:",
            image = R.drawable.transparent,
            optionOne = "Interdição temporária de detenção, uso e porte de arma ou armas",
            optionTwo = "Interdição temporária de compra de munições",
            optionThree = "Interdição temporária de detenção no domicilio",
            correctAnswer = 1
        )
        questionsList.add(q269)

        val q270 = Question(
            id = 269,
            question = "Pode-se disparar armas unicamente em:",
            image = R.drawable.transparent,
            optionOne = "Carreiras de tiro ou campos de tiro ou no exercício de actos venatórios, em campos de treino de caça",
            optionTwo = "Provas desportivas ou práticas recreativas em propriedades rústicas privadas com condições de segurança para o efeito",
            optionThree = "Ambas estao correctas",
            correctAnswer = 3
        )
        questionsList.add(q270)

        val q271 = Question(
            id = 270,
            question = "Sempre que o portador se separe fisicamente da arma de fogo no domicilio, deve:",
            image = R.drawable.transparent,
            optionOne = "Colocá-la na dispensa junto dos produtos de limpeza",
            optionTwo = "Colocá-la no interior de um cofre ou armário de segurança portáteis, sempre que exigidos e com cadeado",
            optionThree = "Colocá-la no interior de um cofre ou armário de segurança não portáteis, sempre que exigidos, ou com cadeado ou outro mecanismo que impossibilite o uso da mesma",
            correctAnswer = 3
        )
        questionsList.add(q271)

        val q272 = Question(
            id = 271,
            question = "O que deve fazer antes de carregar a arma?",
            image = R.drawable.transparent,
            optionOne = "Verificar se a arma está carregada",
            optionTwo = "Ver se o mecanismo de disparar funciona",
            optionThree = "Verificar se o cano ou canos estão desobstruídos",
            correctAnswer = 3
        )
        questionsList.add(q272)

        val q273 = Question(
            id = 272,
            question = "Quando manusear armas nunca deve? ",
            image = R.drawable.transparent,
            optionOne = "Ingerir bebidas alcoólicas",
            optionTwo = "Transportá-las",
            optionThree = "Desmontá-las",
            correctAnswer = 1
        )
        questionsList.add(q273)

        val q274 = Question(
            id = 273,
            question = "Na residência como devem ser acondicionadas as munições?",
            image = R.drawable.transparent,
            optionOne = "Em local diferente das armas e fechadas a chave",
            optionTwo = "Em local diferente das armas mas de fácil acesso",
            optionThree = "No mesmo local das armas mas fechadas a chave",
            correctAnswer = 1
        )
        questionsList.add(q274)

        val q275 = Question(
            id = 274,
            question = "Nos veículos automóveis como devem ser transportadas as armas:",
            image = R.drawable.transparent,
            optionOne = "Separadas das respectivas munições, com mecanismo de segurança accionado",
            optionTwo = "Sem munições na câmara, com cadeado de gatilho e mecanismo que impossibilite o uso indevido e em bolsa ou estojo próprio",
            optionThree = "As respostas a) e b) estado correctas",
            correctAnswer = 3
        )
        questionsList.add(q275)

        val q276 = Question(
            id = 275,
            question = "Nos campos de tiro os atiradores devem circular:",
            image = R.drawable.transparent,
            optionOne = "Com as armas descarregadas",
            optionTwo = "Carregadores e depósitos vazios e carregadores fora do alojamento",
            optionThree = "As respostas a) e b) estão corretas",
            correctAnswer = 3
        )
        questionsList.add(q276)

        val q277 = Question(
            id = 276,
            question = "Quando é que se efectuam manobras de segurança numa arma:",
            image = R.drawable.transparent,
            optionOne = "Não exista a certeza relativa ao municionamento da arma",
            optionTwo = "Se proceda à entrega e recepção da arma, se proceda à limpeza da arma e se inicie ou termine uma sessão de tiro",
            optionThree = "As respostas a) e b) estado correctas",
            correctAnswer = 3
        )
        questionsList.add(q277)

        val q278 = Question(
            id = 277,
            question = "Quando por cada disparo é necessário a ação do atirador sobre a culatra, e as armas possuem carregador ou depósito, estas efectuam tiro de:",
            image = R.drawable.transparent,
            optionOne = "Repetição",
            optionTwo = "Simples",
            optionThree = "Tiro a tiro",
            correctAnswer = 1
        )
        questionsList.add(q278)


        return questionsList
    }

}