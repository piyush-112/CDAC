import React from "react";
import ReactDom from "react-dom";

ReactDom.render(
<div align='center'>
<h1>Wel come to the paradise</h1>
{/* name:
<input type='text' name='username' value='' placeholder="Enter the user name:" width={50}/><br></br><br></br>
password:
<input type="text" name='password' value='' placeholder="Enter the password:"/><br></br><br></br>
<input type="submit" name="submit" value='Login'/>  */}
<form>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">username:</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
    <br></br><br></br>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Password:</label>
    <input type="password" class="form-control" id="exampleInputPassword1"/>
  </div><br></br>
  <button type="button" class="btn btn-success">Success</button>  
</form>
</div>
,document.getElementById("root"));