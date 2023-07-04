/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

function LoadProducts(searchText) {
  if (!searchText)
    searchText = "";
  
  // Load products' details.
  $.ajax({
    url: 'http://localhost:57571/api/Products',
    type: "GET",
    data: { searchText: searchText }, // Pass the searchText as a parameter
    
    // Other codes removed for brevity.
    
  });
}

$('#btnSearch').click(function () {
  var searchText = $('#txtSearch').val().trim();
  if (searchText) {
    $('#tblProducts').empty();
    LoadProducts(searchText);
  }
});
