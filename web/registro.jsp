<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
  <body>
    <h2>Registrar Movimiento</h2>
    <form method="post" action="registrar">
      Tipo:
      <select name="tipo">
        <option value="Ingreso">Ingreso</option>
        <option value="Gasto">Gasto</option></select
      ><br />
      Monto: <input type="number" step="0.01" name="monto" required /><br />
      Descripción: <input type="text" name="descripcion" /><br />
      Fecha: <input type="date" name="fecha" /><br />
      <input type="submit" value="Registrar" />
    </form>
    <a href="index.html">Volver</a>
  </body>
</html>
