/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function AddToCart(productId, productName, qty, price)
{
$('#tblCart tbody')
.append($('<tr>')
.attr('data-product-id', productId)
.append($('<td>').html(productName))
.append($('<td class="qty">').html(qty))
.append($('<td class="price">').html('$' + qty * price))
.append($('<td>')
.append($('<a>')
.attr('href', '#')
.append($('<span>').addClass('glyphicon glyphicon-trash'))
// For Delete Icon.
.click(function ()
{
// Delete Cart from Database.
})
)
)
);
// Add one Cart record in Database.
}