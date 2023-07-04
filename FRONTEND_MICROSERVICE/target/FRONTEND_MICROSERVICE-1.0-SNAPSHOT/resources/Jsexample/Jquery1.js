/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function LoadProducts()
{
// Load products' details.
$.ajax({
url: 'http://localhost:57571/api/Productsdetails',
type: "GET",
contentType: "application/json",
dataType: "json",
success: function (result) {
$.each(result, function (index, value) {
$('#tblProducts')
.append('<tr><td>' +'<h3>' + value.name + '</h3>' +
'<p>' + value.description + '</p>' +
'<a target="_blank" href=' + value.url + '>Amazon Link</a>' +
'<input type="button" style="float:right;" class="btn btn-success" value="Add To Cart" />' +
'</td></tr>');
});
}
});
}