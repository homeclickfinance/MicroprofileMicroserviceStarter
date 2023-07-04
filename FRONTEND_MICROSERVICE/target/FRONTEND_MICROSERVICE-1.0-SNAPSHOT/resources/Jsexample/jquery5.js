/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function PostCart(customerId, productId, qty, finalPrice)
{
var cart =
{
Customerid: customerId,
Productid: productId,
Qty: qty,
Finalprice: finalPrice
};
$.ajax({
url: 'http://localhost:57571/api/Carts',
type: "POST",
contentType: "application/json",
dataType: "json",
data: JSON.stringify(cart),
success: function (result) {
console.log(result);
},
error: function (message) {
console.log(message.statusText);
}
});
}
