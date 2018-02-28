<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="files/favicon-html5.ico">

        <title>Main page</title>

        <!-- bootstrap 4.0 css (through CDN) -->
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <link rel="stylesheet" href="css/card-deck.css">
    </head>
    <body>
        <div class="main-header px-3 py-3 pt-md-5 pb-md-4 mx-auto text-center">
            <h1 class="display-4">Main title</h1>
            <p class="lead">Some little customization here.</p>
        </div>
        <div class="container">
<%--
            <div class="card-deck mb-3 text-center">
                <div class="card mb-4 box-shadow">
                    <!--<div class="card-header"></div>-->
                    <div class="card-body">
                        <p>Some text here</p>
                        <button type="button" class="btn btn-lg btn-block btn-outline-primary" id="btn1" onclick="executeAjax()">Open</button>
                    </div>
                </div>
                <div class="card mb-4 box-shadow">
                    <!--<div class="card-header"></div>-->
                    <div class="card-body">
                        <p>Some text here</p>
                        <button type="button" class="btn btn-lg btn-block btn-outline-primary" onclick="executeAjax()">Open</button>
                    </div>
                </div>
                <div class="card mb-4 box-shadow">
                    <!--<div class="card-header"></div>-->
                    <div class="card-body">
                        <p>Some text here</p>
                        <button type="button" class="btn btn-lg btn-block btn-outline-primary" onclick="executeAjax()">Open</button>
                    </div>
                </div>
            </div>
--%>
            <div class="row">
                <div class="table-responsive">
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Title</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="item" items="${actionBean.itemList}">
                                <tr>
                                    <td> 
                                        <button type="button" class="btn btn-sm btn-link" onclick="executeAjax(this)" data-toggle="modal" data-href="${item}" title="Click for more information">${item}</button>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
            <div id="modalDialog" class="modal fade" tabindex="-1" role="dialog">
                <div id="modalDialogContent"></div>
            </div>
            <footer class="pt-4 my-md-5 pt-md-5 border-top">
                <p>Some text here</p>
            </footer>
            <!--
            <div class="row align-items-center">
                <div class="col-sm">One</div>
                <div class="col-sm">Two</div>
                <div class="col-sm">Three</div>
            </div>
            -->
        </div>

        <!-- jQuery 3.2.1 (through CDN) -->
        <script src="js/vendor/jquery-3.3.1.min.js"></script>
        <script src="js/vendor/popper.min.js"></script>

        <!-- bootstrap 4.0 (through CDN) -->
        <script src="js/vendor/bootstrap.min.js"></script>

        <!-- holder -->
        <script src="js/vendor/holder.min.js"></script>

        <!-- custom scripts -->
        <script src="js/custom.js"></script>

        <script type="text/javascript">
                            $(document).ready(function () {
                                console.log("ready!");
                            });

                            Holder.addTheme("thumbnail", {bg: "#fff", text: "Thumbnail"});
        </script>
    </body>
</html>
