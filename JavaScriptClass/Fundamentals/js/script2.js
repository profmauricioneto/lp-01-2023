const myButton = document.getElementById("btnModify");
const myItemList = document.querySelectorAll("ul li");

myButton.addEventListener("click", () => {
  myItemList.forEach((item) => {
    item.textContent = "I have been modified";
  });
});

// function modifyItems(listItem) {
//     listItem.forEach(item => {
//         item.textContent = 'I have been modified';
//     });
// }
