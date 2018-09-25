//var sendInfo = document.getElementById("sendPersonalInfo");
//sendInfo.addEventListener("onclick",
//  swal({
//    title: 'Você tem certeza?',
//    text: "Suas informações na instituição irão mudar!",
//    type: 'warning',
//    showCancelButton: true,
//    confirmButtonColor: '#3085d6',
//    cancelButtonColor: '#d33',
//    confirmButtonText: 'Sim'
//  }).then((result) => {
//    if (result.value) {
//      swal(
//        'Pronto!',
//        'Suas informações foram enviadas com sucesso!',
//        'success'
//      )
//    }
//  }));

$(document).ready(function () {
  document.querySelector('#sendPersonalInfo').onclick = function () {
    swal({
      title: "Tem certeza que quer enviar?",
      type: "warning",
      showCancelButton: false,
      confirmButtonClass: 'btn-danger',
      confirmButtonText: 'Sim',
      cancelButtonText: "Não, cancelar.",
      closeOnConfirm: false,
      closeOnCancel: true
    }).then(() => {
      if (result.value) {
        swal(
          'Pronto!',
          'Suas informações foram enviadas com sucesso!',
          'success'
        )
      }
    });
  };

});

$(document).ready(function () {
  $(".nav-tabs a").click(function () {
    $(this).tab('show');
  });
});

$('#tutorial').on('click', function (e) {
  var tour = new Tour({

    steps: [{
        element: "#tutorial",
        title: "Portal ______",
        content: "Bem vindo ao Portal ______",
        placement: "center",
        backdrop: true,
        orphan: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px id=\"ellie-imagens\">" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#ellie",
        content: "Olá eu sou a Ellie, você pode me chamar sempre que tiver uma dúvida.",
        placement: "left",
        backdrop: true,
        orphan: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px id=\"ellie-imagens\">" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#tutorial",
        title: "Ajuda",
        content: "Este é o menu de ajuda, clique aqui sempre tiver uma dúvida sobre a navegação do site",
        placement: "left",
        backdrop: true,
        orphan: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px>" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#materias",
        title: "Matérias",
        content: "Este é o menu de materias, aqui é a parte onde você consegue ver, editar e adicionar conteudo para as displinas que você leciona.",
        placement: "top",
        backdrop: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px>" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"prev\">Anterior</button>" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#avisos",
        title: "Avisos",
        content: "Esta é a aba de avisos da instituição, professor e eventos. ",
        placement: "top",
        backdrop: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px>" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"prev\">Anterior</button>" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#ellie-conteudo",
        title: "Ellie",
        content: "Esta é a minha aba =D . Nessa parte você coloca os conteudos que vou repassar aos alunos para ajudar-los com dúvidas. Aqui também será possível visualizar as perguntas realizadas por cada aluno e as mais realizadas por turma.",
        placement: "top",
        backdrop: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px>" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"prev\">Anterior</button>" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      },
      {
        element: "#configuracao",
        title: "Configuração",
        content: "Esta é a aba de configuração, onde você pode editar seu perfil e dados pessoais.",
        placement: "top",
        backdrop: true,
        template: "<div class=\"popover popover-with-columns tour\">" +
          "<div class=\"arrow\"></div>" +
          "<h3 class=\"popover-title\"></h3>" +
          "<img src=\"Imagens/Ellie.png\" width=50px>" +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          "<div class=\"popover-content column\"></div>" +
          "<div class=\"popover-navigation\">" +
          "<button class=\"btn btn-default\" data-role=\"prev\">Anterior</button>" +
          "<button class=\"btn btn-default\" data-role=\"next\">Próximo</button>" +
          "<button class=\"btn btn-default\" data-role=\"end\">Encerrar</button>" +
          "</div>" +
          "</div>"
      }

    ],

  });

  // tour.restart();
  //console.log(tour.restart)

  // Initialize the tour
  tour.init();

  // Start the tour
  tour.start();
});