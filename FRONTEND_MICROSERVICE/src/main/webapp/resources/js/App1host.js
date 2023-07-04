/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


console.log("connected Host 1 app");

 //================================================================================================= 
 
     document.addEventListener("DOMContentLoaded", function() {
      const url = 'http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice';

      fetch(url)
        .then(response => response.json())
        .then(data => {
          const dataDisplay = document.getElementById('DisplayHost1Data');
          const displayText = `Data: ${data[0].microservicea1}`;
          dataDisplay.textContent = displayText;
        })
        .catch(error => {
          console.log('Error:', error);
        });
    });
                       
 //===================================Insert on the HTML page=======================================  
 

