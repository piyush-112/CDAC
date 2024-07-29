//http
const http= require("http");

// const server=http.createServer((req,resp) =>{
//     //req: request process
//     //resp:for writting response

//     resp.writeHead(200,{"content-type":"text/html"});
//     resp.write("<h1>Wow this is response from first created server</h1>");
//     resp.write("<h2>Okk thats nice</h2>");
//     resp.write("<button>Hit me</button>")
//     resp.end("Ok Ok ");
// });
// // one way
// server.listen(3001);


//another way
http.createServer((req,resp) =>{
    //req: request process
    //resp:for writting response

    resp.writeHead(200,{"content-type":"text/html"});
    resp.write("<h1>Wow this is response from first created server</h1>");
    resp.write("<h2>Okk thats nice</h2>");
    resp.end("Ok Ok ");
}).listen(3001);


// how to run the node js program
// save file with .js fromate in the program last mention port num like server.listen(3001);
// run code in vs code and then go to browser
//open the broweser and type localhost:portnum like localhost:3001  you can also do like http://localhost:3001/secondDemo.js and hit enter