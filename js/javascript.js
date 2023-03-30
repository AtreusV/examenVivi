

$(document).ready(function(){

    $('#listar').on('click', function(){
        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '<thead><th>Codigo</th><th>Nombre</th><th>Apellido</th><th>Materias</th><th>Notas</th><th>Juicio</th></thead>';

        $.ajax({
            url:"http://localhost:8080/listarEstudiante",
            type: "GET",
            dataType: "JSON",
            success: function(respuesta){
                console.log(respuesta);

                for(i=0; i <= respuesta.length; i++){

                    tabla.innerHTML += '<tr><td>' + respuesta[i].iDcodigo + '</td><td>' 
                        + respuesta[i].nombreEstu + '</td><td>'
                        + respuesta[i].apellidoEstu + '</td><td>' 
                        + respuesta[i].materiasEstu + '</td><td>' 
                        + respuesta[i].notasEstu + '</td><td>'
                        + respuesta[i].juicio + '</td></tr>' 
                }      
            }
        })
    });

    $('#agregar').on('click', function() {
        let datos = {
            codigo: parseInt($('#idUsuario').val()),
            curso: $('#Curso').val(),
            nombre: $('#Nombre').val(),
            apellido: $('#Apellido').val(),
            materias: materias = [$('#Mate1').val(), $('#Mate2').val(), $('#Mate3').val()],
            notas: notas = [parseFloat($('#Nota1').val()), parseFloat($('#Nota2').val()), parseFloat($('#Nota3').val())],
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
    
        $.ajax({
            url: "http://localhost:8080/agregar",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                alert(respuesta);
            }
        });
    });
});






































































/*
$('#eliminar').on('click',function(){
    $.ajax({
        url: "http://localhost:8080/eliminarEstudiante",
        type: "DELETE",
        dataType: "JSON",
        success: function(respuesta){
            console.log(respuesta);
            if(respuesta){
                $('#eliminarUsu').append("Usuario eliminado")
            }else{
                $('#eliminarUsu').append("Usuario no eliminado")
            }
        }
    })
    
});


$('#modificar').on('click',function(){

    let datos = {

        codigo: parseInt($('#id').val()),
        notas: [parseFloat($('#N1').val()), parseFloat($('#N2').val()),  parseFloat($('#N3').val())]
    }

    let datosEnvio = JSON.stringify(datos);
    console.log(datosEnvio);
    $.ajax({
        url: "http://localhost:8080/modificarEstudiante",
        type: "POST",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON"
    });

});
*/

























































/*
$('#modificar').on('click',function(){
    
    let datos = {
        
        codigo: parseInt($('#id').val()),
        notas: [parseFloat($('#N1').val()), parseFloat($('#N2').val()),  parseFloat($('#N3').val())]
    }
    
    let datosEnvio = JSON.stringify(datos);
    console.log(datosEnvio);
    $.ajax({
        url: "http://localhost:8080/modificarEstudiante",
        type: "POST",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON"
    });

});
$('#eliminar').on('click',function(){
    $.ajax({
        url: "http://localhost:8080/eliminarEstudiante",
        type: "DELETE",
        dataType: "JSON",
        success: function(respuesta){
            console.log(respuesta);
            if(respuesta){
                $('#eliminarUsu').append("Usuario eliminado")
            }else{
                $('#eliminarUsu').append("Usuario no eliminado")
            }
        }
    })
    
});
*/