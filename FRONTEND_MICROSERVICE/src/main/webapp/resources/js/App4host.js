/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


console.log("connected Host 4 app");

 //================================================================================================= 
 
     document.addEventListener("DOMContentLoaded", function() {
      const url = 'http://localhost:8084/BACK_MIC_GROUP_A4/App4/Microservicetestgroupa4/microserviced';

      fetch(url)
        .then(response => response.json())
        .then(data => {
          const dataDisplay = document.getElementById('DisplayHost4Data');
          const displayText = `Data: ${data[0].microservicea4}`;
          dataDisplay.textContent = displayText;
        })
        .catch(error => {
          console.log('Error:', error);
        });
    });
                       
 //===================================Insert on the HTML page=======================================  
 
