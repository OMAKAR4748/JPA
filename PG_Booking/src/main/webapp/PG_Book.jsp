<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PG Booking Module</title>
    <link rel="stylesheet" href="styles.css">
    <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .container {
        background-color: white;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        width: 300px;
    }

    h1 {
        text-align: center;
        color: #333;
    }

    form {
        display: flex;
        flex-direction: column;
    }

    label {
        margin-top: 10px;
    }

    input, select, button {
        margin-top: 5px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    button {
        background-color: #5cb85c;
        color: white;
        cursor: pointer;
    }

    button:hover {
        background-color: #4cae4c;
    }
</style>
<script>
document.getElementById('booking-form').addEventListener('submit', function(event) {
    event.preventDefault();
    alert('Booking submitted successfully!');
    // Add your form submission logic here
});

</script>
</head>
<body>

    <div class="container">
        <h1>PG Booking System</h1>
        <p>${name }  ${email }  ${phone } ${room_type}</p>
        <form id="booking-form" method="post" action="/PGBooK_login">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            <br>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
            <br>
            <label for="phone">Phone:</label>
            <input type="tel" id="phone" name="phone" required>
            <br>
            <label for="room_type">Room Type:</label>
            <select id="room_type" name="room_type" required>
                <option value="single">Single</option>
                <option value="double">Double</option>
                <option value="shared">Shared</option>
            </select>
            <br>
            <button type="submit">Book Now</button>
        </form>
    </div>
    <script src="script.js"></script>
</body>
</html>
