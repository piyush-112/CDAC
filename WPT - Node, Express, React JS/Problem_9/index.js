const calculateCompoundInterest=(e)=>{
    e.preventDefault();
    const principal = parseFloat(document.getElementById("Principal").value)
    const rateOfInterest = parseFloat(document.getElementById("rate").value)
    const period = parseFloat(document.getElementById("Period").value)

    const compoundInterest = (principal * Math.pow((1 + (rateOfInterest/100)),period))-principal

    document.getElementsByClassName("Compound")[0].innerHTML=`${compoundInterest}`
}