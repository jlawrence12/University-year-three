<!--  Author: Jovanie Lawrence
   Date: 08/02/18    
   Description: Code for the orders page on the peach cms admin. -->

<?php

session_start();

if(!isset($_SESSION["admin_ID"])){
   header("Location:index.php");
} 
?>

<!DOCTYPE html>
<html>
   <head>
      <!--   Page Title     -->
      <title> Orders | Admin </title>
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
      <link rel='stylesheet' type='text/css' href='cmsStyleSheet.css'>
   </head>
   <body>
      <!--  Navigation bar -->
      <nav class="navbar navbar-light" style="background-color: #F3F2EE;">
         <header>
            <div class='container-fluid'>
            <div class='navbar-header'>
               <a href='#' class='d-inline-block align-top'> <img src=""> </a>
               <ul class="nav navbar-nav navbar-left">
                  <a class="navbar-brand" >
                  <img alt="Brand" src="p.png" id="logo" width="120px" height="50px">
                  </a>
                  <li><a href="index.html"><span class="glyphicon glyphicon-home"></span>Home</a></li>
                  <li><a href="products.html"> Products </a></li>
                  <li><a href="orders.html"> Orders </a></li>
               </ul>
            </div>
            <div class='collapse navbar-collapse'>
               <ul class="nav navbar-nav navbar-right">
                  <li><a href='index.html'> Log Out <span class='glyphicon glyphicon-user nav-icon'></a></li>
               </ul>
            </div>
         </header>
      </nav>
      <div class="container-fluid">
         <h2 class="text-center">Orders</h2>
         <!--    Table to display order details in a table    -->
         <table class="table table-striped">
            <!--        Table Column Headings        -->
            <thead>
               <tr>
                  <th>Order No</th>
                  <th>Last Edited</th>
                  <th>Customer Name</th>
                  <th>Status</th>
                  <th>Actions</th>
               </tr>
            </thead>
            <!--       Table Data         -->
            <tbody>
               <?php

               $user = new MongoDB\Client("");
               $collection;

               $datetime = $datetime->format('D/M/Y' H:i);

               echo

               "<tr>
                  <td>".$document['product_ID']."</td>
                  <td>".$datetime."</td>
                  <td>".$document['customer']['name']."</td>
                  <td>".$document['status']."</td>
                  <td>
                     <!--             Action Buttons to manage orders               -->
                     <button class='btn btn-primary' data-toggle='modal' data-target="#viewOrderModal">View Order</button>
                     <button class="btn btn-success"  data-toggle="modal" data-target="#updateStatusModal">Update Order Status</button>
                     <button class="btn btn-danger"  data-toggle="modal" data-target="#deleteOrderModal">Delete Order</button>
                  </td>
               </tr>";

               ?>
            </tbody>
         </table>
      </div>
      <!-- Add new product Modal -->
      <div id="viewOrderModal" class="modal fade" data-keyboard="false">
         <div class="modal-dialog">
            <div class="modal-content">
               <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h1 class="text-center">Order Details</h1>
               </div>
               <div class="modal-body">
                  <!--            Form to display the data            -->
                  <form id="existingOrderForm" class="form-horizontal" method="post">
                     <!--             Display each field with data               -->
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="orderNumber">Order No</label>  
                        <div class="col-md-4">
                           <input id="orderNumber" name="orderNumber" type="number" class="form-control input-md" value="1000" disabled>
                        </div>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="orderCreated">Order Created</label>  
                        <div class="col-md-4">
                           <input id="orderCreated" name="orderCreated" type="datetime" class="form-control input-md" value="05/02/2018 21:50" disabled>
                        </div>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="lastModified">Last Edited</label>  
                        <div class="col-md-4">
                           <input id="lastModified" name="lastModified" type="datetime" class="form-control input-md" value="09/02/2018 00:03" disabled>
                        </div>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="status">Status</label>  
                        <div class="col-md-4">
                           <input id="status" name="status" type="text" class="form-control input-md" value="Delivered" disabled>
                        </div>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="customerName">Customer</label>  
                        <div class="col-md-4">
                           <input id="customerName" name="customerName" type="text" class="form-control input-md" value="David Bible" disabled>
                        </div>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="address">Delivery Address</label>
                        <div class="col-md-4">                     
                           <textarea rows="5" cols="1000" class="form-control" id="address" name="address" disabled>Middlesex University&#13;&#10The Burroughs&#13;&#10London&#13;&#10NW4 4BT&#13;&#10United Kingdom</textarea>
                        </div>
                     </div>
                     <!--    Table to display Products Purchased    -->
                     <div class="container-fluid">
                        <table class="table table-striped">
                           <!--        Column Headings        -->
                           <thead>
                              <tr>
                                 <th>Barcode</th>
                                 <th>Title</th>
                                 <th>Qty</th>
                                 <th>Unit Price</th>
                                 <th>Line Price</th>
                              </tr>
                           </thead>
                           <!--       Table Data         -->
                           <tbody>
                              <tr>
                                 <td>12344566</td>
                                 <td>Beats Studio Wireless</td>
                                 <td>2</td>
                                 <td>£299.99</td>
                                 <td>£598.00</td>
                              </tr>
                           </tbody>
                        </table>
                     </div>
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="orderTotal">Order Total</label>
                        <div class="col-md-4">
                           <div class="input-group">
                              <span class="input-group-addon">£</span>
                              <input id="orderTotal" name="orderTotal" class="form-control" type="text" value="29.98" disabled>
                           </div>
                        </div>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
      <!-- Modal to Update Order Status  -->
      <div id="updateStatusModal" class="modal fade" data-keyboard="false">
         <div class="modal-dialog">
            <div class="modal-content">
               <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h2 class="modal-title text-center">Update Order Status</h2>
               </div>
               <div class="modal-body">
                  <form class="form-horizontal" method="post">
                     <div class="form-group">
                        <label class="col-md-4 control-label" for="statusSelect">Status</label>
                        <div class="col-md-4">
                           <select id="statusSelect" name="statusSelect" class="form-control">
                              <option value="Ordered">Ordered</option>
                              <option value="Dispatched">Dispatched</option>
                              <option value="Delivered">Delivered</option>
                           </select>
                        </div>
                        <button type="button" class="btn btn-success">Update</button>
                     </div>
                  </form>
               </div>
            </div>
         </div>
      </div>
      <!-- Modal to confirm Order Delete -->
      <div id="deleteOrderModal" class="modal fade" data-keyboard="false">
         <div class="modal-dialog">
            <div class="modal-content">
               <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h3 class="modal-title">Are you sure you want to remove this product?</h3>
               </div>
               <div class="modal-body">
                  <div class="settingsButtons">
                     <button type="button" class="btn btn-success settings" >Yes</button>
                     <button type="button" class="btn btn-danger settings" data-dismiss="modal">No</button>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>
</body>
</html>