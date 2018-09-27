<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link href="bootstrap-tour-0.12.0/build/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap-tour-0.12.0/build/css/bootstrap-tour.min.css" rel="stylesheet">
    <meta charset="utf-8">
    <link href="./bootstrap-tour-0.12.0/build/css/bootstrap.min.css" rel="stylesheet">
    <link href="./bootstrap-tour-0.12.0/build/css/bootstrap-tour.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <link rel="stylesheet" href="style-aluno.css">
    <link rel="stylesheet" href="style.css">
    <link rel="icon" href="Imagens/logo_icon.png">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Projeto Pegasus - Professor</title>
</head>

<body>
    <header id="headerDiv">
        <button type="button" class="btn btn-secondary btn-sm" id="infos"><a href="login.html" id="logout">Logout</a></button>

        <div class="logo">
            <img src="Imagens/logoBackless.png" alt="Logo" id="logo-pegasus">
        </div>
    </header>
    <br>
    <div class="professor">
        <img src="Imagens/Avatar.png" alt="professor" id="picAluno">
    </div>

    <h3 id="profbv">Bem Vindo, Aluno.</h3>

    <div class="ellie">
        <a href="ellie.jsp"><img src="Imagens/Ellie.png" alt="ellie" id="tutorial"></a>
    </div>

    </header>

    <ul class="nav nav-tabs">
        <li><a data-toggle="tab" href="#materias">Matérias</a></li>
        <li><a data-toggle="tab" href="#avisos">Avisos</a></li>
        <li><a data-toggle="tab" href="#boletim">Boletim</a></li>
        <li><a data-toggle="tab" href="#configuracoes">Configurações</a></li>
    </ul>

    <div class="tab-content">
        <div id="materias" class="tab-pane fade">
            <article>
                <table>
                    <br>
                    <tbody>
                        <tr>
                            <th><img src="Imagens/phone_icon.png" alt="phoneIcon" id="mobile"></th>
                            <th><img src="Imagens/web_icon.png" alt="webIcon" id="web"></th>
                            <th><img src="Imagens/project_icon.png" alt="projectIcon" id="projeto"></th>
                        </tr>
                        <tr>
                            <td id="dm">Densevolvimento Mobile</td>
                            <td id="wd">Web Development</td>
                            <td id="gp">Design de Software</td>
                        </tr>
                    </tbody>
                </table>
            </article>
        </div>
        <div id="avisos" class="tab-pane fade">
            <br>
            <article id="articleWarning">
                <table class="tableWarning">
                    <tr>
                        <div class="aviso">
                            <th><img src="Imagens/profa.png" alt="profIcon" class="prof-icon"></th>
                            <th id="aviso"> Nota de CT disponível no Boletim </th>
                            <div class="data">23/08/2018</div>
                    </tr>
                    <tr>
                        <td id="nm"> Josy R. </td>
                    </tr>
                </table>
                <br>
                <table class="tableWarning">
                    <tr>

                        <div class="aviso">
                            <th><img src="Imagens/prof.png" alt="profIcon" class="prof-icon"></th>
                            <th id="aviso"> Convite BLUEHACKS: Inteligência Artificial </th>
                            <div class="data">25/09/2018</div>
                        </div>
                    </tr>
                    <tr>
                        <td id="nm">Matheus N.</td>
                    </tr>
                </table>
                <br>
                <table class="tableWarning">
                    <tr>

                        <div class="aviso">
                            <th><img src="Imagens/dire.png" alt="profIcon" class="prof-icon"></th>
                            <th id="aviso"> Apresentação Projeto AM - 1TDSG </th>
                            <div class="data">27/09/2018</div>
                    </tr>
                    <tr>
                        <td id="nm">Wagner S.</td>
                    </tr>
                </table>
            </article>
        </div>
        <div id="boletim" class="tab-pane fade">
            <div class="boletim">
                <img src="Imagens/boletim.png" alt="boletim">
            </div>
        </div>
            <div id="configuracoes" class="tab-pane fade">
                <form>
                    <br>
                    <article>
                        <div class="personalData">
                            <p id="personalDetails">Dados Pessoais</p>
                            <table>
                                <tr>
                                    <td>
                                        <input type="text" name="E-mail" class="updatePersonalInfo" placeholder="E-mail"
                                            required />
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <input type="text" name="Telefone" class="updatePersonalInfo" placeholder="Telefone"
                                            required />
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div>
                            <table>
                                <tr>
                                    <div id="changePass">
                                        <p id="idNascimento">Trocar senha </p>
                                        <input name="NewPass" class="updatePersonalInfo" placeholder="Senha Atual" />
                                        <br>
                                        <input name="NewPass" class="updatePersonalInfo" placeholder="Nova Senha" />
                                        <br>
                                        <input name="NewPass" class="updatePersonalInfo" placeholder="Repita a Senha" />
                                    </div>
                                    <br>
                                    <button id="sendPersonalInfo" type="submit">Enviar</button>
                                </tr>
                            </table>
                        </div>
                </form>
                </article>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/promise-polyfill"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="jquery.min.js"></script>
        <script src="bootstrap-tour-0.12.0/build/js/bootstrap.min.js"></script>
        <script src="bootstrap-tour-0.12.0/build/js/bootstrap-tour.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
            crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
        <script src="tutorial.js"></script>
</body>

</html>html>