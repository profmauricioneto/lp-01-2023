function newLanguage() {
  var fields = document.getElementsByTagName("input");

  if (fields[0].value === "" || fields[0].value === "") {
    window.alert("Write Something in Language and Level!");
  } else {
    var newLine = document.createElement("tr");
    for (let i = 0; i < fields.length; i++) {
      var newColumn = document.createElement("td");
      newColumn.innerHTML = fields[i].value;
      newLine.appendChild(newColumn);
      fields[i].value = "";
    }
    var tableData = document.getElementById("table-data");
    tableData.appendChild(newLine);
  }
}
