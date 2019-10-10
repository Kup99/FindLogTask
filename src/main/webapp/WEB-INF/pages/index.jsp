<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
${file}
<form method="get" action="/getFile">
    <p>Enter your logtext</p>
    <p><input type="text" placeholder="logText" name="logText"></p>
    <p>Enter path</p>
    <p><input type="text" placeholder="path" name="path"></p>
    <p>File extension</p>
    <select name="file_extension">
       <option>TXT</option>
       <option>LOG</option>
    </select>
    <input type="submit" value="find">
</form>
</body>
</html>
