/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).on("click","#listar",function(){
    $.ajax({
        url:"/listaUsuarios",
        dataType:"json",
        type:"GET",
        success:function(data){
            console.log(data);
            
            var tabla="<table id='usr'>";
                tabla+="<tr><th>ID</th>";
                tabla+="<th>NOMBRE</th>";
                tabla+="<th>CORREO</th></tr>";
                
                for(var i=0 ; i<data.length ; i++){
                    tabla+="<tr><td>"+data[i].id+"</td>";
                tabla+="<td>"+data[i].nombre+"</td>";
                tabla+="<td>"+data[i].correo+"</td></tr>";
                }
                
                tabla+="</table>";
                
            $("#usuarios").html(tabla);
            
            
        },
        error: function(data,status){
            
        }
    })
})


