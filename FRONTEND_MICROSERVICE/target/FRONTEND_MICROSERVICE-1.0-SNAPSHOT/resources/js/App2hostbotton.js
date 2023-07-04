/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


console.log("connected Host 2 app Console");



 /* THis is the botton function to get Data from the database and show them in the console */  
 function gethost2console() {
            fetch('http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microservicetestgroupa2/microservicec')
                .then(function (response) {
                    return response.json();
                })
                .then(function (myJson) {
                    console.log(JSON.stringify(myJson));
                });
        }
        
        
/* THis is the botton function to get Data from the database and show them in the console */ 