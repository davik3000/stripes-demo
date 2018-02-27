<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@include file="/WEB-INF/jsp/common/taglibs.jsp" %>--%>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>

<s:url var="url" beanclass="com.example.stripes.demo.action.MainActionBean" prependContext="false"/>
<jsp:forward page="${url}"/>
