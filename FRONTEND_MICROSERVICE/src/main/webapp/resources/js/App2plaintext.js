/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

// Fetch data from the API endpoint
fetch('http://localhost:8082/BACK_MIC_GROUP_A2/webapp2/Microgroup2/view2')
  .then(response => response.text()) // Extract the response as plain text
  .then(data => {
    // Update the content of the container element
    const container = document.getElementById('App2-plaintext');
    container.textContent = data;
  })
  .catch(error => {
    console.error('Error:', error);
  });

