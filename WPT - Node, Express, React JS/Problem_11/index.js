const date = prompt("Enter date: ");
const month = prompt("Enter month: ");
const year = prompt("Enter year: ");

const myDate = year+"-"+month+"-"+date;

function getWeekDay(dateString){
    const d = new Date(dateString);
    const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
    const dayOfWeek = days[d.getDay()];
    console.log(dayOfWeek);
}

getWeekDay(myDate);