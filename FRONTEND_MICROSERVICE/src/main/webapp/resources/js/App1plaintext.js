/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

// Fetch data from the API endpoint
fetch('http://localhost:8081/BACK_MIC_GROUP_A1/JAXRSMICRO/Microgroup1/view1')
  .then(response => response.text()) // Extract the response as plain text
  .then(data => {
    // Update the content of the container element
    const container = document.getElementById('App1-plaintext');
    container.textContent = data;
  })
  .catch(error => {
    console.error('Error:', error);
  });

