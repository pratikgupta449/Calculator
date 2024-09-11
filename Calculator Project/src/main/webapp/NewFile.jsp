<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calci(1 Jsp Page)</title>
<style>
*{
box-sizing: border-box;
}
body{
align-items: center;
text-align: center;
background: linear-gradient(to right,orange,orangered);
}
img{
width: 20%;
height: 20%;
margin-top:20px;
border-radius: 100px;
}
img:hover{
transform: scale(1.1);
overflow: wrap;
}
h1{
color:white;
}
input,button{

font-size: 30px;
color: white;
background-color: black;
border-radius: 10px;
border: 2px solid white;
}
input{
padding-left: 20px;
}
input::placeholder{
color: white;

}

</style>
</head>
<body>
 <img alt="hi image" src="images/laugh_gif.gif">
<h1>result of calci</h1>
<h2>Jokes of the day</h2>
<h3><%=request.getParameter("Joke")%></h3>

<form action="myServlet">
<input type="number" placeholder="enter first number" name="firstNumber">
<input type="number" placeholder="enter second number" name="secondNumber">
<button name="btn1" value="1">+</button>
<button name="btn1" value="2">-</button>
<button name="btn1" value="3">*</button>
<button name="btn1" value="4">/</button>
</form>

<h1>Answer: <%=request.getParameter("ans") %>⛳</h1>
</body>
</html>