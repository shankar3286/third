<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Monitoring Data</title>
</head>
<body>
<h1>Monitoring Data</h1>
Welcome to the DevOps monitoring system<br/>
<a href="monitoring.html">Click here to refresh.</a>
<h2><c:out value="${model.title}"/></h2>
<table border="1">
<tr>
<th>Title</th>
<th>Artist</th>
<th>Year_of_release</th>
<th>Number_of_track</th>
<th>Total_plaing_time</th>
</tr>
<c:forEach var="Library" items="${model.dockerData}">
<tr>
   <td align="center"><c:out value="${Library.title}"/></td>
   <td align="center"><c:out value="${Library.artist}"/></td>
   <td align="center"><c:out value="${Library.year_of_release}"/></td>
   <td align="center"><c:out value="${Library.number_of_track}"/></td>
   <td align="center"><c:out value="${Library.total_playing_time}"/></td>
</tr>
   
</c:forEach>
</table>
</body>
</html>