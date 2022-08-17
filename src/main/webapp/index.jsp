<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form method="get" action="calculator">
    <label>Product Description:<input type="text" name="Product Description" placeholder="Mô tả SP"></label>
    <label>List Price:<input type="text" name="ListPrice" placeholder="Giá niêm yết"></label>
    <label>Discount Percent:<input type="text" name="DiscountPercent" placeholder="Tỷ lệ chiết khấu (%)"></label>
    <input type="submit" id="submit" value="calculator" />
</form>
</body>
</html>