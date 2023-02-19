<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>added successfully</title>
<style type ="text/css">
span{
 display: inline-block;
 width:200px;
 text-align:left;
}

</style>
</head>
<body>

<div align="center">
<h2> Detail Added Successfully </h2>

<span> Student Roll :</span> <span>${student.roll}</span></br>
<span> Student Name :</span> <span>${student.name}</span></br>
<span> Student Semester :</span> <span>${student.semester}</span></br>
<span> Student EnglishMarks :</span> <span>${student.englishMarks}</span></br>
<span> Student MathMarks :</span> <span>${student.mathMarks}</span></br>
<span> Student ScienceMarks :</span> <span>${student.scienceMarks}</span>



</div>

</body>
</html>