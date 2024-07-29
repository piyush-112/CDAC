const express = require("express");
const app = express();

app.get("/", (req, res) => {
    res.json([
        {
            id: 1,
            name: "Aniket",
            age: 24
        },
        {
            id: 2, // Changed id to 2 for uniqueness
            name: "Piyush",
            age: 65
        },
        {
            id: 3, // Changed id to 3 for uniqueness
            name: "Rocket",
            age: 44
        }
    ]);
});

app.listen(5500, () => {
    console.log("App is running on port 5500");
});
