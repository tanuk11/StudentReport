<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix ="form" uri ="http://springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student Register form</title>
<style type ="text/css">
label{

display : inline-block;
width: 200px;
margin:5px;
text-align:left;


}

button{
padding:10px;
margin:10px;

}
</style>
</head>
<body>
<div align = "center">
<h2> Add Students details</h2>

<form: form action ="register" method ="post" modelAttribute ="Student">
<form:label path="roll"> Student Roll: </from:label>
<form:input path ="roll"/>
<form:label path="name"> Student name: </from:label>
<form:input path ="name"/>
<form:label path="semester"> Student Semester: </from:label>
<form:input path ="semester"/>
<form:label path="engilsh"> Student EnglishMarks: </from:label>
<form:input path ="english"/>
<form:label path="math"> Student MathMarks: </from:label>
<form:input path ="math"/>
<form:label path="science"> Student ScienceMarks: </from:label>
<form:input path ="science"/>

 <form:button>Add details</form:button>

</form: form>

</div>
</body>
</html>