<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*, modelo.Movimiento"%>
<html><body>
<h2>Listado de Movimientos</h2>
<table border="1">
    <tr><th>ID</th><th>Tipo</th><th>Monto</th><th>Descripción</th><th>Fecha</th></tr>
<%
    List<Movimiento> lista = (List<Movimiento>) request.getAttribute("movimientos");
    if (lista != null) {
        for (Movimiento m : lista) {
%>
<tr>
    <td><%= m.getId() %></td>
    <td><%= m.getTipo() %></td>
    <td><%= m.getMonto() %></td>
    <td><%= m.getDescripcion() %></td>
    <td><%= m.getFecha() %></td>
</tr>
<%
        }
    }
%>
</table>
<a href="index.html">Volver</a>
</body></html>
