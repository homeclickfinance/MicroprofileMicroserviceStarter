/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function PutCart(cartItem)
{
var cart =
{
Id: cartItem.attr('data-cart-id'),
Customerid: '910D4C2F-B394-4578-8D9C-7CA3FD3266E2',
Productid: cartItem.attr('data-product-id'),
Qty: cartItem.find('td.qty').html(),
Finalprice: cartItem.find('td.price').html().replace('$', '')
};
$.ajax({
url: 'http://localhost:57571/api/Carts/' + cart.Id,
type: "PUT",
contentType: "application/json",
dataType: "json",
data: JSON.stringify(cart),
headers: { "Authorization": "Bearer eyJhbGciOiJSUzI1NiIs..." }
});
}

// Update Cart in Database: PUT /api/Carts/{id}
PutCart($('#tblCart').find('tr[data-product-id=' + productId + ']'));