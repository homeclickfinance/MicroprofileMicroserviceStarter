/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

var $ = jQuery.noConflict();
  
            $.ajax( {
                cache: false,
                crossDomain: true,
                dataType: "json",
                url: "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec",
                type: "GET",
                success: function( jsonObj, textStatus, xhr ) {
                    var htmlContent = $( "#logMsgDiv" ).html( ) + "<p>" + jsonObj.message + "</p>";
                    $( "#logMsgDiv" ).html( htmlContent );
                },
                error: function( xhr, textStatus, errorThrown ) {
                    console.log( "HTTP Status: " + xhr.status );
                    console.log( "Error textStatus: " + textStatus );
                    console.log( "Error thrown: " + errorThrown );
                }
            } );
  
            $.ajax( {
                cache: false,
                crossDomain: true,
                dataType: "json",
                url: "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec",
                type: "POST",
                success: function( jsonObj, textStatus, xhr ) {
                    var htmlContent = $( "#logMsgDiv" ).html( ) + "<p>" + jsonObj.message + "</p>";
                    $( "#logMsgDiv" ).html( htmlContent );
                },
                error: function( xhr, textStatus, errorThrown ) {
                    console.log( "HTTP Status: " + xhr.status );
                    console.log( "Error textStatus: " + textStatus );
                    console.log( "Error thrown: " + errorThrown );
                }
            } );
  
            $.ajax( {
                cache: false,
                crossDomain: true,
                dataType: "json",
                url: "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec",
                type: "PUT",
                success: function( jsonObj, textStatus, xhr ) {
                    var htmlContent = $( "#logMsgDiv" ).html( ) + "<p>" + jsonObj.message + "</p>";
                    $( "#logMsgDiv" ).html( htmlContent );
                },
                error: function( xhr, textStatus, errorThrown ) {
                    console.log( "HTTP Status: " + xhr.status );
                    console.log( "Error textStatus: " + textStatus );
                    console.log( "Error thrown: " + errorThrown );
                }
            } );
  
            $.ajax( {
                cache: false,
                crossDomain: true,
                dataType: "json",
                url: "http://localhost:8083/BACK_MIC_GROUP_A3/webapp3/Microservicetestgroupa3/microservicec",
                type: "DELETE",
                success: function( jsonObj, textStatus, xhr ) {
                    var htmlContent = $( "#logMsgDiv" ).html( ) + "<p>" + jsonObj.message + "</p>";
                    $( "#logMsgDiv" ).html( htmlContent );
                },
                error: function( xhr, textStatus, errorThrown ) {
                    console.log( "HTTP Status: " + xhr.status );
                    console.log( "Error textStatus: " + textStatus );
                    console.log( "Error thrown: " + errorThrown );
                }
            } );
            
            
