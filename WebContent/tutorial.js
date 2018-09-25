$(document).on("click", ".panel-heading span.icon_minim", function(e) {
  var $this = $(this);
  if (!$this.hasClass("panel-collapsed")) {
    $this
      .parents(".panel")
      .find(".panel-body")
      .slideUp();
    $this.addClass("panel-collapsed");
    $this.removeClass("glyphicon-minus").addClass("glyphicon-plus");
  } else {
    $this
      .parents(".panel")
      .find(".panel-body")
      .slideDown();
    $this.removeClass("panel-collapsed");
    $this.removeClass("glyphicon-plus").addClass("glyphicon-minus");
  }
});
$(document).on("focus", ".panel-footer input.chat_input", function(e) {
  var $this = $(this);
  if ($("#minim_chat_window").hasClass("panel-collapsed")) {
    $this
      .parents(".panel")
      .find(".panel-body")
      .slideDown();
    $("#minim_chat_window").removeClass("panel-collapsed");
    $("#minim_chat_window")
      .removeClass("glyphicon-plus")
      .addClass("glyphicon-minus");
  }
});
$(document).on("click", "#new_chat", function(e) {
  var size = $(".chat-window:last-child").css("margin-left");
  size_total = parseInt(size) + 400;
  alert(size_total);
  var clone = $("#chat_window_1")
    .clone()
    .appendTo(".container");
  clone.css("margin-left", size_total);
});
$(document).on("click", ".icon_close", function(e) {
  //$(this).parent().parent().parent().parent().remove();
  $("#chat_window_1").remove();
});

$(document).ready(function() {
  document.querySelector("#sendPersonalInfo").onclick = function() {
    swal({
      title: "Tem certeza que quer enviar?",
      type: "warning",
      showCancelButton: false,
      confirmButtonClass: "btn-danger",
      confirmButtonText: "Sim",
      cancelButtonText: "Não, cancelar.",
      closeOnConfirm: false,
      closeOnCancel: true
    }).then(() => {
      if (result.value) {
        swal(
          "Pronto!",
          "Suas informações foram enviadas com sucesso!",
          "success"
        );
      }
    });
  };
});

$(document).ready(function() {
  $(".nav-tabs a").click(function() {
    $(this).tab("show");
  });
});

$("#tutorial").on("click", function(e) {
  var tour = new Tour({
    steps: [
      {
        title: "Portal ______",
        content: "Bem vindo ao Portal ______",
        placement: "left",
        backdrop: true,
        orphan: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px id="ellie-imagens">' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#ellie",
        content:
          "Olá eu sou a Ellie, você pode me chamar sempre que tiver uma dúvida.",
        placement: "left",
        backdrop: true,
        orphan: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px id="ellie-imagens">' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#tutorial",
        title: "Ajuda",
        content:
          "Este é o menu de ajuda, clique aqui sempre tiver uma dúvida sobre a navegação do site",
        placement: "left",
        backdrop: true,
        orphan: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px>' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#materias",
        title: "Matérias",
        content:
          "Este é o menu de materias, aqui é a parte onde você consegue ver, editar e adicionar conteudo para as displinas que você leciona.",
        placement: "top",
        backdrop: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px>' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="prev">Anterior</button>' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#avisos",
        title: "Avisos",
        content: "Esta é a aba de avisos da instituição, professor e eventos. ",
        placement: "top",
        backdrop: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px>' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="prev">Anterior</button>' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#ellie-conteudo",
        title: "Ellie",
        content:
          "Esta é a minha aba =D . Nessa parte você coloca os conteudos que vou repassar aos alunos para ajudar-los com dúvidas. Aqui também será possível visualizar as perguntas realizadas por cada aluno e as mais realizadas por turma.",
        placement: "top",
        backdrop: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px>' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="prev">Anterior</button>' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      },
      {
        element: "#configuracao",
        title: "Configuração",
        content:
          "Esta é a aba de configuração, onde você pode editar seu perfil e dados pessoais.",
        placement: "top",
        backdrop: true,
        template:
          '<div class="popover popover-with-columns tour">' +
          '<div class="arrow"></div>' +
          '<h3 class="popover-title"></h3>' +
          '<img src="imagens/Ellie.png" width=50px>' +
          //"<img class=\"column\" src=\"" + window.baseUrl + "Areas/AppDesafio/Content/imgs/pose5.png\">" +
          '<div class="popover-content column"></div>' +
          '<div class="popover-navigation">' +
          '<button class="btn btn-default" data-role="prev">Anterior</button>' +
          '<button class="btn btn-default" data-role="next">Próximo</button>' +
          '<button class="btn btn-default" data-role="end">Encerrar</button>' +
          "</div>" +
          "</div>"
      }
    ]
  });

  tour.restart();

  // Initialize the tour
  tour.init();

  // Start the tour
  tour.start();
});
