/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

 
function call(url, type, data) {
    var request = $.ajax({
          url: url,
          method: "GET",
          data: (data) ? JSON.stringify(data) : "",
          dataType: type
        });

        request.done(function(resp) {
          console.log(resp);
        });

        request.fail(function(jqXHR, textStatus) {
          console.log("Request failed: " + textStatus);
        });
};

