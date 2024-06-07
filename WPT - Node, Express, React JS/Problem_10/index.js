const myFunction = () => {
    const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    const d = new Date();
    let day = days[d.getDay()];
    let hrs = d.getHours();
    myDate = d.toUTCString().slice(5, 16)

    const currentDate = new Date();

    const lastDayOfYear = new Date(currentDate.getFullYear(), 11, 31); // December is month 11 based on index 0
    const oneDay = 24 * 60 * 60 * 1000; // milliseconds in a day
    const daysRemaining = Math.round((lastDayOfYear - currentDate) / oneDay);

    document.getElementById("myDiv").innerHTML = `Today is ${day}, ${myDate}, Welcome, and Good ${getTimesOfDay(hrs)} to You.<br> Number of Days left till end of year:  ${daysRemaining} `


}

const getTimesOfDay = (hrs) => {
    if (hrs > 0 && hrs < 12)
        return 'Morning'
    else if (hrs >= 12 && hrs <= 17)
        return 'Afternoon'
    else if (hrs >= 17 && hrs <= 24)
        return 'Evening'
}