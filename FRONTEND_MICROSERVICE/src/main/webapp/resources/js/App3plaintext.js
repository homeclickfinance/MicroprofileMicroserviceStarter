/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

// Fetch data from the API endpoint
fetch('http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microgroup3/view')
  .then(response => response.text()) // Extract the response as plain text
  .then(data => {
    // Update the content of the container element
    const container = document.getElementById('App3-plaintext');
    container.textContent = data;
  })
  .catch(error => {
    console.error('Error:', error);
  });


