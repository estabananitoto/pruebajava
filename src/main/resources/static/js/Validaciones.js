 function valida(e){

                tecla = (document.all) ? e.keyCode : e.which;
                //Tecla de retroceso para borrar, siempre la permite
                if (tecla==8){
                  return true;
                }
                  
                // Patron de entrada, en este caso solo acepta numeros
                patron =/[0-9]/;
                tecla_final = String.fromCharCode(tecla);
                return patron.test(tecla_final);
            }
 
 function LETRAS(e){

                tecla = (document.all) ? e.keyCode : e.which;
                //Tecla de retroceso para borrar, siempre la permite
                if (tecla==8){
                  return true;
                }
                  
                // Patron de entrada, en este caso solo acepta numeros
                patron =/[a-z-A-Z. ]/;
                tecla_final = String.fromCharCode(tecla);
                return patron.test(tecla_final);
            }
            
            function ValidarCampos(){

	if($("#Num_docVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL NUMERO DE DOCUMENTO.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#NombreVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL NOMBRE.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#ApellidoVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL APELLIDO.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#CiudadVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE LA CIUDAD.','','warning');/*sucesss*/
	  return 0;
	}
	if($("#MailVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL MAIL.','','warning');/*sucesss*/
	  return 0;
	}else{
	var emailField = document.getElementById('MailVal');
	
	// Define our regular expression.
	var validEmail =  /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

	// Using test we can check if the text match the pattern
	if(!validEmail.test(emailField.value)){
		
		    Swal.fire('POR FAVOR DIGITE UN MAIL CORRECTO.','','warning');
		     return false;
	}
	}
	if($("#TelVal").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL TELEFONO.','','warning');/*sucesss*/
	  return 0;
	}
	 
	$("#GuardarOri").trigger('click');
}
/*-----------------------------------------------------------------------------------------------------------*/

  function ValidarCampos1(){

	if($("#Num_docVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL NUMERO DE DOCUMENTO.','','warning');
	  return 0;
	}
	if($("#NombreVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL NOMBRE.','','warning');
	  return 0;
	}
	if($("#ApellidoVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL APELLIDO.','','warning');
	  return 0;
	}
	if($("#CiudadVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE LA CIUDAD.','','warning');
	  return 0;
	}
	if($("#MailVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL MAIL.','','warning');
	  return 0;
	}else{
	var emailField = document.getElementById('MailVal1');
	
	// Define our regular expression.
	var validEmail =  /^\w+([.-_+]?\w+)*@\w+([.-]?\w+)*(\.\w{2,10})+$/;

	// Using test we can check if the text match the pattern
	if(!validEmail.test(emailField.value)){
		
		    Swal.fire('POR FAVOR DIGITE UN MAIL CORRECTO.','','warning');
		     return false;
	}
	}
	if($("#TelVal1").val() == ''){
	  Swal.fire('POR FAVOR DIGITE EL TELEFONO.','','warning');
	  return 0;
	}
	 
	$("#GuardarOri1").trigger('click');
} 

/*-----------------------------------------------------------------------------------------------------------*/
 $('document').ready(function() {
	 
	 $('.table #update').on('click', function(event){
		 
		 event.preventDefault();
		  
		var href= $(this).attr('href');
		 
		 $.get(href, function(client, status){
			 
			 $('#Num_docVal1').val(client.num_doc);
			 $('#NombreVal1').val(client.nom);
			 $('#ApellidoVal1').val(client.ape);
			 $('#fechaVal1').val(client.Fecha);
			 $('#CiudadVal1').val(client.ciu);
			 $('#MailVal1').val(client.mail);
			 $('#TelVal1').val(client.tel);
			 $('#ocuVal1').val(client.ocu);
			 $('#estVal1').val(client.est);
		 });
		 
		 $('#editModal').modal();
		 
	 });
	  });
	  
	  $('document').ready(function() { 
	 $('.table #updateButton').on('click', function(event){
		 
		 event.preventDefault();
		  
		 var href = $(this).attr('href');
		 	
		 $('#updateEstModal #delRef').attr('href', href);
		  $('#updateEstModal').modal();
	 });
	    });
/*--------------------------------------------------------------------------------*/


/*var words = ['boat', 'bear', 'dog', 'drink', 'elephant', 'fruit'];

$(document).ready(function(){
	$('#CiudadVal').autocomplete({
		hints: words
	});
});*/

/*
$(document).on('click', '#CiudadVal', function () {
    var words = ['boat', 'bear', 'dog', 'drink', 'elephant', 'fruit'];
   
    $('#CiudadVal').autocomplete({
		hints: words
	});
  
}); */






