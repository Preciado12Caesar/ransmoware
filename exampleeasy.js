let romano = "";
for (let i = 0; i < equivalencias.length; i++) {
    while (numeroDecimal >= equivalencias[i].valorDecimal) {
        romano += equivalencias[i].simboloRomano;
        numeroDecimal -= equivalencias[i].valorDecimal;
    }
}