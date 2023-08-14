/**
 * 
 */
function confirmar(id){
	let resposta = confirm("Confirmar a exclusão ?")
	if (resposta === true){
		//alert(id)
		window.location.href = "delete?id=" + id
	}
}

function confirmarB(idBebidas){
	let resposta = confirm("Confirmar a exclusão ?")
	if (resposta === true){
		//alert(id)
		window.location.href = "deleteBebidas?idBebidas=" + idBebidas
	}
}

