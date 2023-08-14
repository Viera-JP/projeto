/**
 * 
 */

function validar(){
	let nome = frmProduto.nome.value
	let quantidade = frmProduto.quantidade.value
	let valorUni = frmProduto.valorUni.value
	let valorTotal = frmProduto.valorTotal.value
	if(nome === ""){
		alert('Informe o nome do produto')
		frmProduto.nome.focus()
		return false
	}else if (quantidade === ""){
		alert('Informe a Quantidade do produto')
		frmProduto.quantidade.focus()
		return false
	}else if (valorUni === ""){
		alert('Informe o valor da unidade')
		frmProduto.valorUni.focus()
		return false
	}else if (valorTotal === ""){
		alert('Informe o valor total')
		frmProduto.valorTotal.focus()
		return false
	}else{
		document.forms["frmProduto"].submit()
	}
}

function validarBebidas(){
	let nomeBebidas = frmBebidas.nomeBebidas.value
	let tamanho = frmBebidas.tamanho.value
	let quantidadeBebidas = frmBebidas.quantidadeBebidas.value
	let valorUniBebidas = frmBebidas.valorUniBebidas.value
	let valorTotalBebidas = frmBebidas.valorTotalBebidas.value
	if(nomeBebidas === ""){
		alert('Informe o nome da bebida')
		frmBebidas.nomeBebidas.focus()
		return false
	}else if (tamanho === ""){
		alert('Informe o tamanho da bebida')
		frmBebidas.tamanho.focus()
		return false
	}else if (quantidadeBebidas === ""){
		alert('Informe a Quantidade da bebida')
		frmBebidas.quantidadeBebidas.focus()
		return false
	}else if (valorUniBebidas === ""){
		alert('Informe o valor da unidade')
		frmBebidas.valorUniBebidas.focus()
		return false
	}else if (valorTotalBebidas === ""){
		alert('Informe o valor total')
		frmBebidas.valorTotalBebidas.focus()
		return false
	}else{
		document.forms["frmBebidas"].submit()
	}
}