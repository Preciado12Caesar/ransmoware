function convertirARomano(numero) {
    const valores = [
        { valor: 1000, simbolo: "M" },
        { valor: 900, simbolo: "CM" },
        { valor: 500, simbolo: "D" },
        { valor: 400, simbolo: "CD" },
        { valor: 100, simbolo: "C" },
        { valor: 90, simbolo: "XC" },
        { valor: 50, simbolo: "L" },
        { valor: 40, simbolo: "XL" },
        { valor: 10, simbolo: "X" },
        { valor: 9, simbolo: "IX" },
        { valor: 5, simbolo: "V" },
        { valor: 4, simbolo: "IV" },
        { valor: 1, simbolo: "I" }
    ];

    let resultado = "";
    for (let i = 0; i < valores.length; i++) {
        while (numero >= valores[i].valor) {
            resultado += valores[i].simbolo;
            numero -= valores[i].valor;
        }
    }
    return resultado;
}

// Ejemplo de uso:
console.log(convertirARomano(1987)); // MCMXXXVII
console.log(convertirARomano(2024)); // MMXXIV