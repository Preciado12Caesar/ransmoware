let resultadoFinal = "";
for (let indice = 0; indice < tablaConversion.length; indice++) {
    while (valorInicial >= tablaConversion[indice].numero) {
        resultadoFinal += tablaConversion[indice].romano;
        valorInicial -= tablaConversion[indice].numero;
    }
}