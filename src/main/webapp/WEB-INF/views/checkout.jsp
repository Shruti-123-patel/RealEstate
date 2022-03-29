<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout</title>
        <link rel="stylesheet" href="css1/style.css"/>
        <style>
        .main {
            background-color: rgba(221, 221, 221, 0.76);
            height: 100vh;
            padding: 50px;
        }

        .congo {
            font-size: 2.5rem;
            font-weight: bolder;
        }

        .container {
            margin-top: 100px;
            display: flex;
            padding: 50px;
        }

        .successimgclass {
            margin-left: 50px;
            margin-right: 50px;
        }

        .message {
            display: flex;
            margin: auto;
            justify-content: center;
            align-items: center;
            width: 950px;
            font-size: 23px;
        }

        a {
            text-decoration: none;
            font-size: 20px;
            background-color: whitesmoke;
            padding: 20px;
            border-radius: 25px;
            font-weight: bolder;
        }

        a:hover {
            background-color: aqua;
            color: black;
        }
    </style>
    </head>
    <body>
            <div>
        <nav class="topbar">
            <div class="logo">
                <img src="images/logo.jpg" alt="" srcset="">
            </div>
            <div class="name">E T E R N I T Y &nbsp; &nbsp; P R I M I E R E</div>
            <button class="btn"><%out.print(session.getAttribute("username"));%></button>
        </nav>
    </div>

    <div class="main">
        <marquee behavior="" direction="" class="congo">🎉🎉🎉 Congratulations Your Order Has Been Place Successfully
            🥳🥳🥳
        </marquee>
        <div class="container">
            <div class="successimgclass"><img src="images/check-circle.gif" alt="" srcset=""
                    style="border-radius: 500px;"></div>
            <div class="message">
                <p>Thank you <span id="change"></span> for shopping with <strong>Empire RealEsate</strong> you will contacted soon by
                    your agent
                    and
                    regarding your purchase and later paper work will be done with owner.</p>
            </div>
        </div>
        <center><a href="#">Continue Purchasing</a></center>
    </div>
    </body>
</html>
