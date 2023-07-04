/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$.ajax({
url: 'http://localhost:57571/api/Carts',
type: "POST",
contentType: "application/json",
dataType: "json",
data: JSON.stringify(cart),
headers: { "Authorization": "Bearer eyJhbGciOiJSUzI1NiIs...[Long String Removed]" },
success: function (result)
{
var cartItem = $('#tblCart').find('tr[data-product-id=' +
productId + ']');
cartItem.attr('data-cart-id', result.id);
},
});