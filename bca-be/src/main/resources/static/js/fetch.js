fetch("/api/amici")
  .then(res => res.json())
  .then(data => {
    const tbody = document.querySelector("tbody");

    data.forEach(a => {
      const row = document.createElement("tr");
      row.innerHTML = `
        <td>${a.nome}</td>
        <td>${a.cognome}</td>
        <td>${a.soprannome}</td>
      `;
      tbody.appendChild(row);
    });
  });