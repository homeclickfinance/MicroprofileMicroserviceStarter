/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


console.log("connected Host 1 app Console");



 /* THis is the botton function to get Data from the database and show them in the console */  
 function gethost1console() {
            fetch('http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/EntityPath/microservice')
                .then(function (response) {
                    return response.json();
                })
                .then(function (myJson) {
                    console.log(JSON.stringify(myJson));
                });
        }
        
        
/* THis is the botton function to get Data from the database and show them in the console */    