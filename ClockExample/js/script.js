// let is12hour = true;
function clockTime12hour() {
    // creating the clock variables
    let date = new Date();
    let hour = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    let period = "AM";
    // 
    if (hour == 0) {
        hour = 12;
    }
    // adjusting to PM period
    if (hour > 12) {
        hour = hour - 12;
        period = "PM";
    }
    // putting zeros before numbers
    hour = (hour < 10) ? "0" + hour : hour;
    minutes = (minutes < 10) ? "0" + minutes : minutes;
    seconds = (seconds < 10) ? "0" + seconds : seconds;
    // 
    var currentTime = hour + ":" + minutes + ":" + seconds;
    // 
    document.getElementById("clock").innerText = currentTime;
    document.getElementById("period").innerText = period;
    let time = setTimeout(function(){
        clockTime12hour()
    }, 1000);
}

function clockTime24hour() {
    // creating the clock variables
    let date = new Date();
    let hour = date.getHours();
    let minutes = date.getMinutes();
    let seconds = date.getSeconds();
    let period = "AM";
    // adjusting to PM period
    if (hour > 12) {
        period = "PM";
    }
    // putting zeros before numbers
    hour = (hour < 10) ? "0" + hour : hour;
    minutes = (minutes < 10) ? "0" + minutes : minutes;
    seconds = (seconds < 10) ? "0" + seconds : seconds;
    // 
    var currentTime = hour + ":" + minutes + ":" + seconds;
    // 
    document.getElementById("clock").innerText = currentTime;
    document.getElementById("period").innerText = period;
    let time = setTimeout(function(){
        clockTime12hour()
    }, 1000);
}
// calling right function
document.getElementById("twelve").onclick = function() {
    console.log("12 hour");
    clockTime12hour();
}
// calling right function
document.getElementById("twentyHour").onclick = function() {
    console.log("24 hour");
    clockTime24hour();
}


