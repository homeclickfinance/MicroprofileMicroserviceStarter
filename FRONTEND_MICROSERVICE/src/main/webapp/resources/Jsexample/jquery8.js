/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function DeleteCart(cartId)
{
$.ajax({
url: 'http://localhost:57571/api/Carts/' + cartId,
type: "DELETE",
contentType: "application/json",
headers: { "Authorization": "Bearer " + accessToken },
success: function (result) {
if (result.id) {
// Deleting the row from the html table.
var cartItem = $('#tblCart').find('tr[data-cart-id=' + cartId + ']');
cartItem.remove();
}
}
});
}
/*
cartItem = $('#tblCart tbody')
.append($('<tr>')
.attr('data-product-id', productId)
.append($('<td>').html(productName))
.append($('<td class="qty">').html(qty))
.append($('<td class="price">').html('$' + qty * price))
.append($('<td>')
.append($('<a>')
.attr('href', '#')
.append($('<span>').addClass('glyphicon glyphicon-trash'))
.click(function () {
// Delete Cart from Database: DELETE /api/Carts/{id}
DeleteCart($(this).parents('tr').attr('data-cart-id'));
})
)
)
);*/