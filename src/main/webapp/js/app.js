function createRequest() {
	var result = new XMLHttpRequest();
	return result;
}


function imc_rest() {
	var req = createRequest();
	var url2 = "webapi/calc/add" + "/"
			+ document.getElementById('peso').value + "/"
			+ document.getElementById('altura').value + "/"
			+ document.getElementById('sexo').value;
	req.open("GET", url2, false);
	req.send();

	document.getElementById('addresult').innerHTML = req.responseText;
	

}



