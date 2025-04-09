document.addEventListener("DOMContentLoaded", () => {
    fetch("https://restcountries.com/v3.1/all?fields=name,flags")
        .then(response => response.json())
        .then(data => {
            const select = document.getElementById("country");
            data.sort((a, b) => a.name.common.localeCompare(b.name.common));
            data.forEach(pais => {
                const option = document.createElement("option");
                option.value = pais.name.common;
                option.text = pais.name.common;
                select.appendChild(option);
            });
        });
});