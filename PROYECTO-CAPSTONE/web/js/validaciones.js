/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validar_registro() {
    nom = document.frmregistro.txtnom.value;
    if (nom.length == 0) {
        alertify.alert("Error", "Ingrese todos los datos").set('label', 'Ok');

        alert("Error", "Ingrese todos los datos").set('label', 'Ok');
        return false;
    } else {
        alertify.success("Registrado correctamente");
        return true;
    }
}

function validarTexto() {
    tecla = e.keyCode;
    teclado = String.fromCharCode(tecla);
    if ((teclado < 'A' || teclado > 'z') && teclado != " ") {
        return false;
    }

}


function SoloNumeros(e) {
    key = e.keyCode || e.which;

    teclado = String.fromCharCode(key);
    numero = "0123456789";
    especiales = "8-37-38-46";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
        }

        if (numero.indexOf(teclado) == -1 && !teclado_especial) {
            alert("DATOS INVALIDOS, SOLO SE PERMITEN NUMEROS");
            return false;
        }
    }
}

function SoloLetras(e) {
    key = e.keyCode || e.which;
    //S=evt.getKeyChar();
    teclado = String.fromCharCode(key);
    letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
    especiales = "222";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
            break;
        }

        if (letras.indexOf(teclado) == -1 && !teclado_especial) {
            //if(letras.indexOf(teclado)==-1 && !teclado_especial){
            alert("DATOS INVALIDOS, SOLO SE PERMITEN LETRAS");
            return false;
        }
    }
}

function LetrasNumeros(e) {
    key = e.keyCode || e.which;
    //S=evt.getKeyChar();
    teclado = String.fromCharCode(key);
    letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789. ";
    especiales = "222";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
            break;
        }

        if (letras.indexOf(teclado) == -1 && !teclado_especial) {
            //if(letras.indexOf(teclado)==-1 && !teclado_especial){
            alert("CARACTER NO PERMITIDO");
            return false;
        }
    }
}

function Email(e) {
    key = e.keyCode || e.which;
    //S=evt.getKeyChar();
    teclado = String.fromCharCode(key);
    letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789@.";
    especiales = "8-37-38-46-222";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
            break;
        }

        if (letras.indexOf(teclado) == -1 && !teclado_especial) {
            //if(letras.indexOf(teclado)==-1 && !teclado_especial){
            alert("CARACTER NO PERMITIDO");
            return false;
        }
    }
}

function Contrasena(e) {
    key = e.keyCode || e.which;
    //S=evt.getKeyChar();
    teclado = String.fromCharCode(key);
    letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789.";
    especiales = "222";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
            break;
        }

        if (letras.indexOf(teclado) == -1 && !teclado_especial) {
            //if(letras.indexOf(teclado)==-1 && !teclado_especial){
            alert("CARACTER NO PERMITIDO");
            return false;
        }
    }
}

function Precio(e) {
    key = e.keyCode || e.which;

    teclado = String.fromCharCode(key);
    numero = "0123456789.";
    especiales = "8-37-38-46";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
        }

        if (numero.indexOf(teclado) == -1 && !teclado_especial) {
            alert(" SOLO SE PERMITEN NUMEROS y ( . ) ");
            return false;
        }
    }
}

function NombreProd(e) {
    key = e.keyCode || e.which;
    //S=evt.getKeyChar();
    teclado = String.fromCharCode(key);
    letras = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789- ";
    especiales = "222";
    teclado_especial = false;

    for (var i in especiales) {
        if (key == especiales[i]) {
            teclado_especial = true;
            break;
        }

        if (letras.indexOf(teclado) == -1 && !teclado_especial) {
            //if(letras.indexOf(teclado)==-1 && !teclado_especial){
            alert("CARACTER NO PERMITIDO");
            return false;
        }
    }
}

function MostrarPassword() {
    var cambio = document.getElementById("pass");
    var cambio2 = document.getElementById("pass2");

    if (cambio.type == "password" || cambio2.type == "password") {
        cambio.type = "text";
        cambio2.type = "text";
        $('.icon').removeClass('fa fa-eye-slash').addClass('fa fa-eye');

    } else {
        cambio.type = "password";
        cambio2.type = "password";
        $('.icon').removeClass('fa fa-eye').addClass('fa fa-eye-slash');
    }
}

$(document).ready(function () {
    //CheckBox mostrar contraseña
    $('#ShowPassword').click(function () {
        $('#Password').attr('type', $(this).is(':checked') ? 'text' : 'password');
    });
}
);

    