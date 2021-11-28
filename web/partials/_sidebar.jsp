<%-- 
    Document   : _sidebar
    Created on : Nov 26, 2021, 5:43:41 PM
    Author     : ZenBook
--%>

<%@page import="dao.ActionDAO"%>
<%@page import="entity.Action"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
            <a class="nav-link" href="home">
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
                        <li class="nav-item"> <a class="nav-link" href="${p.name.toLowerCase()}-project">${p.name}</a></li>
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
                        <li class="nav-item"> <a class="nav-link" href="pages/user/${u.name.toLowerCase()}-user">${u.name}</a></li>
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