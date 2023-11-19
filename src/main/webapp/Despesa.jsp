<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Despesa</title>
<link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css'
	rel='stylesheet'>
<link rel="stylesheet" href="./css/despesa.css">
</head>
<body>
	<main>
		<form action="Despesa" method="post">
			<div class="resume">
				<div>
					Entradas: R$ <span class="incomes">0.00</span>
				</div>
				<div>
					Saídas: R$ <span class="expenses">0.00</span>
				</div>
				<div>
					Total: R$ <span class="total">0.00</span>
				</div>
			</div>
			<div class="newItem">
				<div class="divDesc">
					<label for="desc">Descrição</label> <input type="text" id="desc"
						name="descricao" />
				</div>
				<div class="divAmount">
					<label for="amount">Valor</label> <input type="number" id="amount"
						name="valor" />
				</div>
				<div class="divType">
					<label for="type">Tipo</label> <select id="type" name="tipo">
						<option value="entrada">Entrada</option>
						<option value="saida">Saída</option>
					</select>
				</div>
				<div id="btnNew">
					<input type="submit" value="Incluir">
				</div>
			</div>

		</form>
		<div class="divTable">
			<table>
				<thead>
					<tr>
						<th>Descrição</th>
						<th class="columnAmount">Valor</th>
						<th class="columnType">Tipo</th>
						<th class="columnAction"></th>
					</tr>

				</thead>
				<tbody>
					<c:forEach var="despesa" items="${despesas}">
						<tr>
							<td>${despesa.id}</td>
							<td>${despesa.valor}</td>
							<td>${despesa.tipo}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
	</main>

	<script src="script.js"></script>
</body>
</html>

