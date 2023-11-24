function newLanguage() {
  var fields = document.getElementsByTagName("input");
  var newLine = document.createElement("tr");
  var i;

  for (i = 0; i < fields.length; i++) {
    if (fields[i].value === "") {
      window.alert("Write Something in Language and Level!");
    } else {
      var newColumn = document.createElement("td");
      newColumn.innerHTML = fields[i].value;
      newLine.appendChild(newColumn);
      fields[i].value = "";
    }
  }
  var table = document.getElementById("table");
  table.appendChild(newLine);
}
