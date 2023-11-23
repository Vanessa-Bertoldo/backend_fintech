    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
<link rel="stylesheet" href="/webapp/WEB-INF/css/footer.css">


<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Transacao</title>
<link rel="stylesheet" href="resources/css/navbar.css">

<meta charset="UTF-8">
<title>Transacao</title>
</head>
<body class="bg-light">

    <div class="container">
      <div class="py-5 text-center">
      </div>


        <div class="col-md-8 order-md-1">
          <h4 class="mb-3">Dados de envio</h4>
          <form class="needs-validation" novalidate="" action="Transacao" method="post">
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="firstName">Nome</label>
                <input type="text" class="form-control" id="firstName" placeholder="" name="nome" required="">
                <div class="invalid-feedback">
                  Valid first name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="lastName">Sobrenome</label>
                <input type="text" class="form-control" id="lastName" placeholder="" name="sobrenome" required="">
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
            </div>

            <div class="mb-3">
              <label for="username">Username</label>
              <div class="input-group">
                <div class="input-group-prepend">
                  <span class="input-group-text">@</span>
                </div>
                <input type="text" class="form-control" id="username" placeholder="Username" name="username" required="">
                <div class="invalid-feedback" style="width: 100%;">
                  Your username is required.
                </div>
              </div>
            </div>

            <div class="mb-3">
              <label for="email">Email <span class="text-muted">(Opcional)</span></label>
              <input type="email" class="form-control" id="email" placeholder="you@example.com" name="email">
              <div class="invalid-feedback">
                Please enter a valid email address for shipping updates.
              </div>
            </div>

            <div class="mb-3">
              <label for="address">Endereco</label>
              <input type="text" class="form-control" id="address" placeholder="1234 Main St" required="" name="endereco">
              <div class="invalid-feedback">
                Please enter your shipping address.
              </div>
            </div>

            <div class="row">
              <div class="col-md-5 mb-3">
                <label for="country">Country</label>
                <select class="custom-select d-block w-100" id="country" required="" name="pais">
                  <option value="">Choose...</option>
                  <option value="Brasil" selected="selected">Brasil</option>
                  <option value="Afeganist�o">Afeganist�o</option>
                  <option value="�frica do Sul">�frica do Sul</option>
                  <option value="Alb�nia">Alb�nia</option>
                  <option value="Alemanha">Alemanha</option>
                  <option value="Andorra">Andorra</option>
                  <option value="Angola">Angola</option>
                  <option value="Anguilla">Anguilla</option>
                  <option value="Antilhas Holandesas">Antilhas Holandesas</option>
                  <option value="Ant�rctida">Ant�rctida</option>
                  <option value="Ant�gua e Barbuda">Ant�gua e Barbuda</option>
                  <option value="Argentina">Argentina</option>
                  <option value="Arg�lia">Arg�lia</option>
                  <option value="Arm�nia">Arm�nia</option>
                  <option value="Aruba">Aruba</option>
                  <option value="Ar�bia Saudita">Ar�bia Saudita</option>
                  <option value="Austr�lia">Austr�lia</option>
                  <option value="�ustria">�ustria</option>
                  <option value="Azerbaij�o">Azerbaij�o</option>
                  <option value="Bahamas">Bahamas</option>
                  <option value="Bahrein">Bahrein</option>
                  <option value="Bangladesh">Bangladesh</option>
                  <option value="Barbados">Barbados</option>
                  <option value="Belize">Belize</option>
                  <option value="Benim">Benim</option>
                  <option value="Bermudas">Bermudas</option>
                  <option value="Bielorr�ssia">Bielorr�ssia</option>
                  <option value="Bol�via">Bol�via</option>
                  <option value="Botswana">Botswana</option>
                  <option value="Brunei">Brunei</option>
                  <option value="Bulg�ria">Bulg�ria</option>
                  <option value="Burkina Faso">Burkina Faso</option>
                  <option value="Burundi">Burundi</option>
                  <option value="But�o">But�o</option>
                  <option value="B�lgica">B�lgica</option>
                  <option value="B�snia e Herzegovina">B�snia e Herzegovina</option>
                  <option value="Cabo Verde">Cabo Verde</option>
                  <option value="Camar�es">Camar�es</option>
                  <option value="Camboja">Camboja</option>
                  <option value="Canad�">Canad�</option>
                  <option value="Catar">Catar</option>
                  <option value="Cazaquist�o">Cazaquist�o</option>
                  <option value="Chade">Chade</option>
                  <option value="Chile">Chile</option>
                  <option value="China">China</option>
                  <option value="Chipre">Chipre</option>
                  <option value="Col�mbia">Col�mbia</option>
                  <option value="Comores">Comores</option>
                  <option value="Coreia do Norte">Coreia do Norte</option>
                  <option value="Coreia do Sul">Coreia do Sul</option>
                  <option value="Costa do Marfim">Costa do Marfim</option>
                  <option value="Costa Rica">Costa Rica</option>
                  <option value="Cro�cia">Cro�cia</option>
                  <option value="Cuba">Cuba</option>
                  <option value="Dinamarca">Dinamarca</option>
                  <option value="Djibouti">Djibouti</option>
                  <option value="Dominica">Dominica</option>
                  <option value="Egito">Egito</option>
                  <option value="El Salvador">El Salvador</option>
                  <option value="Emirados �rabes Unidos">Emirados �rabes Unidos</option>
                  <option value="Equador">Equador</option>
                  <option value="Eritreia">Eritreia</option>
                  <option value="Esc�cia">Esc�cia</option>
                  <option value="Eslov�quia">Eslov�quia</option>
                  <option value="Eslov�nia">Eslov�nia</option>
                  <option value="Espanha">Espanha</option>
                  <option value="Estados Federados da Micron�sia">Estados Federados da Micron�sia</option>
                  <option value="Estados Unidos">Estados Unidos</option>
                  <option value="Est�nia">Est�nia</option>
                  <option value="Eti�pia">Eti�pia</option>
                  <option value="Fiji">Fiji</option>
                  <option value="Filipinas">Filipinas</option>
                  <option value="Finl�ndia">Finl�ndia</option>
                  <option value="Fran�a">Fran�a</option>
                  <option value="Gab�o">Gab�o</option>
                  <option value="Gana">Gana</option>
                  <option value="Ge�rgia">Ge�rgia</option>
                  <option value="Gibraltar">Gibraltar</option>
                  <option value="Granada">Granada</option>
                  <option value="Gronel�ndia">Gronel�ndia</option>
                  <option value="Gr�cia">Gr�cia</option>
                  <option value="Guadalupe">Guadalupe</option>
                  <option value="Guam">Guam</option>
                  <option value="Guatemala">Guatemala</option>
                  <option value="Guernesei">Guernesei</option>
                  <option value="Guiana">Guiana</option>
                  <option value="Guiana Francesa">Guiana Francesa</option>
                  <option value="Guin�">Guin�</option>
                  <option value="Guin� Equatorial">Guin� Equatorial</option>
                  <option value="Guin�-Bissau">Guin�-Bissau</option>
                  <option value="G�mbia">G�mbia</option>
                  <option value="Haiti">Haiti</option>
                  <option value="Honduras">Honduras</option>
                  <option value="Hong Kong">Hong Kong</option>
                  <option value="Hungria">Hungria</option>
                  <option value="Ilha Bouvet">Ilha Bouvet</option>
                  <option value="Ilha de Man">Ilha de Man</option>
                  <option value="Ilha do Natal">Ilha do Natal</option>
                  <option value="Ilha Heard e Ilhas McDonald">Ilha Heard e Ilhas McDonald</option>
                  <option value="Ilha Norfolk">Ilha Norfolk</option>
                  <option value="Ilhas Cayman">Ilhas Cayman</option>
                  <option value="Ilhas Cocos (Keeling)">Ilhas Cocos (Keeling)</option>
                  <option value="Ilhas Cook">Ilhas Cook</option>
                  <option value="Ilhas Fero�">Ilhas Fero�</option>
                  <option value="Ilhas Ge�rgia do Sul e Sandwich do Sul">Ilhas Ge�rgia do Sul e Sandwich do Sul</option>
                  <option value="Ilhas Malvinas">Ilhas Malvinas</option>
                  <option value="Ilhas Marshall">Ilhas Marshall</option>
                  <option value="Ilhas Menores Distantes dos Estados Unidos">Ilhas Menores Distantes dos Estados Unidos</option>
                  <option value="Ilhas Salom�o">Ilhas Salom�o</option>
                  <option value="Ilhas Virgens Americanas">Ilhas Virgens Americanas</option>
                  <option value="Ilhas Virgens Brit�nicas">Ilhas Virgens Brit�nicas</option>
                  <option value="Ilhas �land">Ilhas �land</option>
                  <option value="Indon�sia">Indon�sia</option>
                  <option value="Inglaterra">Inglaterra</option>
                  <option value="�ndia">�ndia</option>
                  <option value="Iraque">Iraque</option>
                  <option value="Irlanda do Norte">Irlanda do Norte</option>
                  <option value="Irlanda">Irlanda</option>
                  <option value="Ir�">Ir�</option>
                  <option value="Isl�ndia">Isl�ndia</option>
                  <option value="Israel">Israel</option>
                  <option value="It�lia">It�lia</option>
                  <option value="I�men">I�men</option>
                  <option value="Jamaica">Jamaica</option>
                  <option value="Jap�o">Jap�o</option>
                  <option value="Jersey">Jersey</option>
                  <option value="Jord�nia">Jord�nia</option>
                  <option value="Kiribati">Kiribati</option>
                  <option value="Kuwait">Kuwait</option>
                  <option value="Laos">Laos</option>
                  <option value="Lesoto">Lesoto</option>
                  <option value="Let�nia">Let�nia</option>
                  <option value="Lib�ria">Lib�ria</option>
                  <option value="Liechtenstein">Liechtenstein</option>
                  <option value="Litu�nia">Litu�nia</option>
                  <option value="Luxemburgo">Luxemburgo</option>
                  <option value="L�bano">L�bano</option>
                  <option value="L�bia">L�bia</option>
                  <option value="Macau">Macau</option>
                  <option value="Maced�nia">Maced�nia</option>
                  <option value="Madag�scar">Madag�scar</option>
                  <option value="Malawi">Malawi</option>
                  <option value="Maldivas">Maldivas</option>
                  <option value="Mali">Mali</option>
                  <option value="Malta">Malta</option>
                  <option value="Mal�sia">Mal�sia</option>
                  <option value="Marianas Setentrionais">Marianas Setentrionais</option>
                  <option value="Marrocos">Marrocos</option>
                  <option value="Martinica">Martinica</option>
                  <option value="Maurit�nia">Maurit�nia</option>
                  <option value="Maur�cia">Maur�cia</option>
                  <option value="Mayotte">Mayotte</option>
                  <option value="Mold�via">Mold�via</option>
                  <option value="Mong�lia">Mong�lia</option>
                  <option value="Montenegro">Montenegro</option>
                  <option value="Montserrat">Montserrat</option>
                  <option value="Mo�ambique">Mo�ambique</option>
                  <option value="Myanmar">Myanmar</option>
                  <option value="M�xico">M�xico</option>
                  <option value="M�naco">M�naco</option>
                  <option value="Nam�bia">Nam�bia</option>
                  <option value="Nauru">Nauru</option>
                  <option value="Nepal">Nepal</option>
                  <option value="Nicar�gua">Nicar�gua</option>
                  <option value="Nig�ria">Nig�ria</option>
                  <option value="Niue">Niue</option>
                  <option value="Noruega">Noruega</option>
                  <option value="Nova Caled�nia">Nova Caled�nia</option>
                  <option value="Nova Zel�ndia">Nova Zel�ndia</option>
                  <option value="N�ger">N�ger</option>
                  <option value="Om�">Om�</option>
                  <option value="Palau">Palau</option>
                  <option value="Palestina">Palestina</option>
                  <option value="Panam�">Panam�</option>
                  <option value="Papua-Nova Guin�">Papua-Nova Guin�</option>
                  <option value="Paquist�o">Paquist�o</option>
                  <option value="Paraguai">Paraguai</option>
                  <option value="Pa�s de Gales">Pa�s de Gales</option>
                  <option value="Pa�ses Baixos">Pa�ses Baixos</option>
                  <option value="Peru">Peru</option>
                  <option value="Pitcairn">Pitcairn</option>
                  <option value="Polin�sia Francesa">Polin�sia Francesa</option>
                  <option value="Pol�nia">Pol�nia</option>
                  <option value="Porto Rico">Porto Rico</option>
                  <option value="Portugal">Portugal</option>
                  <option value="Quirguist�o">Quirguist�o</option>
                  <option value="Qu�nia">Qu�nia</option>
                  <option value="Reino Unido">Reino Unido</option>
                  <option value="Rep�blica Centro-Africana">Rep�blica Centro-Africana</option>
                  <option value="Rep�blica Checa">Rep�blica Checa</option>
                  <option value="Rep�blica Democr�tica do Congo">Rep�blica Democr�tica do Congo</option>
                  <option value="Rep�blica do Congo">Rep�blica do Congo</option>
                  <option value="Rep�blica Dominicana">Rep�blica Dominicana</option>
                  <option value="Reuni�o">Reuni�o</option>
                  <option value="Rom�nia">Rom�nia</option>
                  <option value="Ruanda">Ruanda</option>
                  <option value="R�ssia">R�ssia</option>
                  <option value="Saara Ocidental">Saara Ocidental</option>
                  <option value="Saint Martin">Saint Martin</option>
                  <option value="Saint-Barth�lemy">Saint-Barth�lemy</option>
                  <option value="Saint-Pierre e Miquelon">Saint-Pierre e Miquelon</option>
                  <option value="Samoa Americana">Samoa Americana</option>
                  <option value="Samoa">Samoa</option>
                  <option value="Santa Helena, Ascens�o e Trist�o da Cunha">Santa Helena, Ascens�o e Trist�o da Cunha</option>
                  <option value="Santa L�cia">Santa L�cia</option>
                  <option value="Senegal">Senegal</option>
                  <option value="Serra Leoa">Serra Leoa</option>
                  <option value="Seychelles">Seychelles</option>
                  <option value="Singapura">Singapura</option>
                  <option value="Som�lia">Som�lia</option>
                  <option value="Sri Lanka">Sri Lanka</option>
                  <option value="Suazil�ndia">Suazil�ndia</option>
                  <option value="Sud�o">Sud�o</option>
                  <option value="Suriname">Suriname</option>
                  <option value="Su�cia">Su�cia</option>
                  <option value="Su��a">Su��a</option>
                  <option value="Svalbard e Jan Mayen">Svalbard e Jan Mayen</option>
                  <option value="S�o Crist�v�o e Nevis">S�o Crist�v�o e Nevis</option>
                  <option value="S�o Marino">S�o Marino</option>
                  <option value="S�o Tom� e Pr�ncipe">S�o Tom� e Pr�ncipe</option>
                  <option value="S�o Vicente e Granadinas">S�o Vicente e Granadinas</option>
                  <option value="S�rvia">S�rvia</option>
                  <option value="S�ria">S�ria</option>
                  <option value="Tadjiquist�o">Tadjiquist�o</option>
                  <option value="Tail�ndia">Tail�ndia</option>
                  <option value="Taiwan">Taiwan</option>
                  <option value="Tanz�nia">Tanz�nia</option>
                  <option value="Terras Austrais e Ant�rticas Francesas">Terras Austrais e Ant�rticas Francesas</option>
                  <option value="Territ�rio Brit�nico do Oceano �ndico">Territ�rio Brit�nico do Oceano �ndico</option>
                  <option value="Timor-Leste">Timor-Leste</option>
                  <option value="Togo">Togo</option>
                  <option value="Tonga">Tonga</option>
                  <option value="Toquelau">Toquelau</option>
                  <option value="Trinidad e Tobago">Trinidad e Tobago</option>
                  <option value="Tun�sia">Tun�sia</option>
                  <option value="Turcas e Caicos">Turcas e Caicos</option>
                  <option value="Turquemenist�o">Turquemenist�o</option>
                  <option value="Turquia">Turquia</option>
                  <option value="Tuvalu">Tuvalu</option>
                  <option value="Ucr�nia">Ucr�nia</option>
                  <option value="Uganda">Uganda</option>
                  <option value="Uruguai">Uruguai</option>
                  <option value="Uzbequist�o">Uzbequist�o</option>
                  <option value="Vanuatu">Vanuatu</option>
                  <option value="Vaticano">Vaticano</option>
                  <option value="Venezuela">Venezuela</option>
                  <option value="Vietname">Vietname</option>
                  <option value="Wallis e Futuna">Wallis e Futuna</option>
                  <option value="Zimbabwe">Zimbabwe</option>
                  <option value="Z�mbia">Z�mbia</option>
                </select>
                <div class="invalid-feedback">
                  Please select a valid country.
                </div>
              </div>

              <div class="col-md-3 mb-3">
                <label for="zip">Zip</label>
                <input type="text" class="form-control" id="zip" placeholder="" required="" name="cep">
                <div class="invalid-feedback">
                  Zip code required.
                </div>
              </div>
            </div>
            <hr class="mb-4">
            <div class="custom-control custom-checkbox">
              <input type="checkbox" class="custom-control-input" id="save-info">
              <label class="custom-control-label" for="save-info">Salvar informacoes para futuras transacoes</label>
            </div>
            <hr class="mb-4">

            <h4 class="mb-3">Metodo de Pagamento</h4>

            <div class="d-block my-3">
              <div class="custom-control custom-radio">
                <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked="" required="">
                <label class="custom-control-label" for="credit">Credito</label>
              </div>
              <div class="custom-control custom-radio">
                <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required="">
                <label class="custom-control-label" for="debit">Debito</label>
              </div>
            </div>
            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="cc-name">Nome no cartao</label>
                <input type="text" class="form-control" id="cc-name" placeholder="" name="nomeCartao" required="">
                <small class="text-muted">Nome inteiro no verso do cartao</small>
                <div class="invalid-feedback">
                  Name on card is required
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="cc-number">Numero do cartao</label>
                <input type="text" class="form-control" id="cc-number" placeholder="" name="cartao" required="">
                <div class="invalid-feedback">
                  Credit card number is required
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-md-3 mb-3">
                <label for="cc-expiration">Expiracao</label>
                <input type="text" class="form-control" id="cc-expiration" placeholder="" name="cartaoExpiracao" required="">
                <div class="invalid-feedback">
                  Expiration date required
                </div>
              </div>
              <div class="col-md-3 mb-3">
                <label for="cc-expiration">CVV</label>
                <input type="text" class="form-control" id="cc-cvv" placeholder="" name="cartaoCodigo" required="">
                <div class="invalid-feedback">
                  Security code required
                </div>
              </div>
            </div>
            <hr class="mb-4">
            <button class="btn btn-primary btn-lg btn-block" type="submit">Transferir/Pagar</button>
          </form>
        </div>
      </div>

      <div class="container my-5">
        <!-- Footer -->
        <footer
                class="text-center text-lg-start text-white"
                style="background-color: #929fba"
                >
          <!-- Grid container -->
          <div class="container p-4 pb-0">
            <!-- Section: Links -->
            <section class="">
              <!--Grid row-->
              <div class="row">
                <!-- Grid column -->
                <div class="col-md-3 col-lg-3 col-xl-3 mx-auto mt-3">
                  <h6 class="text-uppercase mb-4 font-weight-bold">
                    Fintech
                  </h6>
                  <p>
                    Somos uma empresa fintech com o objeito a lhe auxiliar
                    em seus dados financeiros, controle financeiro, rendas
                    e etcs.
                  </p>
                </div>
                <!-- Grid column -->
      
                <hr class="w-100 clearfix d-md-none" />
      
                <!-- Grid column -->
                <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mt-3">
                  <h6 class="text-uppercase mb-4 font-weight-bold">Info</h6>
                  <p>
                    <a class="text-white" href="admin.jsp">Admin usuario</a>
                  </p>
                  <p>
                    <a class="text-white" href="transacao.jsp">Transacao</a>
                  </p>
                  <p>
                    <a class="text-white" href="investimento.jsp">Investimento</a>
                  </p>
                </div>
                <!-- Grid column -->
      
                <hr class="w-100 clearfix d-md-none" />
      
                <!-- Grid column -->
                <hr class="w-100 clearfix d-md-none" />
      
                <!-- Grid column -->
                <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mt-3">
                  <h6 class="text-uppercase mb-4 font-weight-bold">Contato</h6>
                  <p><i class="fas fa-home mr-3"></i> Sao Paulo, SP 10012, BR</p>
                  <p><i class="fas fa-envelope mr-3"></i> fintech@fintech.com</p>
                  <p><i class="fas fa-phone mr-3"></i> + 55 (11) 00000-000</p>
                  <p><i class="fas fa-print mr-3"></i> + 55 (11) 00000-000</p>
                </div>
                <!-- Grid column -->
      
                <!-- Grid column -->

              <!--Grid row-->
            </section>
            <!-- Section: Links -->
          </div>
          <!-- Grid container -->
      
          <!-- Copyright -->
          <div
               class="text-center p-3"
               style="background-color: rgba(0, 0, 0, 0.2)"
               >
            � 2023 Copyright:
            <a class="text-white" href="https://mdbootstrap.com/"
               >fintech.com</a
              >
          </div>
          <!-- Copyright -->
        </footer>
        <!-- Footer -->
      </div>
      <!-- End of .container -->
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/vendor/holder.min.js"></script>
    <script>
      // Example starter JavaScript for disabling form submissions if there are invalid fields
      (function() {
        'use strict';

        window.addEventListener('load', function() {
          // Fetch all the forms we want to apply custom Bootstrap validation styles to
          var forms = document.getElementsByClassName('needs-validation');

          // Loop over them and prevent submission
          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
    </script>
  

</body>
</html>