
console.log("connected");

 //===================================Insert on the HTML page======================================= 
 //================================================================================================= 

  
fetch('http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec')
             .then(res => {
                    return res.json();
                })
                .then(data => {
                    data.forEach(data =>{
                const markup =`<li> ${data[0].microservicea3} <\li>`;
                document.querySelector('ul').insertAdjacentHTML('beforeend', markup);
                });
       
             })
             .catch(error => console.log(error));


 


      
/*
function getData2() {
    const url = "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec";
    const request = new XMLHttpRequest();
    request.open("GET", url, true);
    
    console.log("HERE");    
    
    request.onload = function () {
        if (request.status >= 200 && request.status < 400) {
            let jsonList = JSON.parse(request.responseText);

            let jsonListElement = document.getElementById("json-list");

            jsonList.forEach(function (item) {
                const listItem = document.createElement("p");
                listItem.textContent = item;
                jsonListElement.appendChild(listItem);
            });

        } else {
            console.error("Error: ", request.status);

        }

    };

    request.onerror = function () {
        console.error("Request failed");
    };
    request.send();
}

*/