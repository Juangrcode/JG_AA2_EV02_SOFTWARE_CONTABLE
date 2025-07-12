package controladores;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.ArrayList;
import modelo.Movimiento;

@WebServlet("/listar")
public class ListarMovimientosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ArrayList<Movimiento> movimientos = RegistrarMovimientoServlet.movimientos;
        request.setAttribute("movimientos", movimientos);
        RequestDispatcher rd = request.getRequestDispatcher("listado.jsp");
        rd.forward(request, response);
    }
}
