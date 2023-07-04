/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$('#btnPlaceOrder').click(function ()
{
var cartItems = $('#tblCart tbody tr');
// If Cart items present, then show modal to enter Shipping Address.
if (cartItems.length > 0) {
$('#Order').modal('show');
return;
}
alert("Please add items into the cart.");
});


//An Ajax call inserts an order's record in the database by clicking Submit using POST. The following code snippet is the click event of Submit:
$('#btnConfirmOrder').click(function () {
PostOrders();
});