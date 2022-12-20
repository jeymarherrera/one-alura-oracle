//const
//espacio de memoria que luego de asignarle un valor no cambia en el tiempo
const valorPasaje = 1650;
console.log(valorPasaje);

const nombrePasajero = "Leo";
const apellidoPasajero = "Martinez";

console.log(nombrePasajero);
console.log(apellidoPasajero);

//nombrePasajero = nombrePasajero + " " + apellidoPasajero;
//console.log(nombrePasajero);

//let
//espacio en memoria que puede cambiar durante la ejecucion del programa
//alcance = local
let nombreCompleto = nombrePasajero + " " + apellidoPasajero;
console.log(nombreCompleto);

//var
//espacio en memoria que puede cambiar durante la ejecucion del programa
//alcance = global
var nomCompleto = nombrePasajero + " " + apellidoPasajero;
console.log(nomCompleto);

let varLet = "let = fuera del bloque"; 
var varVar = "var = fuera del bloque"

{
    let variableLet = "let = dentro del bloque"; 
    var variableVar = "var = dentro del bloque"
    console.log(variableLet);
    console.log(variableVar);
    // da error
    //console.log(vareLet);
    console.log(varVar);
}
// da error
//console.log(variableLet);
console.log(variableVar);
console.log(varLet);
console.log(varVar);