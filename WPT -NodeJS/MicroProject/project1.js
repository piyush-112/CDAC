//project in which i can make a nav bar 
const http=require('http');
const url=require('url');
const fs=require('fs');

http.createServer((req,resp)=>{
    //Request
    //About
    const path=req.url;                              
    if(path === '/about'){
        console.log("About Page");
        resp.writeHead(200,{
            'Content-Type':'text/html'
        });
        const fileContent=fs.readFileSync("NodeJs/MicroProject/views/about.html");
        resp.write(fileContent);
        resp.end();
    }
    //Homes
    else if(path === '/'){
        console.log("Home Page");

        resp.writeHead(200,{
            "content-type":"text/html",
        });
        const fileContent2=fs.readFileSync("NodeJs/MicroProject/views/home.html");
        resp.write(fileContent2);
        resp.end();
    }
    //services
    else if(path === '/services'){
        console.log("Services Page");

        resp.writeHead(200,{
            "content-type":"text/html",
        });
        const fileContent3=fs.readFileSync("NodeJs/MicroProject/views/services.html");
        resp.write(fileContent3);
        resp.end();
    }
}).listen(8090)