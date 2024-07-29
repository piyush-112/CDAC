const http=require('http');
const url=require('url');

//url.parse()
http.createServer((req,resp)=>{
    console.log(req.url);
    //pasrse the url
    let parsedUrl=url.parse(req.url,true);   //when you type http://localhost:8080/query?name=aniket 
    console.log(parsedUrl);  //it give the object
    console.log(parsedUrl.query.name)   //it return aniket  
}).listen(8080);

//If you run these code and goto the browser and type= localhost:8080/AniketKhatal
//It will return the /aniketkhtatal in the vscode terminal in terms of the responsesss