<%-- 
    Document   : home
    Created on : Nov 25, 2021, 8:36:27 AM
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
        <title>Task Management</title>
        <!-- base:css -->
        <link rel="stylesheet" href="vendors/typicons.font/font/typicons.css">
        <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
        <!-- end inject -->
        <!-- plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="css/vertical-layout-light/style.css">
        <!-- end inject -->
        <link rel="shortcut icon" href="images/favicon.png" />
    </head>

    <body>

        <div class="container-scroller">

            <jsp:include page="_navbar.jsp"></jsp:include>

                <div class="container-fluid page-body-wrapper">

                <jsp:include page="_settings-panel.jsp"></jsp:include>

                <jsp:include page="_sidebar.jsp"></jsp:include>

                    <div class="main-panel">
                        <div class="content-wrapper">
                            <div class="row">
                                <div class="col-sm-6">
                                    <h3 class="mb-0 font-weight-bold">${user.firstname} ${user.lastname}</h3>
                                    <p>Your last login: 21h ago from newzealand.</p>
                                </div>
                                <div class="col-sm-6">
                                    <div class="d-flex align-items-center justify-content-md-end">
                                        <div class="mb-3 mb-xl-0 pr-1">
                                            <div class="dropdown">
                                                <button class="btn bg-white btn-sm dropdown-toggle btn-icon-text border mr-2" type="button" id="dropdownMenu3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                    <i class="typcn typcn-calendar-outline mr-2"></i>Last 7 days
                                                </button>
                                                <div class="dropdown-menu" aria-labelledby="dropdownMenuSizeButton3" data-x-placement="top-start">
                                                    <h6 class="dropdown-header">Last 14 days</h6>
                                                    <a class="dropdown-item" href="#">Last 21 days</a>
                                                    <a class="dropdown-item" href="#">Last 28 days</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="pr-1 mb-3 mr-2 mb-xl-0">
                                            <button type="button" class="btn btn-sm bg-white btn-icon-text border"><i class="typcn typcn-arrow-forward-outline mr-2"></i>Export</button>
                                        </div>
                                        <div class="pr-1 mb-3 mb-xl-0">
                                            <button type="button" class="btn btn-sm bg-white btn-icon-text border"><i class="typcn typcn-info-large-outline mr-2"></i>info</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-12 d-flex grid-margin stretch-card">
                                    <div class="card">
                                        <div class="card-body">
                                            <div class="d-flex flex-wrap justify-content-between">
                                                <h4 class="card-title mb-3">Project status</h4>
                                            </div>
                                            <div class="table-responsive">
                                                <table class="table">
                                                    <tbody>
                                                        <tr>
                                                            <td>
                                                                <div class="d-flex">
                                                                    <img class="img-sm rounded-circle mb-md-0 mr-2" src="images/faces/face30.png" alt="profile image">
                                                                    <div>
                                                                        <div> Company</div>
                                                                        <div class="font-weight-bold mt-1">volkswagen</div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                Budget
                                                                <div class="font-weight-bold  mt-1">$2322 </div>
                                                            </td>
                                                            <td>
                                                                Status
                                                                <div class="font-weight-bold text-success  mt-1">88% </div>
                                                            </td>
                                                            <td>
                                                                Deadline
                                                                <div class="font-weight-bold  mt-1">07 Nov 2019</div>
                                                            </td>
                                                            <td>
                                                                <button type="button" class="btn btn-sm btn-secondary">edit actions</button>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <div class="d-flex">
                                                                    <img class="img-sm rounded-circle mb-md-0 mr-2" src="images/faces/face31.png" alt="profile image">
                                                                    <div>
                                                                        <div> Company</div>
                                                                        <div class="font-weight-bold  mt-1">Land Rover</div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                Budget
                                                                <div class="font-weight-bold  mt-1">$12022 </div>
                                                            </td>
                                                            <td>
                                                                Status
                                                                <div class="font-weight-bold text-success  mt-1">70% </div>
                                                            </td>
                                                            <td>
                                                                Deadline
                                                                <div class="font-weight-bold  mt-1">08 Nov 2019</div>
                                                            </td>
                                                            <td>
                                                                <button type="button" class="btn btn-sm btn-secondary">edit actions</button>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <div class="d-flex">
                                                                    <img class="img-sm rounded-circle mb-md-0 mr-2" src="images/faces/face32.png" alt="profile image">
                                                                    <div>
                                                                        <div> Company</div>
                                                                        <div class="font-weight-bold  mt-1">Bentley </div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                Budget
                                                                <div class="font-weight-bold  mt-1">$8,725</div>
                                                            </td>
                                                            <td>
                                                                Status
                                                                <div class="font-weight-bold text-success  mt-1">87% </div>
                                                            </td>
                                                            <td>
                                                                Deadline
                                                                <div class="font-weight-bold  mt-1">11 Jun 2019</div>
                                                            </td>
                                                            <td>
                                                                <button type="button" class="btn btn-sm btn-secondary">edit actions</button>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <div class="d-flex">
                                                                    <img class="img-sm rounded-circle mb-md-0 mr-2" src="images/faces/face33.png" alt="profile image">
                                                                    <div>
                                                                        <div> Company</div>
                                                                        <div class="font-weight-bold  mt-1">Morgan </div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                Budget
                                                                <div class="font-weight-bold  mt-1">$5,220 </div>
                                                            </td>
                                                            <td>
                                                                Status
                                                                <div class="font-weight-bold text-success  mt-1">65% </div>
                                                            </td>
                                                            <td>
                                                                Deadline
                                                                <div class="font-weight-bold  mt-1">26 Oct 2019</div>
                                                            </td>
                                                            <td>
                                                                <button type="button" class="btn btn-sm btn-secondary">edit actions</button>
                                                            </td>
                                                        </tr>
                                                        <tr>
                                                            <td>
                                                                <div class="d-flex">
                                                                    <img class="img-sm rounded-circle mb-md-0 mr-2" src="images/faces/face34.png" alt="profile image">
                                                                    <div>
                                                                        <div> Company</div>
                                                                        <div class="font-weight-bold  mt-1">volkswagen</div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                Budget
                                                                <div class="font-weight-bold  mt-1">$2322 </div>
                                                            </td>
                                                            <td>
                                                                Status
                                                                <div class="font-weight-bold text-success mt-1">88% </div>
                                                            </td>
                                                            <td>
                                                                Deadline
                                                                <div class="font-weight-bold  mt-1">07 Nov 2019</div>
                                                            </td>
                                                            <td>
                                                                <button type="button" class="btn btn-sm btn-secondary">edit actions</button>
                                                            </td>
                                                        </tr>
                                                    </tbody>
                                                </table>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- content-wrapper ends -->
                        <!-- partial:partials/_footer.jsp -->
                    <jsp:include page="_footer.jsp"></jsp:include>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>

        <!-- base:js -->
        <script src="vendors/js/vendor.bundle.base.js"></script>
        <!-- end inject -->
        <!-- Plugin js for this page-->
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="js/off-canvas.js"></script>
        <script src="js/hoverable-collapse.js"></script>
        <script src="js/template.js"></script>
        <script src="js/settings.js"></script>
        <script src="js/todolist.js"></script>
        <!-- end inject -->
        <!-- plugin js for this page -->
        <script src="vendors/progressbar.js/progressbar.min.js"></script>
        <script src="vendors/chart.js/Chart.min.js"></script>
        <!-- End plugin js for this page -->
        <!-- Custom js for this page-->
        <script src="js/dashboard.js"></script>
        <!-- End custom js for this page-->
    </body>

</html>
