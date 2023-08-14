/**
 * 
 */
function calcularValorTotal(){
	let quantidade = frmProduto.quantidade.value
	let valorUni = frmProduto.valorUni.value
	
	let valorTotal = quantidade * valorUni
	
	frmProduto.valorTotal.value = valorTotal
}

function calcularValorTotalB(){
	let quantidade = frmBebidas.quantidadeBebidas.value
	let valorUni = frmBebidas.valorUniBebidas.value
	
	let valorTotal = quantidade * valorUni
	
	frmBebidas.valorTotalBebidas.value = valorTotal
}