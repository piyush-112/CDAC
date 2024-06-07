
function checkString() {
    const siteArray = ["www.googl.com", "ww.go.com"];
    let flag = true;
    let count = 0;
    siteArray.forEach(site => {
        flag = site.startsWith("www");
        if (flag=== true) {
            count++;  
        }
    });
    console.log("Count of sites start with www: "+count);
    
}

checkString();