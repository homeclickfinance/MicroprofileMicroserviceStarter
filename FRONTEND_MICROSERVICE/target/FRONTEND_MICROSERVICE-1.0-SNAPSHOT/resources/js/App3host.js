/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

console.log("connected Host 3 app");

 //================================================================================================= 
 
     document.addEventListener("DOMContentLoaded", function() {
      const url = 'http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec';

      fetch(url)
        .then(response => response.json())
        .then(data => {
          const dataDisplay = document.getElementById('DisplayHost3Data');
          const displayText = `Data: ${data[0].microservicea3}`;
          dataDisplay.textContent = displayText;
        })
        .catch(error => {
          console.log('Error:', error);
        });
    });
                       
 //===================================Insert on the HTML page=======================================  
 

            
    
            
