//In node js you can create your own module also,here we create the module for finding  the average
// to use in the other program we do module.export=modulenm ,like moule.export=frindavg
const findavg = (a, b, c) => {
    console.log("Finding the average:");
    return (a + b + c) / 3;
};

module.exports = findavg;