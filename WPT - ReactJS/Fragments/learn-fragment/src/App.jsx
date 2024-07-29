import React from "react"; //to use the <React.Fragment></React.Fragment> we import it to use <></> we dont need this
import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "bootstrap/dist/css/bootstrap.min.css"; //Add bootstrap import
import "./App.css";
//Map in react
function App() {
  const user = [
    //Brothers Are my strength
    { id: 1, name: "Aniket" },
    { id: 2, name: "Tushar" },
    { id: 3, name: "Mayur" },
    { id: 4, name: "Rakesh" },
    { id: 5, name: "Manoj" },
  ];

  return (
    <>
      <h4>--ATMARAM--</h4>
      <hr></hr>
      {user.map((user) => (
        <li key={user.id}>{user.name}</li>
      ))}
    </>
  );
}

export default App;
