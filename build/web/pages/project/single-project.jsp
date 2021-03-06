<%-- 
    Document   : single-project
    Created on : Nov 28, 2021, 7:11:23 PM
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
        <link rel="stylesheet" href="../../vendors/typicons.font/font/typicons.css">
        <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
        <!-- end inject -->
        <!-- inject:css -->
        <link rel="stylesheet" href="../../css/vertical-layout-light/style.css">
        <!-- plugin css for this page -->
        <link rel="stylesheet" href="../../vendors/mdi/css/materialdesignicons.min.css">
        <link href="../../vendors/mdi/css/materialdesignicons.min.css" rel="stylesheet" type="text/css"/>
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <link rel="stylesheet" href="../../css/vertical-layout-light/style.css">
        <!-- end inject -->
        <link rel="shortcut icon" href="../../images/favicon.png" />
    </head>

    <body>

        <div class="container-scroller">

            <!--_navbar.jsp-->
            <nav class="navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
                <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
                    <a class="navbar-brand brand-logo" href="home"><img src="images/logo.svg" alt="logo" /></a>
                    <a class="navbar-brand brand-logo-mini" href="index.html"><img src="images/logo-mini.svg" alt="logo" /></a>
                    <button title="collapse" class="navbar-toggler navbar-toggler align-self-center d-none d-lg-flex" type="button" data-toggle="minimize"><span class="typcn typcn-th-menu"></span></button>
                </div>
                <div class="navbar-menu-wrapper d-flex align-items-center justify-content-end">
                    <ul class="navbar-nav navbar-nav-right">
                        <li class="nav-item d-none d-lg-flex  mr-2">
                            <a class="nav-link" href="#">Help</a>
                        </li>
                        <li class="nav-item dropdown d-flex">
                            <a class="nav-link count-indicator dropdown-toggle d-flex justify-content-center align-items-center" id="messageDropdown" href="#" data-toggle="dropdown">
                                <i class="typcn typcn-message-typing"></i>
                                <span class="count bg-success">2</span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                                <p class="mb-0 font-weight-normal float-left dropdown-header">Messages</p>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <img src="images/faces/face4.jpg" alt="image" class="profile-pic">
                                    </div>
                                    <div class="preview-item-content flex-grow">
                                        <h6 class="preview-subject ellipsis font-weight-normal">David Grey
                                        </h6>
                                        <p class="font-weight-light small-text mb-0">
                                            The meeting is cancelled
                                        </p>
                                    </div>
                                </a>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <img src="images/faces/face2.jpg" alt="image" class="profile-pic">
                                    </div>
                                    <div class="preview-item-content flex-grow">
                                        <h6 class="preview-subject ellipsis font-weight-normal">Tim Cook
                                        </h6>
                                        <p class="font-weight-light small-text mb-0">
                                            New product launch
                                        </p>
                                    </div>
                                </a>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <img src="images/faces/face3.jpg" alt="image" class="profile-pic">
                                    </div>
                                    <div class="preview-item-content flex-grow">
                                        <h6 class="preview-subject ellipsis font-weight-normal"> Johnson
                                        </h6>
                                        <p class="font-weight-light small-text mb-0">
                                            Upcoming board meeting
                                        </p>
                                    </div>
                                </a>
                            </div>
                        </li>
                        <li class="nav-item dropdown  d-flex">
                            <a class="nav-link count-indicator dropdown-toggle d-flex align-items-center justify-content-center" id="notificationDropdown" href="#" data-toggle="dropdown">
                                <i class="typcn typcn-bell mr-0"></i>
                                <span class="count bg-danger">2</span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="notificationDropdown">
                                <p class="mb-0 font-weight-normal float-left dropdown-header">Notifications</p>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <div class="preview-icon bg-success">
                                            <i class="typcn typcn-info-large mx-0"></i>
                                        </div>
                                    </div>
                                    <div class="preview-item-content">
                                        <h6 class="preview-subject font-weight-normal">Application Error</h6>
                                        <p class="font-weight-light small-text mb-0">
                                            Just now
                                        </p>
                                    </div>
                                </a>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <div class="preview-icon bg-warning">
                                            <i class="typcn typcn-cog mx-0"></i>
                                        </div>
                                    </div>
                                    <div class="preview-item-content">
                                        <h6 class="preview-subject font-weight-normal">Settings</h6>
                                        <p class="font-weight-light small-text mb-0">
                                            Private message
                                        </p>
                                    </div>
                                </a>
                                <a class="dropdown-item preview-item">
                                    <div class="preview-thumbnail">
                                        <div class="preview-icon bg-info">
                                            <i class="typcn typcn-user-outline mx-0"></i>
                                        </div>
                                    </div>
                                    <div class="preview-item-content">
                                        <h6 class="preview-subject font-weight-normal">New user registration</h6>
                                        <p class="font-weight-light small-text mb-0">
                                            2 days ago
                                        </p>
                                    </div>
                                </a>
                            </div>
                        </li>
                        <li class="nav-item nav-profile dropdown">
                            <a class="nav-link dropdown-toggle  pl-0 pr-0" href="#" data-toggle="dropdown" id="profileDropdown">
                                <i class="typcn typcn-user-outline mr-0"></i>
                                <span class="nav-profile-name">${user.firstname} ${user.lastname}</span>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right navbar-dropdown" aria-labelledby="profileDropdown">
                                <a class="dropdown-item">
                                    <i class="typcn typcn-cog text-primary"></i> Profile
                                </a>
                                <a class="dropdown-item" href="logout">
                                    <i class="typcn typcn-power text-primary"></i> Logout
                                </a>
                            </div>
                        </li>
                    </ul>
                    <button title="menu" class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                        <span class="typcn typcn-th-menu"></span>
                    </button>
                </div>
            </nav>

            <div class="container-fluid page-body-wrapper">

                <jsp:include page="../../partials/_settings-panel.jsp"></jsp:include>

                <%@page import="dao.ActionDAO"%>
                <%@page import="entity.Action"%>
                <%@page import="java.util.List"%>

                <%
                    List<Action> projectAction = new ActionDAO().getActionByGroupId(1);
                    List<Action> userAction = new ActionDAO().getActionByGroupId(2);
                    List<Action> taskAction = new ActionDAO().getActionByGroupId(3);
                    List<Action> bugAction = new ActionDAO().getActionByGroupId(4);
                    List<Action> commentAction = new ActionDAO().getActionByGroupId(5);
                %>

                <nav class="sidebar sidebar-offcanvas" id="sidebar">
                    <ul class="nav">
                        <li class="nav-item">
                            <div class="d-flex sidebar-profile">
                                <div class="sidebar-profile-image">
                                    <img src="images/faces/face29.png" alt="image">
                                    <span class="sidebar-status-indicator"></span>
                                </div>
                                <div class="sidebar-profile-name">
                                    <p class="sidebar-name">${user.firstname} ${user.lastname}</p>
                                    <p class="sidebar-designation">Welcome</p>
                                </div>
                            </div>
                            <div class="nav-search">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Type to search..." aria-label="search" aria-describedby="search">
                                    <div class="input-group-append">
                                        <span class="input-group-text" id="search">
                                            <i class="typcn typcn-zoom"></i>
                                        </span>
                                    </div>
                                </div>
                            </div>
                            <p class="sidebar-menu-title">Dash menu</p>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="../../home">
                                <i class="typcn typcn-device-desktop menu-icon"></i>
                                <span class="menu-title">Dashboard <span class="badge badge-primary ml-3">New</span></span>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                                <i class="typcn typcn-briefcase menu-icon"></i>
                                <span class="menu-title">Project</span>
                                <i class="typcn typcn-chevron-right menu-arrow"></i>
                            </a>
                            <div class="collapse" id="ui-basic">
                                <ul class="nav flex-column sub-menu">
                                    <c:forEach items="<%=projectAction%>" var="p">
                                        <li class="nav-item"> <a class="nav-link" href="pages/project/${p.name.toLowerCase()}-project">${p.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#form-elements" aria-expanded="false" aria-controls="form-elements">
                                <i class="typcn typcn-film menu-icon"></i>
                                <span class="menu-title">Users</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="form-elements">
                                <ul class="nav flex-column sub-menu">
                                    <c:forEach items="<%=userAction%>" var="u">
                                        <li class="nav-item"> <a class="nav-link" href="../user/${u.name.toLowerCase()}-user">${u.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#charts" aria-expanded="false" aria-controls="charts">
                                <i class="typcn typcn-chart-pie-outline menu-icon"></i>
                                <span class="menu-title">Tasks</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="charts">
                                <ul class="nav flex-column sub-menu">
                                    <c:forEach items="<%=taskAction%>" var="u">
                                        <li class="nav-item"> <a class="nav-link" href="${u.name.toLowerCase()}-task">${u.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#tables" aria-expanded="false" aria-controls="tables">
                                <i class="typcn typcn-th-small-outline menu-icon"></i>
                                <span class="menu-title">Bug</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="tables">
                                <ul class="nav flex-column sub-menu">
                                    <c:forEach items="<%=bugAction%>" var="u">
                                        <li class="nav-item"> <a class="nav-link" href="${u.name.toLowerCase()}-bug">${u.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="collapse" href="#icons" aria-expanded="false" aria-controls="icons">
                                <i class="typcn typcn-compass menu-icon"></i>
                                <span class="menu-title">Comments</span>
                                <i class="menu-arrow"></i>
                            </a>
                            <div class="collapse" id="icons">
                                <ul class="nav flex-column sub-menu">
                                    <c:forEach items="<%=commentAction%>" var="u">
                                        <li class="nav-item"> <a class="nav-link" href="${u.name.toLowerCase()}-comment">${u.name}</a></li>
                                        </c:forEach>
                                </ul>
                            </div>
                        </li>
                    </ul>
                    <ul class="sidebar-legend">
                        <li>
                            <p class="sidebar-menu-title">Category</p>
                        </li>
                        <li class="nav-item"><a href="#" class="nav-link">#Sales</a></li>
                        <li class="nav-item"><a href="#" class="nav-link">#Marketing</a></li>
                        <li class="nav-item"><a href="#" class="nav-link">#Growth</a></li>
                    </ul>
                </nav>

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
                            <div class="col-lg-12 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title">Striped Table</h4>
                                        <p class="card-description">
                                            Add class <code>.table-striped</code>
                                        </p>
                                        <div class="table-responsive">
                                            <table class="table table-striped">
                                                <thead>
                                                    <tr>
                                                        <th>
                                                            Task
                                                        </th>
                                                        <th>
                                                            User
                                                        </th>
                                                        <th>
                                                            Name
                                                        </th>
                                                        <th>
                                                            Progress
                                                        </th>
                                                        <th>
                                                            Deadline
                                                        </th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <c:forEach items="${listT}" var="t">
                                                        <tr>
                                                            <td>
                                                                ${t.title}
                                                            </td>
                                                            <td class="py-1">
                                                                <img src="../../images/faces/face7.jpg" alt="image"/>
                                                            </td>
                                                            <td>
                                                                ${t.user.firstname} ${t.user.lastname}
                                                            </td>
                                                            <td>
                                                                <div class="progress">
                                                                    <div class="progress-bar bg-warning" role="progressbar" style="width: ${t.status}%" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                ${t.plannedEndDate}
                                                            </td>
                                                            <td>
                                                                <!-- Button trigger modal -->
                                                                <button type="button" class="btn btn-outline-secondary btn-icon-text" data-toggle="modal" data-target="#exampleModalLong${t.id}">
                                                                    Edit
                                                                </button>

                                                                <!-- Modal -->
                                                                <div class="modal fade" id="exampleModalLong${t.id}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                                                                    <div class="modal-dialog" role="document">
                                                                        <div class="modal-content">
                                                                            <div class="modal-header">
                                                                                <h5 class="modal-title" id="exampleModalLabel">
                                                                                    Edit Task
                                                                                </h5>
                                                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                                    <span aria-hidden="true">&times;</span>
                                                                                </button>
                                                                            </div>

                                                                            <form action="add-task?projectId=${projectId}" method="post">
                                                                                <div class="modal-body">
                                                                                    <div class="form-group">
                                                                                        <label for="title" class="col-form-label">
                                                                                            Title:
                                                                                        </label>
                                                                                        <input type="text" class="form-control" id="product-name" name="title" value="${t.title}">
                                                                                    </div>
                                                                                    <div class="form-group">
                                                                                        <label for="user-id" class="col-form-label">
                                                                                            User ID:
                                                                                        </label>
                                                                                        <input type="text" class="form-control" id="product-name" name="userId" value="${t.user.id}">
                                                                                    </div>
                                                                                    <div class="form-group">
                                                                                        <label for="start-date" class="col-form-label">
                                                                                            Start date:
                                                                                        </label>
                                                                                        <input type="text" class="form-control" id="product-name" name="start-date" value="${t.plannedStartDate}">
                                                                                    </div>
                                                                                    <div class="form-group">
                                                                                        <label for="end-date" class="col-form-label">
                                                                                            End date:
                                                                                        </label>
                                                                                        <input type="text" class="form-control" id="product-name" name="end-date" value="${t.plannedEndDate}">
                                                                                    </div>
                                                                                    <div class="form-group">
                                                                                        <label for="description" class="col-form-label">
                                                                                            Description:
                                                                                        </label>
                                                                                        <textarea class="form-control" id="product-details" name="description">${t.description}</textarea>
                                                                                    </div>
                                                                                </div>
                                                                                <div class="modal-footer">  
                                                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                                                                                        Cancel
                                                                                    </button>
                                                                                    <button type="submit" class="btn btn-primary" value="Add">
                                                                                        Add
                                                                                    </button>
                                                                                </div>
                                                                            </form>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                            <td>
                                                                <a href="add-task?id=${t.id}&projectId=${projectId}">
                                                                    <button type="button" class="btn btn-outline-secondary btn-icon-text">
                                                                        Delete
                                                                    </button>
                                                                </a>
                                                            </td>
                                                        </tr>
                                                    </c:forEach>
                                                </tbody>
                                            </table>
                                            <!-- Button trigger modal -->
                                            <button type="button" class="btn btn-primary btn-rounded btn-icon" data-toggle="modal" data-target="#exampleModalLong">
                                                +
                                            </button>

                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">
                                                                Add New Task
                                                            </h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>

                                                        <form action="add-task?projectId=${projectId}" method="post">
                                                            <div class="modal-body">
                                                                <div class="form-group">
                                                                    <label for="title" class="col-form-label">
                                                                        Title:
                                                                    </label>
                                                                    <input type="text" class="form-control" id="product-name" name="title">
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="user-id" class="col-form-label">
                                                                        User ID:
                                                                    </label>
                                                                    <input type="text" class="form-control" id="product-name" name="userId">
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="start-date" class="col-form-label">
                                                                        Start date:
                                                                    </label>
                                                                    <input type="text" class="form-control" id="product-name" name="start-date">
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="end-date" class="col-form-label">
                                                                        End date:
                                                                    </label>
                                                                    <input type="text" class="form-control" id="product-name" name="end-date">
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="description" class="col-form-label">
                                                                        Description:
                                                                    </label>
                                                                    <textarea class="form-control" id="product-details" name="description"></textarea>
                                                                </div>
                                                            </div>
                                                            <div class="modal-footer">  
                                                                <button type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                                                                    Cancel
                                                                </button>
                                                                <button type="submit" class="btn btn-primary" value="Add">
                                                                    Add
                                                                </button>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- content-wrapper ends -->
                    <!-- partial:partials/_footer.jsp -->
                    <jsp:include page="../../partials/_footer.jsp"></jsp:include>
                    <!-- partial -->
                </div>
                <!-- main-panel ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>

        <!-- base:js -->
        <script src="../../vendors/js/vendor.bundle.base.js"></script>
        <!-- end inject -->
        <!-- Plugin js for this page-->
        <!-- End plugin js for this page-->
        <!-- inject:js -->
        <script src="../../js/off-canvas.js"></script>
        <script src="../../js/hoverable-collapse.js"></script>
        <script src="../../js/template.js"></script>
        <script src="../../js/settings.js"></script>
        <script src="../../js/todolist.js"></script>
        <!-- end inject -->
        <!-- plugin js for this page -->
        <script src="../../vendors/progressbar.js/progressbar.min.js"></script>
        <script src="../../vendors/chart.js/Chart.min.js"></script>
        <!-- End plugin js for this page -->
        <!-- Custom js for this page-->
        <script src="../../js/dashboard.js"></script>
        <!-- End custom js for this page-->
    </body>

</html>
