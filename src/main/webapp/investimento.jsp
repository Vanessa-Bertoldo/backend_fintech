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
		<form action="Investimento" method="post">
			<div class="resume">
				<div>
					Entradas: R$ <span class="incomes">0.00</span>
				</div>
				<div>
					Sa�das: R$ <span class="expenses">0.00</span>
				</div>
				<div>
					Total: R$ <span class="total">0.00</span>
				</div>
			</div>
			<div class="newItem">
				<div class="divDesc">
					<label for="desc">Descri��o</label> <input type="text" id="desc" />
				</div>
				<div class="divAmount">
					<label for="amount">Valor</label> <input type="number" id="amount" />
				</div>
				<div class="divType">
					<label for="type">Tipo</label> <select id="type">
						<option>Entrada</option>
						<option>Sa�da</option>
					</select>
				</div>
				<button id="btnNew" type="submit">Incluir</button>
			</div>
		</form>
		<div class="divTable">
			<table>
				<thead>
					<tr>
						<th>Descri��o</th>
						<th class="columnAmount">Valor</th>
						<th class="columnType">Tipo</th>
						<th class="columnAction"></th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
	</main>

	<script src="../parts/js/investimentos.js"></script>
</body>
</html>