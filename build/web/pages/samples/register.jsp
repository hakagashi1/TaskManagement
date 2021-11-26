<%-- 
    Document   : register
    Created on : Nov 25, 2021, 8:38:30 AM
    Author     : ZenBook
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>CelestialUI Admin</title>
        <!-- base:css -->
        <link rel="stylesheet" href="../../vendors/typicons.font/font/typicons.css">
        <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="../../css/vertical-layout-light/style.css">
        <!-- endinject -->
        <link rel="shortcut icon" href="../../images/favicon.png" />
    </head>

    <body>
        <div class="container-scroller">
            <div class="col-lg-4 mx-auto">
                <div class="text-left py-5 px-4 px-sm-5">
                    <div class="brand-logo">
                        <img src="../../images/logo.svg" alt="logo">
                    </div>
                    <h4>New here?</h4>
                    <h6 class="font-weight">Signing up is easy. It only takes a few steps</h6>

                </div>
            </div>
            <form class="forms-sample" action="register" method="post">
                <div class="container-fluid page-body-wrapper full-page-wrapper">

                    <div class="content-wrapper d-flex align-items-center auth px-0">

                        <div class="row w-100 mx-0">
                            <div class="col-md-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="form-group row">
                                            <label for="Username" class="col-sm-3 col-form-label">Username</label>
                                            <div class="col-sm-9">
                                                <p class="text-danger">${userDanger}</p>
                                                <input type="text" class="form-control" name="username" placeholder="Username" value="${username}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Email" class="col-sm-3 col-form-label">Email address</label>
                                            <div class="col-sm-9">
                                                <p class="text-danger">${emailDanger}</p>
                                                <input type="email" class="form-control" name="email" placeholder="Email" value="${email}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Password" class="col-sm-3 col-form-label">Password</label>
                                            <div class="col-sm-9">
                                                <p class="text-danger">${passDanger}</p>
                                                <input type="password" class="form-control" name="password" placeholder="Password">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Re-Password" class="col-sm-3 col-form-label">Confirm Password</label>
                                            <div class="col-sm-9">
                                                <p class="text-danger">${repassDanger}</p>
                                                <input type="password" class="form-control" name="repassword" placeholder="Password">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <div class="form-group row">
                                            <label for="First" class="col-sm-3 col-form-label">First name</label>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control" name="firstname" placeholder="First name" value="${firstname}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Middle" class="col-sm-3 col-form-label">Middle name</label>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control" name="middlename" placeholder="Middle name" value="${middlename}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Last" class="col-sm-3 col-form-label">Last name</label>
                                            <div class="col-sm-9">
                                                <input type="text" class="form-control" name="lastname" placeholder="Last name" value="${lastname}">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label for="Mobile" class="col-sm-3 col-form-label">Mobile</label>
                                            <div class="col-sm-9">
                                                <p class="text-danger">${mobileDanger}</p>
                                                <input type="text" class="form-control" name="mobile" placeholder="Mobile number" value="${mobile}">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <c:forEach items="${roles}" var="r">
                                                    <div class="form-check">
                                                        <label class="form-check-label">
                                                            <input type="radio" class="form-check-input" name="role" value="${r.id}" ${r.id == role ?"checked":""}>
                                                            ${r.role}
                                                        </label>
                                                    </div>
                                                </c:forEach>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- content-wrapper ends -->

                    </div>
                </div>

                <div class="col-lg-4 mx-auto">
                    <div class="text-left py-5 px-4 px-sm-5">
                        <div class="mb-4">
                            <div class="form-check">
                                <label class="form-check-label text-muted">
                                    <p class="text-danger">${agreeDanger}</p>
                                    <input type="checkbox" name="agree" class="form-check-input">
                                    I agree to all Terms & Conditions
                                </label>
                            </div>
                        </div>
                        <div class="mt-3">
                            <button type="submit" class="btn btn-primary mr-2">SIGN UP</button>
                        </div>
                        <div class="text-center mt-4 font-weight-light">
                            Already have an account? <a href="login" class="text-primary">Login</a>
                        </div>
                    </div>
                </div>
            </form>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->
        <!-- base:js -->
        <script src="../../vendors/js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- inject:js -->
        <script src="../../js/off-canvas.js"></script>
        <script src="../../js/hoverable-collapse.js"></script>
        <script src="../../js/template.js"></script>
        <script src="../../js/settings.js"></script>
        <script src="../../js/todolist.js"></script>
        <!-- endinject -->
    </body>

</html>
