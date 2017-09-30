function validar(){
	
	msg="";
	
	user=document.forms[0].username.value;
	pass=document.forms[0].password.value;
	
	resultado=document.getElementById("error");
	
	if(user.length==0){
		msg="Es obligatorio el usuario <br/>";
	}
	if(pass.length==0){
		msg+="Es obligatorio la clave";
	}

	if(msg.length>0){
		
		resultado.innerHTML=msg;
		return false;
	}
}