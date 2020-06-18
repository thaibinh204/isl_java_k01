/**
 * 
 */


function plus(a, b){
	return a+b;
}

function nhan(){
	return a*b;
}


function onMouseLeaveDemo(){
	alert("Your onmouse leave me!");
}

function loadSelectBox(id, arr){
	var val = "";
	for(var i = 0; i < arr.length; i ++){
		val = arr[i];
		var addedOption = document.createElement("option");
        addedOption.text = val;
        addedOption.value = val.toLowerCase();
		document.getElementById(id).appendChild(addedOption);
	}
}