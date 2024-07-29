//create the folder->npm init->enter enter
//install the express into the folder
//create the file index.js=>write the code into it and
//run npm index.js  ==>open into the browser localhost:8800
//create the basic app
//create the docker file 

const express=require("express");
const app=express();

app.get("/",(req,resp)=>{
    resp.json([
        {
            id:11,
            name:"Mayur Ashok Khatal",
            age:33
        },
        {
            id:2,
            name:"Lakshayaman Dasharath Ayodyavasi",
            age:34
        },
        {
            id:5,
            name:"Manoj Dilip khatal",
            age:28
        },
        {
            id:6,
            name:"Tushar Dilip Khatal",
            age:"28"
        }
    ]);
});
app.listen(8800,()=>{
    console.log("App is running on port 8800");
});





 