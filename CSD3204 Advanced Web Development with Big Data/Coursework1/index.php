<!DOCTYPE html>
<html>
   <head>
        <!--   Page Title     -->
      <title> Login | Admin </title>
      <!-- import tab icon -->
      <link rel='shortcut icon' href='Media/peach.png'>
      <!-- import boostrap stylesheets -->
      <link rel='stylesheet' type='text/css' href='css/bootstrap.min.css'>
      <link rel='stylesheet' type='text/css' href='css/bootstrap.css'>
      <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
      <script src='Javascript/jquery-3.1.1.min.js'> </script>
      <script src='https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js'> </script>
      <script src='Javascript/bootstrap.min.js'> </script>
      <script src='Javascript/jquery.md5.js'> </script>
      <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
      <!--import our own stylesheet and javascript file -->
      <script src='Javascript/index.js'> </script>
      <link rel='stylesheet' type='text/css' href='cmsStaffLogin.css'>
   </head>
   <body>
      <!--  This div represents the main box  -->
      <div id="box">
         <!--    This div contains all of the box content    -->
         <div id="box-content">
            <!--      This div contains the logo that is displayed above the login form      -->
            <div id="logo">
               <img src="p.png" height="100px">
            </div>
            <!--     This is the main Login form       -->
            <form class="form-horizontal" id="admin-login" method="post" action="orders.php">
               <input type="email" class="form-control" id="inputEmail" placeholder="Email">
               <input type="password" class="form-control" id="inputPassword" placeholder="Password">
               <div class="form-group">
                  <label class="col-md-4 control-label" for="loginButton"></label>
                  <div class="col-md-4 center-block">
                     <a href="orders.php"><button id="loginButton" name="loginButton" class="btn btn-default center-block">Sign in</button></a>
                  </div>
               </div>
            </form>
         </div>
      </div>
   </body>
</html>