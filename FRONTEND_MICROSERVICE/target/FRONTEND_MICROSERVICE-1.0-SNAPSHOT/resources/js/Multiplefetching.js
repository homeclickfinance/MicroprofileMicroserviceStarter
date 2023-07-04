/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


const endpoint = 'http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec';

// GET request
fetch(endpoint)
  .then(response => response.json())
  .then(data => {
    console.log('GET Data:', data);
  })
  .catch(error => {
    console.log('GET Error:', error);
  });

// POST request
const postData = { microservicea3: 'New Microservice' };

fetch(endpoint, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json'
  },
  body: JSON.stringify(postData)
})
  .then(response => response.json())
  .then(data => {
    console.log('POST Data:', data);
  })
  .catch(error => {
    console.log('POST Error:', error);
  });

// PUT request
const putData = { microservicea3: 'Updated Microservice' };
const microA3 = 1; // Replace with the specific microA3 value

fetch(`${endpoint}/${microA3}`, {
  method: 'PUT',
  headers: {
    'Content-Type': 'application/json'
  },
  body: JSON.stringify(putData)
})
  .then(response => response.json())
  .then(data => {
    console.log('PUT Data:', data);
  })
  .catch(error => {
    console.log('PUT Error:', error);
  });

// DELETE request
const deleteMicroA3 = 1; // Replace with the specific microA3 value

fetch(`${endpoint}/${deleteMicroA3}`, {
  method: 'DELETE'
})
  .then(response => {
    if (response.ok) {
      console.log('DELETE Success');
    } else {
      throw new Error('DELETE Error');
    }
  })
  .catch(error => {
    console.log('DELETE Error:', error);
  });
