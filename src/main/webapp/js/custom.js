/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
console.log("Loading custom.js");

function executeAjax(component){
    var id = $(component).data("href");
    console.log("executing Ajax call on " + id);
    var url = "http://localhost:8080/stripes-demo/Dialog.action";
    var params = "id="+$(component).data("href");
    
    
    
    ajaxGet(url, params, myAjaxDoneCallback, myAjaxErrorCallback);
}

function myAjaxDoneCallback(result) {
    console.log('Success!');
//    console.log(result);
    $('#modalDialogContent').replaceWith(result);
    $('#modalDialog').modal('show');
}

function myAjaxErrorCallback(xhr, status, errorThrown) {
    console.log("Error thrown!");
    console.log(status);
    console.log(errorThrown);
}


/**
 * Calling a web service.
 * @param url The url to be called.
 * @param params The parameters of the call.
 * @param callback The function to be called back.
 */
function ajaxPost(url, params, callback) {
    $.ajax({
        url: url,
        cache: false,
        type: "POST",
        data: params
    }).done(callback);
}
function ajaxGet(url, params, doneCallback, errorCallback) {
    $.ajax({
        url: url,
        cache: false,
        type: "GET",
        dataType: "text",
        data: params,
        statusCode: {
            404: function() {
                alert( "page not found" );
            }
        }
    })
            .done(doneCallback)
            .fail(errorCallback)
            .always(function(xhr, status) {
                console.log("Request complete");
    });
}
