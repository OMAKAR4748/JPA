<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form with Validation</title>
    <link rel="stylesheet" href="styles.css">
    <style>
    body {
        font-family: Arial, sans-serif;
        margin: 20px;
        background-color: #f0f0f0;
    }

    h1 {
        color: #333;
    }

    form {
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    label {
        font-weight: bold;
    }

    input[type="text"], input[type="number"] {
        width: 100%;
        padding: 8px;
        margin: 8px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #45a049;
    }
    </style>
    <script>
    function validateForm() {
        const c_no = document.getElementById('c_no').value;
        const location = document.getElementById('location').value;
        const name = document.getElementById('name').value;
        const pincode = document.getElementById('pincode').value;
        const rating = document.getElementById('rating').value;
        const type = document.getElementById('type').value;

        if (c_no === "" || location === "" || name === "" || pincode === "" || rating === "" || type === "") {
            alert("All fields must be filled out");
            return false;
        }
        return true;
    }

    </script>
</head>
<body>
    <h1>Form with Validation</h1>
    <form id="detailsForm" onsubmit="return validateForm()" action="RestaurantServlet" method="post">
         <label for="name">Name:</label><br>
         <input type="text" id="name" name="name"><br><br>

        <label for="c_no">Contact Number:</label><br>
        <input type="number" id="c_no" name="c_no"><br><br>

        <label for="location">Location:</label><br>
        <input type="text" id="location" name="location"><br><br>

        <label for="pincode">Pincode:</label><br>
        <input type="number" id="pincode" name="pincode"><br><br>

        <label for="rating">Rating:</label><br>
        <input type="number" step="0.1" id="rating" name="rating"><br><br>

        <label for="type">Type:</label><br>
        <input type="text" id="type" name="type"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
