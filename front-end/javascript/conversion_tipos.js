//Alfanumericos
let nombrePasajero = "Pedro Silva";
console.log(nombrePasajero);

nombrePasajero = "Ramon Silva";
console.log(nombrePasajero);

//Numericoss
let valorBoleto = 1650;
console.log(valorBoleto);
const impuestoAeropuerto = 100;
const tasaEmbarque = 60;
const porcentajeTasaEmbarque = 60/100;
var gestionAgencia = 120.50;

//Logicos
let boletoActivo =  true;
console.log(boletoActivo);

//Operaciones Aritmeticas
let totalBoletos = 1700 + 65.45 + 100;
console.log(totalBoletos);

totalBoletos = valorBoleto + tasaEmbarque + gestionAgencia;
console.log(totalBoletos);

//Orden de Precedencia
//()
// * y /
// + y -

let totalizarBoletos = (valorBoleto + impuestoAeropuerto) * (porcentajeTasaEmbarque + gestionAgencia);
console.log(totalizarBoletos);

//Concatenacion
let nombre = "Leonardo";
let apellido = "Perez";

let nombreCompleto = nombre + apellido;
console.log(nombreCompleto);

let pasaporte = '1000' + '12';
let multiplicacion = '1000' * '10';

console.log(pasaporte);
console.log(multiplicacion);

let division = parseInt('1000') / parseFloat('10');

let noEsNumero = parseInt('Jeymar');
console.log(noEsNumero);