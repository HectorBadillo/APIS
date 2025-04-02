function randomFuncion() {
    const randomColor = '#' + Math.floor(Math.random()*16777215).toString(16);
    document.documentElement.style.setProperty('--color-primary', randomColor);
}

function saludoFuncion() {
    alert("¡Hola! Estás usando la función de saludo.");
}
