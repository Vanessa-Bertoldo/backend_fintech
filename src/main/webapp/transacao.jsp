<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css'
	rel='stylesheet'>


<link rel="stylesheet" href="./parts/css/investimentos.css">
</head>
<body>
	<main>
		<form action="Transacao" method="post">
			<div class="resume">
				<div>
					Data Vencimento dd/mm/yyyy <span class="total"></span>
				</div>
				<div>
					Valor: R$ <span class="expenses">0.00</span>
				</div>
				<div>
					Tipo <span class="incomes"></span>
				</div>
			</div>
			<div class="newItem">
				<div class="divDesc">
					<label for="desc">Data Vencimento</label> <input name="dataVencimento" type="date" id="desc" />
				</div>
				<div class="divAmount">
					<label for="amount">Valor</label> <input name="valor" type="number" id="amount" />
				</div>
				<div class="divType">
					<label for="type">Tipo</label> 
					<select id="type" name="tipo">
						<option value="transacaofixa">Fixa</option>
						<option value="transacaovariavel">Variavel</option>
						<option value="transacaodiversa">Diversa</option>
						<option value="pix">Pix</option>
						<option value="pagamento">Pagamento</option>
					</select>
				</div>
				<button id="btnNew" type="submit">Incluir</button>
			</div>
		</form>
		<div class="divTable">
			<table>
				<thead>
					<tr>
						<th class="columnAmount">Id</th>
						<th class="columnAmount">Valor</th>
						<th class="columnType">Tipo</th>
						<th class="columnAction"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="varInvest" items="${transacoes}">
						<tr>
							<td>${varInvest.id}</td>
							<td>${varInvest.valor}</td>
							<td>${varInvest.tipo}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</main>

	<script src="../parts/js/investimentos.js"></script>
</body>
</html>