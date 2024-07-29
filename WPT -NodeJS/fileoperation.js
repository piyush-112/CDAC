//Following are the operations that we perform on the file:
//Read
//write
//append
//delete
//To do that we have a node module called fs ,we need to import
//(require) that
const fs = require('fs');
// let ch=prompt("Enter your choice");
//fs is a module that allows us to interact with the file system
//fs has many methods that we can use to perform operations on files
/*
switch(1)
{
    case 1:
        console.log("Enter the filename to read");
        let filename = readline.question();
        fs.readFile(filename,'utf8',(err,data)=>{
            if(err){
                console.log(err);
                }
                else{
                    console.log(data);
                    }
                    });
                    break;
    case 2:
        console.log("Enter the filename to write");
        let filename2 = readline.question();
        console.log("Enter the data to write");
        let data = readline.question();
        fs.writeFile(filename2,data,(err)=>{
            if(err){
                console.log(err);
                }
                else{
                    console.log("Data written successfully");
                    }
                    });
                    break;
    case 3:
        console.log("Enter the filename to append");
        let filename3 = readline.question();
        console.log("Enter the data to append");
        let data2 = readline.question();
        fs.appendFile(filename3,data2,(err)=>{
            if(err){
                console.log(err);
            }
            else{
                console.log("Data appended successfully");
                }
                });
                break;
    case 4:
        console.log("Enter the filename to delete");
        let filename4 = readline.question();
        fs.unlink("filename4",(error)=>{
            if(error){
                console.log(error);
                }else{
                    console.log("File deleted successfully");
                    }
                    });  
                    break;
                } */

/*
//read file
fs.readFile("gwagan.txt",(error,data)=>{
    if(error){
        console.log(error);
        }else{
            console.log(data.toString());
            }
});
/*
//write file
fs.writeFile("gwagan.txt","Hello An",(error)=>{
    if(error){
        console.log(error);
        }else{
            console.log("File written successfully");
            }
            }
            );

    //append file
    fs.appendFile("gwagan.txt","Hello World",(error)=>{
        if(error){
            console.log(error);
            }else{
                console.log("File appended successfully");
                }
                });
                
*/
  //delete file
  fs.unlink("gwagan.txt",(error)=>{
    if(error){
        console.log(error);
        }else{
            console.log("File deleted successfully");
            }
            });                      