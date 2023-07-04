/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function LoadProducts()
{
// Load products' details.
$.ajax({
url: 'http://localhost:57571/api/Products',
type: "GET",
contentType: "application/json",
dataType: "json",
success: function (result) {
console.log(result);
$.each(result, function (index, value) {
$('#tblProducts')
.append('<tr><td>' +
'<h3>' + value.productsdetail[0].name + '</h3>' +
'<span class="spanPrice">Price: $' + value.price +
'</span>' +
'<p>' + value.productsdetail[0].description + '</p>' +
'<a target="_blank" href=' + value.productsdetail[0].url +
'>Amazon Link</a>' +
'<input type="button" style="float:right;" class="btn btnsuccess" value="Add To Cart" />' +
'</td></tr>');
});
}
});
}

