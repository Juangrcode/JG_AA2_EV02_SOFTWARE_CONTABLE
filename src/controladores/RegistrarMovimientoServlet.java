package controladores;

import modelo.Movimiento;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/registrar")
public class RegistrarMovimientoServlet extends HttpServlet {
    public static ArrayList<Movimiento> movimientos = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String tipo = request.getParameter("tipo");
        double monto = Double.parseDouble(request.getParameter("monto"));
        String descripcion = request.getParameter("descripcion");
        String fecha = request.getParameter("fecha");

        Movimiento mov = new Movimiento(tipo, monto, descripcion, fecha);
        movimientos.add(mov);

        request.setAttribute("movimiento", mov);
        RequestDispatcher rd = request.getRequestDispatcher("registro.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("registro.jsp");
    }
}
