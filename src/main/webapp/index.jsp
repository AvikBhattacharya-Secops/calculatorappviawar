<html>
<head>
    <title>Calculator App</title>
</head>
<body>
    <h2>Calculator</h2>
    <form action="calculate" method="get">
        <input type="number" name="a" required>
        <select name="op">
            <option value="add">+</option>
            <option value="sub">-</option>
            <option value="mul">*</option>
            <option value="div">/</option>
        </select>
        <input type="number" name="b" required>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>